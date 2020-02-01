package com.singtel.species.mammals.impl;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CatTest {

	private Cat cat;

	@Before
	public void before() {
		cat = new Cat();
	}

	@Test
	public void test_behaviour() {
		assertFalse(cat.fly());
		assertTrue(cat.sing());
		assertFalse(cat.swim());
		assertTrue(cat.walk());
	}
}
