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

    private By favourite = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]");

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

    private By changeLanguage = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[7]/android.widget.TextView");

    private By contactUs = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[5]");

    private By logOut = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[10]");

    private By yesLogout = By.id("android:id/button1");

    private By progressBar = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ProgressBar");

    private By confirmEmail = By.id("com.river.comics.us:id/etReEnterNewEmail");

    private By pleaseEnterCurrentEmailAddress = By.xpath("/hierarchy/android.widget.Toast");

    private By currentEmail = By.id("com.river.comics.us:id/etCurrentEmail");

    private By submit = By.id("com.river.comics.us:id/btnSubmit");

    private By validationMsgNonExistingEmail = By.xpath("/hierarchy/android.widget.Toast");

    private By toastMessageNewEmail = By.xpath("/hierarchy/android.widget.Toast");

    private By reEnterNewEmail = By.id("com.river.comics.us:id/etReEnterNewEmail");

    private By newEmail = By.id("com.river.comics.us:id/etNewEmail");

    private By sameEmailValidationMsg = By.id("/hierarchy/android.widget.Toast");

    private By confirmEmailToastMsg = By.id("/hierarchy/android.widget.Toast");

    private By differentEmailToastMSG = By.xpath("/hierarchy/android.widget.Toast");

    private By pleaseEnterNewEmailAddress = By.xpath("/hierarchy/android.widget.Toast");

    private By updatePassword = By.id("com.river.comics.us:id/tvUpdatePassword");

    private By confirmNewPassword = By.id("com.river.comics.us:id/etReEnterNewdPassword");

    private By currentPassword = By.id("com.river.comics.us:id/etCurrentPassword");

    private By newPassword = By.id("com.river.comics.us:id/etNewPassword");

    private By submitPassword = By.id("com.river.comics.us:id/btnSubmit");

    private  By pleaseEnterCurrentPassword = By.xpath("/hierarchy/android.widget.Toast");


    public String getTextPleaseEnterCurrentPassword() {
        return getText(pleaseEnterCurrentPassword);
    }

    public void clickSubmitPassword() throws InterruptedException {
        click(submitPassword);
    }


    public boolean isConfirmNewPasswordPresent() throws InterruptedException {
        Thread.sleep(2000);
        return isElementPresent(confirmNewPassword);
    }

    public void enterCurrentPassword(String passText) throws InterruptedException {
        sendKeys(currentPassword, passText);
        Thread.sleep(2000);
    }

    public void enterNewPassword(String passText) throws InterruptedException {
        sendKeys(newPassword, passText);
        Thread.sleep(2000);
    }

    public void enterConfirmPassword(String passText) throws InterruptedException {
        sendKeys(confirmNewPassword, passText);
        Thread.sleep(2000);
    }

    public void enterDataSearchField(String searchValue) throws InterruptedException {
        sendKeys(searchField, searchValue);
    }

    public void clickUpdatePassword() throws InterruptedException {
        click(updatePassword);
        Thread.sleep(1000);
    }

    public void clickLanguageSubTab() throws InterruptedException {
        click(langauageSubtab);
        Thread.sleep(2000);
    }

    public void clickDeviceList() throws InterruptedException {
        click(deviceList);
        Thread.sleep(2000);
    }

    public void clickSubmit() throws InterruptedException {
        click(submit);
        Thread.sleep(1000);
    }

    public void enterNonExistingEmail(String emailText) throws InterruptedException {
        Thread.sleep(2000);
        sendKeys(currentEmail, emailText);
    }

    public void enterAlreadyRegisteredEmail(String emailText) throws InterruptedException {
        sendKeys(currentEmail, emailText);
        Thread.sleep(2000);
    }

    public void enterConfirmEmail(String emailText) throws InterruptedException {
        sendKeys(reEnterNewEmail, emailText);
        Thread.sleep(2000);
    }

    public void enterNewEmail(String emailText) throws InterruptedException {
        sendKeys(newEmail, emailText);
        Thread.sleep(2000);
    }

    public void enterCurrentEmail(String emailText) throws InterruptedException {
        sendKeys(currentEmail, emailText);
        Thread.sleep(2000);
    }

    public void clickLogout() throws InterruptedException {
        clickHumburgerIcon();
        Thread.sleep(2000);
        click(logOut);
        Thread.sleep(2000);
        click(yesLogout);
        Thread.sleep(2000);
    }

    public void clickSettingsTab() throws InterruptedException {
        Thread.sleep(2000);
        click(settingsTab);
        Thread.sleep(2000);
    }

    public void clickEnglishLanguage() throws InterruptedException {
        click(selectEnglishLanguage);
        Thread.sleep(2000);
    }

    public boolean isEnglishLanguagePresent() throws InterruptedException {
        Thread.sleep(2000);
        return isElementPresent(selectEnglishLanguage);
    }

    public boolean isUpdateEmailPagePresent() throws InterruptedException {
        Thread.sleep(2000);
        return isElementPresent(confirmEmail);
    }


    public void clickHumburgerIcon() throws InterruptedException {
        click(humburgerIcon);
        Thread.sleep(4000);
    }

    public void clickUpdateEmail() throws InterruptedException {
        click(updateEmail);
        Thread.sleep(2000);
    }


    public void clickFavourite() throws InterruptedException {
        click(favourite);
        Thread.sleep(2000);
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
        Thread.sleep(2000);
    }

    public boolean isNoRecordFoundMsgPresent() throws InterruptedException {
        Thread.sleep(2000);
        return isElementPresent(noRecordFound);
    }

    public boolean isProgressBarPresent() throws InterruptedException {
        return isElementPresent(progressBar);
    }

    public boolean isSubscribeButtonPresent() throws InterruptedException {
        Thread.sleep(2000);
        return isElementPresent(subscribe);
    }

    public boolean isSearchButtonPresent() throws InterruptedException {
        Thread.sleep(2000);
        return isElementPresent(search);
    }

    public boolean isFavouriteButtonPresent() throws InterruptedException {
        Thread.sleep(2000);
        return isElementPresent(favourite);
    }

    public boolean isDevicePresent() throws InterruptedException {
        Thread.sleep(2000);
        return isElementPresent(devices);
    }

    public boolean isSettingsPagePresent() throws InterruptedException {
        Thread.sleep(2000);
        return isElementPresent(deleteAccount);
    }

    public void clickDeleteAccount() throws InterruptedException {
        click(deleteAccount);
        Thread.sleep(2000);

    }

    public boolean isPlanDetailPagePresent() throws InterruptedException {
        Thread.sleep(1000);
        return isElementPresent(subscribeNow);
    }

    public boolean isLanguagePopUpOpensUp() throws InterruptedException {
        Thread.sleep(1000);
        return isElementPresent(selectLanguage);
    }


    public boolean isUserOnSharePage() throws InterruptedException {
        Thread.sleep(2000);
        return isElementPresent(validateShare);
    }

    public boolean isConfirmNewEmailPresent() throws InterruptedException {
        Thread.sleep(2000);
        return isElementPresent(confirmNewEmailAddress);
    }

    public boolean isSearchPagePresent() throws InterruptedException {
        Thread.sleep(2000);
        return isElementPresent(searchField);
    }

    public boolean isContactUsTabPresent() throws InterruptedException {
        Thread.sleep(2000);
        return isElementPresent(validateSeries);
    }


    public boolean isSeriesPresent() throws InterruptedException {
        Thread.sleep(2000);
        return isElementPresent(validateSeries);
    }

    public boolean isLanguageTabPresent() throws InterruptedException {
        Thread.sleep(2000);
        return isElementPresent(selectLanguage);
    }

    public boolean isFAQsPresent() throws InterruptedException {
        Thread.sleep(2000);
        return isElementPresent(validateFAQs);
    }


    public void clickChangeLanguage() throws InterruptedException {
        click(changeLanguage);
        Thread.sleep(1000);
    }

    public String getDifferentEmailTXT() {
        return getText(confirmEmailToastMsg);
    }

    public String getUserNameTXT() {
        return getText(usernameText);
    }

    public String getPrenium() {
        return getText(premium);
    }

    public String getSameEmailValidationMsg() {
        return getText(differentEmailToastMSG);
    }


    public String getSubscribeTab() throws InterruptedException {
        Thread.sleep(4000);
        return getText(subscribe);
    }

    public String getSearchTab() throws InterruptedException {
        Thread.sleep(4000);
        return getText(search);
    }

    public String getNewEmailValidationMessage() throws InterruptedException {
        return getText(pleaseEnterNewEmailAddress);
    }

    public String getBlankEmailToastMsg() {
        return getText(pleaseEnterCurrentEmailAddress);
    }

    public String getValidationMessageConfirmEmailBlank() {
        return getText(confirmEmailToastMsg);
    }

    public String getNonExistingEmailToastMsg() {
        return getText(validationMsgNonExistingEmail);
    }

    public String getNewEmailToastMsg() {
        return getText(validationMsgNonExistingEmail);
    }


    public String getFavouriteTab() throws InterruptedException {
        Thread.sleep(4000);
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
