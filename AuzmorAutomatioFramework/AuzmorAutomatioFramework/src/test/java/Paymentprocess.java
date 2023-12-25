import Basetest.BaseClass;
import Pageobjectas.Userlogin;
import pageobjects.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Paymentprocess extends BaseClass {

    @BeforeMethod
    public void sign() throws Exception {

        launchBrowser();
        //User Login Page
        Userlogin ul=new Userlogin();
        ul.signinpage();
        //UserHomePage
        UserHomePage uhp=new UserHomePage();
        uhp.trainPage();
        //UserTrainingPage
        TrainingPage tp=new TrainingPage();
        tp.selectCource();
        //Register the Cource
        UserCourceEnroll enrol=new UserCourceEnroll();
        enrol.buycource();
        //Proceed in cart
        UserConfirmPayment pay=new UserConfirmPayment();
        pay.paymentproceed();
        //SessiomPaymment
        UserSession us=new UserSession();
        us.checkelements();




//        Company cp=new Company();
//        cp.click_add();
//        Invitation invite=new Invitation();
//        invite.Filldetails();
    }
    @Test
    public void SendInvitationMail()
    {

        System.out.println(driver.getCurrentUrl());
    }


}
