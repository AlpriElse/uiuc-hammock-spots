import React, { useContext, useMemo, useState } from 'react'
import ReactMapGL, { Source, Layer } from 'react-map-gl'

import { store } from '../store'

import FilterControls from '../components/FilterControls'
import Page from '../components/Page'
import { KATAWARE_DOKI, RENGOKU } from '../constants/Colors'

const TREE_LAYER_STYLE = {
  id: 'point',
  type: 'circle',
  paint: {
    'circle-radius': [
      'interpolate',
      ['linear'],
      ['get', 'dbh'],
      //  When dbh is 1 radius is 1.5
      1,
      2.5,
      //  When dbh is >=30 radius is 6
      30,
      6,
    ],
    'circle-color': KATAWARE_DOKI,
    'circle-opacity': 0.75,
  },
}

const HAMMOCK_LAYER_STYLE = {
  id: 'route',
  type: 'line',
  paint: {
    'line-color': RENGOKU,
    'line-width': 2,
  },
}

const MAIN_QUAD = {
  latitude: 40.1075,
  longitude: -88.2272,
}

const Map = () => {
  const { state } = useContext(store)

  const [viewport, setViewport] = useState({
    latitude: MAIN_QUAD.latitude,
    longitude: MAIN_QUAD.longitude,
    zoom: 17.5,
    mapStyle: 'mapbox://styles/alprielse/ckrs0k3re0plk18pbdd6v36xm',
    interactive: true,
  })

  //  Only render on trees load
  const treeLayer = useMemo(
    () => (
      <Source id="my-data" type="geojson" data={state.trees}>
        <Layer {...TREE_LAYER_STYLE} />
      </Source>
    ),
    [state.trees],
  )

  const hammockLayer = useMemo(
    () => (
      <Source id="hammocks" type="geojson" data={state.treeDistances}>
        <Layer {...HAMMOCK_LAYER_STYLE} />
      </Source>
    ),
    [state.treeDistances],
  )

  return (
    <Page>
      <FilterControls />
      <ReactMapGL
        {...viewport}
        width="100%"
        height="100%"
        onViewportChange={(nextViewport) =>
          setViewport({
            ...viewport,
            ...nextViewport,
          })
        }
      >
        {treeLayer}
        {hammockLayer}
      </ReactMapGL>
    </Page>
  )
}

export default Map
