package com.org.animal.util;

public enum AnimalSound {
	
	CHICKEN_SOUND ("Cluck, cluck"),
	DUCK_SOUND ("Quack, quack"),
	ROOSTER_SOUND ("Cock-a-doodle-doo");
	
    String sound;
    
    AnimalSound(String sound) {
        this.sound = sound;
    }
    
    public String makeSound() {
    	return sound;
    }
}
