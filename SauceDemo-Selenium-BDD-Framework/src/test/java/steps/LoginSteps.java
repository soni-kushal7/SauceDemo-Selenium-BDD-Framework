package steps;

import org.testng.Assert;
import base.BaseTest;
import io.cucumber.java.en.*;
import pages.LoginPage;

public class LoginSteps extends BaseTest {
    
    // Initialize Page Object
    LoginPage loginPage;

    @Given("user navigates to saucedemo")
    public void user_navigates_to_saucedemo() {
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver); // Instantiate here or in a constructor
    }

    @And("enters valid username and password")
    public void enters_valid_username_and_password() {
        loginPage.login("standard_user", "secret_sauce");
    }

    @And("clicks on login button")
    public void clicks_on_login_button() {
        loginPage.getLoginBtn().click();
    }

    @Then("user should be redirected to homepage")
    public void user_should_be_redirected_to_homepage() {
        Assert.assertTrue(driver.getCurrentUrl().contains("inventory"), "Redirection failed.");
    }
    
    @And("enters username {string} and password {string}")
    public void enters_username_and_password(String user, String pass) {
        loginPage.login(user, pass);
    }
    
    @Then("user should see a {string} error message")
    public void user_should_see_error_message(String errorType) {
        // You would typically add an error element to LoginPage.java
        // For now, checking the URL or a specific element via the Page Object is cleaner
        Assert.assertTrue(driver.getPageSource().contains("Epic sadface"), "Error message not found");
    }
}