package com.org.application;

import com.org.animal.AnimalType;
import com.org.animal.animal.factory.AbstractFactoryAnimal;
import com.org.animal.animal.factory.AnimalProducer;
import com.org.animal.insect.ButterFly;
import com.org.animal.insect.type.InsectType;

public class TestApp {
	
	public static void main(String args[]) {
		AbstractFactoryAnimal insectFactory = AnimalProducer.getFactory(AnimalType.INSECT);
		
		ButterFly butterFly = (ButterFly)insectFactory.getInsect(InsectType.BUTTERFLY);
		System.out.println("ButterFly makes sound : " + butterFly.sound());
		butterFly.fly();
		butterFly.walk();
		butterFly.metaMorphosised();
		butterFly.fly();
		butterFly.walk();
	}
}

