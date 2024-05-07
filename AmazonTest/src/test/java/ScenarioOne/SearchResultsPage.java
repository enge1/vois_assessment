package ScenarioOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SearchResultsPage {
    WebDriver driver;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFirstResult() throws InterruptedException {
        WebElement firstElement = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/span/div/div/div[2]/div[1]/h2/a/span"));

        Actions action = new Actions(driver);
        action.moveToElement(firstElement).perform();
        Thread.sleep(3000);
        firstElement.click();
        Thread.sleep(3000);
    }

    public void addItemToCart() {
        WebElement addToCart = driver.findElement(By.id("add-to-cart-button"));
        addToCart.click();
    }
}
