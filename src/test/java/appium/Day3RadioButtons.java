

package appium;

import static org.junit.Assert.*;

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

public class Day3RadioButtons {
	
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

	 public MobileElement getTextViewByContentDesc(String contentDesc) {

		  return (MobileElement) driver.findElementByXPath("//android.widget.TextView[@content-desc=\""+ contentDesc +"\"]");
		  }
	  
	  	public MobileElement getCheckBoxByContentDesc(String contentDesc1) {
	  		return (MobileElement) driver.findElementByXPath("//android.widget.CheckBox[@content-desc=\""+ contentDesc1 +"\"]");
	  		
	  		 	}
	  	
	  	public MobileElement getRadioButtonByContentDesc(String contentDesc2) {
	  		return (MobileElement) driver.findElementByXPath("//android.widget.RadioButton[@content-desc=\""+ contentDesc2 +"\"]");
	  		
	  		 	}
	  	
	  	public MobileElement editText() {
	  		return (MobileElement) driver.findElementByXPath("//android.widget.EditText[@resource-id='io.appium.android.apis:id/edit']");
	  		
	  		 	}
	  		  
	 @Test
	 public void Radiogroup() throws InterruptedException {
		 	  	MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Radio Group");
		 	    el2.click();		    
		    MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Lunch");
		    String isChecked = el3.getAttribute("checked");
		    System.out.println("Lunch is checked by default? ="+isChecked);
		    
		    MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Breakfast");
		    
		    String isChecked1 = el4.getAttribute("checked");
		    System.out.println("Breakfast is checked? ="+isChecked1);
		    Thread.sleep(2000);
		    el4.click();
		    isChecked1 = el4.getAttribute("checked");
		    System.out.println("Breakfast is checked? ="+isChecked1);
	  }
	 
	 @Test
	  public void Checkbox() throws Throwable  {
	    MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Views");
	    el1.click();
	    MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Controls");
	    el2.click();
	    MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("1. Light Theme");
	    el3.click();
	  //  MobileElement el4 = (MobileElement) driver.findElementById("io.appium.android.apis:id/edit");
	  //  el4.click();
	  //  el4.sendKeys("Deepi");
	  //  driver.hideKeyboard();
	    
	    // for checkbox
	    MobileElement e14 = (MobileElement) driver.findElementByXPath(" //android.widget.CheckBox[@content-desc=\"Checkbox 1\"]");
	    	System.out.println(e14.getAttribute("checked"));
		    e14.click();
	    	System.out.println(e14.getAttribute("checked"));

	    Thread.sleep(5000);
	  } 
	 @Test
	  	public void Radiobutton() throws InterruptedException {
	  		getTextViewByContentDesc("Views").click();
	  		getTextViewByContentDesc("Controls").click();
	  		getTextViewByContentDesc("1. Light Theme").click();
	  		MobileElement e15 = (MobileElement) driver.findElementByXPath("//android.widget.RadioButton[@content-desc=\"RadioButton 2\"]");
	  	 	System.out.println(e15.getAttribute("checked"));
	  	 	e15.click();
	  	 	System.out.println(e15.getAttribute("checked"));
	  		 
	    Thread.sleep(5000);
	  } 
	  		
	 
	@Test

	public void Radio1() {
  		getTextViewByContentDesc("Views").click();
  		getTextViewByContentDesc("Controls").click();
  		getTextViewByContentDesc("1. Light Theme").click();

		
		 MobileElement e16 = (MobileElement) driver.findElementByXPath("//android.widget.RadioButton[@content-desc=\"RadioButton 1\"]");
		 	System.out.println(e16.getAttribute("checked"));
		 	e16.click();
		 	System.out.println(e16.getAttribute("checked"));

	 }

	 @Test
		public void Star() {
	  		getTextViewByContentDesc("Views").click();
	  		getTextViewByContentDesc("Controls").click();
	  		getTextViewByContentDesc("1. Light Theme").click();
	  		
			 MobileElement e17 = (MobileElement) driver.findElementByXPath("//android.widget.CheckBox[@content-desc=\"Star\"]");
		System.out.println(e17.getAttribute("checked)"));
e17.click()	;
	System.out.println(e17.getAttribute("checked"));

}

		@Test
	  	public void starIcon() throws InterruptedException {
	  		getTextViewByContentDesc("Views").click();
	  		getTextViewByContentDesc("Controls").click();
	  		getTextViewByContentDesc("1. Light Theme").click();
	  		
	  		getCheckBoxByContentDesc("Star").click();
	  		Thread.sleep(3000);
	  		String golden = getCheckBoxByContentDesc("Star").getAttribute("checked");
	  		assertEquals(golden, "true");
		}
	  	
	  @Test
	  	public void Togglebutton() throws InterruptedException {
	  		getTextViewByContentDesc("Views").click();
	  		getTextViewByContentDesc("Controls").click();
	  		getTextViewByContentDesc("1. Light Theme").click();
	  		
	  	driver.hideKeyboard();
	  		
	  	MobileElement el8 = (MobileElement) driver.findElementById("io.appium.android.apis:id/toggle1");
	  	System.out.println(el8.getAttribute("text"));

	  	Thread.sleep(3000);
	  	el8.click();
	  	System.out.println(el8.getAttribute("text"));
	  }
	  public void sampleTest() throws Throwable  {
	    
		  Radiogroup();
		  Checkbox();
		  Radiobutton();
	    Radio1();
	    Star();
	    starIcon();
	    Togglebutton();
	  }

	  
	  
	  @After
	  public void tearDown() {
	    driver.quit();
	  }
	}




