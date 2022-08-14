package appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class Day3Spinner {
	
	private AndroidDriver driver;

	 @Before
	  public void setUp() throws MalformedURLException {
	    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "android");
	    desiredCapabilities.setCapability("appium:platformVersion", "7");
	    desiredCapabilities.setCapability("appium:deviceName", "Android SDK built for x86");
	    desiredCapabilities.setCapability("appium:appPackage", "io.appium.android.apis");
	    desiredCapabilities.setCapability("appium:appActivity", "io.appium.android.apis.ApiDemos");
	    desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
	    desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
	    desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
	    desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

	    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

	    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
	  }

	  public void Views() {
		  MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Views");
		    el1.click();
	  }
	  
	 public void Scroll() {
		  (new TouchAction(driver))
	      .press(PointOption.point(238, 1702))
	      .moveTo(PointOption.point(204, 285))
	      .release()
	      .perform();
		  
		  (new TouchAction(driver))
	      .press(PointOption.point(238, 1702))
	      .moveTo(PointOption.point(204, 285))
	      .release()
	      .perform();
	   
	  }

	  
	  public void Spinner() {
		  MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Spinner");
		    el2.click();
	  }
	  
	  public void color() throws InterruptedException {
	  MobileElement el1 = (MobileElement) driver.findElementById("android:id/text1");
	  el1.click();
	  Thread.sleep(2000);

	  MobileElement CheckedTextView = (MobileElement) driver.findElementByXPath("//android.widget.CheckedTextView[@text='violet']");

	  CheckedTextView.click();}
	  
	  public void planet() throws InterruptedException {

		  MobileElement planet = (MobileElement) driver.findElementById("io.appium.android.apis:id/spinner2");
		  planet.click();
		  Thread.sleep(2000);
		  MobileElement dropdown_earth = (MobileElement) driver.findElementByXPath("//android.widget.CheckedTextView[@text='Earth']");
		  dropdown_earth.click();
		  Thread.sleep(2000);}

	  @Test
	  public void sampleTest() throws InterruptedException {
	    Views();
	    Scroll();
	    Spinner();
	    color();
	    planet();
	  }

	  @After
	  public void tearDown() {
	    driver.quit();
	  }
	}



