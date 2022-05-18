package Practice2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPositiveHR {
    public static void main(String[] args) {
        /*

         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://login2.nextbasecrm.com/");
        WebElement login = driver.findElement(By.name("USER_LOGIN"));
        login.sendKeys("hr1@cybertekschool.com");

        WebElement pass = driver.findElement(By.name("USER_PASSWORD"));
        pass.sendKeys("UserUser" + Keys.ENTER);

        if (driver.getTitle().equals("https://login2.nextbasecrm.com/stream/?login=yes")){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }

        driver.quit();

    }


}
