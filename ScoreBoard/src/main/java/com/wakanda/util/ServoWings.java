package com.wakanda.util;

public class ServoWings {

	private int address;
	private int wingNumber;
	public int getAddress() {
		return address;
	}
	public void setAddress(int address) {
		this.address = address;
	}
	public int getWingNumber() {
		return wingNumber;
	}
	public void setWingNumber(int wingNumber) {
		this.wingNumber = wingNumber;
	}
	public ServoWings(int address, int wingNumber) {
		super();
		this.address = address;
		this.wingNumber = wingNumber;
	}
	
}
