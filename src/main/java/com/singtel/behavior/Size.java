package com.singtel.behavior;

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
