package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Page;

public class BaseTests {

    protected static ChromeDriver driver;
    protected static Page page;

    @BeforeAll
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        page = new Page(driver);
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}