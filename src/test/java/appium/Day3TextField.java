package appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class Day3TextField {

		

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
	    MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Text");
	    el1.click();
	  }
	    
		public void swipeUp() {
	    (new TouchAction(driver))
	    .press(PointOption.point(235, 538))
	    .moveTo(PointOption.point(235, 520))
	    .release()
	    .perform();
	    (new TouchAction(driver))
	    .press(PointOption.point(368, 733))
	    .moveTo(PointOption.point(368, 680))
	    .release()
	    .perform();
	    (new TouchAction(driver))
	    .press(PointOption.point(111, 272))
	    .moveTo(PointOption.point(111, 270))
	    .release()
	    .perform();
	    
		}
	    public void TextFields() {
	    
	    MobileElement el2 = (MobileElement) driver.findElementById("io.appium.android.apis:id/text");
	    el2.sendKeys("hello");
	    

	  }

	    @Test
		  public void sampleTest() {
		    
		    Views();
		    swipeUp();
		    TextFields();  }
	/*? @After
	  public void tearDown() {
	    driver.quit();*/
	  }
	
