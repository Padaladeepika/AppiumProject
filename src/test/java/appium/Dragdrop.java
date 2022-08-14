package appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Point;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class Dragdrop {

	
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
	  @Test
	  public void Views() {
		    MobileElement el1 = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Views\"]");
		    el1.click();
		    
		    MobileElement el2 = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Drag and Drop\"]");
		    el2.click();
		    
		    MobileElement SRC = (MobileElement) driver.findElementById("io.appium.android.apis:id/drag_dot_1");
		    SRC.click();
		    MobileElement TGT = (MobileElement) driver.findElementById("io.appium.android.apis:id/drag_dot_3");
		    TGT.click();
 TouchAction action = new TouchAction(driver);
 
 Point pntSRC = SRC.getCenter();
 Point pntTGT =TGT.getCenter();
 
 action
 
 .longPress(PointOption.point(pntSRC))
 .moveTo(PointOption.point(pntTGT))
 .release()
 .perform();
 
	  }
	  
}
		 


