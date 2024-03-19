package tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import static pages.BasePage.sleep;

public class RegisterTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterTest.class);

    @Test
    public void registerTest() {

        String email = "cristinaotel88@yahoo.com";
        String password = "Parola.123";
        String nume = "Cristina";
        String numeF = "Mutu";
        String prefix = "40";
        String telefon = "743086746";

        LOG.info("Accept cookies");
        signInPage.setAcceptcookie();

        LOG.info("Check 'Initiere Sesiune' button");
        Assert.assertTrue(signInPage.initiereSesiuneButton(), "Button is not displayed");

        LOG.info("Click 'Sign in' button");
        signInPage.clickInitiereSesiunebutton();

        sleep(5000);


        LOG.info("Click 'Inregistrativa' button");
        registerPage.clickInregistrativaButton();

        sleep(3000);

        LOG.info("Typing email address in 'E mail' field");
        registerPage.typeInEmailField(email);
        registerPage.typeInPasswordField(password);

        LOG.info("Typing Nume");
        registerPage.typeInNumeField(nume);
        registerPage.typeInNumeFamilieField(numeF);
    //    registerPage.typeInPrefixField(prefix);
        registerPage.typeInTelefonField(telefon);

        sleep(3000);


        LOG.info("Accept politica");
        registerPage.clickOnAcceptCheckBox();
        registerPage.setCreareCont();

        sleep (5000);


    }
}
