package myproject;

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

public class ContactDemoTaps {
	
	  private AndroidDriver driver;

	  @Before
	  public void setUp() throws MalformedURLException {
	    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("appium:platformVersion", "11");
	    desiredCapabilities.setCapability("appium:deviceName", "Android SDK built for x86");
	    desiredCapabilities.setCapability("appium:app", "C:\\Users\\thund\\Downloads\\contactdemo.apk");
	    desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
	    desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
	    desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
	    desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

	    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

	    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
	  }

	  @Test
	  public void sampleTest() {
	  
		  (new TouchAction(driver)).tap(new PointOption().withCoordinates(762, 1166)).perform();
		  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		  MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Clear query");
		  el1.click();
		  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		  MobileElement el2 = (MobileElement) driver.findElementById("com.demo.bryanbeale.codetestbryanbeale:id/fab");
		  el2.click();
		  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		  MobileElement el3 = (MobileElement) driver.findElementById("com.demo.bryanbeale.codetestbryanbeale:id/firstName");
		  el3.click();
		  
		  (new TouchAction(driver)).tap(new PointOption().withCoordinates(109, 2349)).perform();
		  (new TouchAction(driver)).tap(new PointOption().withCoordinates(1141, 2131)).perform();
		  (new TouchAction(driver)).tap(new PointOption().withCoordinates(152, 2114)).perform();
		  (new TouchAction(driver)).tap(new PointOption().withCoordinates(653, 1933)).perform();
		  (new TouchAction(driver)).tap(new PointOption().withCoordinates(358, 1941)).perform();
		    
		  driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);  
		  MobileElement el4 = (MobileElement) driver.findElementById("android:id/button1");
		  el4.click();
		  
		  //adding birthday
		  
		  MobileElement el5 = (MobileElement) driver.findElementById("com.demo.bryanbeale.codetestbryanbeale:id/birthday");
		  el5.click();
		  driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		  
		  MobileElement el6 = (MobileElement) driver.findElementById("android:id/date_picker_header_year");
		  el6.click();
		  
		  (new TouchAction(driver))
	      .press(PointOption.point(943, 935))
	      .moveTo(PointOption.point(926, 1979))
	      .release()
	      .perform();
		  (new TouchAction(driver))
	      .press(PointOption.point(977, 956))
	      .moveTo(PointOption.point(968, 1878))
	      .release()
	      .perform();
		  (new TouchAction(driver))
	      .press(PointOption.point(973, 1015))
	      .moveTo(PointOption.point(968, 1954))
	      .release()
	      .perform();
		  MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout"
		  		+ "/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout"
		  		+ "/android.widget.DatePicker/android.widget.LinearLayout/android.widget.ScrollView/android.widget.ViewAnimator"
		  		+ "/android.widget.ListView/android.widget.TextView[2]");
		  el7.click();
		  
		  driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		  MobileElement el8 = (MobileElement) driver.findElementById("android:id/prev");
		  el8.click();
		  
		  driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		  MobileElement el9 = (MobileElement) driver.findElementByAccessibilityId("13 June 2000");
		  el9.click();
		  MobileElement el10 = (MobileElement) driver.findElementById("android:id/button1");
		  el10.click();
		  
		  //adding phone number
		  
		  MobileElement el11 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout"
		  		+ "/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup"
		  		+ "/android.widget.ScrollView[2]/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.LinearLayout"
		  		+ "/android.widget.LinearLayout/android.widget.Button");
		  el11.click();
		  driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		  
		  MobileElement el12 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout"
		  		+ "/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup"
		  		+ "/android.widget.ScrollView[2]/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.LinearLayout"
		  		+ "/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText");
		  el12.click();
		  driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		  
		  (new TouchAction(driver)).tap(new PointOption().withCoordinates(181, 1962)).perform();
		  (new TouchAction(driver)).tap(new PointOption().withCoordinates(539, 1924)).perform();
		  (new TouchAction(driver)).tap(new PointOption().withCoordinates(922, 1928)).perform();
		  (new TouchAction(driver)).tap(new PointOption().withCoordinates(164, 2143)).perform();
		  (new TouchAction(driver)).tap(new PointOption().withCoordinates(552, 2131)).perform();
		  (new TouchAction(driver)).tap(new PointOption().withCoordinates(926, 2143)).perform();
		  (new TouchAction(driver)).tap(new PointOption().withCoordinates(139, 2362)).perform();
		  (new TouchAction(driver)).tap(new PointOption().withCoordinates(564, 2354)).perform();
		  (new TouchAction(driver)).tap(new PointOption().withCoordinates(922, 2362)).perform();
		  
		  (new TouchAction(driver)).tap(new PointOption().withCoordinates(1300, 2580)).perform();
		  
		  
		  //adding email
		  
		  MobileElement el13 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout"
		  		+ "/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup"
		  		+ "/android.widget.ScrollView[2]/android.widget.LinearLayout/android.widget.FrameLayout[4]/android.widget.LinearLayout"
		  		+ "/android.widget.LinearLayout/android.widget.Button");
		  el13.click();
		  driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		  
		  MobileElement el14 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout"
		  		+ "/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup"
		  		+ "/android.widget.ScrollView[2]/android.widget.LinearLayout/android.widget.FrameLayout[4]/android.widget.LinearLayout"
		  		+ "/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText");
		  el14.click();
		  driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		  
		  (new TouchAction(driver)).tap(new PointOption().withCoordinates(80, 1920)).perform();
		  (new TouchAction(driver)).tap(new PointOption().withCoordinates(215, 1928)).perform();
		  (new TouchAction(driver)).tap(new PointOption().withCoordinates(366, 1928)).perform();
		  (new TouchAction(driver)).tap(new PointOption().withCoordinates(97, 2568)).perform();
		  (new TouchAction(driver)).tap(new PointOption().withCoordinates(139, 2156)).perform();
		  (new TouchAction(driver)).tap(new PointOption().withCoordinates(114, 2564)).perform();
		  (new TouchAction(driver)).tap(new PointOption().withCoordinates(509, 1916)).perform();
		  (new TouchAction(driver)).tap(new PointOption().withCoordinates(644, 1924)).perform();
		  (new TouchAction(driver)).tap(new PointOption().withCoordinates(804, 1916)).perform();
		  (new TouchAction(driver)).tap(new PointOption().withCoordinates(1149, 2581)).perform();
		  (new TouchAction(driver)).tap(new PointOption().withCoordinates(577, 2371)).perform();
		  (new TouchAction(driver)).tap(new PointOption().withCoordinates(1204, 1924)).perform();
		  (new TouchAction(driver)).tap(new PointOption().withCoordinates(1133, 2379)).perform();
		  (new TouchAction(driver)).tap(new PointOption().withCoordinates(1335, 2556)).perform();
		 
		  driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		  MobileElement el15 = (MobileElement) driver.findElementById("com.demo.bryanbeale.codetestbryanbeale:id/fab");
		  el15.click();
		  

		  }

		  
	  

	  @After
	  public void tearDown() {
	    driver.quit();
	  }
	}


