package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverUtils;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(WebDriverUtils.getDriver(),this);
    }

    @FindBy (xpath = "//div[@class='u-column1 col-1']")
    public WebElement loginLogo;
}

