package com.kh.chap1.polymorphism;

public class SmartPhone extends Product {
	private String mobileAgency; // 통신사
	
	public SmartPhone() {
	}
	
	public SmartPhone(String brand, String pCode, String name, int price, String mobileAgency) {
		super(brand, pCode, name, price);
		
		this.mobileAgency = mobileAgency;
	}

	public String getMobileAgency() {
		return mobileAgency;
	}

	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}

	@Override
	public String information() {
		
		return super.information() + ", " + this.mobileAgency;
	}
}
