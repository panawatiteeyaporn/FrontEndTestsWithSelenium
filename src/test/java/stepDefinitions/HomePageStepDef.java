package stepDefinitions;

import PageModels.AutocompletePage;
import PageModels.ButtonsPage;
import PageModels.HomePage;
import PageModels.WebFormPage;
import io.cucumber.java.After;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class HomePageStepDef {

    private WebDriver driver;

    private HomePage onHomePage;
    private WebFormPage onWebFormPage;
    private AutocompletePage onAutocompletePage;
    private ButtonsPage onButtonsPage;


    // Maybe look to set this in the background feature?
    // We want a setup that can switch between different driver (edge, firefox, chrome)
    // easily
    @BeforeAll
    public static void setup() {
        // Set property for all web-drivers
        System.setProperty("webdriver.chrome.driver","src/main/resources/Drivers/chromedriver.exe");
    }

    @After
    public void shutdown() {
        driver.quit();
    }

    @Given("I am at the home page {string}")
    public void i_am_at_the_home_page(String url) {
        driver = new ChromeDriver();
        onHomePage = new HomePage(driver);
        onHomePage.openHomePage();
        assertThat(onHomePage.getUrl(), is(url));
    }

    @When("I click on web form page")
    public void i_click_on_web_form_page() {
        onWebFormPage = onHomePage.clickWebFormLink();
    }

    @Then("I will be on web form page {string}")
    public void i_will_be_on_web_form_page(String webFormUrl) {
        assertThat(onWebFormPage.getUrl(), is(webFormUrl));
    }

    @When("I click on auto complete page")
    public void i_click_on_auto_complete_page() {
        onAutocompletePage = onHomePage.clickAutocompleteLink();
    }

    @Then("I will be on auto complete page {string}")
    public void i_will_be_on_auto_complete_page(String url) {
        assertThat(onAutocompletePage.getUrl(), is(url));
    }

    @When("I click on button page")
    public void i_click_on_button_page() {
        onButtonsPage = onHomePage.clickButtonsLink();
    }
    @Then("I will be on button page {string}")
    public void i_will_be_on_button_page(String url) {
        assertThat(onButtonsPage.getUrl(), is(url));
    }
}
