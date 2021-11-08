import React from 'react'
import { BrowserRouter as Router, Switch, Route } from 'react-router-dom'

import Landing from './pages/Landing'
import Map from './pages/MapPage'

function App() {
  return (
    <Router>
      {/* A <Switch> looks through its children <Route>s and
            renders the first one that matches the current URL. */}
      <Switch>
        <Route exact path="/">
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
