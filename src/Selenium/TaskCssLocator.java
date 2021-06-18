package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskCssLocator {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "./resources/chromedriver");
        WebDriver driver = new ChromeDriver();

//        Write CSS for below elements:
//        https://www.bestbuy.com/
        driver.get("https://www.bestbuy.com/");
//        Searchbox
        driver.findElement(By.cssSelector("#gh-search-input"));
//        Fairfax (your city might be different)
        driver.findElement(By.cssSelector("#lt-container"));
//        Cart
//                Logo
    }
}
