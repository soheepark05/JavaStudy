package com.kh.chap2._class;

/*
 * 클래스에서 사용 가능한 접근 제한자
 * 
 * 1. public
 *   - 동일한 패키지뿐만 아니라 다른 패키지에서도 아무런 제약 없이 사용할 수 있다.
 *   
 * 2. default
 *   - 클래스를 선언할 때 public을 생략했다면 클래스는 default 접근 제한을 가진다.
 *   - 동일한 패키지에는 아무런 제약 없이 사용할 수 있지만 다른 패키지에서는 사용할 수 없도록 접근이 제한된다.
 */
public class Person {
	private String name;
	
	private int age;
	
	// Phone 클래스는 접근 제한이 default라도 동일한 패키지에 존재하는 Person 클래스에서 생성할 수 있다.
//	private Phone phone;
	private Phone phone = new Phone();

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void setPhone(String name, String color, String brand) {
//		this.phone = new Phone();
		
		phone.setName(name);
		phone.setColor(color);
		phone.setBrand(brand);
	}

//	public String whoAreYou() {
//		return "안녕하세요. 저는 " + this.name + "입니다. 나이는 " + this.age + "세 입니다." ;
//	}

	public void whoAreYou() {
		System.out.println("안녕하세요. 저는 " + this.name + "입니다. 나이는 " + this.age + "세 입니다.");
		System.out.println("저는 " + phone.getBrand() + " 브랜드의 " + phone.getName() + "을 가지고 있습니다.");
	}
}
