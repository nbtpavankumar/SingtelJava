package com.singtel.species.insects;

import com.singtel.behavior.Fly;
import com.singtel.behavior.Walk;
import com.singtel.species.Animal;

/**
 * {@link CaterPillar} is an Insects
 * 
 * @author pavankumar
 *
 */
public class CaterPillar extends Animal {

	private static final String CRAWL = "CRAWL";

	/**
	 * {@link CaterPillar} cannot {@link Fly}
	 */
	public boolean fly() {
		return false;
	}

	/**
	 * {@link CaterPillar} cannot Swim
	 */
	public boolean swim() {
		return false;
	}

	/**
	 * {@link CaterPillar} can {@link Walk}
	 */
	public boolean walk() {
		System.out.println(CRAWL);
		return true;
	}

}
