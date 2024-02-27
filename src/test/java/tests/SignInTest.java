package tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import static pages.BasePage.*;

public class SignInTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(SignInTest.class);


    @Test
    public void signIn() {


        String email = "cristinaotel88@yahoo.com";
        String password = "parola";
        sleep(5000);
        LOG.info("Click 'Sign in' button");
        signInPage.clickInitiereSesiunebutton();

        LOG.info("Complete the fields");
        signInPage.typeInInitiereSesiuneEmailField(email);
        signInPage.typeInInitiereSesiunePasswordField(password);

        LOG.info("Click 'Inregistrativa' button");
        signInPage.clickInregistrativa();
    }
}
