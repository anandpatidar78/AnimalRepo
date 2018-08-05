package com.org.application;

import com.org.animal.bird.Bird;
import com.org.animal.bird.Chicken;
import com.org.animal.bird.Duck;

public class TestBird {
	
	public static void main(String args[]) {

		Bird chicken = new Chicken();
		System.out.println("Chicken makes sound : " + chicken.sound());
		chicken.sound();
		
		Duck duck = new Duck();
		System.out.println("Duck makes sound : " + duck.sound());
		duck.swim();
	}
}
