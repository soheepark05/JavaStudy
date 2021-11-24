package co.kh.inherit.practice;

public class Person {
	protected String name;
	
	private int age;
	
	private double height;
	
	private double weight;
	
	public Person() {
	}
	
	public Person(int age, double height, double weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
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

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String information() {
		return "name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight;
	}
}
