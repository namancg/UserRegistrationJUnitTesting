package com.bridgelabz.userregistrationjunittesting;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.bridgelabz.userregistrationjunittesting.UserValidation;

@RunWith(Parameterized.class)
public class UserValidationParametarizedTesting {

	public String testEmail;
	public boolean result;
	public UserValidation userValidator;

	public UserValidationParametarizedTesting(String testEmail, boolean expectedResult) {

		this.testEmail = testEmail;
		this.result = result;
	}

	@Before
	public void initialize() {
		userValidator = new UserValidation();
	}
	@Parameterized.Parameters
	public static Collection input() {

		return Arrays.asList(new Object[][] { {".abc@abc.com", false }, {"abc", false }, {"abc@.com.my", false }, {"abc@abc@gmail.com", false },
				{"abc()*@gmail.com", false }, {"abc..2002@gmail.com", false }, {"abc_@gmail.com", false },
				{"abc123@.com", false }, {"abc123@.com.com", false }, {"abc123@gmail.a", false },
				{"abc@%*.com", false }, {"abc@gmail.com.1a", false }, {".abc@gmail.com.aa.au", false } ,
				
				{"abc@bridgelabz.co.in", true }, {"abc@gmail.com.com", true },
				{"abc@yahoo.com", true }, {"abc@1.com", true }, { "abc-100@yahoo.com", true },
				{"abc.100@yahoo.com", true }, {"abc111@abc.com", true }, {"abc-100@abc.net", true },
				{"abc.100@abc.com.au", true }, {"abc+100@gmail.com", true }});

	}
	@Test
	public void givenEmailAddress_ShouldReturnAsExpected() {
		boolean testResult = userValidator.validateEmail(testEmail);
		Assert.assertEquals(testResult, result);
	}

}