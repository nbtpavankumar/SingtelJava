package com.singtel.species.mammals.impl;

import com.singtel.behavior.Sing;
import com.singtel.species.mammals.Mammal;

/**
 * {@link Dog} is a {@link Mammal}
 * 
 * @author pavankumar
 *
 */
public class Dog extends Mammal {

	private static final String SING = "Woof, woof";

	/**
	 * {@link Dog} {@link Sing} as Woof, woof
	 */
	@Override
	public boolean sing() {
		System.out.println(SING);
		return true;
	}
}
