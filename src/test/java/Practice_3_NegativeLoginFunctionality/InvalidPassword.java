package Practice_3_NegativeLoginFunctionality;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidPassword {
    public static void main(String[] args) throws InterruptedException {
        /*
        valid password helpdesk15@cybertekschool.com
        valid password UserUser
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://login2.nextbasecrm.com/");
        WebElement username = driver.findElement(By.name("USER_LOGIN"));
        username.sendKeys("helpdesk15@cybertekschool.com");
        Thread.sleep(1500);
        WebElement login = driver.findElement(By.name("USER_PASSWORD"));
        login.sendKeys("ASDFASDF");
        Thread.sleep(1500);
        WebElement LoginButton = driver.findElement(By.className("login-btn"));
        LoginButton.click();
        WebElement errorMcg = driver.findElement(By.className("errortext"));

        if(errorMcg.getText().equals("Incorrect login or password")){
            System.out.println("Verification \"error message\" is passed");
        }else {
            System.out.println("Verification \"error message\" is failed");
        }
        driver.quit();
    }
    }
