package com.singtel.species.birds;

import com.singtel.behavior.Fly;
import com.singtel.species.Animal;
import com.singtel.species.birds.impl.Butterfly;
import com.singtel.species.birds.impl.Chicken;
import com.singtel.species.birds.impl.Duck;
import com.singtel.species.birds.impl.Parrot;
import com.singtel.species.birds.impl.Rooster;

/**
 * <b>Bird's abstraction </b> <br>
 * Bird can be {@link Butterfly} , {@link Chicken}, {@link Duck},
 * {@link Parrot}, {@link Rooster}
 * 
 * @author pavankumar
 *
 */
public abstract class Bird extends Animal {

	/**
	 * Birds can Fly
	 * 
	 * @return : {@link Boolean}
	 */
	@Override
	public boolean fly() {
		System.out.println(Fly.I_AM_FLYING);
		return true;
	}

	/**
	 * Birds cannot swim
	 * 
	 * @return : {@link Boolean}
	 */
	@Override
	public boolean swim() {
		return false;
	}

}
