package tests;

//Contains test cases for Checkeligibilityin15sscreentest validation and submission

import org.testng.annotations.Test;

import utility.FactoryofDrivers;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;



public class Checkeligibilityin15sscreentest {
  
	WebDriver driver ;	  
	Eligiblitypage page;
	  
	
  @BeforeMethod
  public void Setup() 
  {
	  driver=FactoryofDrivers.getDriver();
	  driver.get("https://voltmoney.in/check-loan-eligibility-against-mutual-funds");
	  driver.manage().deleteAllCookies();
	    ((JavascriptExecutor) driver).executeScript("window.localStorage.clear(); window.sessionStorage.clear();");
	  page=new Eligiblitypage(driver); 
	 
  }
  
  @Test (priority = 0)
  public void Testwithvaliddetails() throws InterruptedException 
  {
	  page.entermobilenumber("8951560426");
	  page.enterpannumber("DIIPR2414L");
	  page.clickonCheckeligibilityforFREEbuton();
	  
	  String Actualmessageis=page.getmessageaftersubmit();
	  String Expectedmessage= "No investment found" ;
	 Assert.assertEquals(Actualmessageis, Expectedmessage, "No investment found : EXpected" + 
	  Expectedmessage + " but got " + Actualmessageis );
	  page.editdetailsbutton();
	  
	  page.mobileunput.clear();
	  page.Paninput.clear();
	  
  }
  
  @Test (priority = 1, enabled = false)
  public void Testwithinvaliddata() throws InterruptedException
  {
	  
	  page.mobileunput.clear();
	  page.Paninput.clear();
	  page.entermobilenumber("9951560425");
	  page.enterpannumber("DIIPR2525A");
	  page.clickonCheckeligibilityforFREEbuton();

  }
 
  

  @AfterTest(enabled = true)
  public void afterTest() {
	 FactoryofDrivers.quitdriver();
	  
	  
  }

}
