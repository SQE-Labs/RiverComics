package pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Hamburger {
	
	
	@AndroidFindBy(id = "com.river.comics.us:id/tv_email")
	private MobileElement username;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView")
	private MobileElement homeTab;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.TextView")
	private MobileElement subscribeTab;
	
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]")
	private MobileElement searchTab;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]")
	private MobileElement favouriteTab;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[5]")
	private MobileElement shareTab;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[7]/android.widget.TextView")
	private MobileElement changeLanguage;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[5]")
	private MobileElement contactUs;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[6]")
	private MobileElement logOut;
	
	
	
//	public void clickUsername() {
//		click(username);
//	}
//	
//	public void clickHomeIcon() {
//		click(homeTab);
//	}
//	
//	public void clickSubscribeIcon() {
//		click(subscribeTab);
//	}
//	
//	public void clickSearchIcon() {
//		click(searchTab);
//	}
//	
//	public void clickFavouriteIcon() {
//		click(favouriteTab);
//	}
//	
//	public void clickShareIcon() {
//		click(shareTab);
//	}
//	
//	public void clickChangeLanguage() {
//		click(changeLanguage);
//	}
//	
//	public void clickContactUs() {
//		click(contactUs);
//	}
//	
//	public void clickLogoutIcon() {
//		click(logOut);
//	}
}
