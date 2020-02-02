package com.singtel.species.fish;

import com.singtel.behavior.Swim;
import com.singtel.species.Animal;
import com.singtel.species.fish.impl.ClownFish;
import com.singtel.species.fish.impl.Shark;

/**
 * <b>Fish abstraction</b> </br>
 * Fish can be {@link ClownFish}, {@link Shark}
 * 
 * @author pavankumar
 *
 */
public abstract class Fish extends Animal {

	/**
	 * Fishes cannot fly by default
	 * 
	 * @return : {@link Boolean}
	 */
	@Override
	public boolean fly() {
		return false;
	}

	/**
	 * As Fishes stay in water, so they cannot sing.
	 * 
	 * @return : {@link Boolean}
	 */
	@Override
	public boolean sing() {
		return false;
	}

	/**
	 * Fishes can swim
	 * 
	 * @return : {@link Boolean}
	 */
	@Override
	public boolean swim() {
		System.out.println(Swim.I_AM_SWIMMING);
		return true;
	}

	/**
	 * As Fishes stay in waster, they cannot walk
	 */
	@Override
	public boolean walk() {
		return false;
	}

}
