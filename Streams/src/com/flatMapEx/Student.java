package com.flatMapEx;

import java.util.List;

public class Student {

		private List<State> state;
		private List<Address> address;
		public List<State> getState() {
			return state;
		}
		public void setState(List<State> state) {
			this.state = state;
		}
		public List<Address> getAddress() {
			return address;
		}
		public void setAddress(List<Address> address) {
			this.address = address;
		}
		public Student(List<State> state, List<Address> address) {
			super();
			this.state = state;
			this.address = address;
		}
		@Override
		public String toString() {
			return "Student [state=" + state + ", address=" + address + "]";
		}
		
		
		
	
}
