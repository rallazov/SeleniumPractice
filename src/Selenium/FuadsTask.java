package Selenium;

import net.bytebuddy.pool.TypePool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class FuadsTask {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver" , "./resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        Wait w = new WebDriverWait(driver , 10);
        driver.manage().window().maximize();
        //        Go to http://www.practiceselenium.com/
        driver.get(" http://www.practiceselenium.com/");
        //● Store the below elements in a list:

        List<WebElement> list1= driver.findElements(By.cssSelector(".wsb-element-button"));
        System.out.println(list1.get(0).getText());
        list1.get(2).click();
        driver.navigate().back();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".wsb-element-button")));
        System.out.println(driver.findElement(By.cssSelector(".wsb-element-button")).getText());
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".wsb-element-button")));
//        list1.get().click();
       driver.navigate().forward();
       driver.navigate().back();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".wsb-element-button")));
        System.out.println(driver.findElement(By.cssSelector(".wsb-element-button")).getText());
        list1.get(0).click();

        //System.out.println(list1.get(1).getText());
//        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='wsb-image-inner ']/div/a/img")));
//        list1.get(2).click();
//        driver.navigate().back();

//        list1.get(3).click();
//        driver.navigate().back();
//        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='wsb-image-inner ']/div/a/img")));
//        list1.get(3).click();



//int i= 0;
//do{
//    //System.out.println(list1.get(i).getText());
//    System.out.println(list1.get(i).isEnabled());
//   w.until(ExpectedConditions.elementToBeClickable(list1.get(i)));
//    list1.get(i).click();
//    driver.navigate().back();
//    w.until(ExpectedConditions.elementToBeClickable(list1.get(i)));
////    System.out.println(list1.get(i).getText());
////    list1.get(i).click();
////    driver.navigate().back();
//    System.out.println(list1.get(i).isEnabled());
//    i++;
//
//}while(list1.size()>i);
        driver.quit();
    }
}
