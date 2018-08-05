package com.org.application;

import com.org.animal.bird.Bird;
import com.org.animal.bird.Parrot;
import com.org.animal.bird.factory.BirdFactory;
import com.org.animal.util.BirdType;
import com.org.animal.util.ParrotNeighbour;

public class TestApp {
	
	public static void main(String args[]) {
		BirdFactory birdFactory = new BirdFactory();
		
		Bird chicken = birdFactory.getBird(BirdType.CHICKEN.name());
		System.out.println("Chicken makes sound : " + chicken.sound());

		Bird rooster = birdFactory.getBird(BirdType.ROOSTER.name());
		System.out.println("Rooster makes sound : " + rooster.sound());

		Parrot parrot = (Parrot)birdFactory.getBird(BirdType.PARROT.name());
		System.out.println("Parrot makes sound : " + parrot.sound());	
		
		parrot.setNeighbour(ParrotNeighbour.DOG);
		System.out.println("Parrot's neighbour is " + parrot.getNeighbour().name() + " and makes sound " + parrot.sound());

		parrot.setNeighbour(ParrotNeighbour.CAT);
		System.out.println("Parrot's neighbour is " + parrot.getNeighbour().name() + " and makes sound " + parrot.sound());

		parrot.setNeighbour(ParrotNeighbour.DUCK);
		System.out.println("Parrot's neighbour is " + parrot.getNeighbour().name() + " and makes sound " + parrot.sound());
		
	}
}
