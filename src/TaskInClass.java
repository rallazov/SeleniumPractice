import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class TaskInClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "./resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        /**
         * driver.get("https://bestbuy.com");
         *          driver.findElement(By.cssSelector("#gh-search-input")).sendKeys("Ramin");
         *          String location = driver.findElement(By.cssSelector(".store-display-name")).getText();
         *          System.out.println(location);
         *          driver.findElement(By.cssSelector(".cart-label"));
         *          System.out.println(driver.findElement(By.cssSelector(".logo")).getAttribute("alt"));
         */
// Find child elelments of navigation bar--->>>need to look into it to be able to extract elements one by one
        /**
         * driver.get("https://www.ohchr.org");
         *         driver.findElement(By.cssSelector("#navigation>ul"));
         *         System.out.println(driver.findElement(By.cssSelector("#navigation>ul")).getSize());
         *         int each = driver.findElements(By.cssSelector("#navigation>ul>li")).size();
         *         System.out.println(each);
         */
//Log in to yoll HRM and get title
        /**
         * driver.get("http://dev-hrm.yoll.io");
         *         driver.findElement(By.cssSelector("#txtUsername")).sendKeys("yoll_student");
         *         driver.findElement(By.cssSelector("[id = 'txtPassword']")).sendKeys("Bootcamp1#");
         *         driver.findElement(By.cssSelector("[id = btnLogin]")).click();
         *         System.out.println(driver.getTitle().equals("OrangeHRM"));
         */
// Finding John Smith from element
        driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
        driver.manage().window().maximize();
        // String name = driver.findElements(By.xpath("//*[contains(text() ,'John Smith')]")).gettext();
        boolean isNameHere = driver.findElements(By.xpath("//*[contains(text() ,'John Smith')]")).size()>0;
//Print boolean value
        //System.out.println(name.equals("John Smith"));
        System.out.println(isNameHere);







driver.close();
    }
}
