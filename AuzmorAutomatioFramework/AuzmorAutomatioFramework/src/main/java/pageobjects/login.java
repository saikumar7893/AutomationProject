package pageobjects;

import Basetest.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Basetest.BaseClass.driver;

public class login extends BaseClass {
    @FindBy(xpath = "//*[@type='text']")
    WebElement txt_username;
    @FindBy(xpath = "//*[@type='password']")
    WebElement txt_password;

    @FindBy(xpath = "//*[@data-testid='login-submit-btn']")
    WebElement signinButoon;

    public login()
    {
        PageFactory.initElements(driver,this);
    }


    public void signIn()
    {
        txt_username.sendKeys("utaorg1ad1@mailinator.com");
        txt_password.sendKeys("Test@123");
        signinButoon.click();

    }
}
