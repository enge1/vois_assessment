package ScenarioOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToCart() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/div/div[1]/span/span/a")).click();
    }

    public void checkItemAddedSuccessfully() {
        boolean cartElementDisplayed = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[4]/div/div[2]/div[1]/div/form/div[2]/div[3]/div[4]/div/div[2]/ul/li/span/a/span[1]/span/span[2]")).isDisplayed();
        System.out.println("CartElement Element displayed is :" + cartElementDisplayed);
    }
}
