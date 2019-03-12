import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WishListTest {

@Test
    public void addToWishListFromSalePageTest() {
    System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://fasttrackit.org/selenium-test");

    driver.findElement(By.xpath("//a[@class='logo']")).click();
    driver.findElement(By.linkText("SALE")).click();
    driver.findElement(By.linkText("VIEW DETAILS")).click();
    driver.findElement(By.className("link-wishlist")).click();


   // driver.quit();



    }




}
