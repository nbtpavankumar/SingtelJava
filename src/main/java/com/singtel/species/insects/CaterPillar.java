package com.singtel.species.insects;

import com.singtel.species.Animal;

public class CaterPillar extends Animal {

	private static final String CRAWL = "CRAWL";

	public boolean fly() {
		return false;
	}

	public boolean swim() {
		return false;
	}

	public boolean walk() {
		System.out.println(CRAWL);
		return true;
	}

}
