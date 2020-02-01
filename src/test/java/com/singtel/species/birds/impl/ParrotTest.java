package com.singtel.species.birds.impl;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.singtel.species.mammals.impl.Cat;
import com.singtel.species.mammals.impl.Dog;

public class ParrotTest {

	@Test
	public void test_behaviour() {
		Parrot parrot = new Parrot();
		assertTrue(parrot.fly());
		assertFalse(parrot.swim());
		assertTrue(parrot.walk());
	}

	@Test
	public void test_parrot_with_mamal_dog_neighbour() {
		Parrot parrot = new Parrot();
		parrot.setMammal(new Dog());
		assertTrue(parrot.sing());
	}

	@Test
	public void test_parrot_with_mamal_cat_neighbour() {
		Parrot parrot = new Parrot();
		parrot.setMammal(new Cat());
		assertTrue(parrot.sing());
	}

}
