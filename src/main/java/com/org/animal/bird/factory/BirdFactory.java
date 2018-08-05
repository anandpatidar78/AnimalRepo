package com.org.animal.bird.factory;

import com.org.animal.bird.Bird;
import com.org.animal.bird.Chicken;
import com.org.animal.bird.Duck;
import com.org.animal.bird.Parrot;
import com.org.animal.bird.Rooster;
import com.org.animal.util.BirdType;

public class BirdFactory {
	
	

	public Bird getBird(String birdType) {
		if (birdType == null) {
			return null;
		}
		if (birdType.equalsIgnoreCase(BirdType.DUCK.name())) {
			return new Duck();

		} else if (birdType.equalsIgnoreCase(BirdType.CHICKEN.name())) {
			return new Chicken();

		} else if (birdType.equalsIgnoreCase(BirdType.ROOSTER.name())) {
			return new Rooster();
		} else if (birdType.equalsIgnoreCase(BirdType.PARROT.name())) {
			return new Parrot();
		}

		return null;
	}
}
