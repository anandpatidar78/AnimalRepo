package com.org.animal.behaviour.impl;

import com.org.animal.behaviour.FlyingBehaviour;

public class NoFly implements FlyingBehaviour{

	public void fly() {
		System.out.println("I can not fly");
	}

}
