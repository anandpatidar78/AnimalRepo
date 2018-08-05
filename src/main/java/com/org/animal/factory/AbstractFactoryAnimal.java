package com.org.animal.factory;

import com.org.animal.AnimalType;
import com.org.animal.bird.Bird;
import com.org.animal.bird.type.BirdType;
import com.org.animal.insect.Insect;
import com.org.animal.insect.type.InsectType;
import com.org.animal.sea.Fish;
import com.org.animal.sea.SeaAnimal;
import com.org.animal.sea.type.FishType;

public abstract class AbstractFactoryAnimal {
	public abstract Bird getBird(BirdType birdType);
	public abstract Fish getFish(FishType fishType);
	public abstract SeaAnimal getSeaAnimal(AnimalType animalType);
	public abstract Insect getInsect(InsectType insectType);
}
