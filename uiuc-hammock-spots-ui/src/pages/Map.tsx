import React, { useContext } from 'react'

import Page from '../components/Page'
import { store } from '../store'

const Map = () => {
  const { state } = useContext(store)
  console.log(state)
  const { minimum_tree_distance, maximum_tree_distance } = state
  return (
    <Page>
      <h1>Map</h1>
      <h2>
        {minimum_tree_distance} \n
        {maximum_tree_distance}
      </h2>
    </Page>
  )
}

export default Map
