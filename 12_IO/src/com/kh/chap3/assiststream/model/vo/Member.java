package com.kh.chap3.assiststream.model.vo;

import java.io.Serializable;

public class Member implements Serializable {

	private static final long serialVersionUID = -7942502107382144506L;

	private String id;
	
	private transient String pwd;
	
	private String name;
	
	private transient int age;
	
	private transient char gender;

	public Member() {
	}

	public Member(String id, String pwd, String name, int age, char gender) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.age = age;
		this.gender = gender;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", pwd=" + pwd + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}
