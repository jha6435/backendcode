package com.demo.dto;

public class Customer {
		
		private String source;
		private String designation;
		private int noOfPassengers;
		
		public Customer() {}

		public Customer(String source, String designation, int noOfPassengers) {
			
			this.source = source;
			this.designation = designation;
			this.noOfPassengers = noOfPassengers;
		}

		public String getSource() {
			return source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}

		public int getNoOfPassengers() {
			return noOfPassengers;
		}

		public void setNoOfPassengers(int noOfPassengers) {
			this.noOfPassengers = noOfPassengers;
		}
		
		
		

	}


