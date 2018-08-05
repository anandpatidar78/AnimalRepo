package com.org.test.insect;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.org.animal.behaviour.FlyingBehaviour;
import com.org.animal.behaviour.SoundBehaviour;
import com.org.animal.behaviour.WalkBehaviour;
import com.org.animal.behaviour.impl.CanFly;
import com.org.animal.behaviour.impl.CanWalk;
import com.org.animal.behaviour.impl.NoFly;
import com.org.animal.behaviour.impl.NoWalk;
import com.org.animal.insect.ButterFly;
import com.org.animal.util.AnimalSound;

public class TestInsects {
	ButterFly butterFly;
	
	@Before
	public void setup() {
		butterFly = new ButterFly();
	}
	
	@Test
	public void testSoundBehaviour() {
		assertTrue(butterFly instanceof SoundBehaviour);
		assertEquals(butterFly.sound(), AnimalSound.NO_SOUND.makeSound());
		butterFly.metaMorphosised();
		assertEquals(butterFly.sound(), AnimalSound.NO_SOUND.makeSound());
	}	

	@Test
	public void testFlyingBehaviour() {		
		assertTrue(butterFly instanceof FlyingBehaviour);
		assertTrue(butterFly.getFlyingBehaviour() instanceof NoFly);
		butterFly.metaMorphosised();
		assertTrue(butterFly.getFlyingBehaviour() instanceof CanFly);		
	}	

	@Test
	public void testWalkBehaviour() {		
		assertTrue(butterFly instanceof WalkBehaviour);
		assertTrue(butterFly.getWalkBehaviour() instanceof CanWalk);
		butterFly.metaMorphosised();
		assertTrue(butterFly.getWalkBehaviour() instanceof NoWalk);		
	}	
}
