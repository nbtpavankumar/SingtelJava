package com.singtel.species.birds.impl;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class RoosterTest {

	private Rooster rooster;

	@Before
	public void before() {
		rooster = new Rooster();
	}

	@Test
	public void test_behaviour() {
		assertFalse(rooster.fly());
		assertTrue(rooster.sing());
		assertFalse(rooster.swim());
		assertTrue(rooster.walk());
	}
}
