package utilities;

import java.io.IOException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;

public class DriverManager {
	private static ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();

	GlobalParams params = new GlobalParams();

	PropertyManager props = new PropertyManager();

	public DriverManager() {
	}

	public static AppiumDriver getDriver() {
		return driver.get();
	}

	public static void setDriver(AppiumDriver driverref) {
		driver.set((AndroidDriver) driverref);
	}

	public static void unload() {
		driver.remove();
	}

//GenericUtility utils = new GenericUtility();

	public void initializeDriver() throws Exception {
		AndroidDriver driver = null;
		GlobalParams params = new GlobalParams();

		PropertyManager props = new PropertyManager();
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		if (driver == null) {
			//
			UiAutomator2Options options = new UiAutomator2Options();
			options.setDeviceName("Anurag");
			options.setApp("D:\\RiverComicsMobile\\base.apk");
			options.setChromedriverExecutable("C:\\Users\\SQE Labs\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new AndroidDriver(url, options);
			// driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);

			// break;
			this.driver.set(driver);
		}
	}
}