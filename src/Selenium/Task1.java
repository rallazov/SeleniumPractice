package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {

public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver" , "./resources/chromedriver");
    RemoteWebDriver driver = new ChromeDriver();
//    //    Go to website number 1 of your choice using get() method
//    driver.get("http://automationpractice.com/index.php");
////    Maximize window
//    driver.manage().window().maximize();
////    Go to website number 2 of your choice using get() method
//    driver.get("https://facebook.com");
////    Go to website number 3 of your choice using get() method
//    driver.get("https://uber.com");
////    Go to website number 4 of your choice using navigate() method
//    driver.navigate().to("https://ebay.com");
////    Print 4th website title on your console using getTitle() method
//    System.out.println(driver.getTitle());
////    Go back using back() method and Print 3rd website title
//    driver.navigate().back();
////    Go back using back() method and Print 2nd website URL
//    driver.navigate().back();
////    Go back using back() method and Print 1st website title
//    driver.navigate().back();
//    Close window



//    Navigate to http://demo.automationtesting.in/Register.html

//    Locate the dropdown ‘Countries’
   // WebElement countries = driver.findElement(By.cssSelector("#countries"));
//    Print all options for ‘Countries’ dropdown on your console
//    Select s = new Select(countries);
//    List<WebElement> countriesInList  = s.getOptions();
//    countriesInList.forEach(c-> System.out.println(c.getText().toString()));
//    s.selectByVisibleText("Azerbaijan");
  //countriesInList.stream().filter(c->c.getText().equals("Azerbaijan")).map(c->c.getText().toString()).forEach(c-> System.out.println(c.toString()));

    driver.get("https://www.jqueryscript.net/demo/jQuery-Multiple-Select-Plugin-For-Bootstrap-Bootstrap-Multiselect/");
    driver.findElement(By.xpath("//select[@id='example2']/../div")).click();
    List<WebElement> programs = driver.findElements(By.xpath("//select[@id='example2']/..//li"));
    programs.stream().filter(t->t.getAttribute("class").equals("active")).forEach(t->t.click());
    //something new here again



   // Iterator<WebElement> it = programs.iterator();
//    int i = 0;
//    while(it.hasNext()){
//        if(programs.get(i).getAttribute("class").equals("active")) {
//            programs.get(i).click();
//            i++;
//        }

   // }


//    Use ul/li attributes for this task
//    Note: complete this task with reusable method and loop..




}
}
