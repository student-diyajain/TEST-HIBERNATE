package com.map.xml;
public class Sample {
    int Id;
    String name;
    String gender;
	public Sample(int id, String name, String gender) {
		
		Id = id;
		this.name = name;
		this.gender = gender;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Sample() {
		
	}
    

}
