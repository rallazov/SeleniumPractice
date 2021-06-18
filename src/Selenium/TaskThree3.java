package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TaskThree3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "./resources/chromedriver");
        WebDriver driver = new ChromeDriver();


//        Go to https://testautomationpractice.blogspot.com/
        driver.get("https://testautomationpractice.blogspot.com/");
//        Locate the table and locate all Authors on the table with xpath and print them on console
        List<WebElement> authors = driver.findElements(By.xpath("//*[@id = 'HTML1']/div/table/tbody/tr"));
        String eachAuth;
        for (int i = 2; i <= authors.size(); i++) {

            System.out.println( getAuthors(driver , i,2));
        }


        driver.quit();

    }

    public static String getAuthors(WebDriver driver , int rowNum, int colNum) {
       return driver.findElement(By.xpath("//*[@id = 'HTML1']/div/table/tbody/tr["+rowNum+"]/td["+colNum+"]")).getText();
    }

}
