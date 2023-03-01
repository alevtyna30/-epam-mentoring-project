package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.List;


public class HighsoftEmployeesPage extends BasePage {

    @FindBy(css = ".highcharts-point.highcharts-color-2")
    private List<WebElement> highchartsArea;

    @FindBy(xpath = "//*[@class='highcharts-label highcharts-tooltip highcharts-color-2']")
    private WebElement tooltipMessage;

    private List<String> tooltipMessages;

    public HighsoftEmployeesPage(WebDriver driver) {
        super(driver);
    }

    public void hoverOverHighchartAreaAndCollectText() {
        tooltipMessages = new ArrayList<>();
        for (int i = 0; i < highchartsArea.size(); i++) {
            hoverOverElement(highchartsArea.get(i));
            waitVisibilityOfElement(highchartsArea.get(i));
            tooltipMessages.add(tooltipMessage.getText());
        }
    }

    public List<String> getTooltipMessages() {
        return tooltipMessages;
    }
}
