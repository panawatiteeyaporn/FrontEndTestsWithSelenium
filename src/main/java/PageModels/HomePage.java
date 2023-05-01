package PageModels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends AbstractPage {

    @FindBy( xpath = "//li/a[text()='Complete Web Form']")
    private WebElement webFormLink;

    @FindBy( xpath = "//li/a[text()='Autocomplete']")
    private WebElement autocompleteLink;

    @FindBy( xpath = "//li/a[text()='Buttons']")
    private WebElement buttonsLink;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebFormPage clickWebFormLink() {
        webFormLink.click();
        return new WebFormPage(driver);
    }

    public AutocompletePage clickAutocompleteLink() {
        autocompleteLink.click();
        return new AutocompletePage(driver);
    }

    public ButtonsPage clickButtonsLink() {
        buttonsLink.click();
        return new ButtonsPage(driver);
    }





}
