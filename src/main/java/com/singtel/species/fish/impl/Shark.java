package com.singtel.species.fish.impl;

import com.singtel.behavior.Color;
import com.singtel.behavior.Size;
import com.singtel.species.fish.Fish;

/**
 * {@link Shark} is a {@link Fish}
 * 
 * @author nbtpa
 *
 */
public class Shark extends Fish {

	public Shark() {
		this.setColor(Color.GREY);
		this.setSize(Size.LARGE);
	}

}
