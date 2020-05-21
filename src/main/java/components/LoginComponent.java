package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.AccountsOverviewPage;

public class LoginComponent {

    private WebDriver driver;
    private By usernameField = By.name("username");
    private By passwordField = By.name("password");
    private By loginButton = By.cssSelector(".login .button");

    public LoginComponent(WebDriver driver){
        this.driver = driver;
    }

    public AccountsOverviewPage login(String username, String password){
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
        return new AccountsOverviewPage(driver);
    }


}
