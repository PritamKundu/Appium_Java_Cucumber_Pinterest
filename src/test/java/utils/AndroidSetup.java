package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidSetup {
    public static AppiumDriver driver;

    private void androidSetupAppium() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("platformVersion", "9");
        capabilities.setCapability("deviceName", "Nexus");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("app", System.getProperty("user.dir") + "/app/pinterest-10-14-0.apk");
        capabilities.setCapability("appPackage", "com.pinterest");
        capabilities.setCapability("appActivity", ".activity.PinterestActivity");
//        capabilities.setCapability("newCommandTimeout", 60 * 5);
//        capabilities.setCapability("deviceReadyTimeout", 100);
//        capabilities.setCapability("appWaitDuration", 1000000);
        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
//        return driver;
    }

    /**
     * In case it shows NullPointerException or driver is null,
     * then call the androidSetup.setDriver manually from stepDefinitions Constructors
     */
    @Before
    public void setDriver() throws MalformedURLException {
        androidSetupAppium();
    }

    public AndroidDriver getDriver() {
        return (AndroidDriver) driver;
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    /**
     * Note:
     * adb uninstall io.appium.uiautomator2.server
     * adb uninstall io.appium.uiautomator2.server.test
     */
}
