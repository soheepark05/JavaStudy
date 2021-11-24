package com.kh.chap1;

import com.kh.chap1.polymorphism.Desktop;
import com.kh.chap1.polymorphism.Product;
import com.kh.chap1.polymorphism.SmartPhone;
import com.kh.chap1.polymorphism.Tv;

/*
 * 다형성
 *   - 부모 타입으로부터 파생된 여러 가지 자식 객체를 부모 클래스의 참조변수로 다룰 수 있는 기술이다.
 *   - 즉, 부모 클래스의 참조변수로 다양한 자식 객체를 가질 수 있다.
 *   
 * UpCasing
 *  - 자식 타입 -> 부모 타입으로 형변환이 가능하다.
 *  - 형변환 연산자 생략이 가능하다. (자동 형변환)
 *  - 자식 타입의 멤버(필드, 메소드)에는 접근할 수 없다.
 * 
 * DownCasting
 *   - 부모 타입 -> 자식 타입으로 형봔환이 가능하다.
 *   - 형변환 연산자 생략이 불가능하다. (명시적 형변환)
 *   - ((자식타입)부모참조변수).자식메소드();
 */
public class Application {

	public static void main(String[] args) {
		// 1. 부모 타입의 레퍼런스로 부모 객체를 다루는 경우
		Product product = new Product();
		
		// product 참조변수로 Product의 멤버만 접근 가능
		System.out.println(product.information());
		
		// 2. 자식 타입의 레퍼런스로 자식 객체를 다루는 경우
		Desktop desktop = new Desktop();
		
		// desktop 참조변수로 Product, Desktop의 멤버에 접근 가능
		System.out.println(desktop.isAllInOne());
		System.out.println(desktop.information());
		
		// 3. 부모 타입의 레퍼런스로 자식 객체를 다루는 경우 (다형성 적용)
		Product product2 = /* (Product) */ new Desktop();
		
		// product2 참조변수로 Product의 멤버만 접근 가능
		// 하지만 Desktop의 멤버에 접근하고 싶으면 형변환을 해줘야 한다. (강제(명시적) 형변환)
		System.out.println(((Desktop)product2).isAllInOne());
		System.out.println(product2.information());
		
		// 4. 객체배열과 다형성
		// 다형성을 사용하기 전
		Desktop[] arr1 = new Desktop[2];
		arr1[0] = new Desktop();
		arr1[1] = new Desktop();
				
		SmartPhone[] arr2 = new SmartPhone[2];
		arr2[0] = new SmartPhone();
		arr2[1] = new SmartPhone();
		
		// 다형성을 적용하면 부모 클래스의 레퍼런스로 다양한 자식 객체들을 가리킬 수 있다.
		// 코드 길이가 감소, 유연한 코딩 가능
		Product[] arr3 = new Product[4]; // 부모 타입의 객체 배열
		arr3[0] = new Desktop();
		arr3[1] = new Desktop();
		arr3[2] = new SmartPhone();
		arr3[3] = new SmartPhone();
				
		// 객체 배열을 사용하는 경우 반복문을 통해서 쉽게 출력이 가능하다.
		for(int i = 0; i < arr3.length; i++) {
			
			/*
			 * instanceof 연산자
			 *   - 현재 레퍼런스가 실제로 어떤 클래스 형의 객체의 주소를 참조하고 있는지 확인할 때 사용한다.
			 */
			if(arr3[i] instanceof Desktop) {
				System.out.println("isAllInOne : " + ((Desktop)arr3[i]).isAllInOne());
			} else if(arr3[i] instanceof SmartPhone) {
				System.out.println("MobileAgency : " + ((SmartPhone)arr3[i]).getMobileAgency());
			}
		}
		
		Product product3 = new Desktop("삼성", "D-1", "매직스테이션", 1300000, false);
		Product product4 = new SmartPhone("삼성", "S-1", "갤럭시 S2", 200000, "KT");
		Product product5 = new Tv("삼성", "T-1", "스마트TV", 2000000, 60);
		
		/*
		 * 다형성에 오버라이딩의 개념을 접목하게 되면 실제 참조하고 있는 클래스의 오버라이딩된 메소드를 찾아가서 실행한다. 
		 * 동적 바인딩 : 프로그램이 실행되기 전에 컴파일 되면서 모든 메소드는 정적 바인이딩 되는데
		 *            컴파일 시 정적 바인딩 된 메소드를 실행할 당시의 객체 타입을 기준으로 바인딩 되는 것을 동적 바인딩이라고 한다. 
		 */
		System.out.println(product3.information());
		System.out.println(product4.information());
		System.out.println(product5.information());
	}
}
