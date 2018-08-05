package com.org.animal.factory;

import com.org.animal.AnimalType;
import com.org.animal.bird.Bird;
import com.org.animal.bird.type.BirdType;
import com.org.animal.insect.Insect;
import com.org.animal.insect.type.InsectType;
import com.org.animal.sea.ClownFish;
import com.org.animal.sea.Fish;
import com.org.animal.sea.SeaAnimal;
import com.org.animal.sea.Shark;
import com.org.animal.sea.type.FishType;

public class FishFactory extends AbstractFactoryAnimal {
	@Override
	public Bird getBird(BirdType birdType) {
		return null;
	}
	
	@Override
	public Fish getFish(FishType fishType)	{
		if (fishType == null) {
			return null;
		}
		
		if (fishType.equals(FishType.CLOWN)) {
			return new ClownFish();

		} else if (fishType.equals(FishType.SHARK)) {
			return new Shark();
		}
		return null;
	}

	@Override
	public SeaAnimal getSeaAnimal(AnimalType animalType) {
		return null;
	}
		
	@Override
	public Insect getInsect(InsectType insectType) {
		return null;
	}	
}
