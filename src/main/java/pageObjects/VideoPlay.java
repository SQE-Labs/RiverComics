package pageObjects;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class VideoPlay extends BasePage {

	private By back = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView[1]");

	private By timeLeft = By.id(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.TextView[3]");

	private By fullScreen = By.xpath("//android.widget.Button[@text='Fullscreen']");

	private By exitFullScreen = By.xpath("//android.widget.Button[@text='Exit Fullscreen']");

	private By advertisementFrame = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View");

	private By skipButton = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[6]/android.widget.Button");

	private By advertisement = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View");
	private By gotIt = By.id("android:id/ok");

	private By forwardVideo = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView[4]");

	private By pause = By.xpath("//android.widget.ImageView[@index='7']");

	private By rewind = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView[2]");

	private By mute = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView[5]");

	private By language = By.id("00000000-0000-0240-ffff-ffff00000189");

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView[1]")
	private MobileElement backArrow;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Language']")
	private MobileElement language2;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView[2]")
	private MobileElement rewindVideo;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[5]/android.view.View[1]")
	private MobileElement playSeries;

	@AndroidFindBy(xpath = "widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[5]/android.view.View[1]")
	private MobileElement Mute;

	public void clickGotIt() throws InterruptedException {
		click(gotIt);
		Thread.sleep(15000);
	}

	public void clickForwardVideo() throws InterruptedException {
		click(forwardVideo);
		Thread.sleep(1000);
	}

	public void clickPauseSeries() throws InterruptedException {
		click(pause);
		Thread.sleep(1000);
	}

	public void clickRewindVideo() throws InterruptedException {
		click(rewind);
		Thread.sleep(1000);
	}

	public void clickMute() throws InterruptedException {
		click(Mute);
		Thread.sleep(1000);
	}

	public void clickLanguage() throws InterruptedException {
		tap_on_screen();
		click(language);
		Thread.sleep(1000);
	}

//	public void clickOnVideoScreen() throws InterruptedException {
//		click(clickOnVideoScreen());
//		Thread.sleep(1000);
//	}

//public void verifyAdvertisement10Sec() throws InterruptedException
//{
//	waitForVisibility(advertisement);
//	Thread.sleep(5000);
//	
//	if (isDisplayed(advertisement)) {
//        // Start the timer
//		System.out.println("Advertisement Element is displayed");
//        long startTime = System.currentTimeMillis();
//
//        // Check if the advertisement is displayed for 10 seconds
//        while (System.currentTimeMillis() - startTime < 10000) 
//        { // 10 seconds in milliseconds
//            try {
//                // Attempt to interact with the element
//                isDisplayed(advertisement);// Replace with your interaction code if needed
//            } catch (StaleElementReferenceException e) {
//                // Handle StaleElementReferenceException by re-locating the element
//                advertisement = (By) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[6]/android.view.View[2]/android.view.View"));
//            System.out.println(System.currentTimeMillis());
//            }
//        }
//        }
//
//}
	public void verifyLanguageSelectorIsDisplayed() throws InterruptedException {

		isDisplayed(language);

	}

	public void skipAdvertisement() throws InterruptedException {
		Thread.sleep(5000);
		
		waitForVisibility(skipButton);

		click(skipButton);

	}

	public void clk_advertisementPause() throws InterruptedException {
		tap_on_screen();
		System.out.println(isDisplayed(advertisementFrame));

	}

	public void clk_advertisementPlay() throws InterruptedException {
		tap_on_screen();
		Thread.sleep(3000);
		tap_on_screen();

	}

	public void zoomIn() throws InterruptedException {

		click(fullScreen);

	}

	public void zoomOut() throws InterruptedException {

		click(exitFullScreen);

	}

	public void advertisement_not_Displayed() throws InterruptedException {

		Thread.sleep(8000);
		tap_on_screen();
		try {
			Assert.assertFalse(isDisplayed(advertisement));
		} catch (org.openqa.selenium.NoSuchElementException e) {
			// Handle the exception here, e.g., log an error or perform an alternative
			// action

		}

	}

	public void verify_vdo_is_playing() throws InterruptedException {
		Thread.sleep(5000);
		tap_on_screen();
		Assert.assertTrue(isDisplayed(mute));

	}

	public void verify_vdo_is_paused() throws InterruptedException {

		tap_on_screen();
		System.out.println("1");
		System.out.println(isDisplayed(pause));
		// tapOnElement(driver.findElement(pause));

		getCordinates_and_click(pause);
		System.out.println("1");
		System.out.println(isDisplayed(timeLeft));

//		String time1=getAttribute(timeLeft, "text");
//		Thread.sleep(3000);
//		String time2=getAttribute(timeLeft, "text");
//		assertEquals(time1, time2);

	}

	public void clickLanguage1() throws InterruptedException {
		tap_on_screen();
//		isDisplayedMobileElement(language2);
//		//System.out.println(isDisplayed(language));
//		click(language);
		isDisplayed(language);
		
		//System.out.println(elements);
	}
	
	public void advertisementIsPlayed() throws InterruptedException {
		Thread.sleep(5000);
		tap_on_screen();
		Assert.assertTrue(isDisplayed(advertisementFrame));
		
		//System.out.println(elements);
	}
	public void clickBackButton() throws InterruptedException
	{
		click(back);
		
	}
}
