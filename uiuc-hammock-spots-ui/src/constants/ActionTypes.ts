export interface BasicAction {
  type: ActionType
}

export type AnyAction =
  | SetMinimumTreeDistanceAction
  | SetMaximumTreeDistanceAction
  | FilterHammockSpotsAction

export interface SetMinimumTreeDistanceAction {
  type: ActionType.SET_MINIMUM_TREE_DISTANCE
  minimum_tree_distance: number
}
export interface SetMaximumTreeDistanceAction {
  type: ActionType.SET_MAXIMUM_TREE_DISTANCE
  maximum_tree_distance: number
}
export interface FilterHammockSpotsAction {
  type: ActionType.FILTER_HAMMOCK_SPOTS
}

export enum ActionType {
  SET_MINIMUM_TREE_DISTANCE = 'SET_MINIMUM_TREE_DISTANCE',
  SET_MAXIMUM_TREE_DISTANCE = 'SET_MAXIMUM_TREE_DISTANCE',
  FILTER_HAMMOCK_SPOTS = 'FILTER_HAMMOCK_SPOTS',
}
