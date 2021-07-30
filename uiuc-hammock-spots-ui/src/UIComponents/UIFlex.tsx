import React from 'react'
import styled from 'styled-components'

interface UIFlexProps {
  align: string
  direction: string
  justify: string
  wrap: string
}

const FlexWrapper = styled.div`
  display: flex;
  align-items: ${(props: UIFlexProps) => props.align};
  flex-direction: ${(props: UIFlexProps) => props.direction};
  justify-content: ${(props: UIFlexProps) => props.justify};
  flex-wrap: ${(props: UIFlexProps) => props.wrap};
  & > * {
    min-width: 0;
  }
`

const UIFlex = ({
  align = 'start',
  direction = 'row',
  justify = 'start',
  wrap = 'nowrap',
  ...props
}) => (
  <FlexWrapper
    align={align}
    direction={direction}
    justify={justify}
    wrap={wrap}
    {...props}
  />
)

export default UIFlex
