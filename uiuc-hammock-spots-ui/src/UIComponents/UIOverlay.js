import React from 'react'
import styled from 'styled-components'
import { Transition } from 'react-transition-group'

const duration = 300
const BaseOverlay = styled.div`
  position: absolute;
  z-index: 5;
  left: 0;
  background: rgba(255, 255, 255, 0.5);
  width: 100vw;
  height: 100vh;
  transition: opacity ${duration}ms ease-in-out;
  opacity: 0;
`

const transitionStyles = {
  entering: { opacity: 0 },
  entered: { opacity: 1 },
  exiting: { opacity: 0 },
  exited: { opacity: 1 },
}

const UIOverlay = ({ inProp }) => (
  <Transition in={inProp} timeout={duration}>
    {(state) => (
      <BaseOverlay
        styles={{
          ...{ opacity: 0 },
          ...transitionStyles[state],
        }}
      />
    )}
  </Transition>
)

export default UIOverlay
