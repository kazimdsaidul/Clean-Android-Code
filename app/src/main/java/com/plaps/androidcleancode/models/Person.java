package com.plaps.androidcleancode.models;

import com.google.gson.annotations.SerializedName;

public class Person{

	@SerializedName("name")
	 String name;

	@SerializedName("age")
	private int age;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setAge(int age){
		this.age = age;
	}

	public int getAge(){
		return age;
	}


}