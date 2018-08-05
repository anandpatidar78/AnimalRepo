package com.org.animal.animal.factory;

import com.org.animal.AnimalType;
import com.org.animal.bird.Bird;
import com.org.animal.bird.Chicken;
import com.org.animal.bird.Duck;
import com.org.animal.bird.Parrot;
import com.org.animal.bird.Rooster;
import com.org.animal.bird.type.BirdType;
import com.org.animal.sea.Fish;
import com.org.animal.sea.SeaAnimal;
import com.org.animal.sea.type.FishType;

public class BirdFactory extends AbstractFactoryAnimal {

	@Override
	public Bird getBird(BirdType birdType) {
		if (birdType == null) {
			return null;
		}
		if (birdType.equals(BirdType.DUCK)) {
			return new Duck();

		} else if (birdType.equals(BirdType.CHICKEN)) {
			return new Chicken();

		} else if (birdType.equals(BirdType.ROOSTER)) {
			return new Rooster();
		} else if (birdType.equals(BirdType.PARROT)) {
			return new Parrot();
		}

		return null;
	}
	
	@Override
	public Fish getFish(FishType fishType)	{
		return null;
	}

	@Override
	public SeaAnimal getSeaAnimal(AnimalType animalType) {
		return null;
	}
}
