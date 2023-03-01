package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import manager.PageFactoryManager;
import org.openqa.selenium.WebDriver;
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
        homePage.waitElementToBeClickable(homePage.getAcceptCookiesButton());
        homePage.clickOnAcceptCookies();
    }

    @And("User turns off 'google search' chart")
    public void userTurnsOffGoogleSearchChart() {
        homePage.waitElementToBeClickable(homePage.getGoogleSearchChart());
        homePage.clickOnGoogleSearchChart();
    }

    @And("User disables 'revenue' chart")
    public void userDisablesRevenueChart() {
        homePage.waitVisibilityOfElement(homePage.getRevenueChart());
        homePage.clickOnRevenueChart();
    }
    @And("User clicks on 'chart context menu'")
    public void userClicksOnChartContextMenu() {
        homePage.clickOnChartMenu();
    }
    @And("User choose from dropdown menu 'view in full screen'")
    public void userViewChartInFullScreen() {
        homePage.clickOnFullScreenButton();
    }
    @When("User hover mouse on each peak and get all tooltip")
    public void userHoverMouseOnFirstPeak() {
        highsoftEmployeesPage = pageFactoryManager.getHighsoftEmployeesPage();
        highsoftEmployeesPage.hoverOverHighchartAreaAndCollectText();
    }

    @Then("User checks that the list of tooltip should be equal with following:")
    public void userChecksThatTheListOfTooltipShouldBeEqualWithFollowing(List<String> expectedTooltipMessages) {
        assertEquals(expectedTooltipMessages, highsoftEmployeesPage.getTooltipMessages());
    }
    @After
    public void tearDown() {
        driver.close();
    }
}