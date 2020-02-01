package com.singtel.species.birds.impl;

import com.singtel.species.birds.Bird;
import com.singtel.species.mammals.Mammal;

public class Parrot extends Bird {

	private Mammal mammal;

	public boolean sing() {
		if (this.mammal != null) {
			return mammal.sing();
		}
		return false;
	}

	public boolean swim() {
		return false;
	}

	public void setMammal(Mammal mammal) {
		this.mammal = mammal;
	}

}
