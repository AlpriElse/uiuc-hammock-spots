import React, { useContext, useMemo, useState } from 'react'
import { Marker, StaticMap } from 'react-map-gl'

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
    latitude: LOCATIONS.SOUTH_QUAD.latitude,
    longitude: LOCATIONS.SOUTH_QUAD.longitude,
    zoom: 17.5,
    mapStyle: 'mapbox://styles/alprielse/ckrs0k3re0plk18pbdd6v36xm',
  })

  const treeMarkers = useMemo(
    () =>
      state.trees.map(({ siteId, latitude, longitude, dbh }) => (
        <Marker key={siteId} latitude={latitude} longitude={longitude}>
          <Tree age={dbh} />
        </Marker>
      )),
    [state.trees],
  )

  return (
    <Page>
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
    </Page>
  )
}

export default Map
