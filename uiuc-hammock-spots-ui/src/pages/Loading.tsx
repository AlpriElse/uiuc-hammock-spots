import React from 'react'

import UIFlex from '../UIComponents/UIFlex'

import Page from '../components/Page'

const Loading = () => {
  return (
    <Page>
      <UIFlex direction="column" justify="center" style={{ height: '100%' }}>
        <UIFlex direction="row" justify="center" style={{ width: '100%' }}>
          <h1>Loading...</h1>
        </UIFlex>
      </UIFlex>
    </Page>
  )
}

export default Loading
