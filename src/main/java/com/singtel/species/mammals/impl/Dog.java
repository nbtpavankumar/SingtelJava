package com.singtel.species.mammals.impl;

import com.singtel.species.mammals.Mammal;

public class Dog extends Mammal {

	private static final String SING = "Woof, woof";

	public boolean sing() {
		System.out.println(SING);
		return true;
	}
}
