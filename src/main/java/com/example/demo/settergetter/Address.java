package com.example.demo.settergetter;

public class Address {
	
	private String address1;
	private String address2;
	private Integer pinCode;
	
	
	@Override
	public String toString() {
		return "Address [address1=" + address1 + ", address2=" + address2 + ", pinCode=" + pinCode + "]";
	}
	
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public Integer getPinCode() {
		return pinCode;
	}
	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}
	

}
