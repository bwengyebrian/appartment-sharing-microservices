import React, { Component } from 'react';
class MostVisted extends Component {
    state = {  }
    render() { 
        return ( 
            <section class="fullwidth margin-top-65 padding-top-75 padding-bottom-70" data-background-color="#f8f8f8">
    
            <div class="container">
              <div class="row">
          
                <div class="col-md-12">
                  <h3 class="headline centered margin-bottom-45">
                    <strong class="headline-with-separator">Most Visited Places</strong>
                    <span>Discover Top-Rated Local Businesses</span>
                  </h3>
                </div>
          
                <div class="col-md-12">
                  <div class="simple-slick-carousel dots-nav">
          
                  { /* <!--  Listing Item  --> */ }
                  <div class="carousel-item">
                    <a href="listings-single-page.html" class="listing-item-container">
                      <div class="listing-item">
                        <img src="images/listing-item-01.jpg" alt="" />
          
                        <div class="listing-badge now-open">Now Open</div>
                        
                        <div class="listing-item-content">
                          <span class="tag">Eat and Drink</span>
                          <h3>Tom's Restaurant <i class="verified-icon"></i></h3>
                          <span>964 School Street, New York</span>
                        </div>
                        <span class="like-icon"></span>
                      </div>
                      <div class="star-rating" data-rating="3.5">
                        <div class="rating-counter">(12 reviews)</div>
                      </div>
                    </a>
                  </div>
                  { /* <!--  Listing Item / End  --> */ }
          
                  { /* <!--  Listing Item  --> */ }
                  <div class="carousel-item">
                    <a href="listings-single-page.html" class="listing-item-container">
                      <div class="listing-item">
                        <img src="images/listing-item-02.jpg" alt="" />
                        <div class="listing-item-details">
                          <ul>
                            <li>Friday, August 10</li>
                          </ul>
                        </div>
                        <div class="listing-item-content">
                          <span class="tag">Events</span>
                          <h3>Sticky Band</h3>
                          <span>Bishop Avenue, New York</span>
                        </div>
                        <span class="like-icon"></span>
                      </div>
                      <div class="star-rating" data-rating="5.0">
                        <div class="rating-counter">(23 reviews)</div>
                      </div>
                    </a>
                  </div>
                  { /* <!--  Listing Item / End  --> */ }		
          
              
    
                  </div>
                  
                </div>
          
              </div>
            </div>
          
          </section>
         );
    }
}
 
export default MostVisted;