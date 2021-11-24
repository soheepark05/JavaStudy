package com.kh.chap2;

import com.kh.chap2._class.Person;

public class Application {

	public static void main(String[] args) {
	
		Person ismoon = new Person();
		// Phone 클래스는 접근 제한이 default 클래스로 패키지 외부에서 접근이 불가능하다. (객체 생성 불가)
//		Phone phone = new Phone(); (X)
		
		ismoon.setName("문인수");
		ismoon.setAge(20);
		ismoon.setPhone("아이폰12미니", "화이트", "애플");
		ismoon.setPhone("아이폰11", "블랙", "애플");
		
//		System.out.println(ismoon.whoAreYou());
		ismoon.whoAreYou();
	}
}
