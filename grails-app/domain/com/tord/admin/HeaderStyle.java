package com.tord.admin;

public enum HeaderStyle {
	DARK, FIXED_DARK, LIGHT, HIDDEN_ON_LEFT, TOP_CENTER;
	
	public String getTemplate() {
		switch (this) {
		case DARK:
			return "header_dark";
		case FIXED_DARK:
			return "header_fixed_dark";
		case LIGHT:
			return "header_light";
		case HIDDEN_ON_LEFT:
			return "header_hidden_on_left";
		case TOP_CENTER:
			return "header_top_center";
		default:
			return "header_light";
		}
	}
}
