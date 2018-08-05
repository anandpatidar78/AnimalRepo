package com.org.application;

import com.org.animal.Animal;
import com.org.animal.AnimalType;
import com.org.animal.behaviour.FlyingBehaviour;
import com.org.animal.behaviour.SingingdBehaviour;
import com.org.animal.behaviour.SwimBehaviour;
import com.org.animal.behaviour.WalkBehaviour;
import com.org.animal.bird.Bird;
import com.org.animal.bird.type.BirdType;
import com.org.animal.factory.AbstractFactoryAnimal;
import com.org.animal.factory.AnimalProducer;
import com.org.animal.insect.Insect;
import com.org.animal.insect.type.InsectType;
import com.org.animal.sea.Fish;
import com.org.animal.sea.SeaAnimal;
import com.org.animal.sea.type.FishType;

public class TestApp {
	
	public static void main(String args[]) {
		int birdCount = 0;
		int seaAnimalCount = 0;
		int fishCount = 0;
		int insectCount = 0;
		
		int fliersCount = 0;
		int walkersCount = 0;
		int singersCount = 0;
		int swimersCount = 0;
		
		AbstractFactoryAnimal birdFactory = AnimalProducer.getFactory(AnimalType.BIRD);
		AbstractFactoryAnimal fishFactory = AnimalProducer.getFactory(AnimalType.FISH);
		AbstractFactoryAnimal seaAnimalFactory = AnimalProducer.getFactory(AnimalType.SEA_ANIMAL);
		AbstractFactoryAnimal insectFactory = AnimalProducer.getFactory(AnimalType.INSECT);
		
		Animal animals[] = new Animal[] {
				birdFactory.getBird(BirdType.CHICKEN),
				birdFactory.getBird(BirdType.DUCK),
				birdFactory.getBird(BirdType.ROOSTER),
				birdFactory.getBird(BirdType.PARROT),
				fishFactory.getFish(FishType.CLOWN),
				fishFactory.getFish(FishType.SHARK),
				seaAnimalFactory.getSeaAnimal(AnimalType.DOLPHIN),
				insectFactory.getInsect(InsectType.BUTTERFLY)
		};

		for (Animal animal : animals) {			
			if (animal instanceof FlyingBehaviour) fliersCount++;
			if (animal instanceof SingingdBehaviour) singersCount++;
			if (animal instanceof WalkBehaviour) walkersCount++;
			if (animal instanceof SwimBehaviour) swimersCount++;
			
			if(animal instanceof SeaAnimal) {
				seaAnimalCount++;
				if(animal instanceof Fish)
					fishCount++;
			} else if (animal instanceof Bird) {
				birdCount++;
			} else if(animal instanceof Insect) {
				insectCount++;
			}
		}
		
		System.out.println("Total Birds :: " + birdCount);
		System.out.println("Total SeaAnimals :: " + seaAnimalCount);
		System.out.println("Total Fishes :: " + fishCount);
		System.out.println("Total Insects :: " + insectCount);
		
		System.out.println("Total fliers :: " + fliersCount);
		System.out.println("Total singers :: " + singersCount);
		System.out.println("Total walkers :: " + walkersCount);
		System.out.println("Total swimers :: " + swimersCount);
	}
}
