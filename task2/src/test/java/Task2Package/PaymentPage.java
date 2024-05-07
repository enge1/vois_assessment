package Task2Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage {
    private WebDriver driver;

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
    }

    public void choosePaymentMethod() {
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[3]/div[4]/form/div[2]/div[1]/div[1]/div[1]/div/div/div[2]/div/button[2]")).click();
        driver.findElement(By.id("card_number")).sendKeys("1234567890123456");
        driver.findElement(By.id("card_expiry")).sendKeys("1224");
        driver.findElement(By.id("card_cvv")).sendKeys("123");
    }
}
