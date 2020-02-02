package com.singtel.species.mammals;

import com.singtel.species.Animal;
import com.singtel.species.mammals.impl.Cat;
import com.singtel.species.mammals.impl.Dog;
import com.singtel.species.mammals.impl.Dolphin;

/**
 * <b>Mammals abstraction</b> <br>
 * Mammal can be {@link Cat}, {@link Dog}, {@link Dolphin}
 * 
 * @author pavankumar
 *
 */
public abstract class Mammal extends Animal {

	/**
	 * Mammals cannot fly
	 * 
	 * @return : {@link Boolean}
	 */
	@Override
	public boolean fly() {
		return false;
	}

	/**
	 * Mammals cannot Swim
	 * 
	 * @return : {@link Boolean}
	 */
	@Override
	public boolean swim() {
		return false;
	}
}
