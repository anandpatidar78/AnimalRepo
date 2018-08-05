package com.org.animal.sea;

import com.org.animal.util.AnimalColor;
import com.org.animal.util.AnimalSize;

public class Shark extends Fish {
	
	public Shark() {
		color = AnimalColor.COLOR_GREY;
		size = AnimalSize.SIZE_LARGE;
	}
	
	public void swim() {
		System.out.println("I am swiming.");
	}
	
	public void eat() {
		System.out.println("I eat fish.");
	}
}
