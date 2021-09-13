package com.bridgelabz.userregistrationjunittesting;
import org.junit.Assert;
import org.junit.Test;
public class UserValidationTest {
	@Test 
	 public void givenFirstName_WhenProper_ShouldReturnTrue() throws UserValidationException
	{
	        UserValidation validator=new UserValidation();
	        boolean result=validator.validateName.validate("Naman");
	        Assert.assertEquals(true, result);
	    }
	    
	    @Test
	    public void givenFirstName_WhenShort_ShouldReturnFalse()throws UserValidationException 
	    {
	    	 UserValidation validator=new UserValidation();
	         boolean result=validator.validateName.validate("nc");
	         Assert.assertEquals(false, result);
	    }
	    
	    @Test
	    public void givenFirstName_WhenStartWithSpecialChars_ShouldReturnFalse()throws UserValidationException 
	    {
	    	 UserValidation validator=new UserValidation();
	         boolean result=validator.validateName.validate("_Naman");
	         Assert.assertEquals(false, result);
	    }
	    @Test
		public void givenFirstName_WhenNull_ShouldReturnFalse()
	    {
			
			UserValidation userValidator = new UserValidation();
			try
			{
				userValidator.validateName.validate(null);
			}
			catch(UserValidationException e)
			{
				Assert.assertEquals("ENTER A NAME",e.getMessage());
			}
			
		}
		
	    @Test
		public void givenFirstName_WhenEmpty_ShouldReturnFalse(){
			
			UserValidation userValidator = new UserValidation();
			try 
			{
				userValidator.validateName.validate("");
			}
			catch(UserValidationException e)
			{
				Assert.assertEquals("ENTER A NAME",e.getMessage());
			}
			
		}
	    
	    @Test
	    public void givenFirstName_WhenStartWithSmallLetter_ShouldReturnFalse()throws UserValidationException 
	    {
	    	 UserValidation validator=new UserValidation();
	         boolean result=validator.validateName.validate("naman");
	         Assert.assertEquals(false, result);
	    }
	    
	    @Test
	    public void givenFirstName_WhenLongAndStartWithCapital_ShouldReturnTrue()throws UserValidationException 
	    {
	    	 UserValidation validator=new UserValidation();
	         boolean result=validator.validateName.validate("Namanchadfrrha");
	         Assert.assertEquals(true, result);
	    }
	    
	    @Test 
	    public void givenLastName_WhenProper_ShouldReturnTrue()throws UserValidationException 
	    {
	           UserValidation validator=new UserValidation();
	           boolean result=validator.validateName.validate("Chandra");
	           Assert.assertEquals(true, result);
	       }
	       
	       @Test
	       public void givenLastName_WhenShort_ShouldReturnFalse()throws UserValidationException 
	       {
	       	 UserValidation validator=new UserValidation();
	            boolean result=validator.validateName.validate("cha");
	            Assert.assertEquals(false, result);
	       }
	       
	       @Test
	       public void givenLastName_WhenStartWithSpecialChars_ShouldReturnFalse()throws UserValidationException 
	       {
	       	 UserValidation validator=new UserValidation();
	            boolean result=validator.validateName.validate("_Chandra");
	            Assert.assertEquals(false, result);
	       }
	       
	       @Test
	       public void givenLastName_WhenStartWithSmallLetter_ShouldReturnFalse()throws UserValidationException
	       {
	       	 UserValidation validator=new UserValidation();
	            boolean result=validator.validateName.validate("chandra");
	            Assert.assertEquals(false, result);
	       }
	       
	       @Test
	       public void givenLastName_WhenLongAndStartWithCapital_ShouldReturnTrue()throws UserValidationException 
	       {
	       	 UserValidation validator=new UserValidation();
	            boolean result=validator.validateName.validate("Chandra");
	            Assert.assertEquals(true, result);
	       }
	       @Test
	   	public void givenLastName_WhenNull_ShouldReturnFalse() {
	   		
	   		UserValidation userValidator = new UserValidation();
	   		try 
	   		{
	   			userValidator.validateName.validate(null);
	   		}
	   		catch(UserValidationException e)
	   		{
	   			Assert.assertEquals("ENTER A NAME",e.getMessage());
	   		}
	       }
	       @Test
	   	public void givenEmailAddress_WhenProper_ShouldReturnTrue()throws UserValidationException 
	       {
	   		
	   		UserValidation userValidator = new UserValidation();
	   		boolean result = userValidator.validateEmailID.validate("abc-100@yahoo.com");
	   		Assert.assertEquals(true, result);
	   	}
	   	@Test
	   	public void givenEmailAddress_WhenNotProper_ShouldReturnFalse()throws UserValidationException 
	   	{
	   		
	   		UserValidation userValidator = new UserValidation();
	   		boolean result = userValidator.validateEmailID.validate("abc()*@gmail.com");
	   		Assert.assertEquals(false ,result);
	   		
	   	}
	   	@Test
		public void givenEmail_WhenMisplaced_Symbol_ShouldReturnFalse()throws UserValidationException 
	   	{
			UserValidation validator = new UserValidation();
			boolean result = validator.validateEmailID.validate("abcbl.co@.co");
			Assert.assertEquals(false, result);
		}

