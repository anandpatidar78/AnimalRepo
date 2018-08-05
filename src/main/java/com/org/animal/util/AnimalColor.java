package com.org.animal.util;

public enum AnimalColor {
	
	COLOR_GREY ("Grey"),
	COLOR_ORANGE ("Orange");
	
    String color;
    
    AnimalColor(String color) {
        this.color = color;
    }
    
    public String colorName() {
    	return color;
    }
}
