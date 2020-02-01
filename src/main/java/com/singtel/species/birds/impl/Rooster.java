package com.singtel.species.birds.impl;

public class Rooster extends Chicken {

	private static final String SING = "Cook-a-doodle-doo";

	public boolean sing() {
		System.out.println(SING);
		return true;
	}
}
