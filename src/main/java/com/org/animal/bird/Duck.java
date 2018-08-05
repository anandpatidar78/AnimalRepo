package com.org.animal.bird;

import com.org.animal.behaviour.SwimBehaviour;
import com.org.animal.util.AnimalSound;

public class Duck extends Bird implements SwimBehaviour{
	public String sound() {
		return AnimalSound.DUCK_SOUND.makeSound();
	}

	public void swim() {
		System.out.println("I am bird though I can swim");
	}
}
