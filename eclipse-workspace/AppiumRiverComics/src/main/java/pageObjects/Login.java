package pageObjects;

import org.openqa.selenium.By;

import base.BasePage;
import base.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Login extends BasePage{
	
	
	
	//@AndroidFindBy(id = "com.river.comics.us:id/etEmail")
	private By userName=By.id("com.river.comics.us:id/etEmail");
	
	//@AndroidFindBy(id = "com.river.comics.us:id/etPassword")
	private By password=By.id("com.river.comics.us:id/etPassword");
	
	//@AndroidFindBy(id = "com.river.comics.us:id/btnLogin")
	private By loginBtn=By.id("com.river.comics.us:id/etPassword");
	
	public void enterUserName(String usernameTxt) {
		sendKeys(userName,usernameTxt);	
	}
	
	public void enterPassword(String passwordTxt) {
		sendKeys(password,passwordTxt);	
	}
	
	public void clickLogin() {
		click(userName);	
	}

}
