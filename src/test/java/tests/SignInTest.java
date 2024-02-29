package tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import static pages.BasePage.*;

public class SignInTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(SignInTest.class);


    @Test
    public void signIn() {


        LOG.info("Accept cookies");
        signInPage.setAcceptcookie();

        String email = "cristinaotel88@yahoo.com";
        String password = "parola";
        sleep(5000);

        LOG.info("Check 'Initiere Sesiune' button");
        Assert.assertTrue(signInPage.isinitiereSesiuneButton(), "Button is not displayed");


        LOG.info("Click 'Sign in' button");
        signInPage.clickInitiereSesiunebutton();

        LOG.info("Complete the fields");
        signInPage.typeInInitiereSesiuneEmailField(email);
        signInPage.typeInInitiereSesiunePasswordField(password);

        LOG.info("Click 'Initiere Sesiune' button");
        signInPage.clickInitiereSesiuneenter();


        LOG.info("Click 'Inregistrativa' button");
        signInPage.clickInregistrativa();
    }
}
