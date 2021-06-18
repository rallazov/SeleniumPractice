import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class elvinsCode {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver" , "./resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.practiceselenium.com/");
        List<WebElement> imgElement = driver.findElements(By.xpath("//img"));
        System.out.println("Number of elements: " + imgElement.size());
        imgElement.get(7).click();
        driver.navigate().back();
        imgElement.get(10).click();
        driver.navigate().back();
        Thread.sleep(3000);
        imgElement.get(11).click();
        driver.navigate().back();
        Thread.sleep(3000);
        driver.close();
    }
}
