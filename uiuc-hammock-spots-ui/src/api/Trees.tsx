import axios from 'axios'

export function fetchTrees() {
  return axios.get('/trees')
}

export function fetchTreesGeoJSON() {
  return axios.get('/trees/asGeoJSON')
}
