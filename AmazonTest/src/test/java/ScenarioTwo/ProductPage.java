package ScenarioTwo.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ProductPage {
    private WebDriver driver;

    private By addToCartButton = By.id("add-to-cart-button");
    private By goToCartLink = By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/div/div[3]/div/div[1]/span/span/a");
    private By cartElement = By.xpath("/html/body/div[1]/div[1]/div[3]/div[4]/div/div[2]/div[1]/div/form/div[2]/div[3]/div[4]/div/div[2]/ul/li/span/a/span[1]/span/span[2]");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addItemToCart() {

        driver.findElement(addToCartButton).click();
    }

    public void goToCart() {
        driver.findElement(goToCartLink).click();
    }

    public boolean isItemAddedToCart() {
        return driver.findElement(cartElement).isDisplayed();
    }
}
