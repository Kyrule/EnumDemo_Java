package com.example.java.model;

public enum OliveName {
	KALAMATA("Kalamata"),LIGURIAN("Ligurian");
	
	public String name;
	
	OliveName(String name){
		this.name=name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
