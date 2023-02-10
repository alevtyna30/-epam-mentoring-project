package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{


    @FindBy(xpath = "//a[@class='btn btn-primary mr-1 btn-small horisontal-menu-item text-uppercase']")
    private WebElement tryButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void openHomePage(String url) {
        driver.get(url);
    }
    public boolean isTryButtonVisible(){
        return tryButton.isDisplayed();
    }
    public WebElement getTryButton(){
        return tryButton;
    }
}
