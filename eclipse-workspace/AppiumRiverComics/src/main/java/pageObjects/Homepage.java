package pageObjects;

import base.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Homepage extends BasePage{
	
	//@AndroidFindBy(id = "com.river.comics.us:id/tvToolbarSubscribe")
	private MobileElement subscribeBtn;
	
	
	//@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageButton")
	private MobileElement hamburgerIcon;

	@AndroidFindBy(id = "com.river.comics.us:id/ivToolbarLogo")
	private MobileElement logo;
	
	//@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.ImageView")
	private MobileElement selectSeries;
	
	public void clickSubscribeBtn() {
		click(subscribeBtn);
		
	}
	
	public void select_Series() {
		click(selectSeries);
		
	}
}
