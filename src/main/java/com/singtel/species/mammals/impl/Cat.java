package com.singtel.species.mammals.impl;

import com.singtel.behavior.Sing;
import com.singtel.species.mammals.Mammal;

/**
 * {@link Cat} is a {@link Mammal}
 * 
 * @author pavankumar
 *
 */
public class Cat extends Mammal {

	private static final String SING = "Meow";

	/**
	 * {@link Cat} can {@link Sing} as Meow
	 */
	@Override
	public boolean sing() {
		System.out.println(SING);
		return true;
	}

}
