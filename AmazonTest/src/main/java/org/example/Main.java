package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import javax.swing.*;
import java.security.Key;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver d = new ChromeDriver();
        d.get("https://www.amazon.eg");

        d.manage().window().maximize();



        WebElement SearchBar = d.findElement(By.id("twotabsearchtextbox"));
        SearchBar.sendKeys("car accessories"+ Keys.ENTER);

        Thread.sleep(3000);

        WebElement FirstElement = d.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/span/div/div/div[2]/div[1]/h2/a/span"));
        Actions action = new Actions(d);
        action.moveToElement(FirstElement);
        action.perform();
        Thread.sleep(3000);
        FirstElement.click();

        Thread.sleep(3000);


        WebElement AddToCart = d.findElement(By.id("add-to-cart-button"));
        AddToCart.click();

        WebElement NavToCart = d.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/div/div[1]/span/span/a"));
        NavToCart.click();

        Boolean CartElement = d.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[4]/div/div[2]/div[1]/div/form/div[2]/div[3]/div[4]/div/div[2]/ul/li/span/a/span[1]/span/span[2]")).isDisplayed();
        System.out.println("CartElement Element displayed is :"+CartElement);


        d.quit();
    }
}