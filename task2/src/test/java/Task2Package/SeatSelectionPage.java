package Task2Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeatSelectionPage {
    private WebDriver driver;

    public SeatSelectionPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectSeat() {
        driver.findElement(By.id("SrvcSelectBtnForward0")).click();
        driver.findElement(By.xpath("/html/body/main/form/section/div/div[6]/div[3]/div/div/div[2]/div[4]/div/table/tbody/tr/td/div/div[1]/div[2]/div[1]/div/div[1]/div/div/div/ul[5]/li[7]/span")).click();
    }
}
