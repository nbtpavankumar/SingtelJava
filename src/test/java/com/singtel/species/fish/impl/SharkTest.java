package com.singtel.species.fish.impl;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class SharkTest {

	private Shark shark;

	@Before
	public void before() {
		shark = new Shark();
	}

	@Test
	public void test_behaviour() {
		assertFalse(shark.fly());
		assertFalse(shark.sing());
		assertTrue(shark.swim());
		assertFalse(shark.walk());
	}
}
