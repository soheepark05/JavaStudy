package com.kh.inherit.after;

/*
 * 상속
 *   [표현법]
 *     [접근 제한자] class 클래스명 extends 부모클래스명 { ... }
 *     
 *   상속의 장점
 *     - 적은 양의 코드로 새로운 클래스를 작성이 가능하다.
 *     - 코드를 공통적으로 관리하기 때문에 코드를 추가나 변경에 용이하다.
 *     - 코드의 중복을 제거하여 프로그램의 생산성과 유지보수에 크게 기여한다.
 * 
 */

public class Desktop extends Product {
	private boolean allInOne; // 일체 여부
	
	public Desktop() {
		System.out.println("자식 객체 기본 생성자");
	}
	
	/*
	 * 부모 필드를 초기화할 수 있는 방법
	 * 
	 * 1. super.를 통해서 부모의 필드에 직접 접근
	 *   - 부모의 필드가 private이면 직접 접근을 할 수 없다.
	 *   - 부모의 필드가 default이면 동일한 패키지 경로에 있어야만 직접 접근이 가능하다.
	 *   - 부모의 필드가 protected이면 상속관계일 때 자식 객체에서 직접 접근이 가능하다.
	 *   - 부모의 필드가 public이면 어디서든 접근이 가능하다.
	 * 
	 * 2. 부모의 setter 메소드를 통해서 초기화
	 *   - 부모 클래스에서 setter 메소드를 제공하면 자식 객체에서 setter 메소드를 통해서 필드의 초기화가 가능하다.
	 *   - setter는 public 접근 제한자를 갖기 때문에 가능하다.
	 * 
	 * 3. 부모 생성자 호출해서 초기화
	 *   - super([매개값, ...])를 통해서 자식의 생성자에서 부모의 생성자를 호출할 수 있다.
	 */
	
	public Desktop(String brand, String pCode, String name, int price, boolean allInOne) {
		super(brand, pCode, name, price);
		
//		super.name = "홍길동";
//		this.setBrand(brand);
//		this.setpCode(pCode);
//		this.setName(name);
//		this.setPrice(price);
		
		this.allInOne = allInOne;
	}

	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}

	@Override
	public String information() {	
		
		return super.information() + ", " + this.allInOne;
	}
}
