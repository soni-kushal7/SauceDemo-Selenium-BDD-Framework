package steps;

import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import base.BaseTest;
import io.cucumber.java.en.*;
import pages.InventoryPage;


public class LogoutSteps extends BaseTest {

	InventoryPage inventoryPage;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @And("the user clicks on the Menue Bar button")
    public void the_user_clicks_on_the_menue_bar_button() {
        inventoryPage = new InventoryPage(driver);
        
        // Use the Page Object element with the Wait
        wait.until(ExpectedConditions.visibilityOf(inventoryPage.getMenuBtn()));
        inventoryPage.clickMenu();
    }

    @And("user clicks on Logout button")
    public void user_clicks_on_logout_button() {
        wait.until(ExpectedConditions.elementToBeClickable(inventoryPage.getLogoutLink()));
        inventoryPage.clickLogout();
    }
    

    @Then("the user should be redirected to the Login page")
    public void the_user_should_be_redirected_to_the_login_page() throws InterruptedException {
    	Thread.sleep(3000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/", "Logout failed.");
        Thread.sleep(3000);
    }
}