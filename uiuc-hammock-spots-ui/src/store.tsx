import React, { createContext, useEffect, useReducer } from 'react'

import { fetchTreesGeoJSON } from './api/Trees'
import { fetchTreeDistances } from './api/TreeDistances'
import { StoreState } from './types'
import { AnyAction, ActionType } from './constants/ActionTypes'

const DEFAULT_MINIMUM_TREE_DISTANCE = 10
const DEFAULT_MAXIMUM_TREE_DISTANCE = 15

const initialState: StoreState = {
  minimum_tree_distance: DEFAULT_MINIMUM_TREE_DISTANCE,
  maximum_tree_distance: DEFAULT_MAXIMUM_TREE_DISTANCE,
  trees: [],
}

const store = createContext({
  state: initialState,
  dispatch: () => {},
})
const { Provider } = store

const StateProvider = ({ children }: { children: React.ReactNode }) => {
  //  Handle User Actions
  const [state, dispatch]: [state: StoreState, dispatch: any] = useReducer(
    (state: StoreState, action: AnyAction) => {
      switch (action.type) {
        case ActionType.SET_MINIMUM_TREE_DISTANCE: {
          const { minimum_tree_distance } = action

          return Object.assign({}, state, {
            minimum_tree_distance: minimum_tree_distance,
          })
        }

        case ActionType.SET_MAXIMUM_TREE_DISTANCE: {
          const { maximum_tree_distance } = action

          return Object.assign({}, state, {
            maximum_tree_distance: maximum_tree_distance,
          })
        }
        case ActionType.RECEIVED_TREES: {
          const { trees } = action

          return Object.assign({}, state, {
            trees,
          })
        }
        case ActionType.RECEIVED_TREE_DISTANCES: {
          const { treeDistances } = action

          return Object.assign({}, state, {
            treeDistances,
          })
        }
        case ActionType.FILTER_HAMMOCK_SPOTS: {
          //  Start API Request, Return existing state, Dispatch action on Callback
          const { minimum_tree_distance, maximum_tree_distance } = state

          fetchTreeDistances(minimum_tree_distance, maximum_tree_distance).then(
            (res) =>
              dispatch({
                type: ActionType.RECEIVED_TREE_DISTANCES,
                treeDistances: res.data.payload,
              }),
          )
          return state
        }
        default:
          throw new Error('Invalid action type')
      }
    },
    initialState,
  )

  //  Init API Calls
  useEffect(() => {
    fetchTreesGeoJSON().then((res) =>
      dispatch({
        type: ActionType.RECEIVED_TREES,
        trees: res.data.payload,
      }),
    )
    fetchTreeDistances(
      DEFAULT_MINIMUM_TREE_DISTANCE,
      DEFAULT_MAXIMUM_TREE_DISTANCE,
    ).then((res) =>
      dispatch({
        type: ActionType.RECEIVED_TREE_DISTANCES,
        treeDistances: res.data.payload,
      }),
    )
  }, [])

  return <Provider value={{ state, dispatch }}>{children}</Provider>
}

export { store, StateProvider }
