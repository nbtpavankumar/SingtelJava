package com.singtel.species;

import com.singtel.behavior.Color;
import com.singtel.behavior.Fly;
import com.singtel.behavior.Sing;
import com.singtel.behavior.Size;
import com.singtel.behavior.Swim;
import com.singtel.behavior.Walk;

public abstract class Animal implements Fly, Sing, Swim, Walk {

	private Size size;

	private Color color;

	public boolean walk() {
		System.out.println(Walk.I_AM_WALKING);
		return true;
	}

	public boolean sing() {
		System.out.println(Sing.I_AM_SINGING);
		return true;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
