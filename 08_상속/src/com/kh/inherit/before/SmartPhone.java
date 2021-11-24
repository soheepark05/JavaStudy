package com.kh.inherit.before;

public class SmartPhone {
	private String brand; // 브랜드
	
	private String pCode; // 상품코드
	
	private String name; // 상품명
	
	private int price; // 가격
	
	private String mobileAgency; // 통신사
	
	public SmartPhone() {
	}

	public SmartPhone(String brand, String pCode, String name, int price, String mobileAgency) {
		this.brand = brand;
		this.pCode = pCode;
		this.name = name;
		this.price = price;
		this.mobileAgency = mobileAgency;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMobileAgency() {
		return mobileAgency;
	}

	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	
	public String information() {
		return this.brand + ", " + this.name + ", " + this.pCode + ", " + this.price + ", " + this.mobileAgency;
	}
}
