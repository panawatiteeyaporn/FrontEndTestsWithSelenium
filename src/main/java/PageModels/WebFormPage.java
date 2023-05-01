package PageModels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WebFormPage extends AbstractPage {

    public WebFormPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

}
