package com.singtel.species.birds.impl;

import com.singtel.behavior.Sing;
import com.singtel.behavior.Swim;
import com.singtel.species.birds.Bird;

/**
 * {@link Duck} is a {@link Bird}
 * 
 * @author pavankumar
 *
 */
public class Duck extends Bird {

	public static final String SING = "Quack, quack";

	/**
	 * {@link Duck} {@link Sing} as Quack, Quack
	 */
	@Override
	public boolean sing() {
		System.out.println(SING);
		return true;
	}

	/**
	 * {@link Duck} can {@link Swim}
	 */
	@Override
	public boolean swim() {
		System.out.println(I_AM_SWIMMING);
		return true;
	}

}
