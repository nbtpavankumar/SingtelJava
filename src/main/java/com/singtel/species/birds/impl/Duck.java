package com.singtel.species.birds.impl;

import com.singtel.species.birds.Bird;

public class Duck extends Bird {

	public static final String SING = "Quack, quack";

	public boolean sing() {
		System.out.println(SING);
		return true;
	}

	public boolean swim() {
		System.out.println(I_AM_SWIMMING);
		return true;
	}

}
