package edu.mum.cs.paypalservice.model;

public class Booking {
	 private String userId;
	    private String price;
	    
		public Booking(String userId, String price) {
			super();
			this.userId = userId;
			this.price = price;
		}
		public Booking() {
			super();
		}
		public String getUserId() {
			return userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public String getPrice() {
			return price;
		}
		public void setPrice(String price) {
			this.price = price;
		}
}
