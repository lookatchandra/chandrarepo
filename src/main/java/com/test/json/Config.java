package com.test.json;

public class Config {

	public String name;
	//public String images;
	public String vnfd;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVnfd() {
		return vnfd;
	}
	public void setVnfd(String vnfd) {
		this.vnfd = vnfd;
	}
	@Override
	public String toString() {
		return "Config [name=" + name + ", vnfd=" + vnfd + "]";
	}
	
	
	
}
