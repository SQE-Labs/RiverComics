package pageObjects;

import org.openqa.selenium.By;

import base.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class VideoPlay extends BasePage{
	
private By gotIt =By.id("android:id/ok");	

private By forwardVideo = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView[4]");
		
private By pause = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView[3]");	

private By rewind = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView[2]");

private By mute = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView[5]");

private By language =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.TextView[2]");

private By clickVideoScreen = By.xpath("android:id/content");
@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView[1]")
private MobileElement backArrow;

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
	click(language);
	Thread.sleep(1000);
   }

public void clickOnVideoScreen() throws InterruptedException {
	click(clickVideoScreen);
	Thread.sleep(1000);
   }
}
