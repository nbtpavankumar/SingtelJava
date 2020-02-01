package com.singtel.species.birds.impl;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ButterflyTest {

	private Butterfly butterfly;

	@Before
	public void before() {
		butterfly = new Butterfly();
	}

	@Test
	public void test_behaviour() {
		assertTrue(butterfly.fly());
		assertFalse(butterfly.sing());
		assertFalse(butterfly.swim());
		assertTrue(butterfly.walk());
	}

}
