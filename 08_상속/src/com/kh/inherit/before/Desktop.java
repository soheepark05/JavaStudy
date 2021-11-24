package com.kh.inherit.before;

public class Desktop {
	private String brand; // 브랜드
	
	private String pCode; // 상품코드
	
	private String name; // 상품명
	
	private int price; // 가격
	
	private boolean allInOne; // 일체 여부
	
	public Desktop() {
	}

	public Desktop(String brand, String pCode, String name, int price, boolean allInOne) {
		this.brand = brand;
		this.pCode = pCode;
		this.name = name;
		this.price = price;
		this.allInOne = allInOne;
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

	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	public String information() {
		return this.brand + ", " + this.name + ", " + this.pCode + ", " + this.price + ", " + this.allInOne;
	}
}
