package com.org.animal.util;

public enum AnimalGender {	
	GENDER_MALE ("Male"),
	GENDER_FEMALE ("FeMale");
	
	String gender;
    AnimalGender(String gender) {
        this.gender = gender;
    }	
}
