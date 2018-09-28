package com.pkg.mon;

public class Person {
	String fame;
	String lame;
	int age;
	
	public Person(String f, String l, int a) {
		this.fame = f;
		this.lame = l;
		this.age = a;
		
	}
	public String getFame() {
		return fame;
	}
	public void setFame(String fame) {
		this.fame = fame;
	}
	public String getLame() {
		return lame;
	}
	public void setLame(String lame) {
		this.lame = lame;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
