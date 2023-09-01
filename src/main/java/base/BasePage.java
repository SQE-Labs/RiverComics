package base;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utilities.DriverManager;

public class BasePage {
    public AppiumDriver<AndroidElement> driver;
	public final long EXPLICIT_WAIT=10;
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
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), EXPLICIT_WAIT);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(path)));
	}
	public void click(MobileElement mobileElement) {
		//waitForVisibility(mobileElement);
		//TestUtils.log().info(mobileElement.getText() + " is clicked");
		//ExtentLogger.info("<b>" + mobileElement.getText() + "</b> is clicked");
		mobileElement.click();
	}

	public void click(By path) {
		//waitForVisibility(mobileElement);
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
		waitForVisibility(path);
		//TestUtils.log().info("Filling " + txt + " in " + mobileElement.getText());
		//ExtentLogger.info("Filling <b>" + txt + "</b> in <b>" + mobileElement.getText() + "</b>");
		driver.findElement(path).sendKeys(txt);
	
	}
	public void switchToAlert() {
		
		 DriverManager.getDriver().switchTo().alert().accept();
		//TestUtils.log().info("Filling " + txt + " in " + mobileElement.getText());
		//ExtentLogger.info("Filling <b>" + txt + "</b> in <b>" + mobileElement.getText() + "</b>");
	}


	public String getAttribute(MobileElement mobileElement, String attribute) {
		//waitForVisibility(mobileElement);
		//TestUtils.log().info("Attribute: " + attribute + " value for " + mobileElement.getText() + " is - "
		//		+ mobileElement.getAttribute(attribute));
		/*
		 * ExtentLogger.info("Attribute: <b>" + attribute + "</b> value for <b>" +
		 * mobileElement.getText() + "</b> is - <b>" +
		 * mobileElement.getAttribute(attribute) + "</b>");
		 */return mobileElement.getAttribute(attribute);
	}
	
//	public String getText(MobileElement mobileElement) {
//	String text = "";
//
//        Element element = new Element("", path);
//        text = element.getText();
//        
//	}
}
