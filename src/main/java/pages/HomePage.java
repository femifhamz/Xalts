package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//*[text()='Sign Out']")
    private WebElement signOutButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickSignOut() {
        signOutButton.click();
    }
}
