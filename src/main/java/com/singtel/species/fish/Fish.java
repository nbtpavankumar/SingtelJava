package com.singtel.species.fish;

import com.singtel.behavior.Swim;
import com.singtel.species.Animal;

public abstract class Fish extends Animal {

	public boolean fly() {
		return false;
	}

	public boolean sing() {
		return false;
	}

	public boolean swim() {
		System.out.println(Swim.I_AM_SWIMMING);
		return true;
	}

	public boolean walk() {
		return false;
	}

}
