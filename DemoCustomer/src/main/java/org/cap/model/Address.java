package org.cap.model;

public class Address {
	private String addressline;
	private String city;
	public String getAddressline() {
		return addressline;
	}
	public void setAddressline(String addressline) {
		this.addressline = addressline;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String addressline, String city) {
		super();
		this.addressline = addressline;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [addressline=" + addressline + ", city=" + city + "]";
	}
	

}
