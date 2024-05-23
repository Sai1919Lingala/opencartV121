package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{

	public HomePage(WebDriver driver) 
	{
		
		super(driver);
	}
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement lnkMyAccount;
	
	@FindBy(xpath="//a[text()='Register']")
	WebElement lnkRegister;
		
		@FindBy(linkText = "Login")   // Login link added in step5
		WebElement linkLogin;

	
	public void clickMyAccount() 
	{
		lnkMyAccount.click();
	}
	public void clickMyRegister() 
	{
		lnkRegister.click();
	}

	public void clickLogin()    // added in step5
	{
		linkLogin.click();
	}
	
}
