package pageObjects;

import base.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class VideoPlay extends BasePage{
		
	
@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView[1]")
private MobileElement backArrow;

@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView[2]")
private MobileElement rewindVideo;

@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[5]/android.view.View[1]")
private MobileElement playSeries;

@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView[4]")
private MobileElement forwardVideo;

@AndroidFindBy(xpath = "widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[5]/android.view.View[1]")
private MobileElement Mute;

@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.TextView[2]")
private MobileElement language;

public void clickBackArrow() {
	click(backArrow);
}

public void clickRewindVideo() {
	click(rewindVideo);
}

public void clickPlaySeries() {
	click(playSeries);
   }

public void clickForwardVideo() {
	click(forwardVideo);
   }

public void clickMute() {
	click(Mute);
   }

public void clickLanguage() {
	click(language);
   }
}
