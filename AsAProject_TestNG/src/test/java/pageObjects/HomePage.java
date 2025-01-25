package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage{
	
	
	       public HomePage(WebDriver driver)  
			{
		        super(driver);       //this ll invoke the parent class constructor method. by passing the same 'driver' to that constructor method in parent class
			}                        //parent class is 'BasePage'. so it ll invoke constructor method present in that class
	       
	       
	      
	       
	       @FindBy(xpath = "//a[@class='ico-register']" )
	       WebElement register;
	       
	       
	       
	       public void registration()
	       {
	    	   register.click();
	       }

}
