import React, { useContext, useMemo, useState } from 'react'
import ReactMapGL from 'react-map-gl'

import { store } from '../store'

import HammockLayer from './map-features/HammockLayer'
import TreeLayer from './map-features/TreeLayer'

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
    () => <TreeLayer treesGeoJson={state.trees} />,
    [state.trees],
  )

  const hammockLayer = useMemo(
    () => <HammockLayer treeDistancesGeoJson={state.treeDistances} />,
    [state.treeDistances],
  )
  return (
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
  )
}

export default Map
