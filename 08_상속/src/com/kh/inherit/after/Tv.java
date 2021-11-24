package com.kh.inherit.after;

public class Tv extends Product {
	private int inch;
	
	public Tv() {
	}
	
	public Tv(String brand, String pCode, String name, int price, int inch) {
		this.setBrand(brand);
		this.setpCode(pCode);
		this.setName(name);
		this.setPrice(price);
		this.setInch(inch);
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

	@Override
	public String information() {
		
		return super.information() + ", " + this.inch;
	}
}
