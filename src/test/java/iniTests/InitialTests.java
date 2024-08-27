package iniTests;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;

public class InitialTests {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		UiAutomator2Options options= new UiAutomator2Options();
		options.setPlatformName("Android");
		options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
		options.setDeviceName("Samsung m31");
		options.setCapability("udid", "RZ8NB08ME9T");
		options.setPlatformVersion("12");
		options.setCapability("noReset", true); 
		
		options.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		options.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
		
//		options.setDeviceName("Samsung Galaxy S10");
//		options.setCapability("udid", "RZ8M22VB7EB");
//		options.setPlatformVersion("12");
//		options.setCapability("noReset", true);
//		
//		options.setCapability("appWaitPackage", "com.mysmitch.deepholistics.staging");
//
//		options.setCapability("appActivity", "com.mysmitch.deepholistics.ui.common.SplashActivity");
//		options.setCapability("appActivity", "com.mysmitch.deepholistics.ui.user.htOnboarding.welcome");
		
//		options.setCapability("appPackage", "com.samsung.android.calendar");
//		options.setCapability("appActivity", "com.samsung.android.app.calendar.AllInOneActivity");
		
//		options.setCapability("appWaitPackage", "com.mysmitch.dhcompanion");
//		options.setCapability("appWaitActivity", "com.mysmitch.dhcompanion.SplashActivity"); RZ8M22VB7EB
		
		String uri = ("http://127.0.0.1:4723");
		URL url = URI.create(uri).toURL();
		AndroidDriver driver = new AndroidDriver(url, options);
		//System.out.println("hi");
		Thread.sleep(1000);

	}

}
