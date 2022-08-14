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
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class Day3SeekBar {
	
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
	  	
		  	  
		  public void Move() throws InterruptedException {
			  Thread.sleep(2000);
			  MobileElement seekBar = (MobileElement) driver.findElementByAccessibilityId("Seek Bar");
			  seekBar.click();
			  
			  Thread.sleep(2000);
			  MobileElement bar = (MobileElement) driver.findElementById("io.appium.android.apis:id/seek");
			  bar.click();
			  
			  int xPos = bar.getLocation().getX();
			  int yPos = bar.getLocation().getY();

			  int lastXPos = xPos + bar.getSize().getWidth();
			  int centerXPos = (xPos + bar.getCenter().getX());
			  
			  System.out.println("xPos= " + xPos);
			  System.out.println("yPos= " + yPos);
			  System.out.println("lastXPos= " + lastXPos);
			  System.out.println("centerXPos= " + centerXPos);
			  
			  //moving left
			  (new TouchAction(driver))
		      .press(ElementOption.element(bar))
		      .moveTo(PointOption.point(xPos, yPos))
		      .release()
		      .perform();

			  Thread.sleep(2000);
		  
			  //moving right
			  (new TouchAction(driver))
			  .press(ElementOption.element(bar))
			  .moveTo(PointOption.point(lastXPos, yPos))
			  .release()
			  .perform();

			  //moving to the 30% position
			  Thread.sleep(2000);
			  int delta = 40;
			  int zPos = 30 * (xPos + bar.getSize().getWidth()/100)+40;


			  (new TouchAction(driver))
			  .press(ElementOption.element(bar))
			  .moveTo(PointOption.point(zPos, yPos))
			  .release()
			  .perform();

		  }
	  
	  

	  
	  @Test
	  public void sampleTest() throws InterruptedException {
	    Views();
	    Scroll();
	    Move();
	   
	    
	  }

	  @After
	  public void tearDown() {
	    driver.quit();
	  }
	}



