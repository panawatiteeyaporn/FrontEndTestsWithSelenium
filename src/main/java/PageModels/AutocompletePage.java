package PageModels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AutocompletePage extends AbstractPage {

    public AutocompletePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
