package com.singtel.species.mammals.impl;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class DolphinTest {

	private Dolphin dolphin;

	@Before
	public void before() {
		dolphin = new Dolphin();
	}

	@Test
	public void test_behaviour() {
		assertFalse(dolphin.fly());
		assertTrue(dolphin.sing());
		assertTrue(dolphin.swim());
		assertTrue(dolphin.walk());
	}
}
