package com.org.animal.util;

public enum AnimalSound {
	
	CHICKEN_SOUND ("Cluck, cluck"),
	DUCK_SOUND ("Quack, quack");
	
    String sound;
    
    AnimalSound(String sound) {
        this.sound = sound;
    }
    
    public String makeSound() {
    	return sound;
    }    
}
