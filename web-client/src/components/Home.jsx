import React, { Component } from "react";
import Header from "./Header";
import Banner from "./Banner";
import MostVisted from "./MostVisited";
import Footer from './Footer'
class Home extends Component {
  state = {};
  render() {
    return (
      <React.Fragment>
        <Header></Header>
        <Banner></Banner>
        <MostVisted></MostVisted>
        <Footer></Footer>
      </React.Fragment>
    );
  }
}

export default Home;
