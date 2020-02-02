package com.singtel.behavior;

/**
 * <b>Defined Colors</b>
 * 
 * @author pavankumar
 *
 */
public enum Color {

	ORANGE("Orange"), GREY("Grey");

	private String color;

	Color(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

}
