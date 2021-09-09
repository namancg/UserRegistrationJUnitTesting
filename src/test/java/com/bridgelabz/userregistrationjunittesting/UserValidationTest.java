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
	      
	   	
}
