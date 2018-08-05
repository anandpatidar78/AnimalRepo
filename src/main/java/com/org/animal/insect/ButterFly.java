package com.org.animal.insect;

import com.org.animal.behaviour.FlyingBehaviour;
import com.org.animal.behaviour.SoundBehaviour;
import com.org.animal.behaviour.WalkBehaviour;
import com.org.animal.behaviour.impl.CanFly;
import com.org.animal.behaviour.impl.CanWalk;
import com.org.animal.behaviour.impl.NoFly;
import com.org.animal.behaviour.impl.NoWalk;
import com.org.animal.util.AnimalSound;

public class ButterFly extends Insect implements FlyingBehaviour, SoundBehaviour {
	private FlyingBehaviour flyingBehaviour;
	private WalkBehaviour walkBehaviour;

	private boolean metaMorphosised;

	public ButterFly() {
		flyingBehaviour = new NoFly();
		walkBehaviour = new CanWalk();
		metaMorphosised = false;
	}
	
	@Override
	public void walk() {
		walkBehaviour.walk();
	}
	
	public void fly() {
		flyingBehaviour.fly();
	}
	
	public String sound() {
		return AnimalSound.NO_SOUND.makeSound();
	}
	
	public FlyingBehaviour getFlyingBehaviour() {
		return flyingBehaviour;
	}

	public void setFlyingBehaviour(FlyingBehaviour flyingBehaviour) {
		this.flyingBehaviour = flyingBehaviour;
	}

	public WalkBehaviour getWalkBehaviour() {
		return walkBehaviour;
	}

	public void setWalkBehaviour(WalkBehaviour walkBehaviour) {
		this.walkBehaviour = walkBehaviour;
	}
	
	public boolean isMetaMorphosised() {
		return metaMorphosised;
	}

	public void metaMorphosised() {				
		flyingBehaviour = new CanFly();
		walkBehaviour = new NoWalk();
		metaMorphosised = true;
		System.out.println("Transformed to a butterfly from caterpillar");
	}	
}
