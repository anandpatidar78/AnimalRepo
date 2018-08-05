package com.org.animal.behaviour.impl;

import com.org.animal.behaviour.WalkBehaviour;

public class NoWalk implements WalkBehaviour{
	public void walk() {
		System.out.println("I can not walk");
	}
}
