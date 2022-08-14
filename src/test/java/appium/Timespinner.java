package appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Point;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class Timespinner {
	

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
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }

	 
	 
	   @Test
	   public void time() {
	     MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Views");
	     el1.click();
	     MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Date Widgets");
	     el2.click();
	     MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("1. Dialog");
	     el3.click();
	     MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("change the time (spinner)");
	     el4.click();
	    // MobileElement e15 = (MobileElement) driver.findElementById("android:id/hours");
	    // e15.click();
	     MobileElement SRC = (MobileElement) driver.findElementByXPath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"1\"]");
	    
	     SRC.click();
	     MobileElement TRG = (MobileElement) driver.findElementByXPath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"3\"]");
		    
	     TRG.click();
	     
	     Point pntSRC = SRC.getCenter();
			Point pntTRG = TRG.getCenter();
						
			(new TouchAction(driver))
		      .longPress(PointOption.point(pntSRC))
		      .moveTo(PointOption.point(pntTRG))
		      .release()
		      .perform();
			
			
			MobileElement el6 = (MobileElement) driver.findElementById("android:id/minutes");
		    el6.click();
			
			MobileElement SRC1 = (MobileElement) driver.findElementByAccessibilityId("3");
			SRC1.click();
		     
		     MobileElement TRG1 = (MobileElement) driver.findElementByAccessibilityId("15");
		     TRG1.click();
		     
		     Point pntSRC1 = SRC1.getCenter();
				Point pntTRG1 = TRG1.getCenter();
							
				(new TouchAction(driver))
			      .longPress(PointOption.point(pntSRC1))
			      .moveTo(PointOption.point(pntTRG1))
			      .release()
			      .perform();
			
	     MobileElement el7 = (MobileElement) driver.findElementById("android:id/button1");
	     el7.click();
	   }

	   public void sampletest() {
	   
	   time();
	 }
		  
		  @After
		  public void tearDown() {
		 //   driver.quit();
		  }
		}


