package com.org.animal.sea;

import com.org.animal.Animal;
import com.org.animal.behaviour.SwimBehaviour;

public abstract class SeaAnimal extends Animal implements SwimBehaviour{
	public void swim() {
		System.out.println("I am swiming.");
	}
}
