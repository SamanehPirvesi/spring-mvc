package com.example.test.model;

public class Address {
	private String via;
	private int num;

	public Address() {
	}

	public Address(String via, int num) {
		this.via = via;
		this.num = num;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}
