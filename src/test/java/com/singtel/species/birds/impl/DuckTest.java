package com.singtel.species.birds.impl;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class DuckTest {

	private Duck duck;

	@Before
	public void before() {
		duck = new Duck();
	}

	@Test
	public void test_behaviour() {
		assertTrue(duck.fly());
		assertTrue(duck.sing());
		assertTrue(duck.swim());
		assertTrue(duck.walk());
	}
}
