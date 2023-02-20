package manager;

import org.openqa.selenium.WebDriver;
import pages.HighsoftEmployeesPage;
import pages.HomePage;

public class PageFactoryManager {

    WebDriver driver;

    public PageFactoryManager(WebDriver driver) {
        this.driver = driver;
    }
    public HomePage getHomePage() {
        return new HomePage(driver);
    }
    public HighsoftEmployeesPage getHighsoftEmployeesPage(){
        return new HighsoftEmployeesPage(driver);
    }


}
