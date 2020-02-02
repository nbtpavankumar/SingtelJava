package com.singtel.species;

import com.singtel.behavior.Color;
import com.singtel.behavior.Fly;
import com.singtel.behavior.Sing;
import com.singtel.behavior.Size;
import com.singtel.behavior.Swim;
import com.singtel.behavior.Walk;
import com.singtel.species.birds.Bird;
import com.singtel.species.fish.Fish;
import com.singtel.species.mammals.Mammal;

/**
 * <b>Animal abstraction</b> <br>
 * Animal's It can be {@link Bird} , {@link Mammal}, {@link Fish}
 * 
 * @author pavankumar
 *
 */
public abstract class Animal implements Fly, Sing, Swim, Walk {

	private Size size;

	private Color color;

	/**
	 * Animals can Walk
	 * 
	 * @return : {@link Boolean}
	 */
	@Override
	public boolean walk() {
		System.out.println(Walk.I_AM_WALKING);
		return true;
	}

	/**
	 * Animals can sing
	 * 
	 * @return : {@link Boolean}
	 */
	@Override
	public boolean sing() {
		System.out.println(Sing.I_AM_SINGING);
		return true;
	}

	/**
	 * Return the Specific Size, if defined
	 * 
	 * @return : {@link Size}
	 */
	public Size getSize() {
		return size;
	}

	/**
	 * Setting the Specific Size
	 * 
	 * @param {@link Size}
	 */
	public void setSize(Size size) {
		this.size = size;
	}

	/**
	 * Return the specific color , if defined
	 * 
	 * @return : {@link Color}
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * Setting the Color Value
	 * 
	 * @param {@Color}
	 */
	public void setColor(Color color) {
		this.color = color;
	}

}
