import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageHomeMTS {


    public WebDriver driver;

    public PageHomeMTS(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath = "//div[@class='col-12 col-xl-8']//h2[1]")
    private WebElement BlockTitleName;

    @FindBy(xpath = "//button[text()='Принять']")
    public WebElement acceptButton;

    @FindBy(xpath = "(//img[@alt='Visa'])[1]")
    public WebElement visaImage;

    @FindBy(xpath = "//img[@alt='Verified By Visa']")
    public WebElement visaImageVer;

    @FindBy(xpath = "//img[@src='/local/templates/new_design/assets/html/images/pages/index/pay/mastercard.svg']")
    public WebElement mastercardImage;

    @FindBy(xpath = "(//img[@alt='MasterCard Secure Code'])[1]")
    public WebElement mastercardSecureImage;

    @FindBy(xpath = "//img[@src='/local/templates/new_design/assets/html/images/pages/index/pay/belkart.svg']")
    public WebElement belImage;

    @FindBy(xpath = "(//a[contains(text(),'Подробнее о сервисе')])[1]")
    public WebElement detailsLink;

    @FindBy(xpath = "//input[@id='connection-phone']")
    public WebElement phoneField;

    @FindBy(xpath = "//input[@id='connection-sum']")
    public WebElement sumField;

    @FindBy(xpath = "//input[@id='connection-email']")
    public WebElement mailField;

    @FindBy(xpath = "(//button[@type='submit'][contains(text(),'Продолжить')])[1]")
    public WebElement nextButton;



    //public void clickAcceptButton() {
    //    acceptButton.click();
    //}

    //public boolean isVisaImagePresent() {
    //   return visaImage.isDisplayed();
    //}


    public WebElement getAcceptButton() {
        return acceptButton;
    }


    public String getHeaderText() {
        return BlockTitleName.getText().replace("\n", " ");
    }


    public boolean isVisaImagePresentForAll(WebElement element1) {
        return element1.isDisplayed();
    }

    public void clickControl(WebElement element1) {
        element1.click();
    }

    public void fillField(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }

}
