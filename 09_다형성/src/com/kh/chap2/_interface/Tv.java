package com.kh.chap2._interface;

public class Tv extends Product {
	private int inch;
	
	public Tv() {
	}
	
	public Tv(String brand, String pCode, String name, int price, int inch) {
		super(brand, pCode, name, price);
		
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

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");		
	}
}
