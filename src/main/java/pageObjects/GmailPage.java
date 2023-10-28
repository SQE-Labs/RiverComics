package pageObjects;

import org.openqa.selenium.By;

import base.BasePage;

public class GmailPage extends BasePage{
	
	private By email= By.id("com.google.android.gm:id/senders");
	

	public void clickEmail_passwordReset() throws InterruptedException
	{
		click(email);
		
		Thread.sleep(5000);
		scrollToElement5();
		
	}
	
	public boolean mailRecieved()
	{
		return isDisplayed(email);
	}
}
