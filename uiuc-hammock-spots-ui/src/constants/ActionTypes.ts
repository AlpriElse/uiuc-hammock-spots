import { Tree, TreeDistance } from '../types'

export interface BasicAction {
  type: ActionType
}

export type AnyAction =
  | SetMinimumTreeDistanceAction
  | SetMaximumTreeDistanceAction
  | FilterHammockSpotsAction
  | ReceivedTreesAction
  | ReceivedTreeDistancesAction

export enum ActionType {
  FILTER_HAMMOCK_SPOTS = 'FILTER_HAMMOCK_SPOTS',
  RECEIVED_TREES = 'RECEIVED_TREES',
  RECEIVED_TREE_DISTANCES = 'RECEIVED_TREE_DISTANCES',
  SET_MINIMUM_TREE_DISTANCE = 'SET_MINIMUM_TREE_DISTANCE',
  SET_MAXIMUM_TREE_DISTANCE = 'SET_MAXIMUM_TREE_DISTANCE',
}

export interface FilterHammockSpotsAction {
  type: ActionType.FILTER_HAMMOCK_SPOTS
}

export interface ReceivedTreesAction {
  type: ActionType.RECEIVED_TREES
  trees: Tree[]
}

export interface ReceivedTreeDistancesAction {
  type: ActionType.RECEIVED_TREE_DISTANCES
  treeDistances: TreeDistance[]
}

export interface SetMinimumTreeDistanceAction {
  type: ActionType.SET_MINIMUM_TREE_DISTANCE
  minimum_tree_distance: number
}
export interface SetMaximumTreeDistanceAction {
  type: ActionType.SET_MAXIMUM_TREE_DISTANCE
  maximum_tree_distance: number
}
