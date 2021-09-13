package com.bridgelabz.userregistrationjunittesting;
import com.bridgelabz.userregistrationjunittesting.UserValidationException.ExceptionType;;
@FunctionalInterface
interface UserValidationIF {
	public boolean validate(String n) throws UserValidationException;
}
public class UserValidation {
		UserValidationIF validateName = name -> {
		try 
		{
		String nameRegex = "^[A-Z]{1}[a-z]{1,}";
		return name.matches(nameRegex);
		}
		catch (NullPointerException e)
		{
			throw new UserValidationException(ExceptionType.ENTERED_NULL,"ENTER A NAME");
		}
		};
	
		
		UserValidationIF validateEmailID = email -> {
		try 
		{

		String emailRegex = "^[a-zA-z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[\\.][a-z]{2,}(\\\\.[a-z]+)?";
		return email.matches(emailRegex);
		}
		catch(NullPointerException e) {
			throw new UserValidationException(ExceptionType.ENTERED_NULL,"ENTER A EMAIL ID");
		}
	};
	
	UserValidationIF validateMobileNumber = mobileNumber -> {
		try
		{

		String mobileNumberRegex = "[0-9]{1,2}\\s{1}[0-9]{10}$";
		return mobileNumber.matches(mobileNumberRegex);
		}
		catch (NullPointerException e)
		{
			throw new UserValidationException(ExceptionType.ENTERED_NULL,"ENTER A MOBILE NUMBER");
		}
	};
	UserValidationIF validatePassword = password -> {
		try 
		{
		String passwordRegex = "(?=.*[@#$%^&-+=()])(?=.*[0-9])(?=.*[A-Z])[a-zA-Z0-9].{8,}";
		return password.matches(passwordRegex);
		}
		catch (NullPointerException e)
		{
			throw new UserValidationException(ExceptionType.ENTERED_NULL,"ENTER A PASSWORD");
		}
	};
}
