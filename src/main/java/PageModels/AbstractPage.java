package PageModels;

import org.openqa.selenium.WebDriver;

public class AbstractPage {
    protected WebDriver driver;

    public AbstractPage (WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public HomePage openHomePage() {
        driver.get("https://formy-project.herokuapp.com/");
        return new HomePage(driver);
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }

}
