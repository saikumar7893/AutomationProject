package pageobjects;

import Basetest.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class Homepage extends BaseClass {

    @FindBy(xpath="//*[@data-testid='filter-by-company']")
    WebElement dd_comapnytag;

    @FindBy(xpath = "//*[@data-testid='peoples-menu']")
    WebElement bu_clickcompany;

    public Homepage()
    {
        PageFactory.initElements(driver,this);
    }

    public  void CompanyHover() throws InterruptedException {
        Actions a=new Actions(driver);
        Thread.sleep(6000);
        a.moveToElement(dd_comapnytag).perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        bu_clickcompany.click();
    }


}
