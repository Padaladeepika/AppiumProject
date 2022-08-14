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

public class ContactDemoFInal {
	
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
	  
	  public void AddContact() {
		  (new TouchAction(driver)).tap(new PointOption().withCoordinates(762, 1166)).perform();
		  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		  MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Clear query");
		  el1.click();
		  driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		  MobileElement el2 = (MobileElement) driver.findElementById("com.demo.bryanbeale.codetestbryanbeale:id/fab");
		  el2.click();
	  }
	  
	  public void AddName() {
		  MobileElement el3 = (MobileElement) driver.findElementById("com.demo.bryanbeale.codetestbryanbeale:id/editName");
		  el3.click();
		  MobileElement el4 = (MobileElement) driver.findElementByXPath("//android.widget.EditText");
		  
		  el4.sendKeys("Kate");
		  
		  MobileElement el5 = (MobileElement) driver.findElementById("android:id/button1");
		  el5.click();
	  }
	  
	  public void AddBirthday() {
		  MobileElement el6 = (MobileElement) driver.findElementById("com.demo.bryanbeale.codetestbryanbeale:id/birthday");
		  el6.click();
		  //driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		  
		  MobileElement el7 = (MobileElement) driver.findElementById("android:id/date_picker_header_year");
		  el7.click();
		  
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
		  
		  MobileElement el8 = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='2000']");
		  el8.click();
		  
		  //driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		  MobileElement el9 = (MobileElement) driver.findElementById("android:id/prev");
		  el9.click();
		  
		  //driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		  MobileElement el10 = (MobileElement) driver.findElementByAccessibilityId("13 June 2000");
		  el10.click();
		  MobileElement el11 = (MobileElement) driver.findElementById("android:id/button1");
		  el11.click();
	  }
	  
	  public void AddPhone() {
		  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		  MobileElement el12 = (MobileElement) driver.findElementByXPath("//android.widget.Button[@text='ADD NEW PHONE NUMBER']");
		  el12.click();
		  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		  
		  MobileElement el13 = (MobileElement) driver.findElementByXPath("//android.widget.EditText[@text='Enter Phone']");
		  el13.sendKeys("123456789");
		  
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  }
	  
	  public void AddEmail() {
		  MobileElement el15 = (MobileElement) driver.findElementByXPath("//android.widget.Button[@text='ADD NEW EMAIL']");
		  el15.click();
		  driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		  
		  MobileElement el16 = (MobileElement) driver.findElementByXPath("//android.widget.EditText[@text='Enter Email']");
		  el16.sendKeys("qwe@rty.com");
	  }
	  
	  public void SaveContact() {
		  MobileElement el18 = (MobileElement) driver.findElementById("com.demo.bryanbeale.codetestbryanbeale:id/fab");
		  el18.click();
	  }
	  
	  		@Test
	  		public void endToEndTest() {
	  			AddContact();
	  			AddName();
	  			AddPhone();
	  			AddEmail();
	  			SaveContact();
	  		}
	  	
	  	@After
	  	public void tearDown() {
	  		driver.quit();
	  		  }
	  		}
	  	
	  


