import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/main/resources/Drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        var elementCookie = driver.findElement(By.id("W0wltc"));

        elementCookie.click();

        var element = driver.findElement(By.name("q"));

        element.sendKeys("Cheese!");

        element.submit();

        driver.quit();

    }
}
