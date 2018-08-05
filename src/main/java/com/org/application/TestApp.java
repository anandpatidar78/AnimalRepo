package com.org.application;

import com.org.animal.AnimalType;
import com.org.animal.animal.factory.AbstractFactoryAnimal;
import com.org.animal.animal.factory.AnimalProducer;
import com.org.animal.bird.Bird;
import com.org.animal.bird.type.BirdType;
import com.org.animal.sea.ClownFish;
import com.org.animal.sea.Fish;
import com.org.animal.sea.SeaAnimal;
import com.org.animal.sea.type.FishType;

public class TestApp {
	
	public static void main(String args[]) {
		AbstractFactoryAnimal birdFactory = AnimalProducer.getFactory(AnimalType.BIRD);
		AbstractFactoryAnimal fishFactory = AnimalProducer.getFactory(AnimalType.FISH);
		AbstractFactoryAnimal seaAnimalFactory = AnimalProducer.getFactory(AnimalType.SEA_ANIMAL);
		
		Bird chicken = birdFactory.getBird(BirdType.CHICKEN);
		System.out.println("Chicken makes sound : " + chicken.sound());

		Bird rooster = birdFactory.getBird(BirdType.ROOSTER);
		System.out.println("Rooster makes sound : " + rooster.sound());
		
		Fish shark = fishFactory.getFish(FishType.SHARK);
		System.out.println("Shark is " + shark.getColor() + " in color");
		System.out.println("Shark is " + shark.getSize() + " in size");
		shark.swim();
		shark.eat();
		
		ClownFish clownFish = (ClownFish) fishFactory.getFish(FishType.CLOWN);
		System.out.println("ClownFish is " + clownFish.getColor() + " in color");
		System.out.println("ClownFish is " + clownFish.getSize() + " in size");
		clownFish.swim();
		clownFish.eat();
		
		SeaAnimal dolphin = seaAnimalFactory.getSeaAnimal(AnimalType.DOLPHIN);
		System.out.println("Dolphin :");
		dolphin.swim();
		clownFish.eat();
	}
}
