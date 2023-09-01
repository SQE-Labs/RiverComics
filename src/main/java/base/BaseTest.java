package base;


import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.appium.java_client.InteractsWithApps;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;
import utilities.DriverManager;

public class BaseTest {
	
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
		

        DesiredCapabilities cap = new DesiredCapabilities();
       
        cap.setCapability("platformName", "Android");
        cap.setCapability("deviceName", "Nexus 5 API 30");
        cap.setCapability("platformVersion", "11.0");
        cap.setCapability("automationName", "Appium");
        cap.setCapability("app", "C:\\Users\\Itsqe\\eclipse-workspace\\AppiumRiverComics\\RiverComicsAPK\\base.apk");
   //  cap.setCapability("appPackage","com.river.comics.us");
   //cap.setCapability("appActivity","com.ui.user.login.LoginActivity");
     

		AndroidDriver  driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		DriverManager.setDriver(driver);
		
	}

	@AfterClass
	public void afterClass() {
		DriverManager.getDriver().quit();
	}

	public void closeApp() {
		((InteractsWithApps) DriverManager.getDriver()).closeApp();
	}

	public void launchApp() {
		((InteractsWithApps) DriverManager.getDriver()).launchApp();
	}

	@BeforeSuite
	public void beforeSuite2() throws AppiumServerHasNotBeenStartedLocallyException, Exception {

		//ThreadContext.put(ROUTINGKEY, SERVER_LOGS);
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
	//	server.stop();
		//TestUtils.log().debug("Appium Server stopped.............");
	}


}
