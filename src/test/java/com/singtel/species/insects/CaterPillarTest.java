package com.singtel.species.insects;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CaterPillarTest {

	private CaterPillar caterPillar;

	@Before
	public void before() {
		caterPillar = new CaterPillar();
	}

	@Test
	public void test_behaviour() {
		assertFalse(caterPillar.fly());
		assertTrue(caterPillar.sing());
		assertFalse(caterPillar.swim());
		assertTrue(caterPillar.walk());
	}
}
