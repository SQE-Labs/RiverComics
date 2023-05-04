package testClass;

import org.testng.annotations.Test;
import base.BaseTest;
import pageObjects.Login;

public class LoginTest extends BaseTest {
	

	@Test
    public  void validate_Login() throws Exception {
		Login login= new Login();
        Thread.sleep(2000);
        login.enterUserName("test0404@yopmail.com");
        login.enterPassword("1234567");
        login.clickLogin();
        
	}
}
