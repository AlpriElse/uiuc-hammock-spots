import React, { useContext } from 'react'
import styled from 'styled-components'
import Button from 'react-bootstrap/Button'

import { ActionType } from '../constants/ActionTypes'
import { store } from '../store'

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
`

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
`

const FilterControls = () => {
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
    <StyledDiv>
      <h4 className="pb-4">Hammock Spots</h4>
      <div className="pb-3">
        <h6>Minimum Distance Between Trees</h6>
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
        <h6>Maximum Distance Between Trees</h6>
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
        <StyledButton
          variant="primary"
          size="lg"
          onClick={handleHammockFilterClick}
        >
          Find Hammock Spots
        </StyledButton>
      </div>
    </StyledDiv>
  )
}

export default FilterControls
