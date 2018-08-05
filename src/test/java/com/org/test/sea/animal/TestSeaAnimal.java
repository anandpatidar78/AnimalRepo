package com.org.test.sea.animal;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.org.animal.behaviour.EatBehaviour;
import com.org.animal.behaviour.FlyingBehaviour;
import com.org.animal.behaviour.JokeBehaviour;
import com.org.animal.behaviour.SoundBehaviour;
import com.org.animal.behaviour.SwimBehaviour;
import com.org.animal.sea.ClownFish;
import com.org.animal.sea.Dolphin;
import com.org.animal.sea.Shark;

public class TestSeaAnimal {
	ClownFish clownFish;
	Shark shark;
	Dolphin dolphin;
	
	@Before
	public void setup() {
		clownFish = new ClownFish();
		shark = new Shark();
		dolphin = new Dolphin();
	}
	
	@Test
	public void testSoundBehaviour() {
		assertFalse(dolphin instanceof SoundBehaviour);
	}	

	@Test
	public void testFlyingBehaviour() {		
		assertFalse(clownFish instanceof FlyingBehaviour);
		assertFalse(dolphin instanceof FlyingBehaviour);
	}	

	@Test
	public void testSwimBehaviour() {
		assertTrue(clownFish instanceof SwimBehaviour);
		assertTrue(dolphin instanceof SwimBehaviour);
	}

	@Test
	public void testEatBehaviour() {
		assertTrue(shark instanceof EatBehaviour);
		assertTrue(clownFish instanceof EatBehaviour);
		assertFalse(dolphin instanceof EatBehaviour);
	}
	
	@Test
	public void testJokeBehaviour() {
		assertTrue(clownFish instanceof JokeBehaviour);
		assertFalse(shark instanceof JokeBehaviour);
		assertFalse(dolphin instanceof JokeBehaviour);
	}		
}
