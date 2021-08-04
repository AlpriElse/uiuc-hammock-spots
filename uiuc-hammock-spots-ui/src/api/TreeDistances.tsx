import axios from 'axios'

export function fetchTreeDistances(
  minimum_tree_distance: number,
  maximum_tree_distance: number,
) {
  return axios.get(
    `/tree-distances?minimum_distance=${minimum_tree_distance}&maximum_distance=${maximum_tree_distance}`,
  )
}

export function fetchTreeDistancesGeoJSON(
  minimum_tree_distance: number,
  maximum_tree_distance: number,
) {
  return axios.get(
    `/tree-distances/asGeoJSON?minimum_distance=${minimum_tree_distance}&maximum_distance=${maximum_tree_distance}`,
  )
}
