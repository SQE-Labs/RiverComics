package pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Settings {
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[6]")
	private MobileElement setting;
	
	@AndroidFindBy(id = "com.river.comics.us:id/rlLanguage")
	private MobileElement language;
	
	@AndroidFindBy(id = "com.river.comics.us:id/tvUpdateEmail")
	private MobileElement updateEmail;
	
	@AndroidFindBy(id = "com.river.comics.us:id/etCurrentEmail")
	private MobileElement currentEmail;
	
	@AndroidFindBy(id = "com.river.comics.us:id/etNewEmail")
	private MobileElement newEmail;
	
	@AndroidFindBy(id = "com.river.comics.us:id/etReEnterNewEmail")
	private MobileElement confirmEmail;
	
	
	@AndroidFindBy(id = "com.river.comics.us:id/tvUpdatePassword")
	private MobileElement updatePassword;
	
	@AndroidFindBy(id = "com.river.comics.us:id/etCurrentPassword")
	private MobileElement currentPassword;
	
	@AndroidFindBy(id = "com.river.comics.us:id/etNewPassword")
	private MobileElement newPassword;
	
	@AndroidFindBy(id = "com.river.comics.us:id/etReEnterNewdPassword")
	private MobileElement confirmPassword;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]")
	private MobileElement selectEnglishLanguage;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]")
	private MobileElement selectHindiLanguage;
	
	
	@AndroidFindBy(id = "com.river.comics.us:id/tvDeviceList")
	private MobileElement deviceList;
	
	@AndroidFindBy(id = "com.river.comics.us:id/tvRestorePurchase")
	private MobileElement restorePurchase;
	
	@AndroidFindBy(id = "com.river.comics.us:id/tvDeleteAccount")
	private MobileElement deleteAccount;
	

}
