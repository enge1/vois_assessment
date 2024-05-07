package ScenarioOne;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestOne {
    WebDriver driver;
    HomePage homePage;
    SearchResultsPage searchResultsPage;
    CartPage cartPage;

    @BeforeTest
    public void initializeTest() {
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1024, 768));
        homePage = new HomePage(driver);
        searchResultsPage = new SearchResultsPage(driver);
        cartPage = new CartPage(driver);
        driver.get("https://www.amazon.eg");
    }

    @Test(priority = 1)
    public void searchAndSelectItem() throws InterruptedException {
        homePage.searchForItem("car accessories");
        searchResultsPage.selectFirstResult();
    }

    @Test(priority = 2)
    public void addItemToCart() {
        searchResultsPage.addItemToCart();
    }

    @Test(priority = 3)
    public void verifyItemAddedToCart() {
        cartPage.navigateToCart();
        cartPage.checkItemAddedSuccessfully();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
