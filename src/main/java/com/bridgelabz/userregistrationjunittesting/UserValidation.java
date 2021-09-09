package com.bridgelabz.userregistrationjunittesting;

public class UserValidation {
	public boolean validateName(String name) {

		String nameRegex = "^[A-Z]{1}[a-z]{1,}";
		return name.matches(nameRegex);
	}
	public boolean validateEmail(String email) {

		String emailRegex = "^[a-zA-z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[\\.][a-z]{2,}(\\\\.[a-z]+)?";
		return email.matches(emailRegex);
	}
	
	public boolean validateMobileNumber(String mobileNumber) {

		String mobileNumberRegex = "[0-9]{1,2}\\s{1}[0-9]{10}$";
		return mobileNumber.matches(mobileNumberRegex);
	}
}
