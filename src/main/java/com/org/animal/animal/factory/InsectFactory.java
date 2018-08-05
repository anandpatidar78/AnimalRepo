package com.org.animal.animal.factory;

import com.org.animal.AnimalType;
import com.org.animal.bird.Bird;
import com.org.animal.bird.type.BirdType;
import com.org.animal.insect.ButterFly;
import com.org.animal.insect.Insect;
import com.org.animal.insect.type.InsectType;
import com.org.animal.sea.Fish;
import com.org.animal.sea.SeaAnimal;
import com.org.animal.sea.type.FishType;

public class InsectFactory extends AbstractFactoryAnimal {

	@Override
	public Bird getBird(BirdType birdType) {
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
	
	@Override
	public Insect getInsect(InsectType insectType) {
		if (insectType == null) {
			return null;
		}
		if (insectType.equals(InsectType.BUTTERFLY)) {
			return new ButterFly();
		}

		return null;		
	}
}
