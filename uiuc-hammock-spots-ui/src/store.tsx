import React, { createContext, useEffect, useReducer, useState } from 'react'

import { fetchTrees } from './api/Trees'
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
  //  Init API Calls
  const [trees, setTrees] = useState([])
  const [treeDistances, setTreeDistances] = useState([])
  useEffect(() => {
    fetchTrees().then((res) => {
      const receivedTees = res.data.payload
      setTrees(receivedTees)
    })
    fetchTreeDistances(
      DEFAULT_MINIMUM_TREE_DISTANCE,
      DEFAULT_MAXIMUM_TREE_DISTANCE,
    ).then((res) => {
      const receivedTreeDistances = res.data.payload
      setTreeDistances(receivedTreeDistances)
    })
  }, [])

  //  Handle User Actions
  const [state, dispatch]: [state: StoreState, dispatch: any] = useReducer(
    (state: StoreState, action: AnyAction) => {
      switch (action.type) {
        case ActionType.SET_MINIMUM_TREE_DISTANCE:
          const { minimum_tree_distance } = action

          return {
            ...state,
            minimum_tree_distance: minimum_tree_distance,
          }

        case ActionType.SET_MAXIMUM_TREE_DISTANCE:
          const { maximum_tree_distance } = action

          return {
            ...state,
            maximum_tree_distance: maximum_tree_distance,
          }

        default:
          throw new Error('Invalid action type')
      }
    },
    initialState,
  )

  const newState = {
    ...state,
    trees,
    treeDistances,
  }

  return <Provider value={{ state: newState, dispatch }}>{children}</Provider>
}

export { store, StateProvider }
