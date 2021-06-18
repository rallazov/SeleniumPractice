import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import sun.jvm.hotspot.utilities.Assert;

import java.util.List;

public class DropdownPractice {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver" , "./resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.jqueryscript.net/demo/jQuery-Multiple-Select-Plugin-For-Bootstrap-Bootstrap-Multiselect/");
        driver.findElement(By.xpath("//tr[2]/td[1]/div/button")).click();
       List<WebElement> options = driver.findElements(By.xpath("//tr[2]/td[1]/div/button/following-sibling::ul[1]"));
       int count = 0;
        for (WebElement each : options) {
            System.out.println(each.getText());
            if(!each.isSelected()) {
                 count++;
                each.click();

            }
            System.out.println(count);
        }





Thread.sleep(3000);
        driver.quit();

    }
}
