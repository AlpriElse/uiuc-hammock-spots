import React, { useEffect, useState } from 'react'
import { Transition } from 'react-transition-group'

import UIFlex from '../UIComponents/UIFlex'

import LoadingSpinner from './loading-spinner/LoadingSpinner'

const duration = 400
const defaultStyle = {
  transition: `opacity ${duration}ms ease-in-out, transform ${duration}ms ease-in-out`,
  opacity: 0,
  transform: 'translateY(-20px)',
}

const transitionStyles = {
  entering: { opacity: 1, transform: 'translateY(0)' },
  entered: { opacity: 1, transform: 'translateY(0)' },
  exiting: { opacity: 0, transform: 'translateY(20px)' },
  exited: { opacity: 0, transform: 'translateY(20px)' },
}

const LoadingMessage = () => {
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
          <h1 className="center-block" style={{ fontSize: '3em' }}>
            loading...
          </h1>
          <UIFlex direction="row" justify="center">
            <LoadingSpinner />
          </UIFlex>
        </div>
      )}
    </Transition>
  )
}

export default LoadingMessage
