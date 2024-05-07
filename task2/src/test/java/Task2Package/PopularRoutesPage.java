package Task2Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PopularRoutesPage {
    private WebDriver driver;

    public PopularRoutesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectRoute() {
        driver.findElement(By.xpath("/html/body/main/section/div/div/div[1]/div/div/div/div[2]/div/div/ul/li[1]")).click();
    }

    public void chooseArrivalDate() {
        driver.findElement(By.id("txtJourneyDate")).click();
        driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[3]/td[4]/a")).click();
    }

    public void searchForBus() {
        driver.findElement(By.xpath("/html/body/main/form/div[1]/div/div[2]/div[3]/button")).click();
    }
}
