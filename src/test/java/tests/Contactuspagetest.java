package tests;

import org.testng.annotations.Test;

import utility.FactoryofDrivers;

import org.testng.annotations.BeforeMethod;
import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.Assert;


public class Contactuspagetest {
 
	WebDriver driver;
	Contactuspom contactusbutton;
	
	
  @BeforeMethod
  public void beforeMethod() {
	  
	  driver=FactoryofDrivers.getDriver();
	  driver.get("https://voltmoney.in/check-loan-eligibility-against-mutual-funds");
	  contactusbutton= new Contactuspom(driver);
  }
  
  @Test
  public void contactustest()
  {
	  contactusbutton.clickoncontactusbutton();
	  
	  
	  String Expectedresult = "Let's connect and get your questions answered";
	  String Actualresult= contactusbutton.getcontactusmessage();
	  Assert.assertEquals(Actualresult, Expectedresult);
	  
	  
  }
  
  

  @AfterTest(enabled = true)
  public void afterTest() {
	 FactoryofDrivers.quitdriver();

}
}
