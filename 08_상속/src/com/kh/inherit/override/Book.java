package com.kh.inherit.override;


/*
 * 모든 클래스는 Object 클래스의 후손이다. 즉, 최상위 클래스는 항상 Object이다.
 * Object 클래스에 있는 모든 메소드를 다 사용할 수 있다.
 */

public class Book /* extends Object */{
	private String title;
	
	private String author;
	
	private int price;
	
	public Book() {
	}

	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String infomation() {
		return this.title + ", " + this.price;
	}

	/*
	 * 오버라이딩
	 *   - 자식 클래스가 상속받은 부모 클래스의 메소드를 재정의하는 것을 메소드 오버라이딩이라고 한다.
	 *   - 자식 객체를 통해서 실행 시 재정의 된 자식 메소드가 우선권을 가진다.
	 *     (부모 클래스에서 정의된 메소드가 사라지는게 아니다.)
	 *     
	 * 오버라이딩 성립 조건
	 *   - 부모 클래스의 메소드와 메소드명 동일
	 *   - 매개변수의 개수, 자료형, 순서 동일
	 *   - 반환형 동일
	 *   - 부모 메소드의 접근 제한자 보다 범위 같거나 커야한다.
	 *     public > protected > default > private
	 *     ex)
	 *       부모 클래스에서 정의된 메소드의 접근 제한자가 protected일 경우 자식 클래스에서 오버라이딩하는 메소드의 접근제한자는 protected이거나 public이어야 한다.
	 *       
	 * @Override 어노테이션
	 *   - 명시를 안 해줘도 오버라이딩 된다.
	 *   - 어노테이션을 붙이는 이유
	 *     - 해당 메소드가 오버라이딩 된 메소드라는 것을 컴파일러에게 알려주는 역할을 한다.
	 *     - 자식 메소드에서 재정의를 잘못하고 있는 경우 컴파일 에러로 표시
	 * 
	 */
	
	/*
	 * 1. Object 클래스의 toString() 메소드 오버라이딩
	 *   - toString() 메소드는 객체의 문자 정보를 리턴한다. 객체의 문자 정보란 객체를 문자열로 표현한 값을 말한다.
	 *   - 기본적으로 Object 클래스에서는 "클래스명@16진수 해시코드"를 리턴하는데 자식 클래스에서 객체에 대한 유용한 문자열 정보를 리턴하도록 재정의할 수 있다.
	 *   - print 메소드의 경우 기본적으로 객체의 참조 값을 매개값으로 넘겨주면 내부적으로 참조값.toString() 메소드를 호출해서 리턴되는 값을 출력해 준다.
	 * 
	 */
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
	/*
	 * 2. Object 클래스의 equals() 메소드 오버라이딩
	 *   - equals() 메소드는 매개 값으로 전달받은 객체와 동일한 객체라면 true를 리턴하고 그렇지 않으면 false를 리턴한다.
	 *   - 객체의 동등 비교 시 주소값 비교가 아닌 객체가 가지고 있는 필드의 값들이 모두 같을 경우 true가 반환되고, 
	 *     하나라도 다른 경우엔 false가 반환 되도록 재정의해서 사용할 수 있다. 
	 */
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		Book target = (Book) obj;
		
		// private은 해당 클래스에서 직접 접근이 가능하기 때문에 아래와 같이 target의 private 멤버에도 직접 접근이 가능하다.
		if (this.title.equals(target.title) && this.author.equals(target.author) && this.price == target.price) {
			result = true;
		}
		
		return result;
	}
	
	/*
	 * 3. Object 클래스의 hashCode() 메소드 오버라이딩
	 *   - 객체의 해시 코드란 객체를 식별할 하나의 정수값을 의미한다.
	 *   - 기본적으로 Object 클래스의 hashCode() 메소드는 객체의 메모리 번지를 이용해서 만들어주기 때문에 객체마다 다른 값을 가지고 있다.
	 *   - 컬렉션들은 hashCode() 메소드를 가지고 두 객체가 동등한지 비교한다. 해시코드값이 같으면 equals() 메소드로 다시 비교한다.
	 *     (hashCode()가 true를 리턴해도 equals()가 false를 리턴하면 다른 객체로 판단한다.)
	 * 
	 */
	
	@Override
	public int hashCode() {

		/*
		 * 해당 객체의 필드 값들을 하나의 문자열로 합쳐서 해당 문자열의 해시 코드를 리턴해준다.
		 *   - title + author + price ---> 문자열이 된다.
		 * String 클래스에서 같은 문자열일 경우 해당 문자열의 hashCode는 같도록 이미 재정의되어 있다.
		 */
		return (this.title + this.author + this.price).hashCode();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
