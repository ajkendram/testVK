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



}
