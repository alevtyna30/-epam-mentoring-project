package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HighsoftEmployeesPage extends BasePage {

    @FindBy(xpath = "//*[@class='highcharts-label highcharts-tooltip highcharts-color-2']")
    private WebElement secondTooltipOnHighchartsArea;

    @FindBy(xpath = "//*[@fill='#90ed7d'][3]")
    private WebElement secondPeakOnHighchartsArea;

    public HighsoftEmployeesPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getSecondPeakOnHighchartsArea(){
        return secondPeakOnHighchartsArea;
    }
    public String getActualTooltipText() {
        return secondTooltipOnHighchartsArea.getText();
    }
    public WebElement getSecondTooltipOnHighchartsArea(){
        return secondTooltipOnHighchartsArea;
    }
}
