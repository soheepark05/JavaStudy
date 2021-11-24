package com.kh.chap4.generics;

import java.util.ArrayList;
import java.util.List;

//public class MyGenerics<T> {
public class MyGenerics<T extends Number> {
	private T[] array;
	
	public MyGenerics() {
	}
	
	public MyGenerics(T[] array) {
		this.array = array;
	}
	
	public void print() {
		for(T t : array) {
			
			System.out.println(t);
		}
	}
	
	public List<T> toList() {
		List<T> list = new ArrayList<>();
		
		for (T t : array) {
			list.add(t);
		}
		
		return list;
	}
}
