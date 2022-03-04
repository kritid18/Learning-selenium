package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.title;
import static org.junit.Assert.assertEquals;

public class SeleniumWebsiteTest {

    private WebDriver driver;

    @org.junit.Test

//    @BeforeClass
//    public static void init()
//    {
////        WebDriverManager.firefoxdriver().setup();
//    }

    @Before
    public void setup()
    {
        WebDriverManager.firefoxdriver().setup();
         driver = new FirefoxDriver();
         driver.get("http://selenium.dev");
         WebElement blog = driver.findElement(By.linkText("Blog"));
         blog.click();
    }

    public void  test_selenium_dot_dev_blog()
    {
//        WebDriverManager.firefoxdriver().setup();
//
//        WebDriver driver = new FirefoxDriver();
//
//        driver.get("https://selenium.dev");
//
//        WebElement blog = driver.findElement(By.linkText("Blog"));
//        blog.click();

        WebElement link2016 = driver.findElement(By.id("m-blog2016"));
        link2016.click();

        WebElement element = driver.findElement(By.linkText("Fall Selenium Conf, Save the Date & Call for Speakers!!"));
        assertEquals("Blog Posts - 2016 | Selenium", title);

        //driver.quit();
    }

    @org.junit.Test
    public void  test_selenium_dot_dev_blog_2017_page()
    {
//        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("https://selenium.dev");

        WebElement blog = driver.findElement(By.linkText("Blog"));
        blog.click();

        WebElement link2016 = driver.findElement(By.id("m-blog2017"));
        link2016.click();

        WebElement element = driver.findElement(By.linkText("Fall Selenium Conf, Save the Date & Call for Speakers!!"));
        assertEquals("Blog Posts - 2017 | Selenium", title);

        //driver.quit();
    }

    @After
    public void close()
    {
        System.out.println("close after class");
        driver.quit();
    }

    @AfterClass
    public static void afterclass()
    {
        System.out.println("inside after class");
    }
}
