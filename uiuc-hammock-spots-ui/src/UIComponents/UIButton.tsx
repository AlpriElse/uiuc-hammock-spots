import React from 'react'
import Button from 'react-bootstrap/Button'
import styled from 'styled-components'

import * as Colors from '../constants/Colors'

const StyledButton = styled(Button)`
  background-color: ${Colors.SACHI};
  border-color: ${Colors.SACHI};
  &:hover {
    color: ${Colors.KATAWARE_DOKI};
    background-color: ${Colors.MAHITO};
    border-color: ${Colors.MAHITO};
  }
  &:active {
    color: ${Colors.KATAWARE_DOKI};
    background-color: ${Colors.MAHITO};
    border-color: ${Colors.MAHITO};
  }

  transition: transform 200ms ease-in-out;
  transform: translateY(0);
  &:hover {
    transform: translateY(-3px);
  }
`

export default StyledButton
