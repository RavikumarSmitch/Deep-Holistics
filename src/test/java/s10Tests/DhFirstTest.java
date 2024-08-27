package s10Tests;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;

public class DhFirstTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		UiAutomator2Options options= new UiAutomator2Options();
		options.setPlatformName("Android");
		options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
		
		options.setDeviceName("Samsung Galaxy S10");
		options.setCapability("udid", "RZ8M22VB7EB");
		options.setPlatformVersion("12");
		options.setCapability("noReset", false);
		
		options.setCapability("appPackage", "com.mysmitch.deepholistics.staging");
		options.setCapability("appActivity", "com.mysmitch.deepholistics.ui.common.SplashActivity");
//		options.setCapability("appActivity", "com.mysmitch.deepholistics.ui.user.htOnboarding.welcome.HtWelcomeActivity");
		
		String uri = ("http://127.0.0.1:4723");
		URL url = URI.create(uri).toURL();
		AndroidDriver driver = new AndroidDriver(url, options);
		Thread.sleep(2000);
		
		WebElement logIn = driver.findElement(By.id("com.mysmitch.deepholistics.staging:id/btn_already_have_account"));
		logIn.click();
		
		WebDriverWait exwait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
/*		WebElement cCode=driver.findElement(By.id("com.mysmitch.deepholistics.staging:id/country_code"));
		exwait.until(ExpectedConditions.elementToBeClickable(cCode));
		cCode.click();
		
		Thread.sleep(1000);
		
		WebElement cSearch=driver.findElement(By.id("com.mysmitch.deepholistics.staging:id/search_text"));
		cSearch.sendKeys("Finland");
		
		WebElement sCountry=driver.findElement(By.id("com.mysmitch.deepholistics.staging:id/text"));
		sCountry.click();
		
		Thread.sleep(1000);
		
		WebElement mNum=driver.findElement(By.id("com.mysmitch.deepholistics.staging:id/etMobileNo"));
		mNum.sendKeys("4573987994"); */
		
//		6374383104
		WebElement mNum=driver.findElement(By.id("com.mysmitch.deepholistics.staging:id/etMobileNo"));
		exwait.until(ExpectedConditions.visibilityOf(mNum));
		mNum.sendKeys("6374383104");
		
		WebElement gOtp=driver.findElement(By.id("com.mysmitch.deepholistics.staging:id/btn_get_otp"));
		exwait.until(ExpectedConditions.elementToBeClickable(gOtp));
		gOtp.click();
		
		WebElement otpNum=driver.findElement(By.id("com.mysmitch.deepholistics.staging:id/pinField"));
		exwait.until(ExpectedConditions.visibilityOf(otpNum));
		otpNum.sendKeys("6789");
		
		WebElement continueButton=driver.findElement(By.id("com.mysmitch.deepholistics.staging:id/btn_otp"));
		exwait.until(ExpectedConditions.elementToBeClickable(continueButton));
		continueButton.click();
		
		Thread.sleep(1000);
		
/*		//to refresh the page
		int deviceWidth = driver.manage().window().getSize().getWidth();
	    int deviceHeight = driver.manage().window().getSize().getHeight();
	    int midX = (deviceWidth / 2);
	    int midY = (deviceHeight / 2);
	    int bottomEdge = (int) (deviceHeight * 0.85f);
	    new TouchAction(driver)
	            .press(point(midX,midY))
	            .waitAction(waitOptions(ofMillis(1000)))
	            .moveTo(point(midX, bottomEdge))
	            .release().perform();
		// */
		
		WebElement anthroQues=driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.mysmitch.deepholistics.staging:id/iv_unlock\"])[2]"));
		exwait.until(ExpectedConditions.elementToBeClickable(anthroQues));
		anthroQues.click();
		System.out.println("ANTHRO 1ST QUESTIONS ANSWERED SUCCESSFULLY");
		
		WebElement waistAns=driver.findElement(By.id("com.mysmitch.deepholistics.staging:id/answer"));
		exwait.until(ExpectedConditions.visibilityOf(waistAns));
		waistAns.sendKeys("30");
		System.out.println("ANTHRO 2ND QUESTIONS ANSWERED SUCCESSFULLY");

		
		WebElement nxtQues=driver.findElement(By.id("com.mysmitch.deepholistics.staging:id/next_question"));
		exwait.until(ExpectedConditions.elementToBeClickable(nxtQues));
		nxtQues.click();
		System.out.println("ANTHRO 3RD QUESTIONS ANSWERED SUCCESSFULLY");

		
		
		WebElement hipAns=driver.findElement(By.id("com.mysmitch.deepholistics.staging:id/answer"));
		exwait.until(ExpectedConditions.visibilityOf(hipAns));
		hipAns.sendKeys("32");
		System.out.println("ANTHRO 4TH QUESTIONS ANSWERED SUCCESSFULLY");

		
//		WebElement com.mysmitch.deepholistics.staging:id/next_question
		exwait.until(ExpectedConditions.elementToBeClickable(nxtQues));
		nxtQues.click();
		System.out.println("ANTHRO 5TH QUESTIONS ANSWERED SUCCESSFULLY");

		
		WebElement uChange=driver.findElement(By.id("com.mysmitch.deepholistics.staging:id/unit"));
		uChange.click();
		Thread.sleep(1000);
		System.out.println("ANTHRO 6TH QUESTIONS ANSWERED SUCCESSFULLY");

		
		WebElement nkAns=driver.findElement(By.id("com.mysmitch.deepholistics.staging:id/answer"));
		exwait.until(ExpectedConditions.elementToBeClickable(nkAns));
		nkAns.sendKeys("42");
		System.out.println("ANTHRO 7TH QUESTIONS ANSWERED SUCCESSFULLY");

		
		exwait.until(ExpectedConditions.elementToBeClickable(nxtQues));
		nxtQues.click();
		
		WebElement subButton=driver.findElement(By.id("android:id/button1"));
		exwait.until(ExpectedConditions.visibilityOf(subButton));
		subButton.click();
		
		Thread.sleep(1000);
	}

}
