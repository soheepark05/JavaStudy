package com.kh.chap3.assiststream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap3.assiststream.model.vo.Member;

public class D_OjbectStream {
	public void fileSave() {
		Member member = new Member("ismoon", "1234", "문인수", 20, 'M');
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e_object.dat"))) {
			System.out.println("객체 입력 전");
			
			oos.writeObject(member);
			
			System.out.println("객체 입력 후");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileRead() {
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e_object.dat"))) {
			System.out.println("객체 출력 전");
			
			Member member = (Member) ois.readObject();
			
			System.out.println(member);
			System.out.println("객체 출력 후");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void objectsSave() {
		// Member 객체를 배열에 담아서 반복문을 통해서 파일에 저장하기 ("f_objects.dat")
		Member[] members = {
				new Member("ismoon", "1234", "문인수",  20, 'M'), 
				new Member("kim", "5678", "김철수", 18, 'M'),
				new Member("hong", "91011", "홍길동", 21, 'F')
		};
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("f_objects.dat"))) {
			System.out.println("객체배열 저장 전");
			
			for (Member member : members) {
				oos.writeObject(member);
				
				System.out.println(member.getName() + " 객체 저장 완료!");
			}
			
			System.out.println("객체배열 저장 후");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void objectsRead() {
		// 파일에 저장 된 Member 객체를 읽어서 배열에 저장 후 각 객체의 toString() 메소드를 출력
		Member[] members = new Member[3];
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("f_objects.dat"))) {
			System.out.println("객체배열 읽기 전");
			
			members[0] = (Member) ois.readObject();
			members[1] = (Member) ois.readObject();
			members[2] = (Member) ois.readObject();
			
			for (Member member : members) {
				System.out.println(member);
			}
			
			System.out.println("객체배열 읽기 후");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
