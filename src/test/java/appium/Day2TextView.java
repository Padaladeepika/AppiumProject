package appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Day2TextView {

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
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    
	  }
	    
	    @Test
		  public void TextView() {
	    	
	    
	    //API Demos > Text > LogTextBox   > TextboxElement
	    
	  //android.widget.TextView[@content-desc="Text"]
	  //android.widget.TextView[@content-desc="LogTextBox"]
	//  /hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.TextView
	 
	  
	   MobileElement menuOptionText = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Text\"]");
	   menuOptionText.click();
	  MobileElement menuoptionLogTextBox = (MobileElement) driver.findElementByXPath ("//android.widget.TextView[@content-desc=\"LogTextBox\"]");
	  menuoptionLogTextBox.click();
	   MobileElement menuoptionTextboxElement = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.TextView");
	   menuoptionTextboxElement.sendKeys("Hello");
	    }
	    
	    
	  }


