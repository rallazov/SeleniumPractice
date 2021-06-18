package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Locale;

public class Task2inCohort4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "./resources/chromedriver");
        WebDriver driver = new ChromeDriver();

//        Go to http://demo.guru99.com/test/newtours/
        driver.get("http://demo.guru99.com/test/newtours/");
//        Click on Register
        driver.findElement(By.linkText("REGISTER")).click();
//        Register an account by filling out all the fields
//        First Name:
        driver.findElement(By.name("firstName")).sendKeys("Ramin");
//        Last Name:
        driver.findElement(By.name("lastName")).sendKeys("Allazov");
//        Phone:
        driver.findElement(By.name("phone")).sendKeys("123-456-7890");
//        Email:
        driver.findElement(By.name("userName")).sendKeys("ra@yahoo.com");
//        Mailing Information
//        Address:
        driver.findElement(By.name("address1")).sendKeys("123 main st");
//        City:
        driver.findElement(By.name("city")).sendKeys("Baku");
//        State/Province:
        driver.findElement(By.name("state")).sendKeys("Azerbaijan");
//        Postal Code:
        driver.findElement(By.name("postalCode")).sendKeys("987654");
//        Country:
        WebElement countries = driver.findElement(By.name("country"));
        Select s = new Select(countries);
        s.selectByVisibleText("Azerbaijan".toUpperCase());
//        Click on Submit
        driver.findElement(By.name("submit")).click();

    }
}
