package testCases;

import org.testng.Assert;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;



public class TC001_AccRegistration extends BaseClass{
	
	@Test
	public void verify_account_registration() throws InterruptedException {

		HomePage hp = new HomePage(driver);     //constructor method are there in this 'HomePage' class. we r passing this class 'driver' to that pass by using constructor

		hp.registration();
		
		
    	RegistrationPage rp = new RegistrationPage(driver);     //constructor method are there in this 'RegistrationPage' class. we r passing this class 'driver' to that pass by using constructor

		rp.Setfname(randomString().toUpperCase());   //call 'random_generator' method is written below to generate random alphabets.
		rp.Setlname(randomString().toUpperCase());
		rp.SetEmail(randomString() + "@gmail.com");   // bcz 2nd time panum podhu gmail alrdy exits ll come. here one method call another method
		Thread.sleep(1000);
		
		String password = randomAplhaNumberic();  
		
		//for password and cnfrmpassword thaniya thaniya random number gen pana, mismatch aagum, thats y we call only one time and store it in one string and pass that in both password and cnfrm password.
		
		rp.SettxtPassword(password);
		rp.SetcnfrmtxtPassword(password);
		rp.clickregister();
		String confirmMessage = rp.cnfrmMessage();
		Assert.assertEquals(confirmMessage, "Your registration completed");
		
	}

}
