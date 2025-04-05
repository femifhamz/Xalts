package stepDefinitions;


import io.cucumber.java.en.*;

import pages.*;

public class StepDefinitions extends BaseTest {
    
    SignUpPage signUpPage;
    LoginPage loginPage;
    HomePage homePage;
  
    @Given("User opens the browser and navigates to the portal")
    public void user_opens_browser() {
        // Initialize WebDriver   
        initializeDriver() ;
        driver.get("https://xaltsocnportal.web.app");
        signUpPage = new SignUpPage(driver);
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
    }

    @Then("Navigate to signup page")
    public void navigate_to_signup_page() {
        // Use the getter method if added
        signUpPage.navigateToSignUpPage();
    }
    @When("User enters email {string}, password {string}, and confirm password {string}")
    public void user_enters_signup_details(String email, String password, String confirmPassword) {
        signUpPage.enterEmail(email);
        signUpPage.enterPassword(password);
        signUpPage.enterConfirmPassword(confirmPassword);
    }

    @And("User clicks on sign up")
    public void user_clicks_sign_up() {
        signUpPage.clickSignUp();
    }

    @Then("Navigate to signin page and click here")
    public void navigate_to_signin_page() {
        loginPage.navigateToLoginPage();
        loginPage.clickHereToSignUp();
    }
    @When("User enters login email {string} and password {string}")
    public void user_enters_login_details(String email, String password) {
        signUpPage.enterEmail(email);
        signUpPage.enterPassword(password);
    }

    @And("User clicks on login")
    public void user_clicks_login() {
        loginPage.clickLogin();
    }

    @Then("User clicks on sign out")
    public void user_clicks_sign_out() {
        homePage.clickSignOut();
    }

    @Then("Verify sign up button is disabled and error message is displayed")
    public void verify_sign_up_button_and_error_message() {
        boolean isButtonEnabled = signUpPage.isSignUpButtonEnabled();
        String errorMessage = signUpPage.getErrorMessage();

        if (isButtonEnabled) {
            throw new AssertionError("Sign Up button should be disabled when passwords do not match.");
        }

        if (!errorMessage.equals("Passwords do not match")) { 
            throw new AssertionError("Expected error message not displayed. Found: " + errorMessage);
        }
    }

//     @After
//     public void tearDown() {
//         driver.quit();
//     }
}
