package PageModels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ButtonsPage extends AbstractPage {

    public ButtonsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
