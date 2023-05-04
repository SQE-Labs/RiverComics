package testClass;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class ValidateAppium {
	
	
	DesiredCapabilities cap = new DesiredCapabilities();
	
	@Test
	public void validate() throws MalformedURLException, InterruptedException {
    
    cap.setCapability("platformName", "Android");
    cap.setCapability("deviceName", "Nexus 5 API 30");
    cap.setCapability("platformVersion", "11.0");
    cap.setCapability("automationName", "Appium");
    cap.setCapability("app", "C:\\Users\\Itsqe\\eclipse-workspace\\AppiumRiverComics\\RiverComicsAPK\\base.apk");
    
    AndroidDriver  driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
    Thread.sleep(4000);
    driver.findElement(By.id("com.river.comics.us:id/etEmail")).sendKeys("test0404@yopmail.com");

   }
}
