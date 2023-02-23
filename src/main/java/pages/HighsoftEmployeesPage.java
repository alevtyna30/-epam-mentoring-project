package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HighsoftEmployeesPage extends BasePage {

    @FindBy(css = ".highcharts-point.highcharts-color-2")
    private List<WebElement> highchartsArea;

    @FindBy(xpath = "//*[@class='highcharts-label highcharts-tooltip highcharts-color-2']")
    private WebElement tooltipMessage;

    public HighsoftEmployeesPage(WebDriver driver) {
        super(driver);

    }

    public List<WebElement> getAllPeaksFromHighchartsArea() {
        return highchartsArea;
    }

    public String getTextFromToolTip() {
        return tooltipMessage.getText();
    }

    public WebElement getTooltipMessage() {
        return tooltipMessage;
    }

}
