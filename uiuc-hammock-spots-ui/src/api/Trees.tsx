import axios from 'axios'

export function fetchTrees() {
  return axios.get('/trees')
}
