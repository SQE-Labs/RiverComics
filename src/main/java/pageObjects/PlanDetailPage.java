package pageObjects;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.BasePage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class PlanDetailPage extends BasePage {

	private By payNow=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.widget.Button");
	
	private By relativeLayout = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout");

	private By webView = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView");

	private By webView2 = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView");

	private By proceed = By.xpath("//android.view.View/android.widget.Button");

	private By contactNO2 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]");
	private By subscribeBtn = By.id("com.river.comics.us:id/tvToolbarSubscribe");

	private By subscribeNow = By.id("com.river.comics.us:id/buttonBuyNow");

	private By hjk = By.id("");;
	
	private By language=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/android.view.View");
	
	private By viewDetails=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[3]/android.view.View[4]/android.widget.Button");
	
	private By closeViewDetails= By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[3]/android.widget.Image");
	private By edewd = By.id("");

	private By ghddj = By.id("");

	private By ghswns = By.id("");

	private By contact = MobileBy.id("contact");
	private By planDetailsPageTitle = By.id("com.river.comics.us:id/tvToolbarTitle");

	private By proceedButton = By.id("redesign-v15-cta");

	private By cardPayment = By.xpath("//android.widget.ListView/android.view.View[1][@text='Card']");

	private By UPIPayment = By.xpath("//android.widget.ListView/android.view.View[2][@text='UPI ...']");
	private By netBankingPayment = By.xpath("//android.widget.ListView/android.view.View[3][@text='Netbanking ...']");
	private By walletPayment = By.xpath("//android.widget.ListView/android.view.View[4][@text='Wallet ...']");
	public void clickSubscribe() throws InterruptedException {
		click(subscribeBtn);

	}

	public void clickSubscribeNow() throws InterruptedException {
		click(subscribeNow);
		Thread.sleep(2000);
	}

	public String getSubscribeNOW() throws InterruptedException {
		Thread.sleep(4000);
		return getText(subscribeNow);

	}

	public void getWindows() {
		Set<String> contexts = driver.getContextHandles();
		for (String context : contexts) {
			if (context.contains("NATIVE_APP")) {
				System.out.println("Switched");
				driver.context(context);
				break;
			}

		}
	}

	public void planDetailsPageDisplayed() throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertTrue(isDisplayed(planDetailsPageTitle));

	}

	public void callTouchByCOrdinates() {
		tapByCoordinates(587, 2097);

	}

	public void clickProceed() throws InterruptedException {
		click(proceed);

	}

	public void verifyAllPaymentMethodsDisplayed() throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertTrue(isDisplayed(cardPayment));

		Assert.assertTrue(isDisplayed(UPIPayment));
		Assert.assertTrue(isDisplayed(netBankingPayment));
		Assert.assertTrue(isDisplayed(walletPayment));

	}

	public void addContactDetails(String text) throws InterruptedException {
		sendKeys(contact, text);
	}

	public void enterContactNumber() throws InterruptedException {
		
		sendKeys(contactNO2, "7087964477");

	}
	public void clickLanguage() throws InterruptedException
	{
		click(language);
	}
	
	public void clickOrderDetails() throws InterruptedException
	{
		click(viewDetails);
	}
	public void closeOrderDetails() throws InterruptedException
	{
		Thread.sleep(3000);
		click(closeViewDetails);
	}
	public void verifyPayNowIsDisplayed()
	{
		
		Assert.assertTrue(isDisplayed(payNow));
		
	}
	
	public void verifySubscribeNowIsDisplayed()
	{
		
		Assert.assertTrue(isDisplayed(subscribeNow));
		
	}

}
