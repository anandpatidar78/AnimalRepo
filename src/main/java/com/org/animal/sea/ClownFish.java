package com.org.animal.sea;

import com.org.animal.behaviour.JokeBehaviour;
import com.org.animal.util.AnimalColor;
import com.org.animal.util.AnimalSize;

public class ClownFish extends Fish implements JokeBehaviour {
	
	public ClownFish() {
		color = AnimalColor.COLOR_ORANGE;
		size = AnimalSize.SIZE_SMALL;
	}
	
	public void swim() {
		System.out.println("I am swiming.");
	}

	public void joke() {
		System.out.println("I am telling jokes.");
	}
}
