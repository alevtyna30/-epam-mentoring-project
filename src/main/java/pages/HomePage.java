package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{


    @FindBy(xpath = "//a[@class='btn btn-primary mr-1 btn-small horisontal-menu-item text-uppercase']")
    private WebElement tryButton;

    @FindBy(xpath = "//*[@aria-label='Show Highsoft employees']")
    private WebElement highsoftEmployeesChart;

    @FindBy(xpath = "//a[@id='CybotCookiebotDialogBodyButtonAccept']")
    private WebElement acceptCookiesButton;

    @FindBy(xpath = "//button[@aria-label='Show Google search for highcharts']")
    private WebElement googleSearchChart;

    @FindBy(xpath = "//button[@aria-label='Show Revenue']")
    private WebElement revenueChart;

    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void openHomePage(String url) {
        driver.get(url);
    }
    public boolean isTryButtonVisible(){
        return tryButton.isDisplayed();
    }
    public WebElement getHighsoftEmployeesChart(){
        return highsoftEmployeesChart;
    }
    public WebElement getGoogleSearchChart(){
        return googleSearchChart;
    }
    public WebElement getRevenueChart(){
        return revenueChart;
    }
    public WebElement getAcceptCookiesButton(){
        return acceptCookiesButton;
    }
    public void clickOnAcceptCookies(){
        acceptCookiesButton.click();
    }
    public void clickOnGoogleSearchChart(){
        googleSearchChart.click();
    }
    public void clickOnRevenueChart(){
        revenueChart.click();
    }

}
