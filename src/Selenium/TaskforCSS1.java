package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class TaskforCSS1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver" , "./resources/chromedriver");
        WebDriver driver = new ChromeDriver();


//        Write CSS for below elements:
//        https://www.bestbuy.com
//driver.navigate().to("https://www.bestbuy.com/");

       driver.navigate().to("https://www.facebook.com/");
       driver.navigate().to("https://www.amazon.com/");
       Thread.sleep(3000);
//        Searchbox
        driver.findElement(By.cssSelector("#gh-search-input")).getAttribute("placeholder");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("svg[aria-hidden= true ] svg[id = Close_Cancel_Line]")).click();
        Thread.sleep(3000);
//        Fairfax (your city might be different)
        String cityName = driver.findElement(By.cssSelector("#store-loc-overlay")).getText();
        System.out.println(cityName);
//        Cart , Logo

        System.out.println( driver.findElement(By.cssSelector(".cart-link .cart-label")).getText());
        driver.findElement(By.cssSelector(".logo"));

        driver.close();
    }
}
