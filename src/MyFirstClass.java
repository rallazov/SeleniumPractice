import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MyFirstClass {
//    Go to http://automationpractice.com/index.php
//    Locate below elements with xpath
//            Logo
//    Cart
//    Search input box
//    Search button
//    Contact Us link
    public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver" , "./resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.cssSelector("#header_logo"));
        //driver.findElement(By.cssSelector(".shopping_cart a b")); // this is syntax for class
        String cart = driver.findElement(By.cssSelector("[class = 'shopping_cart'] a b ")).getText();
        String axtar =  driver.findElement(By.xpath("//*[@id= 'search_query_top']/..div")).getAttribute("id");
        System.out.println(axtar);
        //driver.navigate().back();

        driver.quit();


    }
}
