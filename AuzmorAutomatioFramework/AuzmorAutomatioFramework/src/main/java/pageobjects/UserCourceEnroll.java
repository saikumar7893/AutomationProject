package pageobjects;

import Basetest.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserCourceEnroll extends BaseClass {

    @FindBy(xpath = "//*[@data-testid='buy-now']")
    WebElement buy;

    @FindBy(xpath = "//*[@data-testid='checkout-btn']")
    WebElement checkout;

    public UserCourceEnroll()
    {
        PageFactory.initElements(driver,this);
    }
    public void buycource()
    {
    buy.click();
    checkout.click();
    }
}
