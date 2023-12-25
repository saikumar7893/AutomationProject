package Pageobjectas;

import Basetest.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Userlogin extends BaseClass {


    @FindBy(xpath = "//*[@type='text']")
    WebElement txt_username;
    @FindBy(xpath = "//*[@type='password']")
    WebElement txt_password;

    @FindBy(xpath = "//*[@data-testid='login-submit-btn']")
    WebElement signinButoon;
    public Userlogin(){
        PageFactory.initElements(driver,this);
    }
    public void signinpage()
    {
        txt_username.sendKeys("saikumarkolli7372@gmail.com");
        txt_password.sendKeys("Saikumar@123");
        signinButoon.click();

    }
}
