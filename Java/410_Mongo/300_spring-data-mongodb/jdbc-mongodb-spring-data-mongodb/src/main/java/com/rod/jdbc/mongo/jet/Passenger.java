
package com.rod.jdbc.mongo.jet;

public class Passenger {

	private String id;
	private String name;
	private Integer age;
	
	
	public Passenger() {
		super();
	}
	
	
	public Passenger(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}




	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	
}
