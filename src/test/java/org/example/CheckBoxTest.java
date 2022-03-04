package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CheckBoxTest {

    private WebDriver driver;

    @Before
    public void setup()
    {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("http://localhost:8082");
        WebElement id = driver.findElement(By.id("checkboxLink"));
        id.click();
    }

    @Test

    public void  test_checkbox() {

//        WebDriver driver = new FirefoxDriver();

//        driver.get("http://localhost:8082");

//        WebElement id = driver.findElement(By.id("checkboxLink"));
//        id.click();

        WebElement Lattuce = driver.findElement(By.id("lettuceCheckbox"));
        Lattuce.click();

        assertTrue(Lattuce.isSelected());
    }

    @Test
    public void test_message()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("message")));

        WebElement msg = driver.findElement(By.id("message"));
        assertEquals("Loading complete...", msg.getText());
    }

    @Test
    public void test_radiobutton()
    {

    }

    @After
    public void close()
    {
        driver.quit();
    }

}
