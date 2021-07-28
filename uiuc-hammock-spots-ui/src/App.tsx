import React from 'react'
import { BrowserRouter as Router, Switch, Route } from 'react-router-dom'

import Landing from './pages/Landing'
import Loading from './pages/Loading'
import Map from './pages/Map'

function App() {
  return (
    <Router>
      {/* A <Switch> looks through its children <Route>s and
            renders the first one that matches the current URL. */}
      <Switch>
        <Route exact path="/">
          <Loading />
        </Route>
        <Route path="/landing">
          <Landing />
        </Route>
        <Route path="/map">
          <Map />
        </Route>
      </Switch>
    </Router>
  )
}

export default App
