package com.kh.chap4;

import java.util.List;

import com.kh.chap4.generics.MyGenerics;

public class Application {

	public static void main(String[] args) {
		String[] strArr = {"문인수", "김성엽", "김이영", "박찬의", "서수민"};
		Integer[] intArr = {11, 22, 33, 44, 55};
		Double[] doubleArr = {11.4, 22.8, 33.2, 44.7, 55.6};

//		MyGenerics<String> myGenerics = new MyGenerics<>(strArr);
		MyGenerics<Double> myGenerics = new MyGenerics<>(doubleArr);
		MyGenerics<Integer> myGenerics2 = new MyGenerics<>(intArr);
		
		myGenerics.print();
		myGenerics2.print();
		
		List<Double> list = myGenerics.toList();
		List<Integer> list2 = myGenerics2.toList();
		
		for (Double d : list) {
			System.out.println(d);
		}
		
		for (Integer i : list2) {
			System.out.println(i);
		}
	}
}
