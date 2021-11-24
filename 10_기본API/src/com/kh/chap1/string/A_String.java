package com.kh.chap1.string;

import java.util.StringTokenizer;

public class A_String {
	
	public void method1() {
		// 문자열 리터럴과 new 문으로 생성된 문자열 비교
		
		// str1, str2와 같이 리터럴로 값을 초기화하게 되면 StringPool 영역에 값이 저장된다.
		// StringPool 영역에 중복된는 값이 존재할 수 없다. 기본에 존재하는 값이 있을 경우엔 존재하는 값의 주소값을 전달해 준다.
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		String str4 = new String("hello");
		
		System.out.println("str1 == str2 ? " + (str1 == str2));
		System.out.println("str1 == str3 ? " + (str1 == str3));
		System.out.println("str3 == str4 ? " + (str3 == str4));
		
		// equals() => String 클래스에서 이미 오버라이딩 되어있다.
		System.out.println("str1.equals(str2) ? " + str1.equals(str2));
		System.out.println("str2.equals(str3) ? " + str2.equals(str3));
		System.out.println("str3.equals(str4) ? " + str3.equals(str4));
		
		// hashCode() => String 클래스에서 이미 오버라이딩 되어있다.
		System.out.println("str1.hashCode() : " + str1.hashCode());
		System.out.println("str2.hashCode() : " + str2.hashCode());
		System.out.println("str3.hashCode() : " + str3.hashCode());
		System.out.println("str4.hashCode() : " + str4.hashCode());
		
		// 문자열 객체의 실제 주소값에 대해서 알고 싶으면 System.identityHashCode() 메소드를 통해서 확인이 가능하다.
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
		// toString() => String 클래스에서 이미 오버라이딩 되어있다.
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}
	
	public void method2() {
		// String 클래스에서 제공하는 메소드 사용
		String str = "Hello World!";
		
		// 1. charAt(int index) : 전달받은 index 위치의 하나의 문자만 추출해서 리턴한다.
		char ch = str.charAt(3);
		System.out.println(ch);
		System.out.println();
		
		// 2. concat(String str) : 전달받은 str과 원본 문자열을 하나로 합쳐진 새로운 문자열을 생성해서 리턴한다.
		String str2 = str.concat("!!!!!");
		System.out.println(str2);
		System.out.println(str);
		System.out.println();
		
		// 3. substring(int beginIndex) : 문자열의 beginIndex 위치에서부터 끝까지의 새로운 문자열을 생성해서 리턴한다.
		//    substring(int beginIndex, int endIndex) : 문자열의 beginIndex 위치에서부터 endIndex-1 까지의 새로운 문자열을 생성해서 리턴한다.
		String str3 = str.substring(6);
		String str4 = str.substring(2, 6);
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str);
		System.out.println();
		
		// 4. replace(char oldChar, char newChar) : 문자열에서 old 문자를 new 문자로 변경된 새로운 문자열을 생성해서 리턴한다.
		String str5 = str.replace('l', 'c');
		
		System.out.println(str5);
		System.out.println(str);
		System.out.println();
		
		// 5. toUpperCase() / toLowerCase() : 문자열을 모두 대/소문자로 변경한 새로운 문자열을 생성해서 리턴한다.
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str);
		System.out.println();
		
		// 6. trim() : 문자열의 앞뒤 공백을 제거한 새로운 문자열 생성해서 리턴한다.
		str = " java ";
		System.out.println(str.trim());
		System.out.println(str);
		System.out.println();
		
		// 7. toCharArray() : 문자열의 문자들을 문자 배열에 담아서 해당 배열의 주소값을 리턴한다.
		str = "Hello";
		char[] arr = str.toCharArray();
		
		System.out.println(arr[0]); // H 출력
		System.out.println();
		
		// 8. valueOf([기본 자료형, 문자 배열, 객체]) : 입력받은 값들을 문자열 변경해서 리턴한다.
		String str6 = String.valueOf(true);
		String str7 = String.valueOf(arr);
		String str8 = String.valueOf(3.141592F);
		
		System.out.println(str6);
		System.out.println(str7);
		System.out.println(str8);
		System.out.println();
	}
	
	public void method3() {
		// 구분자를 이용하여 문자열 분리
		String str = "Java,Oracle,JDBC,HTML,CSS,Spring";
		
		// 1. String 클래스의 split 메소드를 이용하는 방법
		//    split(String regex) : 입력받은 구분자로 문자열을 분리해서 문자열의 배열로 담아서 리턴한다.
		String[] strArr = str.split(",");
		System.out.println("strArr.length : " + strArr.length);
		
		for(String s : strArr) {
			System.out.println(s);
		}
		
		System.out.println();
		
		// 2. StringTokenizer 객체를 이용하는 방법
		//    countTokens() : 남아있는 토큰의 수를 리턴한다.
		//    hasMoreTokens() : 남아있는 토큰이 있는지 확인한다. (true, false를 리턴한다.)
		//    nextToken() : 토큰을 하나씩 꺼내온다.
		StringTokenizer st = new StringTokenizer(str, ","); 
		System.out.println("분리 후 문자열의 개수 : " + st.countTokens());
		
		// for 문을 통한 출력 방법
//		int length = st.countTokens();
//		
//		for(int i = 0; i < length; i++) {
//			System.out.println(st.nextToken());
//		}

		// while 문을 통한 출력 방법
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
