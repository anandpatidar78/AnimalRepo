package com.org.test.bird;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.org.animal.behaviour.FlyingBehaviour;
import com.org.animal.behaviour.SwimBehaviour;
import com.org.animal.bird.Chicken;
import com.org.animal.bird.Duck;
import com.org.animal.bird.Rooster;
import com.org.animal.util.AnimalSound;

public class TestBirds {
	Chicken chicken;
	Rooster rooster;	
	Duck duck;
	
	@Before
	public void setup() {
		chicken = new Chicken();
		duck = new Duck();
		rooster = new Rooster();
	}
	
	@Test
	public void testSoundBehaviour() {
		assertEquals(chicken.sound(), AnimalSound.CHICKEN_SOUND.makeSound());
		assertEquals(rooster.sound(), AnimalSound.ROOSTER_SOUND.makeSound());
		assertEquals(duck.sound(), AnimalSound.DUCK_SOUND.makeSound());		
	}	

	public void testFlyingBehaviour() {		
		assertFalse(chicken instanceof FlyingBehaviour);
		assertFalse(rooster instanceof FlyingBehaviour);
		assertFalse(duck instanceof FlyingBehaviour);		
	}	

	public void testSwimBehaviour() {
		assertTrue(duck instanceof SwimBehaviour);
		assertFalse(chicken instanceof SwimBehaviour);
		assertFalse(rooster instanceof SwimBehaviour);
	}	
}
