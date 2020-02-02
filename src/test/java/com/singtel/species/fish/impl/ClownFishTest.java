package com.singtel.species.fish.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.singtel.behavior.Color;
import com.singtel.behavior.Size;

public class ClownFishTest {

	private ClownFish clownFish;

	@Before
	public void before() {
		clownFish = new ClownFish();
	}

	@Test
	public void test_behaviour() {
		assertEquals(Size.SMALL, clownFish.getSize());
		assertEquals(Color.ORANGE, clownFish.getColor());
		assertFalse(clownFish.fly());
		assertTrue(clownFish.sing());
		assertTrue(clownFish.swim());
		assertFalse(clownFish.walk());
	}
}
