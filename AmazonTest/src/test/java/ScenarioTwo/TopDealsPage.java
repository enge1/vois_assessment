package ScenarioTwo.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TopDealsPage {
    private WebDriver driver;

    private By groceryCheckBox = By.xpath("/html/body/div[1]/div[1]/div[20]/div/div/div/div[3]/div[2]/span[3]/ul/li[13]/label/input");
    private By electronicsLabel = By.xpath("/html/body/div[1]/div[1]/div[20]/div/div/div/div[3]/div[2]/span[3]/ul/li[17]/label/span");
    private By offerLink = By.xpath("/html/body/div[1]/div[1]/div[20]/div/div/div/div[3]/div[2]/span[6]/ul/li[2]/div/a/span");
    private By firstItemLink = By.xpath("/html/body/div[1]/div[1]/div[20]/div/div/div/div[3]/div[3]/div/div[3]/div/div/div/a/div");

    public TopDealsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectGroceryAndElectronics() {
        driver.findElement(groceryCheckBox).click();
        driver.findElement(electronicsLabel).click();
        driver.findElement(offerLink).click();
    }

    public void selectFirstItem() throws InterruptedException {
        Actions action = new Actions(driver);
        action.sendKeys(Keys.HOME).build().perform();
        Thread.sleep(3000);
        WebElement firstItem = driver.findElement(firstItemLink);
        action.moveToElement(firstItem).perform();
        Thread.sleep(3000);
        firstItem.click();
        Thread.sleep(3000);
    }
}
