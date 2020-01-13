import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class RegisterTest {



    @Test
    public void registerTest() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test");


        driver.findElement(By.linkText("ACCOUNT")).click();
        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.id("firstname")).sendKeys("Maier");
        driver.findElement(By.name("middlename")).sendKeys("Eduard");
        driver.findElement(By.name("lastname")).sendKeys("Lotzi");
        driver.findElement(By.id("email_address")).sendKeys("maiereduard86@gmail.com");
        
        //aici nu imi place cum ai scris!
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.name("confirmation")).sendKeys("password");
        driver.findElement(By.className("checkbox")).click();

    }
}