		@Test
		public void givenEmail_WhenMisplaced_dot_ShouldReturnFalse()throws UserValidationException 
		{
			UserValidation validator = new UserValidation();
			boolean result = validator.validateEmailID.validate("abc.xyz@cg.in.");
			Assert.assertEquals(false, result);
		}
		@Test
		public void givenEmail_WhenMissedMandatoryPart_abc_ShouldReturnFalse() throws UserValidationException
		{
			UserValidation validator = new UserValidation();
			boolean result = validator.validateEmailID.validate("naman.xyz@bl.co.in");
			Assert.assertEquals(false, result);
		}

		@Test
		public void givenEmail_WhenMissedMandatoryPart_bl_ShouldReturnFalse()throws UserValidationException 
		{
			UserValidation validator = new UserValidation();
			boolean result = validator.validateEmailID.validate("abc.xyz@vi.co.in");
			Assert.assertEquals(false, result);
		}

		@Test
		public void givenEmailAddress_WhenEmpty_ShouldReturnFalse(){
			
			UserValidation userValidator = new UserValidation();
			try 
			{
				userValidator.validateEmailID.validate("");
			}
			catch(UserValidationException e)
			{
				Assert.assertEquals("ENTER EMAIL ID",e.getMessage());
			}
			
		}
	   	@Test
	   	public void givenMobileNumber_WhenProper_ShouldReturnTrue()throws UserValidationException
	   	{
	   		
	   		UserValidation userValidator = new UserValidation();
	   		boolean result = userValidator.validateMobileNumber.validate("91 9538169967");
	   		Assert.assertEquals(true, result);
	   	}
	   	
	   	@Test
	   	public void givenMobileNumber_WhenNoSpace_ShouldReturnFalse() throws UserValidationException
	   	{
	   		
	   		UserValidation userValidator = new UserValidation();
	   		boolean result = userValidator.validateMobileNumber.validate("919538169967");
	   		Assert.assertEquals(false, result);
	   	}
	   	
	   	@Test
	   	public void givenMobileNumber_WhenNumberLessThanTenDigits_ShouldReturnFalse()throws UserValidationException
	   	{
	   		
	   		UserValidation userValidator = new UserValidation();
	   		boolean result = userValidator.validateMobileNumber.validate("91 636473773");
	   		Assert.assertEquals(false ,result);
	   	}
	   	@Test
		public void givenMobileNumber_WhenEmpty_ShouldReturnFalse() throws UserValidationException{
			
			UserValidation userValidator = new UserValidation();
			try 
			{
				userValidator.validateMobileNumber.validate("");
			}
			catch(UserValidationException e)
			{
				Assert.assertEquals("ENTER MOBILE NUMBER",e.getMessage());
			}
			
		}
	   	
	   	@Test
	   	public void givenPassword_WhenProper_ShouldReturnTrue() throws UserValidationException
	   	{
	   		
	   		UserValidation userValidator = new UserValidation();
	   		boolean result = userValidator.validatePassword.validate("Namancg@1974");
	   		Assert.assertEquals(true, result);
	   	}
	   	
	   	@Test
	   	public void givenPassword_WhenLessThanEightCharcters_ShouldReturnFalse() throws UserValidationException
	   	{
	   		
	   		UserValidation userValidator = new UserValidation();
	   		boolean result = userValidator.validatePassword.validate("Namancg");
	   		Assert.assertEquals(false, result);
	   	}
	   	
	   	@Test
	   	public void givenPassword_WhenNoUpperCaseCharacter_ShouldReturnFalse()throws UserValidationException
	   	{
	   		
	   		UserValidation userValidator = new UserValidation();
	   		boolean result = userValidator.validatePassword.validate("namancg1919");
	   		Assert.assertEquals(false, result);
	   	}
	   	
	   	@Test
	   	public void givenPassword_WhenNoNumericalNumber_ShouldReturnFalse()throws UserValidationException
	   	{
	   		
	   		UserValidation userValidator = new UserValidation();
	   		boolean result = userValidator.validatePassword.validate("namancg");
	   		Assert.assertEquals(false, result);
	   	}
	   	@Test
		public void givenPassword_WhenEmpty_ShouldReturnFalse() throws UserValidationException
	   	{
			
			UserValidation userValidator = new UserValidation();
			try 
			{
				userValidator.validatePassword.validate("");
			}
			catch(UserValidationException e)
			{
				Assert.assertEquals("Please Enter Valid Password. EMPTY Password Entered.",e.getMessage());
			}
			
		}

}
