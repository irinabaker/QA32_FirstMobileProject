package com.telran.fw;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MainScreenHelper extends HelperBase{

    public MainScreenHelper(AppiumDriver driver) {
        super(driver);
    }

    public int getTotalReminders() {

        List<WebElement> id = driver.findElements(By.id("thumbnail_image"));
        int idCount = id.size();
        System.out.println("Total reminder quantity: " + idCount);
        return idCount;
    }
}
