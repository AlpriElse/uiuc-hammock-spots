import React from 'react'
import { Source, Layer } from 'react-map-gl'

import { RENGOKU } from '../../constants/Colors'

const HAMMOCK_LAYER_STYLE = {
  id: 'route',
  type: 'line',
  paint: {
    'line-color': RENGOKU,
    'line-width': 2,
  },
}

const HammockLayer = ({ treeDistancesGeoJson }) => (
  <Source id="hammocks" type="geojson" data={treeDistancesGeoJson}>
    <Layer {...HAMMOCK_LAYER_STYLE} />
  </Source>
)

export default HammockLayer
