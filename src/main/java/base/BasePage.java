package base;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.Assert;
import utilities.DriverManager;

import java.util.NoSuchElementException;


public class BasePage {
    public AppiumDriver driver;
	public final long EXPLICIT_WAIT=20;
	public BasePage() {
		
		this.driver=DriverManager.getDriver();
	//PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
	//PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	//PageFactory.initElements(new AppiumFieldDecorator(DriverManager.getDriver(), 15, TimeUnit.SECONDS), this);
	//	PageFactory.initElements(driver, this);
	}

	public void waitForVisibility(MobileElement mobileElement) {
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), EXPLICIT_WAIT);
		wait.until(ExpectedConditions.visibilityOf(mobileElement));
	}

	public void waitForVisibility(By path) {
		WebDriverWait wait = new WebDriverWait(driver, EXPLICIT_WAIT);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(path)));
	}
	public void waitForAlert() {
		WebDriverWait wait = new WebDriverWait(driver, EXPLICIT_WAIT);
		wait.until(ExpectedConditions.alertIsPresent());
	}
	public void click(MobileElement mobileElement) {
		//waitForVisibility(mobileElement);
		//TestUtils.log().info(mobileElement.getText() + " is clicked");
		//ExtentLogger.info("<b>" + mobileElement.getText() + "</b> is clicked");
		mobileElement.click();
	}

	public void click(By path) throws InterruptedException {
	 // waitForVisibility(path);
		Thread.sleep(2000);
		//TestUtils.log().info(mobileElement.getText() + " is clicked");
		//ExtentLogger.info("<b>" + mobileElement.getText() + "</b> is clicked");
		driver.findElement(path).click();
	}
	public void sendKeys(MobileElement mobileElement, String txt) {
		//waitForVisibility(mobileElement);
		//TestUtils.log().info("Filling " + txt + " in " + mobileElement.getText());
		//ExtentLogger.info("Filling <b>" + txt + "</b> in <b>" + mobileElement.getText() + "</b>");
		mobileElement.sendKeys(txt);
	}

	public void sendKeys(By path, String txt) {
		//waitForVisibility(path);
		//TestUtils.log().info("Filling " + txt + " in " + mobileElement.getText());
		//ExtentLogger.info("Filling <b>" + txt + "</b> in <b>" + mobileElement.getText() + "</b>");
		driver.findElement(path).sendKeys(txt);
	
	}
	public void acceptAlert() throws InterruptedException {
		waitForAlert();

		driver.switchTo().alert().accept();
		Thread.sleep(5000);
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

	protected boolean isElementPresent(By by) {
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
	}


