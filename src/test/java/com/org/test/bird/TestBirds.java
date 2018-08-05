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
import com.org.animal.util.AnimalSound;

public class TestBirds {
	Chicken chicken;	
	Duck duck;
	
	@Before
	public void setup() {
		chicken = new Chicken();
		duck = new Duck();
	}
	
	@Test
	public void testSoundBehaviour() {
		Chicken chicken = new Chicken();
		assertEquals(chicken.sound(), AnimalSound.CHICKEN_SOUND.makeSound());

		Duck duck = new Duck();
		assertEquals(duck.sound(), AnimalSound.DUCK_SOUND.makeSound());		
	}	

	@Test
	public void testFlyingBehaviour() {		
		assertFalse(chicken instanceof FlyingBehaviour);
		assertFalse(duck instanceof FlyingBehaviour);		
	}	

	@Test
	public void testSwimBehaviour() {
		assertTrue(duck instanceof SwimBehaviour);
		assertFalse(chicken instanceof SwimBehaviour);
	}	
}
