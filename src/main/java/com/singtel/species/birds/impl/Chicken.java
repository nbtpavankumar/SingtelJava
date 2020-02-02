package com.singtel.species.birds.impl;

import com.singtel.behavior.Fly;
import com.singtel.behavior.Sing;
import com.singtel.species.birds.Bird;

/**
 * {@link Chicken} is a {@link Bird}
 * 
 * @author pavankumar
 *
 */
public class Chicken extends Bird {

	public static final String SING = "Cluck,cluck";

	/**
	 * {@link Chicken} {@link Sing}'s Cluck, cluck
	 */
	@Override
	public boolean sing() {
		System.out.println(SING);
		return true;
	}

	/**
	 * {@link Chicken} cannot {@link Fly}
	 */
	@Override
	public boolean fly() {
		return false;
	}

}
