import React from 'react'
import { Source, Layer } from 'react-map-gl'

import { KATAWARE_DOKI } from '../../constants/Colors'

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

const TreeLayer = ({ treesGeoJson }) => (
  <Source id="my-data" type="geojson" data={treesGeoJson}>
    <Layer {...TREE_LAYER_STYLE} />
  </Source>
)

export default TreeLayer
