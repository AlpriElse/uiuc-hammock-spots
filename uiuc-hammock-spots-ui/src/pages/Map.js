import React, { useContext, useMemo, useState } from 'react'
import { Marker, StaticMap } from 'react-map-gl'

import FilterControls from '../components/FilterControls'
import Page from '../components/Page'
import Tree from '../components/Tree'
import { store } from '../store'

const LOCATIONS = {
  MAIN_QUAD: {
    latitude: 40.1075,
    longitude: -88.2272,
  },
  SOUTH_QUAD: {
    latitude: 40.103,
    longitude: -88.2272,
  },
}
const Map = () => {
  const { state } = useContext(store)

  const [viewport, setViewport] = useState({
    width: '100vv',
    height: '100vh',
    latitude: LOCATIONS.MAIN_QUAD.latitude,
    longitude: LOCATIONS.MAIN_QUAD.longitude,
    zoom: 17.5,
    mapStyle: 'mapbox://styles/alprielse/ckrs0k3re0plk18pbdd6v36xm',
  })

  //  Only render on trees load
  const treeMarkers = useMemo(() => {
    return state.trees.map(({ siteId, latitude, longitude, dbh }) => (
      <Marker key={siteId} latitude={latitude} longitude={longitude}>
        <Tree dbh={dbh} />
      </Marker>
    ))
  }, [state.trees])

  //  Limit renders
  const staticMap = useMemo(
    () => (
      <StaticMap
        {...viewport}
        onViewportChange={(nextViewport) =>
          setViewport({
            ...viewport,
            nextViewport,
          })
        }
      >
        {treeMarkers}
      </StaticMap>
    ),
    [viewport, treeMarkers],
  )

  return (
    <Page>
      <FilterControls />
      {staticMap}
    </Page>
  )
}

export default Map
