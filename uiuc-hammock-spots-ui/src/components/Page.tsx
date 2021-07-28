import React from 'react'
import { Link } from 'react-router-dom'
import styled from 'styled-components'

import { KATAWARE_DOKI } from '../constants/Colors'

const StyledDiv = styled.div`
  background-color: ${KATAWARE_DOKI};
`

const Page = ({ ...props }) => {
  return (
    <div>
      <nav>
        <ul>
          <li>
            <Link to="/">Loading Assets</Link>
          </li>
          <li>
            <Link to="/landing">Landing</Link>
          </li>
          <li>
            <Link to="/map">Map</Link>
          </li>
        </ul>
      </nav>
      <StyledDiv {...props} />
    </div>
  )
}

export default Page
