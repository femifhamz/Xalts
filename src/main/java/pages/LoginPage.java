package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath="//*[text()='Sign In']")
    private WebElement navigateToSignin;

    @FindBy(xpath = "//button[normalize-space(.)='Already have an account? Click here to sign in.']")
    private WebElement clickHere;

    @FindBy(className = ".css-1x5jdmq")
    private WebElement emailField;

    @FindBy(xpath = "//*[@id=\"outlined-basic\"]")
    private WebElement passwordField;

    @FindBy(xpath = "//*[text()='Sign In']")
    private WebElement loginButton;

    
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void navigateToLoginPage() {
        navigateToSignin.click();
    }
    public void clickHereToSignUp() {
        clickHere.click();
    }
    public void enterEmail(String email) {
        emailField.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLogin() {
        loginButton.click();
    }
}
