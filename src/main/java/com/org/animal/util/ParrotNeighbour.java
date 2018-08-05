package com.org.animal.util;

public enum ParrotNeighbour {	
	DOG, CAT, ROOSTER, DUCK, PHONE;	
	
	public String makeSound() {
		AnimalSound sound;
		switch (this) {
		case DOG:
			sound = AnimalSound.DOG_SOUND;
			break;
		case CAT:
			sound = AnimalSound.CAT_SOUND;
			break;
		case ROOSTER:
			sound = AnimalSound.ROOSTER_SOUND;
			break;
		case PHONE:
			sound = AnimalSound.PHONE_RING_SOUND;
			break;
		case DUCK:
			sound = AnimalSound.DUCK_SOUND;
			break;
		default:
			sound = AnimalSound.PARROT_SOUND;
		}
		return sound.makeSound();
	}
}
