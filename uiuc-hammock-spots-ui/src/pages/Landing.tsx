import React, { useContext, useEffect } from 'react'

import { store } from '../store'

import UIFlex from '../UIComponents/UIFlex'

import Page from '../components/Page'
import WelcomeMessage from '../components/WelcomeMessage'

const Loading = () => {
  const { state } = useContext(store)
  const isLoading = state.trees.length === 0

  return (
    <Page>
      <UIFlex direction="column" justify="center" style={{ height: '100%' }}>
        <UIFlex direction="row" justify="center" style={{ width: '100%' }}>
          {isLoading ? <h1>Loading...</h1> : <WelcomeMessage />}
        </UIFlex>
      </UIFlex>
    </Page>
  )
}

export default Loading
