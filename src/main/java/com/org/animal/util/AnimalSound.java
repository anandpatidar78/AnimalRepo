package com.org.animal.util;

public enum AnimalSound {
	
	CHICKEN_SOUND ("Cluck, cluck"),
	DUCK_SOUND ("Quack, quack"),
	ROOSTER_SOUND ("Cock-a-doodle-doo"),
	PARROT_SOUND ("Chirp"),
	PHONE_RING_SOUND ("Tring, tring"),
	DOG_SOUND("Woof, woof"),
	CAT_SOUND ("Meow");
	
    String sound;
    
    AnimalSound(String sound) {
        this.sound = sound;
    }
    
    public String makeSound() {
    	return sound;
    }
}
