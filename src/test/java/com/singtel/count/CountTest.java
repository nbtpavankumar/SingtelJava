package com.singtel.count;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.singtel.species.Animal;
import com.singtel.species.birds.impl.Butterfly;
import com.singtel.species.birds.impl.Chicken;
import com.singtel.species.birds.impl.Duck;
import com.singtel.species.birds.impl.Parrot;
import com.singtel.species.birds.impl.Rooster;
import com.singtel.species.fish.impl.ClownFish;
import com.singtel.species.fish.impl.Shark;
import com.singtel.species.insects.CaterPillar;
import com.singtel.species.mammals.impl.Cat;
import com.singtel.species.mammals.impl.Dog;
import com.singtel.species.mammals.impl.Dolphin;

public class CountTest {

	private List<Animal> animals;

	@Before
	public void before() {
		animals = Arrays.asList(new Animal[] { new Duck(), new Chicken(), new Rooster(), new Parrot(), new Shark(),
				new ClownFish(), new Dolphin(), new Dog(), new Butterfly(), new Cat(), new CaterPillar() });
	}

	@Test
	public void test_fly_count() {
		assertEquals(3, animals.stream().filter(animal -> animal.fly()).count());
	}

	@Test
	public void test_walk_count() {
		assertEquals(9, animals.stream().filter(animal -> animal.walk()).count());
	}

	@Test
	public void test_sing_count() {
		assertEquals(8, animals.stream().filter(animal -> animal.sing()).count());
	}

	@Test
	public void test_swim_count() {
		assertEquals(4, animals.stream().filter(animal -> animal.swim()).count());
	}

}
