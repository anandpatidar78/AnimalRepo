package com.org.animal.bird;

import com.org.animal.behaviour.SoundBehaviour;
import com.org.animal.util.AnimalSound;

public class Chicken extends Bird implements SoundBehaviour {
	public String sound() {
		return AnimalSound.CHICKEN_SOUND.makeSound();
	}
}
