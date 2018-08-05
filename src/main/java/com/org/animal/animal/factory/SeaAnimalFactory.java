package com.org.animal.animal.factory;

import com.org.animal.AnimalType;
import com.org.animal.bird.Bird;
import com.org.animal.bird.Chicken;
import com.org.animal.bird.Duck;
import com.org.animal.bird.Parrot;
import com.org.animal.bird.Rooster;
import com.org.animal.bird.type.BirdType;
import com.org.animal.sea.Dolphin;
import com.org.animal.sea.Fish;
import com.org.animal.sea.SeaAnimal;
import com.org.animal.sea.type.FishType;

public class SeaAnimalFactory extends AbstractFactoryAnimal {

	public SeaAnimal getSeaAnimal(AnimalType animalType) {
		if (animalType == null) {
			return null;
		}
		if (animalType.equals(AnimalType.DOLPHIN)) {
			return new Dolphin();
		} 

		return null;
	}
	
	public Bird getBird(BirdType birdType)	{
		return null;
	}
	
	public Fish getFish(FishType fishType)	{
		return null;
	}
}
