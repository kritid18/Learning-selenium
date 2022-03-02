package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.sql.Driver;

public class Main {

    public static void main(String[] args) {

//        FirefoxOptions options = new FirefoxOptions();
//        options.setProfile(new FirefoxProfile());
//        options.setBinary("/usr/bin/firefox");

        WebDriver driver = fireforxDriver();

        driver.get("http://google.com");

        // document.getElementsByName("q")[0]
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.click();

        // document.getElementsByName("q")[0].value = "Selenium learning"
        searchBox.sendKeys("Selenium learning");
        searchBox.sendKeys(Keys.ENTER);
    }

    public static WebDriver fireforxDriver()
    {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }

//    public static WebDriver chromeDriver()
//    {
//        ChromeOptions options = new ChromeOptions();
//
//
//    }

}
