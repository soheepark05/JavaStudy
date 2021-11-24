package com.kh.chap3.map.model.vo;

public class Snack {
	public String flavor;
	
	public int calorie;
	
	public Snack() {
	}

	public Snack(String flavor, int calorie) {
		this.flavor = flavor;
		this.calorie = calorie;
	}

	@Override
	public String toString() {
		return "Snack [flavor=" + flavor + ", calorie=" + calorie + "]";
	}
}
