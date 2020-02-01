package com.singtel.species.birds;

import com.singtel.behavior.Fly;
import com.singtel.species.Animal;

public abstract class Bird extends Animal {

	public boolean fly() {
		System.out.println(Fly.I_AM_FLYING);
		return true;
	}

	public boolean swim() {
		return false;
	}

}
