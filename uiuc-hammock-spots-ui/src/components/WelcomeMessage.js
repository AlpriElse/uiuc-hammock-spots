import React, { useEffect, useState } from 'react'
import { Link } from 'react-router-dom'
import styled from 'styled-components'
import { Transition } from 'react-transition-group'

import UIButton from '../UIComponents/UIButton'

const duration = 300
const defaultStyle = {
  transition: `opacity ${duration}ms ease-in-out, transform ${duration}ms ease-in-out`,
  opacity: 0,
  transform: 'translateY(-10px)',
}

const transitionStyles = {
  entering: { opacity: 1, transform: 'translateY(0)' },
  entered: { opacity: 1, transform: 'translateY(0)' },
  exiting: { opacity: 0 },
  exited: { opacity: 0 },
}

const StyledButton = styled(UIButton)`
  padding: 0.5em 2em;
  font-size: 1.2em;
`

const WelcomeMessage = () => {
  const [inProp, setInProp] = useState(false)
  useEffect(() => {
    setInProp(true)
  }, [])

  return (
    <Transition in={inProp} timeout={duration}>
      {(state) => (
        <div
          style={{
            ...defaultStyle,
            ...transitionStyles[state],
          }}
        >
          <h1>Welcome to UIUC Hammock spots!</h1>
          <Link to="/map">
            <StyledButton className="mt-3">Find spots!</StyledButton>
          </Link>
        </div>
      )}
    </Transition>
  )
}

export default WelcomeMessage
