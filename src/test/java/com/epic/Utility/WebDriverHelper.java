package com.epic.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverHelper {

    static WebDriver driver;

    public WebDriver driverInitilization() {

        //set property for chrome driver
        System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");

        //driver initilization
        driver=new ChromeDriver();

        //maximize the screen
        driver.manage().window().maximize();

        return driver;
    }

    public void openURL(String url) {

        //open url
        driver.get(url);

    }

    public void driverClose() {

        //close driver
        driver.close();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        WebDriverHelper.driver = driver;
    }


}
