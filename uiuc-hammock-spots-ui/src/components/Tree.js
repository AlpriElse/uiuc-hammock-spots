import React from 'react'

import { KATAWARE_DOKI } from '../constants/Colors'

const Tree = ({ age }) => {
  // Map 1 to 1.5px and >30 to 4
  const radius = Math.min(1, age / 30) * 3 + 1.5
  return (
    <svg>
      <circle cx={radius} cy={radius} r={radius} fill={KATAWARE_DOKI} />
    </svg>
  )
}

export default Tree
