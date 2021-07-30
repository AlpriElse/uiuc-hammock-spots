import React, { useContext } from 'react'
import { store } from '../store'

import UIFlex from '../UIComponents/UIFlex'

import Page from '../components/Page'

const Loading = () => {
  const { state } = useContext(store)
  const isLoading = state.trees.length === 0

  return (
    <Page>
      <UIFlex direction="column" justify="center" style={{ height: '100%' }}>
        <UIFlex direction="row" justify="center" style={{ width: '100%' }}>
          {isLoading ? <h1>Loading...</h1> : <h1>Done Loading.</h1>}
        </UIFlex>
      </UIFlex>
    </Page>
  )
}

export default Loading
