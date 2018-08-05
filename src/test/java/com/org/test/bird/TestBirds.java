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
import com.org.animal.bird.Parrot;
import com.org.animal.bird.Rooster;
import com.org.animal.util.AnimalSound;
import com.org.animal.util.ParrotNeighbour;

public class TestBirds {
	Chicken chicken;
	Rooster rooster;	
	Duck duck;
	Parrot parrot;
	
	@Before
	public void setup() {
		chicken = new Chicken();
		duck = new Duck();
		rooster = new Rooster();
		parrot = new Parrot();
	}
	
	@Test
	public void testSoundBehaviour() {
		assertEquals(chicken.sound(), AnimalSound.CHICKEN_SOUND.makeSound());
		assertEquals(rooster.sound(), AnimalSound.ROOSTER_SOUND.makeSound());
		assertEquals(duck.sound(), AnimalSound.DUCK_SOUND.makeSound());		
		
		assertEquals(parrot.sound(), AnimalSound.PARROT_SOUND.makeSound());
		
		//Parrot sound behaviour variations
		parrot.setNeighbour(ParrotNeighbour.DOG);
		assertEquals(parrot.sound(), AnimalSound.DOG_SOUND.makeSound());
		
		parrot.setNeighbour(ParrotNeighbour.CAT);
		assertEquals(parrot.sound(), AnimalSound.CAT_SOUND.makeSound());

		parrot.setNeighbour(ParrotNeighbour.ROOSTER);
		assertEquals(parrot.sound(), AnimalSound.ROOSTER_SOUND.makeSound());

		parrot.setNeighbour(ParrotNeighbour.DUCK);
		assertEquals(parrot.sound(), AnimalSound.DUCK_SOUND.makeSound());

		parrot.setNeighbour(ParrotNeighbour.PHONE);
		assertEquals(parrot.sound(), AnimalSound.PHONE_RING_SOUND.makeSound());
	}	

	@Test
	public void testFlyingBehaviour() {		
		assertFalse(chicken instanceof FlyingBehaviour);
		assertFalse(rooster instanceof FlyingBehaviour);
		assertFalse(duck instanceof FlyingBehaviour);
		assertTrue(parrot instanceof FlyingBehaviour);
	}	

	@Test
	public void testSwimBehaviour() {
		assertTrue(duck instanceof SwimBehaviour);
		assertFalse(chicken instanceof SwimBehaviour);
		assertFalse(rooster instanceof SwimBehaviour);
		assertFalse(parrot instanceof SwimBehaviour);
	}
}
