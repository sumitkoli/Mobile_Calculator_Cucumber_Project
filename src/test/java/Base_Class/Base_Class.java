package Base_Class;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import Page_Object.CalculatorPage_PageObjects;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class Base_Class {
	public Logger log= LogManager.getLogger("Logs");;
	public static AndroidDriver<MobileElement> driver;
	public static AppiumDriverLocalService service;
	public static String NodeExePath = "C:\\Program Files\\nodejs\\node.exe";
	public static String NodeJsMainPath = "C:\\Users\\lenovo\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js";
	public static String ServerAddress = "127.0.0.1";
	public static CalculatorPage_PageObjects calculator_Page;

	
	public void applicationsetup_Method() throws MalformedURLException {
		start_AppiumServer();
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("ignoreHiddenApiPolicyError", true);
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		cap.setCapability("deviceName", "Oneplus7T");

		cap.setCapability("udid", "b3fdf56d");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");

		cap.setCapability("appPackage", "com.oneplus.calculator");

		cap.setCapability("appActivity", "com.oneplus.calculator.Calculator");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		driver = new AndroidDriver<>(url, cap);
		
		page_Objects();
		
		
	}

	
	public void applicationtearDown_Method() {
		driver.quit();
		stop_AppuimServer();
	}

	
	public void start_AppiumServer() {

		service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
				.usingDriverExecutable(new File(NodeExePath)).withAppiumJS(new File(NodeJsMainPath))
				.withIPAddress(ServerAddress).withArgument(GeneralServerFlag.BASEPATH, "/wd/hub").usingPort(4723)
				.withLogFile(new File(
						"C:\\Users\\lenovo\\eclipse-workspace1\\Mobile_Calculator_POM_Project\\LogFiles\\AppiumServerlog.txt")));

		service.start();
		log.info("Server is Starting");
	}

	
	public void stop_AppuimServer() {

		if (service.isRunning() == true) {
			service.stop();

			log.info("Appium Server Stop.....");
		}
	}

	public void page_Objects() {
		calculator_Page=new CalculatorPage_PageObjects(driver);
	}
}

