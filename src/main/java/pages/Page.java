package pages;

import components.LoginComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page {

    protected WebDriver driver;

    public Page(WebDriver driver){
        this.driver = driver;
    }

    public void clickAccountService(String service){
        driver.findElement(By.linkText(service)).click();
    }

    public AccountsOverviewPage login(String username, String password){
        return new LoginComponent(driver).login(username, password);
    }
}
