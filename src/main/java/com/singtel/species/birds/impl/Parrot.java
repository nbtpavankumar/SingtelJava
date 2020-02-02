package com.singtel.species.birds.impl;

import com.singtel.behavior.Swim;
import com.singtel.species.birds.Bird;
import com.singtel.species.mammals.Mammal;

/**
 * {@link Parrot} is a {@link Bird}
 * 
 * {@link Parrot} can stay with {@link Mammal}
 * 
 * @author pavankumar
 *
 */
public class Parrot extends Bird {

	private Mammal mammal;

	/**
	 * Based on partnering {@link Mammal}
	 */
	@Override
	public boolean sing() {
		if (this.mammal != null) {
			return mammal.sing();
		}
		return false;
	}

	/**
	 * {@link Parrot} cannot {@link Swim}
	 */
	public boolean swim() {
		return false;
	}

	public void setMammal(Mammal mammal) {
		this.mammal = mammal;
	}

}
