package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskThree1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "./resources/chromedriver");
        WebDriver driver = new ChromeDriver();

//        Go to http://automationpractice.com/index.php
        driver.get("http://automationpractice.com/index.php");
//        Locate below elements with xpath
//                Logo
        driver.findElement(By.xpath("//*[@id = 'header_logo']"));
//        Cart
        driver.findElement(By.xpath("//b"));
//        Search input box
        driver.findElement(By.xpath("//*[@id = 'searchbox']"));
//        Search button
        driver.findElement(By.xpath("//*[@id = 'searchbox']/button"));
//        Contact Us link
        driver.findElement(By.xpath("//*[@id = 'contact-link']"));

        driver.close();

    }
}
