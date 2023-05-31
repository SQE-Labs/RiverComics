package pageObjects;

import base.BasePage;
import io.appium.java_client.MobileElement;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;

public class Hamburger extends BasePage {

    private By humburgerIcon = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageButton");

    private By usernameText = By.id("com.river.comics.us:id/tv_email");

    private By premium = By.id("com.river.comics.us:id/tv_premium");

    private By subscribe = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.TextView");

    private By search = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]");

    private By favourite = By.id("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]");

    private By subscribeNow = By.id("com.river.comics.us:id/buttonBuyNow");

    private By searchField = By.id("com.river.comics.us:id/etToolbarSearch");

    private By validateSeries = By.xpath("//android.widget.LinearLayout[@content-desc='Series']/android.widget.TextView");

    private By noRecordFound = By.id("com.river.comics.us:id/tvNoRecordFound");

    private By shareTab = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView");

    private By validateShare = By.id("android:id/title");

    private By settingsTab = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[6]");

    private By deleteAccount = By.id("com.river.comics.us:id/tvDeleteAccount");

    private By langauageSubtab = By.id("com.river.comics.us:id/rlLanguage");

    private By selectLanguage = By.id("com.river.comics.us:id/alertTitle");

    private By selectEnglishLanguage = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]");

    private By updateEmail = By.id("com.river.comics.us:id/tvUpdateEmail");

    private By confirmNewEmailAddress = By.id("com.river.comics.us:id/etReEnterNewEmail");

    private By deviceList = By.id("com.river.comics.us:id/tvDeviceList");

    private By devices = By.id("com.river.comics.us:id/ivPhone");

    private By FAQs = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[9]");

    private By validateFAQs = By.id("com.river.comics.us:id/webView");

//    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView")
//    private MobileElement homeTab;

    private By changeLanguage = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[7]/android.widget.TextView");


    private By contactUs = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[5]");

//    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[6]")
//    private MobileElement logOut;


    public void enterDataSearchField(String searchValue) {
        sendKeys(searchField, searchValue);
    }

    public void clickLanguageSubTab() throws InterruptedException {
        click(langauageSubtab);
        Thread.sleep(2000);
    }

    public void clickDeviceList() throws InterruptedException {
        click(deviceList);
        Thread.sleep(2000);
    }

    public void clickSettingsTab() throws InterruptedException {
        click(settingsTab);
        Thread.sleep(4000);
    }

    public void clickEnglishLanguage() throws InterruptedException {
        click(selectEnglishLanguage);
        Thread.sleep(2000);
    }


    public void clickHumburgerIcon() throws InterruptedException {
        click(humburgerIcon);
        Thread.sleep(4000);
    }

    public void clickUpdateEmail() throws InterruptedException {
        click(updateEmail);
        Thread.sleep(4000);
    }

    public void clickFavourite() throws InterruptedException {
        click(favourite);
        Thread.sleep(4000);
    }

    public void clickShare() throws InterruptedException {
        click(shareTab);
        Thread.sleep(2000);
    }

    public void clickSearch() throws InterruptedException {
        click(search);
        Thread.sleep(4000);
    }

    public void clickSubscribe() throws InterruptedException {
        click(subscribe);
        Thread.sleep(4000);
    }

    public void validateNonexistingData() throws InterruptedException {
        Thread.sleep(2000);
        isElementPresent(noRecordFound);
    }

    public void validateDevices() throws InterruptedException {
        Thread.sleep(2000);
        isElementPresent(devices);
    }

    public void validateSettingsPage() throws InterruptedException {
        Thread.sleep(2000);
        isElementPresent(deleteAccount);
    }

    public void clickDeleteAccount() throws InterruptedException {
        click(deleteAccount);
        Thread.sleep(2000);

    }

    public void validatePlanPage() throws InterruptedException {
        Thread.sleep(4000);
        isElementPresent(subscribeNow);
    }

    public void validateShareTab() throws InterruptedException {
        Thread.sleep(2000);
        isElementPresent(validateShare);
    }

    public void validateUpdateEmail() throws InterruptedException {
        Thread.sleep(2000);
        isElementPresent(confirmNewEmailAddress);
    }

    public void validateSearchPage() throws InterruptedException {
        Thread.sleep(4000);
        isElementPresent(searchField);
    }

    public void validateSearchField() throws InterruptedException {
        Thread.sleep(2000);
        isElementPresent(validateSeries);
    }

    public void validateLanguage() throws InterruptedException {
        Thread.sleep(2000);
        isElementPresent(selectLanguage);
    }

    public void validateFAQs() throws InterruptedException {
        Thread.sleep(2000);
        isElementPresent(validateFAQs);
    }


    public void clickChangeLanguage() throws InterruptedException {
        click(changeLanguage);
        Thread.sleep(1000);
    }

    public String getUserNameTXT() {
        return getText(usernameText);
    }

    public String getPrenium() {
        return getText(premium);
    }

    public String getSubscribeTab() {
        return getText(subscribe);
    }

    public String getSearchTab() {
        return getText(search);
    }

    public String getFavouriteTab() {
        return getText(favourite);
    }

    public void clickFAQs() throws InterruptedException {
        click(FAQs);
        Thread.sleep(1000);
    }

    public void clickContactUs() throws InterruptedException {
        click(contactUs);
    }

}
