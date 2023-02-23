package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import manager.PageFactoryManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HighsoftEmployeesPage;
import pages.HomePage;

import java.util.List;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DefinitionsSteps {

    WebDriver driver;
    PageFactoryManager pageFactoryManager;
    HomePage homePage;
    HighsoftEmployeesPage highsoftEmployeesPage;


    @Before
    public void testsSetUp() {
        chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        pageFactoryManager = new PageFactoryManager(driver);
    }

    @Given("User navigates to the {string}")
    public void openPage(final String url) {
        homePage = pageFactoryManager.getHomePage();
        homePage.openHomePage(url);
    }

    @Then("User checks try button visibility")
    public void userChecksSearchFieldVisibility() {
        assertTrue(homePage.isTryButtonVisible());
    }

    @And("User should 'accept cookies'")
    public void userShouldAcceptCookies() {
        homePage.clickOnAcceptCookies();
    }

    @And("User turns off 'google search' chart")
    public void userTurnsOffGoogleSearchChart() {
        homePage.waitVisibilityOfElement(homePage.getGoogleSearchChart());
        homePage.clickOnGoogleSearchChart();
    }

    @And("User disables 'revenue' chart")
    public void userDisablesRevenueChart() {
        homePage.waitVisibilityOfElement(homePage.getRevenueChart());
        homePage.clickOnRevenueChart();
    }

    @When("User hover mouse on peak with {int} index")
    public void userHoverMouseOnFirstPeak(int index) {
        highsoftEmployeesPage = pageFactoryManager.getHighsoftEmployeesPage();
        highsoftEmployeesPage.hoverOnElementTwice(highsoftEmployeesPage.getAllPeaksFromHighchartsArea().get(index));
        highsoftEmployeesPage.waitVisibilityOfElement(highsoftEmployeesPage.getTooltipMessage());
    }

    @Then("User should see {string} text")
    public void userShouldSeeTooltipText(String tooltip) {
        String tooltipMessage = highsoftEmployeesPage.getTextFromToolTip();
        assertEquals(tooltip, tooltipMessage);
    }

    @After
    public void tearDown() {
        driver.close();
    }

}
