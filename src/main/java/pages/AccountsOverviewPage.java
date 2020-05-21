package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class AccountsOverviewPage extends Page {

    private By table = By.id("accountTable");
    private By accountColumn = By.cssSelector("#accountTable tr[ng-repeat='account in accounts'] td:not(.ng-binding)");

    public AccountsOverviewPage(WebDriver driver){
        super(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(table)));
    }

    public List<String> getAccounts(){
        return driver.findElements(accountColumn)
                .stream()
                .map(e -> e.getText())
                .collect(Collectors.toList());
    }
}