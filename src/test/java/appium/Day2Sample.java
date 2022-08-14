package appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Day2Sample {

	
	//public class SampleTest {

	  private AndroidDriver driver;

	  @Before
	  public void setUp() throws MalformedURLException {
	    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "android");
	    desiredCapabilities.setCapability("appium:platformVersion", "7");
	    desiredCapabilities.setCapability("appium:deviceName", "Android SDK built for x86");
	    desiredCapabilities.setCapability("appium:app", "D:\\ApiDemos-debug.apk");
	    desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
	    desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
	    desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
	    desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

	    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

	    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
	  }

	  @Test
	  public void sampleTest() {
	    MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Text");
	    el1.click();
	    MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("LogTextBox");
	    el2.click();
	    MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Add");
	    el3.click();
	    MobileElement el4 = (MobileElement) driver.findElementById("io.appium.android.apis:id/text");
	    el4.click();
	    el4.sendKeys("\"Hello\"");
	  }

	  @After
	  public void tearDown() {
	    driver.quit();
	  }
	}

