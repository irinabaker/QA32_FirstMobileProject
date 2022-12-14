package com.telran.fw;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppManager {

    AppiumDriver driver;

    DesiredCapabilities capabilities;

    MainScreenHelper mainScreen;
    ReminderHelper reminder;

    public ReminderHelper getReminder() {
        return reminder;
    }

    public MainScreenHelper getMainScreen() {
        return mainScreen;
    }

    public void init() throws MalformedURLException {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","8.0");
        capabilities.setCapability("deviceName", "qa32_mob");
        capabilities.setCapability("automationName","Appium");
        capabilities.setCapability(  "appPackage", "com.blanyal.remindly");
        capabilities.setCapability("appActivity", "com.blanyal.remindme.MainActivity");
        capabilities
                .setCapability("app","C:/Users/Tel-Ran.de/Documents/apk/com.blanyal.remindly_2_apps.evozi.com.apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

        reminder = new ReminderHelper(driver);
        mainScreen = new MainScreenHelper(driver);
    }

    public void stop() {
        driver.quit();
    }
}
