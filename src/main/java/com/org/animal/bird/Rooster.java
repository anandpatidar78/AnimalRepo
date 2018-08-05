package com.org.animal.bird;

import com.org.animal.behaviour.SoundBehaviour;
import com.org.animal.util.AnimalSound;

public class Rooster extends Chicken implements SoundBehaviour {
	public String sound() {
		return AnimalSound.ROOSTER_SOUND.makeSound();
	}
}
