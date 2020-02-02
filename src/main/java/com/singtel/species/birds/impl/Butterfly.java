package com.singtel.species.birds.impl;

import com.singtel.behavior.Sing;
import com.singtel.species.birds.Bird;

/**
 * {@link Butterfly} is a {@link Bird}
 * 
 * @author pavankumar
 *
 */
public class Butterfly extends Bird {

	/**
	 * {@link Butterfly}'s cannot {@link Sing}
	 */
	@Override
	public boolean sing() {
		return false;
	}
}
