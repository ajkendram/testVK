import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PagePopupService {
    public WebDriver driver;



    public PagePopupService(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath = "//span[contains(text(), 'BYN')]")
    public WebElement SumHeaderPopup;


    @FindBy(css = "div[class='pay-description__cost'] span:nth-child(1)")
    public WebElement SumHeaderPopupCSS;

    @FindBy(xpath = "(//button[contains(text(),'22.00 BYN')])[1]")
    public WebElement ButtonPayXpath;

    @FindBy(css = "//button[@_ngcontent-dhv-c64 and contains(@class, 'disabled') and contains(text(), 'BYN')]")
    public WebElement ButtonPay1;

    @FindBy(xpath =  "//input[@id='cc-number']")
    public WebElement CartNumberField;

    @FindBy(xpath =  "//input[@placeholder='MM / YY']")
    public WebElement yymmField;

    @FindBy(xpath =  "//input[@name='verification_value']")
    public WebElement csvField;

    @FindBy(xpath =  "//input[contains(@_ngcontent-rfl-c61, '') and @formcontrolname='holder']")
    public WebElement nameField;




}
