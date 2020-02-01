package com.singtel.species.birds.impl;

import com.singtel.species.birds.Bird;

public class Chicken extends Bird {

	public static final String SING = "Cluck,cluck";

	public boolean sing() {
		System.out.println(SING);
		return true;
	}

	public boolean fly() {
		return false;
	}

}
