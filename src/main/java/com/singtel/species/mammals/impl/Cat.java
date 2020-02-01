package com.singtel.species.mammals.impl;

import com.singtel.species.mammals.Mammal;

public class Cat extends Mammal {

	private static final String SING = "Meow";

	public boolean sing() {
		System.out.println(SING);
		return true;
	}

}
