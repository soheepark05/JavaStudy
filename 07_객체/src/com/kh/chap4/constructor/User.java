package com.kh.chap4.constructor;


/*
 * 생성자
 * 
 *  [표현법]
 *  
 *    [접근 제한자] 클래스명([매개변수, ...]) {
 *       .. 필드를 초기화하거나, 객체를 사용할 준비 ..
 *    }
 * 
 *  - 생성자는 클래스로부터 객체를 생성할 때 호출되어 객체의 초기화를 담당한다. (필드 초기화, 객체를 사용할 준비)
 *  - 생성자 작성 시 주의사항
 *    - 생성자 명은 반드시 클래스 명과 동일해야 한다.
 *    - 반환형이 존재하지 않는다.
 *    - 매개 변수가 있는 생성자를 작성하게 되면 기본 생성자를 JVM이 자동으로 만들어주지 않는다.
 *      (즉, 기본 생성자는 항상 기본으로 작성하는 습관을 들여야 한다.)   
 * 
 */
public class User {
	private String id;
	
	private String pwd;
	
	private String name;
	
	private int age;
	
	private char gender;
	
	// 기본 생성자
	// 객체 생성만을 목적으로 사용된다.
	public User() {
		System.out.println("기본 생성자 호출");
	};
	
	// 생성자를 private으로 선언하면 외부에서 절대로 객체를 생성할 수 없다.
	// 클래스 내부에서만 생성자를 호출할 수 있고, 객체를 생성할 수 있다.
//	private User() {
//	}
	
	// 매개변수가 있는 생성자 (아이디, 패스워드, 이름)
	// 객체 생성과 동시에 전달된 값들을 매개변수로 받아서 필드를 초기화하는 목적으로 사용된다.
	public User(String id, String pwd, String name) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}
	
	// 매개변수가 있는 생성자 (아이디, 패스워드, 이름, 나이, 성별)
	public User(String id, String pwd, String name, int age, char gender) {
		// 클래스 내에서 문자열 매개 변수 3개를 가지는 생성자가 존재하기 때문에 this(...) 통해서 생성자 호출이 가능하다.
		this(id, pwd, name);
//		this.id = id;
//		this.pwd = pwd;
//		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String infomation() {
//		this(); (X)
		return this.id + ", " + this.pwd + ", " + this.name + ", " + this.age + ", " + this.gender;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
}
