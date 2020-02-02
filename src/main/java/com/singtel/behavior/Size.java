package com.singtel.behavior;

/**
 * <b>Defined Sizes </b>
 * 
 * @author pavankumar
 *
 */
public enum Size {

	SMALL("Small"), LARGE("Large");

	private String size;

	Size(String size) {
		this.size = size;
	}

	public String getSize() {
		return size;
	}
}
