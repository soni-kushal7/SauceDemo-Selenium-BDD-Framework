package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {
    
    WebDriver driver;

    // This is the constructor that was missing or mismatched
    public InventoryPage(WebDriver driver) {
        this.driver = driver;
        // This line initializes the @FindBy elements
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "react-burger-menu-btn")
    private WebElement menuBtn;

    @FindBy(id = "logout_sidebar_link")
    private WebElement logoutLink;

    public void clickMenu() {
        menuBtn.click();
    }

    public void clickLogout() {
        logoutLink.click();
    }
    
    public WebElement getMenuBtn() {
        return menuBtn;
    }

    public WebElement getLogoutLink() {
        return logoutLink;
    }
}