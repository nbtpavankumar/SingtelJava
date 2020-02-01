package com.singtel.species.mammals.impl;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class DogTest {

	private Dog dog;

	@Before
	public void before() {
		dog = new Dog();
	}

	@Test
	public void test_behaviour() {
		assertFalse(dog.fly());
		assertTrue(dog.sing());
		assertFalse(dog.swim());
		assertTrue(dog.walk());
	}
}
