package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Contactuspom {
	
	WebDriver driver;
	WebDriverWait wait;
	
	
	@FindBy(xpath = "(//div[text() = 'Contact us'])[1]") WebElement contactusbutton;
	@FindBy(xpath = "//*[text() = \"Let's connect and get your questions answered\"]") WebElement contactuspage;
	
	
	public Contactuspom(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
	}
	
	public void clickoncontactusbutton()
	{
		wait.until(ExpectedConditions.visibilityOf(contactusbutton));
		contactusbutton.click();
	}
	
	public String getcontactusmessage()
	{
		wait.until(ExpectedConditions.visibilityOf(contactusbutton));
		return contactuspage.getText();
	}
	
	

}
