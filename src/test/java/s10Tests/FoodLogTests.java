package s10Tests;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;

public class FoodLogTests {

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
		
		String uri = ("http://127.0.0.1:4723");
		URL url = URI.create(uri).toURL();
		AndroidDriver driver = new AndroidDriver(url, options);
		Thread.sleep(2000);
		
		WebElement logIn = driver.findElement(By.id("com.mysmitch.deepholistics.staging:id/btn_already_have_account"));
		logIn.click();
		
		WebDriverWait exwait = new WebDriverWait(driver, Duration.ofSeconds(10));
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
		
		Thread.sleep(3000);
		
		WebElement fabButton=driver.findElement(By.id("com.mysmitch.deepholistics.staging:id/iv_add_type"));
		exwait.until(ExpectedConditions.elementToBeClickable(fabButton));
		fabButton.click();
		
		Thread.sleep(3000);
		WebElement foodButton=driver.findElement(By.id("com.mysmitch.deepholistics.staging:id/food"));
		exwait.until(ExpectedConditions.visibilityOf(foodButton));
		foodButton.click();
		
		WebElement logBFast=driver.findElement(By.id("com.mysmitch.deepholistics.staging:id/iv_breakfast_next"));
		exwait.until(ExpectedConditions.visibilityOf(logBFast));
		logBFast.click();
		
		WebElement timeEdit=driver.findElement(By.id("com.mysmitch.deepholistics.staging:id/tv_edit_time"));
		exwait.until(ExpectedConditions.visibilityOf(timeEdit));
		timeEdit.click(); 
		
		//number picker to edit time android:id/numberpicker_input
//		WebElement numPicker=driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"android:id/numberpicker_input\" and @text=\"10\"]"));
//		WebElement numPicker=driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"09\"))"));
//		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"09\"))")).click();
//		WebElement numPicker=driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Display\"))"));
//		WebElement numPicker=driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).new UiSelector().resourceId(\\\"android:id/numberpicker_input\\\"))"));
		WebElement numPickerHr=driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().resourceId(\"android:id/numberpicker_input\"))"));
		WebElement selectHr=driver.findElement(By.id("00000000-0000-0a99-0000-000300000211"));
		selectHr.click();
//		numPickerHr.click();
//		numPickerHr.sendKeys("{09, 00, AM}");
		String numTxt= numPickerHr.getText();
		System.out.println(numTxt);
//		WebElement numPickerMin=driver
		
//		WebElement hour=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"09\")"));
//		System.out.println(hour.getText());
		
		
		Thread.sleep(1000);

	}

}
