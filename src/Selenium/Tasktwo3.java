package Selenium;

import com.sun.tools.javac.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tasktwo3 {
    public static void main(String[] args) {


       System.setProperty("webdriver.chrome.driver" , "./resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//
//        /*  Go to http://demo.guru99.com/test/newtours/ */
//        driver.get("http://demo.guru99.com/test/newtours/ ");
//        /*         Fill out username and password using Name locator */
//        driver.findElement(By.name("userName")).sendKeys("allazov@yahoo.com");
//        driver.findElement(By.name("password")).sendKeys("123456");
//        /*         Click on login button*/
//        driver.findElement(By.xpath("//*[@type= 'submit']")).click();
//        /*         Click on Vacations link using partialLinktext locator */
//        driver.findElement(By.partialLinkText("Vacations")).click();
//        /*         Click on Register link using linktext locator */
//        driver.findElement(By.linkText("REGISTER")).click();
//        /*         Fill out the form*/
//        driver.findElement(By.name("firstName")).sendKeys("Ramin");
//        driver.findElement(By.name("lastName")).sendKeys("All");
//WebElement countries = driver.findElement(By.cssSelector("[name = 'country']"));
//        Select country = new Select(countries);
//        country.selectByVisibleText("AZERBAIJAN");
        driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
        String name = driver.findElement(By.xpath("//*[contains(text(), 'John Smith')]")).getText();
        System.out.println(name);
        System.out.println(name.equals("John Smith"));

        driver.quit();
    }
}
