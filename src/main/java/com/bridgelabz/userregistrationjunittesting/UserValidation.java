package com.bridgelabz.userregistrationjunittesting;

public class UserValidation {
	public boolean validateName(String name) {

		String nameRegex = "^[A-Z]{1}[a-z]{1,}";
		return name.matches(nameRegex);
	}
	
}
