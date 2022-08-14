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

public class Day3Switches {
	
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
	  
	  public void Switches() {
		  MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Switches");
		    el2.click();
		    
		    MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Customized text");
		    
		    String isChecked = el3.getAttribute("checked");
		    System.out.println("switch status ="+isChecked);
		    
		    
		    el3.click();
		    isChecked = el3.getAttribute("checked");
		    System.out.println("switch status ="+isChecked);
		  
	  }
	  
	  @Test
	  public void sampleTest() {
	    
	    Views();
	    
	  
	    Scroll();
	    Switches();    
	    
	  }

	  @After
	  public void tearDown() {
	    driver.quit();
	  }
	}





