import React from 'react'
import { Link } from 'react-router-dom'
import styled from 'styled-components'

import { KATAWARE_DOKI } from '../constants/Colors'

const StyledDiv = styled.div`
  background-color: ${KATAWARE_DOKI};
  height: 100vh;
  padding: 0;
`

const Page = ({ ...props }) => {
  return (
    <StyledDiv>
      <div style={{ width: '100%', height: '100%' }} {...props} />
    </StyledDiv>
  )
}

export default Page
