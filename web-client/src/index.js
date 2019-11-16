import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import * as serviceWorker from './serviceWorker';
import { BrowserRouter as Router , Link , NavLink , Prompt } from 'react-router-dom'
import Route from  'react-router-dom/Route'
import AddAppartment from './components/AddAppartment'
import ListAppartments from './components/ListAppartments'
import SingleAppartment from './components/SingleAppartment';
import BookAppartment from './components/BookAppartment';
import Messages from './components/Messages';
import Bookings from './components/Bookings';
import Payments from './components/Payments';
import Listings from './components/Listings';
import Reviews from './components/Reviews';

ReactDOM.render((

    <React.Fragment>
    <Router>
      <Route exact path="/" component={App} />
      <Route exact path="/addlist" component={AddAppartment} />
      <Route exact path="/list" component={ListAppartments} />
      <Route exact path="/single" component={SingleAppartment} />
      <Route exact path="/book" component={BookAppartment} />
      <Route exact path="/messages" component={Messages} />
      <Route exact path="/bookings" component={Bookings} />
      <Route exact path="/payments" component={Payments} />
      <Route exact path="/listings" component={Listings} />
      <Route exact path="/reviews" component={Reviews} />
    </Router>
    </React.Fragment>
), document.getElementById('root'));

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();
