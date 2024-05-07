package Task2Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.*;

public class PassengerDetailsPage {
    private WebDriver driver;

    public PassengerDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterPassengerDetails() {
        driver.findElement(By.id("Forwardprofile-tab")).click();
        driver.findElement(By.id("mobileNo")).sendKeys("6789125987");
        driver.findElement(By.id("email")).sendKeys("enge.samaan@gmail.com");
        driver.findElement(By.id("passengerNameForward0")).sendKeys("john");

        WebElement genderElement = driver.findElement(By.xpath("/html/body/main/form/section/div/div[6]/div[3]/div/div/div[2]/div[4]/div/table/tbody/tr/td/div/div[1]/div[2]/div[3]/div/div/div/div/div[1]/div/div[2]/div[2]/select"));
        Select selectGender = new Select(genderElement);
        selectGender.selectByVisibleText("MALE");

        driver.findElement(By.id("passengerAgeForward0")).sendKeys("24");

        WebElement concessionElement = driver.findElement(By.xpath("/html/body/main/form/section/div/div[6]/div[3]/div/div/div[2]/div[4]/div/table/tbody/tr/td/div/div[1]/div[2]/div[3]/div/div/div/div/div[1]/div/div[2]/div[5]/select"));
        Select selectConcession = new Select(concessionElement);
        selectConcession.selectByVisibleText("GENERAL PUBLIC");

        driver.findElement(By.id("termsChk")).click();
        driver.findElement(By.id("PgBtn")).click();

    }
}
