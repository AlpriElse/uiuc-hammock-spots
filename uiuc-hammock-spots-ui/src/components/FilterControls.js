import React, { useContext, useEffect, useState } from 'react'
import styled from 'styled-components'
import { Transition } from 'react-transition-group'

import { ActionType } from '../constants/ActionTypes'
import { store } from '../store'

import UIButton from '../UIComponents/UIButton'
import UIFlex from '../UIComponents/UIFlex'
import UIRangeInput from '../UIComponents/UIRangeInput'
import * as Colors from '../constants/Colors'

const MINIMUM_POSSIBLE_TREE_DISTANCE = 1
const MAXIMUM_POSSIBLE_TREE_DISTANCE = 30

const StyledDiv = styled.div`
  position: fixed;
  z-index: 10;
  margin: 1.5em;

  background-color: ${Colors.KATAWARE_DOKI};
  border-radius: 1.5em;
  padding: 2em 1.75em;
  min-width: 16vw;

  box-shadow: 0px 6px 7px 1px rgba(171, 171, 171, 0.26);
  -webkit-box-shadow: 0px 6px 7px 1px rgba(171, 171, 171, 0.26);
  -moz-box-shadow: 0px 6px 7px 1px rgba(171, 171, 171, 0.26);
`

const SliderLabel = styled.span`
  padding: 0.5em;
  padding-left: 0;
  font-size: 1em;
  min-width: 2.5em;
  font-family: 'Roboto', sans-serif;
`

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

const FilterControls = () => {
  const [isRendered, setIsRendered] = useState(false)
  useEffect(() => {
    setTimeout(() => setIsRendered(true), 1000)
  }, [])

  const { state, dispatch } = useContext(store)
  const { minimum_tree_distance, maximum_tree_distance } = state

  const handleMinimumTreeDistanceChange = (e) =>
    dispatch({
      type: ActionType.SET_MINIMUM_TREE_DISTANCE,
      minimum_tree_distance: e.target.value,
    })

  const handleMaximumTreeDistanceChange = (e) =>
    dispatch({
      type: ActionType.SET_MAXIMUM_TREE_DISTANCE,
      maximum_tree_distance: e.target.value,
    })

  const handleHammockFilterClick = () =>
    dispatch({
      type: ActionType.FILTER_HAMMOCK_SPOTS,
    })

  return (
    <Transition in={isRendered} timeout={duration}>
      {(state) => (
        <StyledDiv style={{ ...defaultStyle, ...transitionStyles[state] }}>
          <h4 className="pb-4">Hammock Spots</h4>
          <div className="pb-3">
            <h6 className="copy-font">Minimum Distance Between Trees</h6>
            <UIFlex align="center">
              <SliderLabel>{minimum_tree_distance}</SliderLabel>
              <UIRangeInput
                min={MINIMUM_POSSIBLE_TREE_DISTANCE}
                max={MAXIMUM_POSSIBLE_TREE_DISTANCE}
                value={minimum_tree_distance}
                onChange={handleMinimumTreeDistanceChange}
              />
            </UIFlex>
          </div>
          <div className="pb-3">
            <h6 className="copy-font">Maximum Distance Between Trees</h6>
            <UIFlex align="center">
              <SliderLabel>{maximum_tree_distance}</SliderLabel>
              <UIRangeInput
                min={MINIMUM_POSSIBLE_TREE_DISTANCE}
                max={MAXIMUM_POSSIBLE_TREE_DISTANCE}
                value={maximum_tree_distance}
                onChange={handleMaximumTreeDistanceChange}
              />
            </UIFlex>
          </div>
          <div className="d-grid">
            <UIButton
              variant="primary"
              size="lg"
              onClick={handleHammockFilterClick}
            >
              Find Hammock Spots
            </UIButton>
          </div>
        </StyledDiv>
      )}
    </Transition>
  )
}

export default FilterControls
