package com.singtel.species.birds.impl;

import com.singtel.behavior.Sing;

/**
 * {@link Rooster} is a type of {@link Chicken}
 * 
 * @author pavankumar
 *
 */
public class Rooster extends Chicken {

	private static final String SING = "Cook-a-doodle-doo";

	/**
	 * {@link Rooster} {@link Sing} as Cook-a-doodle-doo
	 */
	@Override
	public boolean sing() {
		System.out.println(SING);
		return true;
	}
}
