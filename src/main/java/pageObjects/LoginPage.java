package pageObjects;

import org.openqa.selenium.By;

import base.BasePage;
import base.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends BasePage{
	
	
	
	
	private By userName=By.id("com.river.comics.us:id/etEmail");
	
	
	private By password=By.id("com.river.comics.us:id/etPassword");
	
	
	private By loginBtn=By.id("com.river.comics.us:id/btnLogin");
	
	private By  popUpMsg = By.id("android:id/message");
	
	
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_deny_button")
	private By denyLocation=By.id("com.android.permissioncontroller:id/permission_deny_button");
	
	
	public void enterUserName(String usernameTxt) {
		sendKeys(userName,usernameTxt);	
	}
	
	public void enterPassword(String passwordTxt) {
		sendKeys(password,passwordTxt);	
	}
	
	public void clickLogin() {
		click(loginBtn);	
	}
	
	public void denyLocationPopUp() throws InterruptedException {
		Thread.sleep(3000);
		click(denyLocation);	
	}
	
	public String getToastMessage()
	{
		
		String toastMsg = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");

		return toastMsg;
	}
	
	public String getPopUpErrorMsg()
	{
		
		//driver.findElement(By.id("android:id/button1")).click();
		String msg=driver.findElement(popUpMsg).getText();
		driver.findElement(By.id("android:id/button1")).click();
		
		return msg;
		
		
	}
	public void switchToFrame()
	{
		driver.switchTo().frame(0);
	}
	
	
	
	

}
