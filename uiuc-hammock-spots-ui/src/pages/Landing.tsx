import React, { useContext } from 'react'

import { store } from '../store'

import UIFlex from '../UIComponents/UIFlex'

import LoadingSpinner from '../components/loading-spinner/LoadingSpinner'
import Page from '../components/Page'
import WelcomeMessage from '../components/WelcomeMessage'

const Loading = () => {
  const { state } = useContext(store)
  const isLoading = state.trees.length === 0

  return (
    <Page>
      <UIFlex direction="column" justify="center" style={{ height: '100%' }}>
        <UIFlex
          direction="row"
          justify="center"
          style={{ width: '100%' }}
          wrap="wrap"
        >
          {isLoading ? (
            <div>
              <h1 className="center-block" style={{ fontSize: '3em' }}>
                loading...
              </h1>
              <UIFlex className="" direction="row" justify="center">
                <LoadingSpinner />
              </UIFlex>
            </div>
          ) : (
            <WelcomeMessage />
          )}
        </UIFlex>
      </UIFlex>
    </Page>
  )
}

export default Loading
