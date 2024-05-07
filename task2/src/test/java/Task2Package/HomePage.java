package Task2Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void goTo() {
        driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
    }

    public void choosePopularRoutes() {
        driver.findElement(By.xpath("/html/body/main/section/div/div/div[1]/div/div/div/div[2]/div/div/ul/li[1]")).click();
    }
}
