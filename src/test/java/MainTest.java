import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
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
    private PagePopupService pagePopupService;



    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
        pageHomeMTS = new PageHomeMTS(driver);
        pagePopupService = new PagePopupService(driver);

        driver.get("https://www.mts.by/");
        driver.manage().window().maximize();

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
            wait.until(ExpectedConditions.elementToBeClickable(pageHomeMTS.getAcceptButton()));

            pageHomeMTS.clickControl(pageHomeMTS.acceptButton);
        } catch (Exception e) {
            System.out.println("Failed to click the accept button: " + e.getMessage());
        }

        Actions actions = new Actions(driver);
        actions.moveToElement(pageHomeMTS.acceptButton).perform();

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
    public void testPlaceholdersService() {
        String expectedText = "Номер телефона";
        assertEquals(expectedText,  pageHomeMTS.getContainsText(pageHomeMTS.phonePlaceholder),  "The placeholder should contain the text 'phonePlaceholder'");

        String expectedTextSum = "Сумма";
        assertEquals(expectedTextSum, pageHomeMTS.getContainsText(pageHomeMTS.sumPlaceholder),"The placeholder should contain the text 'sumPlaceholder'");
        System.out.println("Placeholder!!!!!!!!!!!!!!!!!!:" +  pageHomeMTS.sumPlaceholder.getAttribute("placeholder"));

        String expectedTextMail = "E-mail для отправки чека";
        assertEquals(expectedTextMail, pageHomeMTS.getContainsText(pageHomeMTS.mailPlaceholder), "The placeholder should contain the text 'expectedTextMail'");
        System.out.println("Placeholder!!!!!!!!!!!!!!!!!!:" +  pageHomeMTS.mailPlaceholder.getAttribute("placeholder"));

    }



    @Test
    public void testPlaceholdersHomeInet() {


        pageHomeMTS.clickControl(pageHomeMTS.dropdownArrow);
        pageHomeMTS.clickControl(pageHomeMTS.dropdownHomeInet);


        String expectedText = "Номер абонента";
        assertEquals(expectedText, pageHomeMTS.getContainsText(pageHomeMTS.phoneAbonent), "The placeholder should contain the text 'phoneAbonent'");

        String expectedTextSum = "Сумма";
        assertEquals(expectedTextSum, pageHomeMTS.getContainsText(pageHomeMTS.sumPlaceholder), "The placeholder should contain the text 'sumPlaceholder'");
       // System.out.println("Placeholder!!!!!!!!!!!!!!!!!!:" +  pageHomeMTS.sumPlaceholder.getAttribute("placeholder"));

        String expectedTextMail = "E-mail для отправки чека";
        assertEquals(expectedTextMail, pageHomeMTS.getContainsText(pageHomeMTS.mailPlaceholder), "The placeholder should contain the text 'expectedTextMail'");
       // System.out.println("Placeholder!!!!!!!!!!!!!!!!!!:" +  pageHomeMTS.mailPlaceholder.getAttribute("placeholder"));
    }


    @Test
    public void testPlaceholdersInstallment() {


        pageHomeMTS.clickControl(pageHomeMTS.dropdownArrow);
        pageHomeMTS.clickControl(pageHomeMTS.dropdownInstallment);


        String expectedText = "Номер счета на 44";
        assertEquals(expectedText, pageHomeMTS.getContainsText(pageHomeMTS.accNumber), "The placeholder should contain the text 'accNumber'");

        String expectedTextSum = "Сумма";
        assertEquals(expectedTextSum, pageHomeMTS.getContainsText(pageHomeMTS.sumPlaceholder), "The placeholder should contain the text 'sumPlaceholder'");
        // System.out.println("Placeholder!!!!!!!!!!!!!!!!!!:" +  pageHomeMTS.sumPlaceholder.getAttribute("placeholder"));

        String expectedTextMail = "E-mail для отправки чека";
        assertEquals(expectedTextMail, pageHomeMTS.getContainsText(pageHomeMTS.mailPlaceholder), "The placeholder should contain the text 'expectedTextMail'");
        // System.out.println("Placeholder!!!!!!!!!!!!!!!!!!:" +  pageHomeMTS.mailPlaceholder.getAttribute("placeholder"));
    }


    @Test
    public void testPlaceholdersDebt() {


        pageHomeMTS.clickControl(pageHomeMTS.dropdownArrow);
        pageHomeMTS.clickControl(pageHomeMTS.dropdownDebt);


        String expectedText = "Номер счета на 2073";
        assertEquals(expectedText, pageHomeMTS.getContainsText(pageHomeMTS.accNumberDebt), "The placeholder should contain the text 'dropdownDebt'");

        String expectedTextSum = "Сумма";
        assertEquals(expectedTextSum, pageHomeMTS.getContainsText(pageHomeMTS.sumPlaceholder), "The placeholder should contain the text 'sumPlaceholder'");
        // System.out.println("Placeholder!!!!!!!!!!!!!!!!!!:" +  pageHomeMTS.sumPlaceholder.getAttribute("placeholder"));

        String expectedTextMail = "E-mail для отправки чека";
        assertEquals(expectedTextMail, pageHomeMTS.getContainsText(pageHomeMTS.mailPlaceholder), "The placeholder should contain the text 'expectedTextMail'");
        // System.out.println("Placeholder!!!!!!!!!!!!!!!!!!:" +  pageHomeMTS.mailPlaceholder.getAttribute("placeholder"));
    }



    @Test
    public void testServiceSummHeader() {

        pageHomeMTS.fillField(pageHomeMTS.phoneField, "297777777");
        pageHomeMTS.fillField(pageHomeMTS.sumField, "22");
        pageHomeMTS.fillField(pageHomeMTS.mailField, "slj@sdsd.ru");

        pageHomeMTS.clickControl(pageHomeMTS.nextButton);

        //driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@data-tagging-id='G-7C99PNNT06']")));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className("bepaid-iframe")));

        //driver.switchTo().frame(driver.findElement(By.className("bepaid-iframe")));

        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement element = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(), 'BYN')]")));

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!SumHeaderPopup: " + pageHomeMTS.getTextFromElement(pagePopupService.SumHeaderPopupCSS));


        String expectedText = "22.00 BYN";
        assertEquals(expectedText, pageHomeMTS.getTextFromElement(pagePopupService.SumHeaderPopupCSS), "The placeholder should contain the text 'expectedText'");

        //assertEquals(expectedText, pageHomeMTS.getContainsText(pagePopupService.SumHeaderPopup), "The placeholder should contain the text 'expectedText'");

        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement element1 = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@_ngcontent-dhv-c64 and contains(@class, 'disabled') and contains(text(), 'BYN')]")));

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!SumHeaderPopup: " + pageHomeMTS.getTextFromElement(pagePopupService.ButtonPay1));



    }



    @AfterEach
    public void tearDown() {
            driver.quit();
    }

}