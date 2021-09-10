package com.bridgelabz.userregistrationjunittesting;

public class UserValidation {
	public boolean validateName(String name)throws UserValidationException 
	{
		try 
		{
		String nameRegex = "^[A-Z]{1}[a-z]{1,}";
		return name.matches(nameRegex);
		}
		catch (NullPointerException e)
		{
			throw new UserValidationException("ENTER A NAME");
		}
	}
	public boolean validateEmail(String email)throws UserValidationException 
	{
		try 
		{

		String emailRegex = "^[a-zA-z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[\\.][a-z]{2,}(\\\\.[a-z]+)?";
		return email.matches(emailRegex);
		}
		catch(NullPointerException e) {
			throw new UserValidationException("ENTER EMAIL ID");
		}
	}
	
	public boolean validateMobileNumber(String mobileNumber)throws UserValidationException  
	{
		try
		{

		String mobileNumberRegex = "[0-9]{1,2}\\s{1}[0-9]{10}$";
		return mobileNumber.matches(mobileNumberRegex);
		}
		catch (NullPointerException e)
		{
		throw new UserValidationException("ENTER MOBILE NUMBER");
		}
	}
	public boolean validatePassword(String password) throws UserValidationException
	{
		try 
		{
		String passwordRegex = "(?=.*[@#$%^&-+=()])(?=.*[0-9])(?=.*[A-Z])[a-zA-Z0-9].{8,}";
		return password.matches(passwordRegex);
		}
		catch (NullPointerException e)
		{
			throw new UserValidationException("ENTER PASSWORD");
		}
	}
}
