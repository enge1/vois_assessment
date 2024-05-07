package ScenarioTwo;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestTwo {
    private WebDriver driver;
    private ScenarioTwo.Pages.HomePage homePage;
    private ScenarioTwo.Pages.TopDealsPage topDealsPage;
    private ScenarioTwo.Pages.ProductPage productPage;

    @BeforeTest
    public void initializePage() {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.eg");
        driver.manage().window().setSize(new Dimension(1024, 768));
        homePage = new ScenarioTwo.Pages.HomePage(driver);
        topDealsPage = new ScenarioTwo.Pages.TopDealsPage(driver);
        productPage = new ScenarioTwo.Pages.ProductPage(driver);
    }

    @Test(priority = 1)
    public void navigateToTopDeals() {
        homePage.goToTopDeals();
    }

    @Test(priority = 2)
    public void selectGroceryAndElectronics() {
        topDealsPage.selectGroceryAndElectronics();
    }

    @Test(priority = 3)
    public void selectFirstItemAndAddToCart() throws InterruptedException {
             topDealsPage.selectFirstItem();
             productPage.addItemToCart();
             productPage.goToCart();
             Thread.sleep(3000);
             boolean itemAdded = productPage.isItemAddedToCart();
             System.out.println("Item added to cart: " + itemAdded);
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }
}
