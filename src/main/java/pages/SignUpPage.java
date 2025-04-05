package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends BasePage {

    // Locate by Name
    @FindBy(xpath = "//*[text()='Get Started']")
    private WebElement getStartedButton;

    // Locate by ID
    @FindBy(id = "outlined-basic")
    private WebElement emailField;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwordField;

    @FindBy(xpath = "(//input[@type='password'])[2]")
    private WebElement confirmPasswordField;

    @FindBy(xpath = "//*[text()='Sign Up']")
    private WebElement signUpButton;

    public SignUpPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this); // Ensure WebElements are initialized
    }

    public void navigateToSignUpPage() {
        getStartedButton.click();
    }

    public void enterEmail(String email) {
        emailField.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        confirmPasswordField.sendKeys(confirmPassword);
    }

    public void clickSignUp() {
        signUpButton.click();
    }

    
    public boolean isSignUpButtonEnabled() {
        // Ensure signUpButton is properly initialized and used
        return signUpButton != null && signUpButton.isEnabled();
    }

    public String getErrorMessage() {
        // Ensure error message element exists and fetch its text safely
        WebElement errorMessageElement = driver.findElement(By.id("outlined-basic-helper-text"));
        return (errorMessageElement != null) ? errorMessageElement.getText() : "";
    }
}
