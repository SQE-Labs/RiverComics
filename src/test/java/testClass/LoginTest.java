package testClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;
import pageObjects.LoginPage;

public class LoginTest extends BaseTest {
	

	@Test
    public  void validate_Login() throws Exception {
		LoginPage login= new LoginPage();
        Thread.sleep(5000);
        
        login.clickLogin();
        String msg=login.getToastMessage();
        Assert.assertEquals(msg, "Please enter email address");
        
        
        
        
        login.enterUserName("anurag");
        login.enterPassword("Anurag@12345");
        login.clickLogin();
        String msg2=login.getToastMessage();
        Assert.assertEquals(msg2, "Please enter valid email address");
        
        
        login.enterUserName("anurag@a.com");
        login.enterPassword("Anurag@12345");
        login.clickLogin();
        Thread.sleep(5000);
       String msg3= login.getPopUpErrorMsg();
        Assert.assertEquals(msg3,"Invalid Username/Password");
        
        
        

        
        
        
        
        
        
        
        
        
        
        login.enterUserName("anurag.rana@sqelabs.com");
       
        
        login.enterPassword("Anurag@12345");
        login.clickLogin();
        login.denyLocationPopUp();
//        Thread.sleep(5000);
//        pressEnterKey();
//        pressEnterKey();
//
//        
//        login.clickLogin();
        
	}
}
