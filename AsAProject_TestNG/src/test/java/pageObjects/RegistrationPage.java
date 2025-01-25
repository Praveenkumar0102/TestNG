package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

	public RegistrationPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id='FirstName']")
	WebElement txtFirstName;

	@FindBy(xpath = "//input[@id='LastName']")
	WebElement txtLastName;
	
	@FindBy(xpath = "//input[@id='Email']")
	WebElement txtEmail;
	
	@FindBy(xpath = "//input[@id='Password']")
	WebElement txtPassword;
	
	@FindBy(xpath = "//input[@id='ConfirmPassword']")
	WebElement cnfrmtxtPassword;
	
	@FindBy(xpath = "//button[@id='register-button']")
	WebElement btnregister;
	
	@FindBy(xpath = "//div[@class='result']")
	WebElement confirmMessage;

	
	
	public void Setfname(String fname)
    {
		txtFirstName.sendKeys(fname);
    }
    
	public void Setlname(String lname)
    {
		txtLastName.sendKeys(lname);
    }
	public void SetEmail(String email)
    {
		txtEmail.sendKeys(email);
    }
	public void SettxtPassword(String password)
    {
		txtPassword.sendKeys(password);
    }
	public void SetcnfrmtxtPassword(String password)
    {
		cnfrmtxtPassword.sendKeys(password);
    }
	
	public void clickregister()
    {
		btnregister.click();
    }
	
	public String cnfrmMessage()
    {
		return confirmMessage.getText();
    }
	
	
	

}
