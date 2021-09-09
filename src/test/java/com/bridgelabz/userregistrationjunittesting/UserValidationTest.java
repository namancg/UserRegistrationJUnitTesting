package com.bridgelabz.userregistrationjunittesting;
import org.junit.Assert;
import org.junit.Test;
public class UserValidationTest {
	@Test 
	 public void givenFirstName_WhenProper_ShouldReturnTrue() {
	        UserValidation validator=new UserValidation();
	        boolean result=validator.validateName("Naman");
	        Assert.assertEquals(true, result);
	    }
	    
	    @Test
	    public void givenFirstName_WhenShort_ShouldReturnFalse() {
	    	 UserValidation validator=new UserValidation();
	         boolean result=validator.validateName("nc");
	         Assert.assertEquals(false, result);
	    }
	    
	    @Test
	    public void givenFirstName_WhenStartWithSpecialChars_ShouldReturnFalse() {
	    	 UserValidation validator=new UserValidation();
	         boolean result=validator.validateName("_Naman");
	         Assert.assertEquals(false, result);
	    }
	    
	    @Test
	    public void givenFirstName_WhenStartWithSmallLetter_ShouldReturnFalse() {
	    	 UserValidation validator=new UserValidation();
	         boolean result=validator.validateName("naman");
	         Assert.assertEquals(false, result);
	    }
	    
	    @Test
	    public void givenFirstName_WhenLongAndStartWithCapital_ShouldReturnTrue() {
	    	 UserValidation validator=new UserValidation();
	         boolean result=validator.validateName("Namanchadfrrha");
	         Assert.assertEquals(true, result);
	    }
	    
	    @Test 
	    public void givenLastName_WhenProper_ShouldReturnTrue() {
	           UserValidation validator=new UserValidation();
	           boolean result=validator.validateName("Chandra");
	           Assert.assertEquals(true, result);
	       }
	       
	       @Test
	       public void givenLastName_WhenShort_ShouldReturnFalse() {
	       	 UserValidation validator=new UserValidation();
	            boolean result=validator.validateName("cha");
	            Assert.assertEquals(false, result);
	       }
	       
	       @Test
	       public void givenLastName_WhenStartWithSpecialChars_ShouldReturnFalse() {
	       	 UserValidation validator=new UserValidation();
	            boolean result=validator.validateName("_Chandra");
	            Assert.assertEquals(false, result);
	       }
	       
	       @Test
	       public void givenLastName_WhenStartWithSmallLetter_ShouldReturnFalse() {
	       	 UserValidation validator=new UserValidation();
	            boolean result=validator.validateName("chandra");
	            Assert.assertEquals(false, result);
	       }
	       
	       @Test
	       public void givenLastName_WhenLongAndStartWithCapital_ShouldReturnTrue() {
	       	 UserValidation validator=new UserValidation();
	            boolean result=validator.validateName("Chandra");
	            Assert.assertEquals(true, result);
	       }
	       @Test
	   	public void givenEmailAddress_WhenProper_ShouldReturnTrue() {
	   		
	   		UserValidation userValidator = new UserValidation();
	   		boolean result = userValidator.validateEmail("abc-100@yahoo.com");
	   		Assert.assertEquals(true, result);
	   	}
	   	@Test
	   	public void givenEmailAddress_WhenNotProper_ShouldReturnFalse() {
	   		
	   		UserValidation userValidator = new UserValidation();
	   		boolean result = userValidator.validateEmail("abc()*@gmail.com");
	   		Assert.assertEquals(false ,result);
	   		
	   	}
	   	@Test
		public void givenEmail_WhenMisplaced_Symbol_ShouldReturnFalse() {
			UserValidation validator = new UserValidation();
			boolean result = validator.validateEmail("abcbl.co@.co");
			Assert.assertEquals(false, result);
		}

		@Test
		public void givenEmail_WhenMisplaced_dot_ShouldReturnFalse() {
			UserValidation validator = new UserValidation();
			boolean result = validator.validateEmail("abc.xyz@cg.in.");
			Assert.assertEquals(false, result);
		}
		@Test
		public void givenEmail_WhenMissedMandatoryPart_abc_ShouldReturnFalse() {
			UserValidation validator = new UserValidation();
			boolean result = validator.validateEmail("naman.xyz@bl.co.in");
			Assert.assertEquals(false, result);
		}

		@Test
		public void givenEmail_WhenMissedMandatoryPart_bl_ShouldReturnFalse() {
			UserValidation validator = new UserValidation();
			boolean result = validator.validateEmail("abc.xyz@vi.co.in");
			Assert.assertEquals(false, result);
		}
	   	
}
