package Task2Package;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BusBookingTest {
    private WebDriver driver;
    private HomePage homePage;
    private PopularRoutesPage popularRoutesPage;
    private SeatSelectionPage seatSelectionPage;
    private PassengerDetailsPage passengerDetailsPage;
    private PaymentPage paymentPage;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1024, 768));
        homePage = new HomePage(driver);
        popularRoutesPage = new PopularRoutesPage(driver);
        seatSelectionPage = new SeatSelectionPage(driver);
        passengerDetailsPage = new PassengerDetailsPage(driver);
        paymentPage = new PaymentPage(driver);
    }

    @Test(priority = 1)
    public void bookBusTicket() {
        homePage.goTo();
        homePage.choosePopularRoutes();
        popularRoutesPage.selectRoute();
        popularRoutesPage.chooseArrivalDate();
        popularRoutesPage.searchForBus();
        seatSelectionPage.selectSeat();
        passengerDetailsPage.enterPassengerDetails();
        paymentPage.choosePaymentMethod();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
