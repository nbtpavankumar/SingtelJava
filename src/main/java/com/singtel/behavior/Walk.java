package com.singtel.behavior;

/**
 * <b>Walk Behavior</b>
 * 
 * @author pavankumar
 *
 */
public interface Walk {

	public static final String I_AM_WALKING = "I am walking";

	/**
	 * Walk Behavior Implementation
	 * 
	 * @return : {@link Boolean}
	 */
	public boolean walk();
}
