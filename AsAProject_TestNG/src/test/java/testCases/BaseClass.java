package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
	}
	
	@AfterClass
	public void afterClass() {

		driver.quit();
	}

	
	public String randomString()    
	{
		String generatedString = RandomStringUtils.randomAlphabetic(5);     //RandomStringUtils is a class from 'commons-lang3'.add commons-lang3 dependancy in pom xml
		return generatedString;                              //returning the 'string' and we used in 'SetEmail' method. 
	} 
	
	public String randomNumber()    
	{
		String generatedNum = RandomStringUtils.randomNumeric(5);    //it will create random 5 numbers. based on the need we can the method in @Test method
		return generatedNum;                             
	} 
	
	public String randomAplhaNumberic()          //combination of both alpha and number. 
	{
		String generatedString = RandomStringUtils.randomAlphabetic(5);     //it will create random 5 alpha. 
		String generatedNum = RandomStringUtils.randomNumeric(5);       //it will create random 5 numbers
		 
		return generatedString + "@" + generatedNum;               //here we combined both generated random and concat and then return                 
	} 

	

}
