package appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class Calender {
	
	private AndroidDriver<MobileElement> driver;

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
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	  }
	
	
	@Test
    public void testScroll() throws InterruptedException {
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Views']")).click();
//		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Date Widgets']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Date Widgets']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='1. Dialog']")).click();
//		
//		io.appium.android.apis:id/pickDate
		driver.findElement(By.id("io.appium.android.apis:id/pickDate")).click();
		driver.findElement(By.id("android:id/date_picker_header_year")).click();
		MobileElement MEYear = driver.findElement(By.id("android:id/date_picker_header_year"));
		String strCrYear = MEYear.getAttribute("text");
		int crYear = Integer.parseInt(strCrYear);
		String strReqYear = "2028";
		int reqYear = Integer.parseInt(strReqYear);
		
		if (reqYear > crYear) {
//			Scroll Up
//			PRINT THE VALES -> TOP LEFT
			
			
			Boolean flgFound = false;
			
			while (!flgFound) {
				List<MobileElement> allYYears = driver.findElements(By.xpath("//android.widget.TextView"));
				for (MobileElement year : allYYears) {
					System.out.println(year.getAttribute("text"));
				}
				
				List<MobileElement> lstReqYr = driver.findElements(By.xpath("//android.widget.TextView[@text='2030']"));
				if (lstReqYr.size()>0) {
					flgFound = true;
					break;
				}
				ScrollUPYear();
				
				
				
			}
			
			driver.findElement(By.xpath("//android.widget.TextView[@text='2030']")).click();
			
			Thread.sleep(5000);
			
			 
			 
			 
			
		}
		
		else{
//			scrollDown
			
		}
		
		
		
		
		
		
	}
	
	
	public void ScrollUPYear() {
		MobileElement MEListYEAR = driver.findElement(By.id("android:id/date_picker_year_picker"));
		int x = MEListYEAR.getLocation().getX();
		int y = MEListYEAR.getLocation().getY();
//		PRINT H AND W
		
		int H = MEListYEAR.getSize().getHeight();
		int W = MEListYEAR.getSize().getWidth();
		
		 int strtX = (int) (x+ (W*0.5));
		  int startY = (int) (y + H*0.9);
		 
		 int endX = strtX;
		 int endY = (int) (y + H*0.1);
		 
		 TouchAction action = new TouchAction(driver);
		
		 action
	      .longPress(PointOption.point(strtX,startY))
	      .moveTo(PointOption.point(endX,endY))
	      .release()
	      .perform();
		 
		 
		
		 
		
	}
		
	
	
		

	@After
	public void tearDown() throws InterruptedException {

		Thread.sleep(1000);

		driver.quit();
	}
}


