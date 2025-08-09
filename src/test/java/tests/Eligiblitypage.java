package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Page object module for the eligibility module or check eligibility in 15seconds screen



public class Eligiblitypage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath ="//input[@placeholder='Enter mobile number']") WebElement mobileunput;
	@FindBy(xpath = "//input[@placeholder='Enter PAN']")WebElement Paninput;
	@FindBy(xpath = "//button[@type='button']") WebElement submitbutton;
	@FindBy(xpath = "//button[@type='button' and @class='ant-btn css-k94ck0 ant-btn-primary ant-btn-color-primary ant-btn-variant-solid']") WebElement Editdetailbutton;
	@FindBy(xpath = "//div[text()='No investment found']") WebElement Messageaftersubmit;
	
	
	public Eligiblitypage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	public void entermobilenumber(String mobile)
	{
		wait.until(ExpectedConditions.visibilityOf(mobileunput));
		mobileunput.sendKeys(mobile);
	}
	
	public void enterpannumber(String pan)
	{
		wait.until(ExpectedConditions.visibilityOf(Paninput));
		Paninput.sendKeys(pan);
	}
	
	public void clickonCheckeligibilityforFREEbuton()
	{
		wait.until(ExpectedConditions.visibilityOf(submitbutton));
		submitbutton.click();
	}
	
	public void editdetailsbutton()
	{
		wait.until(ExpectedConditions.visibilityOf(Editdetailbutton));
		Editdetailbutton.click();
	}
	
	public String getmessageaftersubmit()
	{
		wait.until(ExpectedConditions.visibilityOf(Messageaftersubmit));
		return Messageaftersubmit.getText();
		
	}
	
	
	
	
}