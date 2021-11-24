package com.kh.polymorphism;

import com.kh.polymorphism.practice.Animal;
import com.kh.polymorphism.practice.Cat;
import com.kh.polymorphism.practice.Dog;

public class Application {

	public static void main(String[] args) {
		Animal[] animals = new Animal[5];
		
		animals[0] = new Dog("뽀삐", "말티즈", 5);
		animals[1] = new Cat("잘생김", "페르시안", "서울", "흰색");
		animals[2] = new Cat("이쁨", "러시안블루", "집", "회색");
		animals[3] = new Dog("개", "시베리안", 30);
		animals[4] = new Dog("큰개", "차우차우", 40);
		
		for(Animal animal : animals) {
			animal.speak();
		}
	}

}
