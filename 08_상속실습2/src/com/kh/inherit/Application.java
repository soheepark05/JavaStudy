package com.kh.inherit;

import com.kh.inherit.practice.Circle;
import com.kh.inherit.practice.Rectangle;

public class Application {

	public static void main(String[] args) {
		Circle[] cir = new Circle[2];
		Rectangle[] rec = new Rectangle[2];
		
		cir[0] = new Circle(1, 2, 3);
		cir[1] = new Circle(3, 3, 4);
		
		rec[0] = new Rectangle(-1, -2, 5, 2);
		rec[1] = new Rectangle(-2, 5, 2, 8);
		
		System.out.println("===== circle =====");
		for(Circle c : cir) {
			c.draw(); // 부모의 draw 메소드가 아닌 자식의 draw 메소드가 실행
		}
		
		System.out.println("===== rectangle =====");
		for(Rectangle r : rec) {
			r.draw(); // 부모의 draw 메소드가 아닌 자식의 draw 메소드가 실행
		}
	}
}
