import React, { useEffect, useState } from 'react'
import { Transition } from 'react-transition-group'

import FilterControls from '../components/FilterControls'
import Map from '../components/Map'
import Page from '../components/Page'

const duration = 300
const defaultStyles = {
  transition: `opacity ${duration}ms ease-in-out`,
  opacity: 0,
  height: '100%',
  width: '100%',
}

const transitionStyles = {
  entering: { opacity: 1 },
  entered: { opacity: 1 },
  exiting: { opacity: 0 },
  exited: { opacity: 0 },
}

const MapPage = () => {
  const [isRendered, setIsRendered] = useState(false)
  useEffect(() => {
    setIsRendered(true)
  }, [])

  return (
    <Page>
      <FilterControls />
      <Transition in={isRendered} timeout={duration}>
        {(state) => (
          <div
            style={{
              ...defaultStyles,
              ...transitionStyles[state],
            }}
          >
            <Map />
          </div>
        )}
      </Transition>
    </Page>
  )
}

export default MapPage
