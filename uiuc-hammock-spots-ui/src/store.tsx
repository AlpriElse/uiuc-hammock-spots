import React, { createContext, useReducer } from 'react'

import { AnyAction, ActionType } from './constants/ActionTypes'

interface StoreState {
  minimum_tree_distance: number
  maximum_tree_distance: number
}
const initialState: StoreState = {
  minimum_tree_distance: 10,
  maximum_tree_distance: 15,
}

const store = createContext({
  state: initialState,
  dispatch: () => {},
})
const { Provider } = store

const StateProvider = ({ children }: { children: React.ReactNode }) => {
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

  return <Provider value={{ state, dispatch }}>{children}</Provider>
}

export { store, StateProvider }
