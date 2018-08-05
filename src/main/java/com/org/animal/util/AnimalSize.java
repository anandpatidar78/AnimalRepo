package com.org.animal.util;

public enum AnimalSize {
	
	SIZE_LARGE ("Large"),
	SIZE_MEDIUM ("Medium"),
	SIZE_SMALL ("Small");
	
    String size;
    
    AnimalSize(String size) {
        this.size = size;
    }
    
    public String size() {
    	return size;
    }    
}
