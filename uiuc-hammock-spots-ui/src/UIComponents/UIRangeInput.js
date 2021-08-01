import React from 'react'
import Form from 'react-bootstrap/Form'

//  TODO: implement custom slider
//  -   https://dev.to/sandra_lewis/building-a-multi-range-slider-in-react-from-scratch-4dl1
//  -   https://css-tricks.com/sliding-nightmare-understanding-range-input/
const UIRangeInput = ({ ...props }) => <Form.Range {...props} />

export default UIRangeInput
