package com.singtel.species.birds.impl;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ChickenTest {

	private Chicken chicken;

	@Before
	public void before() {
		chicken = new Chicken();
	}

	@Test
	public void test_behaviour() {
		assertFalse(chicken.fly());
		assertTrue(chicken.sing());
		assertFalse(chicken.swim());
		assertTrue(chicken.walk());
	}
}
