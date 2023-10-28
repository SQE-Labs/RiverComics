package base;

import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.google.common.collect.ImmutableMap;

//import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import utilities.DriverManager;
import com.google.common.collect.ImmutableMap;

public class BasePage {
	public static AppiumDriver driver = DriverManager.getDriver();
	public final long EXPLICIT_WAIT = 20;
//	public BasePage() {
//		
//		this.driver=DriverManager.getDriver();
////	PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
////	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
////	PageFactory.initElements(new AppiumFieldDecorator(DriverManager.getDriver(), 15, TimeUnit.SECONDS), this);
////		PageFactory.initElements(driver, this);
//	}

	public void waitForVisibility(MobileElement mobileElement) {
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), EXPLICIT_WAIT);
		wait.until(ExpectedConditions.visibilityOf(mobileElement));
	}

	public void waitForVisibility(By path) {
		WebDriverWait wait = new WebDriverWait(driver, EXPLICIT_WAIT);
		wait.until(ExpectedConditions.presenceOfElementLocated(path));
	}

	public void waitForAlert() {
		WebDriverWait wait = new WebDriverWait(driver, EXPLICIT_WAIT);
		wait.until(ExpectedConditions.alertIsPresent());
	}

	public void click(MobileElement mobileElement) {
		// waitForVisibility(mobileElement);
		// TestUtils.log().info(mobileElement.getText() + " is clicked");
		// ExtentLogger.info("<b>" + mobileElement.getText() + "</b> is clicked");
		mobileElement.click();
	}

	public void click(By path) throws InterruptedException {
		// waitForVisibility(path);
		Thread.sleep(2000);
		// TestUtils.log().info(mobileElement.getText() + " is clicked");
		// ExtentLogger.info("<b>" + mobileElement.getText() + "</b> is clicked");
		driver.findElement(path).click();
	}

	public void sendKeys(MobileElement mobileElement, String txt) {
		// waitForVisibility(mobileElement);
		// TestUtils.log().info("Filling " + txt + " in " + mobileElement.getText());
		// ExtentLogger.info("Filling <b>" + txt + "</b> in <b>" +
		// mobileElement.getText() + "</b>");
		mobileElement.sendKeys(txt);
	}

	public void sendKeys(By path, String txt) throws InterruptedException {
		Thread.sleep(2000);
		// waitForVisibility(path);
		// TestUtils.log().info("Filling " + txt + " in " + mobileElement.getText());
		// ExtentLogger.info("Filling <b>" + txt + "</b> in <b>" +
		// mobileElement.getText() + "</b>");
		driver.findElement(path).sendKeys(txt);

	}
	public void sendKeys(MobileBy path, String txt) throws InterruptedException {
		Thread.sleep(2000);
		// waitForVisibility(path);
		// TestUtils.log().info("Filling " + txt + " in " + mobileElement.getText());
		// ExtentLogger.info("Filling <b>" + txt + "</b> in <b>" +
		// mobileElement.getText() + "</b>");
		driver.findElement(path).sendKeys(txt);

	}

	public void acceptAlert() throws InterruptedException {
		waitForAlert();
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
	}

	public static void assertEquals(String actual, String expected) {

		try {
			Assert.assertEquals(actual, expected);

		} catch (AssertionError e) {

		}
	}

	public String getAttribute(By path, String attribute) {
		String attributeValue = driver.findElement(path).getAttribute(attribute);
		return attributeValue;
	}

//	protected boolean isElementPresent(By by) {
//		try {
//			driver.findElement(by);
//			return true;
//		} catch (NoSuchElementException e) {
//			return false;
//		}
//	}

	public boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

//	public boolean isElementPresent(By path) {
//
//		return driver.findElement(path).isDisplayed();
//	}

	public boolean isElementSelected(By path) {

		return driver.findElement(path).isSelected();
	}

	public String getText(By path) {

		return driver.findElement(path).getText();

	}

	public boolean isDisplayed(By path) {

		return driver.findElement(path).isDisplayed();
	}

	public void tap_on_screen() throws InterruptedException {

		// driver.tap(1, 200, 200, 100);
		TouchAction touchAction = new TouchAction(driver);
		touchAction.tap(PointOption.point(200, 200)).perform();
	}

	public void getCordinates_and_click(By path) {
		Point location = driver.findElement(path).getLocation();
		int elementX = location.getX();
		int elementY = location.getY();
		System.out.println(elementX + " " + elementY);
		TouchAction touchAction = new TouchAction(driver);
		touchAction.tap(PointOption.point(elementX, elementY)).perform();
		// driver.tap(200, path,200);
	}

	public void tapOnElement(WebElement element) {
		TouchActions action = new TouchActions(driver);
		action.click(element);
		action.perform();

	}

	public boolean isDisplayedMobileElement(MobileElement path) {

		return path.isDisplayed();
	}

	public void scrollToElement5() {

		driver.findElement(MobileBy
				.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"RESET PASSWORD\"))"))
				.click();

	}

	public int isElementPresentList(By path) {
		return driver.findElements(path).size();

	}

	public void swipeDown() {
		Dimension size = driver.manage().window().getSize();
		int startX = size.width / 2;
		int startY = (int) (size.height * 0.8);
		int endY = (int) (size.height * 0.2);

		// Swipe from startY to endY (scroll down)
		new TouchAction<>(driver).press(PointOption.point(startX, startY)).waitAction()
				.moveTo(PointOption.point(startX, endY)).release().perform();

	}

	public  void scrollDownToEnd(By element) {
		
		int size=driver.findElements(element).size();
		
		int i=0;
		while (i<5) {
			// Perform a swipe down
			swipeDown();
			i++;
		}
		//System.out.println("Outt");
		
		
	}
	
	 public static void tapByCoordinates(int elementX, int elementY) {
		
			TouchAction touchAction = new TouchAction(driver);
			touchAction.tap(PointOption.point(elementX, elementY)).perform();
	    }
	
}
