package com.singtel.species.fish.impl;

import com.singtel.behavior.Color;
import com.singtel.behavior.Size;
import com.singtel.species.fish.Fish;

public class ClownFish extends Fish {

	private static final String I_AM_JOCKING = "I am Jocking";

	public ClownFish() {
		this.setColor(Color.ORANGE);
		this.setSize(Size.SMALL);
	}

	@Override
	public boolean sing() {
		super.sing();
		System.out.println(I_AM_JOCKING);
		return true;
	}

}
