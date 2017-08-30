package com.sihuatech.ssm.model;


public class Person {
	private Long id;
	private String name;
	private int enable;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getEnable() {
		return enable;
	}
	public void setEnable(int enable) {
		this.enable = enable;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", enable=" + enable + "]";
	}
	
	
	

}
