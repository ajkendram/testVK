import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class MainTest {

    private WebDriver driver;
    private PageHomeMTS pageHomeMTS;




    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
        pageHomeMTS = new PageHomeMTS(driver);

        driver.get("https://www.mts.by/");
        driver.manage().window().maximize();

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.elementToBeClickable(pageHomeMTS.getAcceptButton()));
            pageHomeMTS.clickControl(pageHomeMTS.acceptButton);
        } catch (Exception e) {
            System.out.println("Failed to click the accept button: " + e.getMessage());
        }
    }


    @Test
    public void testBlockName() {
        //Assert.assertEquals();
        //System.out.println("111111111111111");
        String expectedText = "Онлайн пополнение без комиссии";
        String actualText = pageHomeMTS.getHeaderText();
        assertEquals(expectedText, actualText);
    }


    @Test
    public void testIconVisa() {
        assertTrue(pageHomeMTS.isElementPresent(pageHomeMTS.visaImage), "No Visa");
    }

    @Test
    public void testIconAll() {

        //для упрощения все в одном тесте
        assertTrue(pageHomeMTS.isElementPresent(pageHomeMTS.mastercardImage), "No mastercardImage");
        assertTrue(pageHomeMTS.isElementPresent(pageHomeMTS.mastercardSecureImage), "No mastercardSecureImage");
        assertTrue(pageHomeMTS.isElementPresent(pageHomeMTS.belImage), "No belImage");
        assertTrue(pageHomeMTS.isElementPresent(pageHomeMTS.visaImageVer), "No visaImageVer");

    }


    @Test
    public void testDetailsLink() {
        String initialUrl = driver.getCurrentUrl();
        pageHomeMTS.clickControl(pageHomeMTS.detailsLink);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.not(ExpectedConditions.urlToBe(initialUrl)));

        String newUrl = driver.getCurrentUrl();
        assertTrue(!newUrl.equals(initialUrl), "The page URL should change");
    }



    @Test
    public void testNextButton() {

        pageHomeMTS.fillField(pageHomeMTS.phoneField, "297777777");
        pageHomeMTS.fillField(pageHomeMTS.sumField, "22");
        pageHomeMTS.fillField(pageHomeMTS.mailField, "slj@sdsd.ru");

        pageHomeMTS.clickControl(pageHomeMTS.nextButton);


        String initialUrl = driver.getCurrentUrl();
        pageHomeMTS.clickControl(pageHomeMTS.detailsLink);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.not(ExpectedConditions.urlToBe(initialUrl)));

        String newUrl = driver.getCurrentUrl();
        assertTrue(!newUrl.equals(initialUrl), "The page URL should change");
    }


    //16HW

    @Test
    public void testPlaceholders() {
        String expectedText = "Номер телефона";
        assertEquals(pageHomeMTS.getContainsText(pageHomeMTS.phonePlaceholder), expectedText, "The placeholder should contain the text 'phonePlaceholder'");


        String expectedTextSum = "Сумма";
        assertEquals(pageHomeMTS.getContainsText(pageHomeMTS.sumPlaceholder), expectedTextSum, "The placeholder should contain the text 'sumPlaceholder'");
        System.out.println("Placeholder!!!!!!!!!!!!!!!!!!:" +  pageHomeMTS.sumPlaceholder.getAttribute("placeholder"));




    }




    @AfterEach
    public void tearDown() {
            driver.quit();
    }

}