package com.org.animal.bird;

import com.org.animal.behaviour.FlyingBehaviour;
import com.org.animal.behaviour.SoundBehaviour;
import com.org.animal.util.AnimalSound;
import com.org.animal.util.ParrotNeighbour;

public class Parrot extends Bird implements SoundBehaviour, FlyingBehaviour {
	private ParrotNeighbour neighbour;

	public void setNeighbour(ParrotNeighbour neighbour) {
		this.neighbour = neighbour;
	}	
	public ParrotNeighbour getNeighbour() {
		return neighbour;
	}

	public String sound() {		
		if(null == neighbour) return AnimalSound.PARROT_SOUND.makeSound();
		return neighbour.makeSound();
	}
	
	public void fly() {
		System.out.println("I am flying");
	}
}
