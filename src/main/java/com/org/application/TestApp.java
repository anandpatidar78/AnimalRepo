package com.org.application;

import com.org.animal.bird.Bird;
import com.org.animal.bird.factory.BirdFactory;
import com.org.animal.util.BirdType;

public class TestApp {
	
	public static void main(String args[]) {
		BirdFactory birdFactory = new BirdFactory();
		
		Bird chicken = birdFactory.getBird(BirdType.CHICKEN.name());
		System.out.println("Chicken makes sound : " + chicken.sound());

		Bird rooster = birdFactory.getBird(BirdType.ROOSTER.name());
		System.out.println("Rooster makes sound : " + rooster.sound());
	}
}
