package com.kh.chap1.list;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.chap1.list.compare.AritistAcending;
import com.kh.chap1.list.compare.TitleAcending;
import com.kh.chap1.list.model.vo.Music;

public class A_ArrayList {
	
	public void method1() {
		// ArrayList를 생성, 데이터 저장, 출력 테스트
		
		/*
		 * ArrayList
		 *   - ArrayList를 생성하면 내부적으로 10개의 객체를 저장할 수 있는 공간이 생성된다.
		 *   - 저장 순서가 유지되고 인덱스를 통해서 관리된다.
		 *   - 객체만 저장할 수 있고 null도 저장이 가능하다.
		 *   - 중복되는 객체의 저장도 허용한다.
		 * 
		 */
		List list = new ArrayList();
		
		list.add("안녕하세요.");
		list.add(3.14); // 오토 박싱이 적용됨
		list.add(LocalDateTime.now());
		list.add(1);
		
		System.out.println("list : " + list);
		System.out.println("Size : " + list.size());
		System.out.println();
		
		for(int i = 0; i < list.size(); i++) {
			// 인덱스에 해당하는 값을 가져올 때는 get() 메소드를 사용한다.
			System.out.println(list.get(i));
		}
		
		// list에서 값을 꺼내서 대입하기 위해서는 해당 자료형에 맞게 형변환을 해주어야 한다.
//		String str = (String) list.get(0);
//		int num = (int) list.get(3);
		
		
		System.out.println();
		
		// 객체의 중복 저장을 허용한다.
		list.add("안녕하세요.");
		System.out.println("list : " + list);
		
		// 원하는 인덱스 위치에 객체를 추가할 수 있다.
		list.add(2, 1234500);
		System.out.println("list : " + list);
		
		// 원하는 인덱스 위치에 객체를 변경할 수 있다.
		list.set(2, false);
		System.out.println("list : " + list);
		
		// 저장된 객체를 삭제할 때 remove() 메소드를 사용한다.
		list.remove(2);
		list.remove("안녕하세요.");
		list.remove(3.14);
		list.remove(Integer.valueOf(1));
		System.out.println("list : " + list);
		System.out.println("list.isEmpty() : " + list.isEmpty());
		
		// 저장된 객체를 모두 삭제할 때는 clear() 메소드를 사용한다.
		list.clear();
		System.out.println("list : " + list);
		System.out.println("list.isEmpty() : " + list.isEmpty());	
	}
	
	public void method2() {
		/*
		 * 리스트 정렬
		 *  - 기본 자료형, 문자열의 경우엔 Comparable 인터페이스가 내부적으로 구현되어 있어 Collections.sort()를 통해서 정렬이 가능하다.
		 *  - 사용자가 작성하는 클래스의 객체도 Collections.sort()를 통해서 정렬이 가능하게 하고 싶다면 Comparable 인터페이스를 구현하면 된다.
		 * 
		 * 제네릭스(<>)를 사용하는 이유
		 *   - 명시된 타입의 객체만 저장하도록 제한을 두기 위해서 사용한다.
		 *   - 컬렉션에 저장된 객체를 꺼내서 사용할 때 매번 형변환을 하지 않아도 된다. 
		 */
		List<String> list = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		list.add("apple");
		list.add("orange");
		list.add("banana");
		list.add("mango");
		list.add("grape");
		
		list2.add(7);
		list2.add(1);
		list2.add(8);
		list2.add(10);
		list2.add(3);
		list2.add(2);
		
		System.out.println(list);
		System.out.println(list2);
		
		// 오름차순으로 리스트를 정렬하는 메소드
		Collections.sort(list);
		Collections.sort(list2);
		
		System.out.println(list);
		System.out.println(list2);
		
		// 내림차순으로 리스트를 정렬하는 메소드
		Collections.reverse(list);
		Collections.reverse(list2);
		
		System.out.println(list);
		System.out.println(list2);
	}
	
	public void method3() {
		// Music 객체를 list 담아서 출력하고 정렬해보기
		
		List<Music> list = new ArrayList<>();
		
		list.add(new Music("Permission to Dance", "BTS", 1));
		list.add(new Music("Butter", "BTS", 3));
		list.add(new Music("Ice Cream", "BlackPink", 5));
		list.add(new Music("헤픈우연?", "헤이즈", 2));
		list.add(new Music("눈의꽃", "박효신", 4));
		
		for(Music music : list) {
			System.out.println(music);
		}
		
		System.out.println();
		
		Collections.sort(list);
		
		for(Music music : list) {
			System.out.println(music);
		}
		
		System.out.println();
		
		Collections.sort(list, new TitleAcending());
		
		for(Music music : list) {
			System.out.println(music);
		}
		
		System.out.println();
		
		Collections.sort(list, new AritistAcending());
		
		for(Music music : list) {
			System.out.println(music);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
