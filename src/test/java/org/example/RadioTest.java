package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class RadioTest {

    private WebDriver driver;


    @Before
    public void setup()
    {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("http://localhost:8082");
        WebElement id = driver.findElement(By.id("radioLink"));
        id.click();
    }

    @Test
    public void radioTest()
    {
       // WebElement List<Color>;
        List<WebElement> element = driver.findElements(By.name("color"));

        for(WebElement e : element)
        {
            if(e.getAttribute("value").equals("blue"))
            {
                e.click();
            }
        }

        assertTrue(element.get(2).isSelected());



    }
}
