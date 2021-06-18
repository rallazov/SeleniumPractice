package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskThree2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "./resources/chromedriver");
        WebDriver driver = new ChromeDriver();

//        Go to http://automationpractice.com/index.php
        driver.get("http://automationpractice.com/index.php");
//                Setup your email and pwd by creating string variables for each on your IDE
        String email = "ystudent@email.com", password = "secret";
//        Click signin button on homepage using xpath and ‘contains’ method
        driver.findElement(By.xpath("//*[contains(@class, 'user')]/a")).click();
        logInWithEmailandPass( driver ,"//*[@id = 'email']" , "//*[@name = 'passwd']" ,email , password);
        printtitle(driver);
        driver.close();
    }

    private static void logInWithEmailandPass(WebDriver driver , String emailEl, String pass ,String email ,String password) {
        driver.findElement(By.xpath(emailEl)).sendKeys(email);
//        Enter your pwd using xpath and ‘name’ attribute
        driver.findElement(By.xpath(pass)).sendKeys(password);
//        Click signin button using ‘id’ only
        driver.findElement(By.id("SubmitLogin")).click();
    }

    private static void printtitle(WebDriver driver) {
        driver.getCurrentUrl();
        System.out.println(driver.getTitle());
    }

}
