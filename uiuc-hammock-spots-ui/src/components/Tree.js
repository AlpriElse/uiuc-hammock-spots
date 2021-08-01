import React from 'react'

import { KATAWARE_DOKI } from '../constants/Colors'

const Tree = ({ dbh }) => {
  // Map 1 to 1.5px and >30 to 4
  const radius = Math.min(1, dbh / 30) * 3 + 1.5
  return (
    <svg>
      <circle cx={radius} cy={radius} r={radius} fill={KATAWARE_DOKI} />
    </svg>
  )
}

export default React.memo(Tree)
