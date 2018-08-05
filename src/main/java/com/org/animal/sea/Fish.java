package com.org.animal.sea;

import com.org.animal.behaviour.EatBehaviour;
import com.org.animal.behaviour.SwimBehaviour;
import com.org.animal.util.AnimalColor;
import com.org.animal.util.AnimalSize;

public class Fish extends SeaAnimal implements SwimBehaviour, EatBehaviour {
	public AnimalColor color;
	public AnimalSize size;
	
	public String getColor() {
		return color.colorName();
	}
	
	public String getSize() {
		return size.size();
	}	

	public void eat() {
		System.out.println("I eat........");
	}	
}
