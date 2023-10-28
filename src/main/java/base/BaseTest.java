package base;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.InteractsWithApps;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;
import utilities.DriverManager;

public class BaseTest {
	AndroidDriver driver;

	private static AppiumDriverLocalService server;

	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod(ITestResult result) {
	}

	/* Executes before any of the test method class is executed */

	@BeforeSuite
	public void beforeSuite() throws Exception {
		/*
		 * @Optional("androidOnly") -> means we are setting the default value as
		 * androidOnly and it is Optional
		 */

		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("platformName", "Android");
		caps.setCapability("deviceName", "Anurag");
		caps.setCapability("platformVersion", "11.0");
		caps.setCapability("automationName", "UIAutomator2");
		// caps.setCapability("app","‪C:\\base.apk");
		caps.setCapability("app", "C:\\Users\\SQE Labs\\Documents\\RiverComics.apk");

		// cap.setCapability("appPackage","com.river.comics.us");
		// cap.setCapability("appActivity","com.ui.user.login.LoginActivity");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), caps);
		DriverManager.setDriver(driver);

	}

	/*
	 * @AfterClass public void afterClass() { DriverManager.getDriver().quit(); }
	 */

	public void closeApp() {
		((InteractsWithApps) DriverManager.getDriver()).closeApp();
	}

	public void launchApp() {
		((InteractsWithApps) DriverManager.getDriver()).launchApp();
	}

	@BeforeSuite
	public void beforeSuite2() throws AppiumServerHasNotBeenStartedLocallyException, Exception {

		// ThreadContext.put(ROUTINGKEY, SERVER_LOGS);
//		server = AppiumServerUtils.getAppiumService();
//		if (!AppiumServerUtils.checkIfAppiumServerIsRunnning(4723)) {
//			server.start();
//			/* This will not print the Appium server Logs in IDE console */
//			server.clearOutPutStreams();
//			TestUtils.log().debug("Appium Server started.................");
//		} else {
//			TestUtils.log().debug("Appium Server is already running................");
//		}
	}

	@AfterSuite
	public void afterSuite() {
		// server.stop();
		// TestUtils.log().debug("Appium Server stopped.............");
	}

	public void OpenChromeBrowser() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SQE Labs\\Downloads\\chromedriver_117\\chromedriver-win64\\chromedriver.exe");
		caps.setCapability("deviceName", "Anurag");
		caps.setCapability("platformName", "Android");
		caps.setCapability("chromedriverExecutableDir",
				"‪C:\\Users\\SQE Labs\\Downloads\\chromedriver_117\\chromedriver-win64\\chromedriver.exe");

		caps.setCapability("browserName", "Chrome");
		caps.setCapability("automationName", "UIAutomator2");

		// Specify the Appium server URL
		URL appiumURL;
		try {
			appiumURL = new URL("http://localhost:4723");
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}

		// Initialize the AndroidDriver with the desired capabilities and Appium server
		// URL
		AppiumDriver driver1 = new AndroidDriver(appiumURL, caps);

		// Navigate to a website
		driver1.get("https://www.example.com");

		// Add your test steps here

		// Quit the driver
		// driver.quit();
	}

	protected void switchToApp() {

		Activity activity = new Activity("com.google.android.gm",
				"com.google.android.gm.ConversationListActivityGmail");
		driver.startActivity(activity);

	}
	
	protected void switchToCheckoutPage() {

		Activity activity = new Activity("com.river.comics.us",
				"com.razorpay.CheckoutActivity");
		driver.startActivity(activity);

	}
	
	public void pressAndroidBackKey()
	{
		driver.navigate().back();
	}
	
	public void pressSearchKey_keypad()
	{ 
		
		 driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));

		
	}
	public void enterConatct()
	{
		for(int i=0;i<10;i++)
		driver.pressKey(new KeyEvent(AndroidKey.DIGIT_7));
		
	}
	
	public void getWindows()
	{
		Set<String> contextHandles = driver.getContextHandles();
		System.out.println(contextHandles);
		for (String context : contextHandles) {
		    if (context.startsWith("WEBVIEW")) {
		        driver.context(context);
		        break;
		    }
		}
	}
	
	}
