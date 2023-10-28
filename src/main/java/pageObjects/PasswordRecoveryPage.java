package pageObjects;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.BasePage;

public class PasswordRecoveryPage extends BasePage {
	
	
	By newPassword=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[2]/android.view.View[1]/android.widget.EditText");
	
	By confirmPassword=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.widget.EditText");
	
	By resetPasswordButton=By.className("android.widget.Button");
	
	By newPwdRequired=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[2]/android.view.View[1]/android.widget.TextView[1]");
	
	By confirmPwdRequired= By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.widget.TextView[1]");
	By LessThanSixCharMsg= By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[2]/android.view.View[1]/android.widget.TextView[1]");
	
	By pwdResetSuccessMsg= By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.widget.TextView[3]");
	
	public void clickResetPassword() throws InterruptedException
	{
		click(resetPasswordButton);
		
		
	}
	
	public void validatePasswordIsMandatory() throws InterruptedException
	{
		Thread.sleep(2000);
		String msg=getText(newPwdRequired);
		Assert.assertEquals(msg, "The Password field is required.");
		
		
	}
	public void passwordResetDetails(String pwd, String confirmPwd) throws InterruptedException
	{
		
		Thread.sleep(5000);
		sendKeys(newPassword,pwd);
		sendKeys(confirmPassword,confirmPwd);
	}
	public void validatePasswordLessThanSixChar() throws InterruptedException
	{
		Thread.sleep(2000);
		String msg=getText(LessThanSixCharMsg);
	    Assert.assertEquals(msg, "The Password field must be at least 6 characters in length.");
		
		
	}
	public void validatePasswordMoreThan14Char() throws InterruptedException
	{
		Thread.sleep(2000);
		String msg=getText(LessThanSixCharMsg);
	    Assert.assertEquals(msg, "The Password field cannot exceed 14 characters in length.");
		
		
	}
	public void validateConfirmPwd() throws InterruptedException
	{
		Thread.sleep(2000);
		String msg=getText(confirmPwdRequired);
	    Assert.assertEquals(msg, "The Password Confirmation field is required.");
		
		
	}
	
	public void validatePwdConfirmPwd() throws InterruptedException
	{
		Thread.sleep(2000);
		String msg=getText(newPwdRequired);
	    Assert.assertEquals(msg, "The Password field does not match the Password Confirmation field.");
		
		
	}
	
	public void pwdReset() throws InterruptedException
	{
		Thread.sleep(2000);
		String msg=getText(pwdResetSuccessMsg);
	    Assert.assertEquals(msg, "Your password has been successfully changed. You may now continue in the River Comics app and login with the new password.");
		
		
	}
	public boolean passwordResetBtnDisplayed()
	{
		
		return isDisplayed(resetPasswordButton);
	}
	
}
