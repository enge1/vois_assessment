package ScenarioTwo.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
    private WebDriver driver;

    private By topDealsLink = By.xpath("/html/body/div[1]/header/div/div[4]/div[2]/div[2]/div/a[1]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToTopDeals() {
        driver.findElement(topDealsLink).click();
    }
}

