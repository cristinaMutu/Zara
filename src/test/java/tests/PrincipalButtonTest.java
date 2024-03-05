package tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PrincipalButtonPage;
import static pages.BasePage.*;

public class PrincipalButtonTest extends BaseTest {

    public static final Logger LOG = LoggerFactory.getLogger(PrincipalButtonTest.class);

    @Test
    public void navigateButton() {


        LOG.info("Accept cookies");
        signInPage.setAcceptcookie();

        LOG.info("Check Principal button");
        Assert.assertTrue(principalButtonPage.isPrincipalButton(), "Button is not displayed");

        LOG.info("Click Principal button");
        principalButtonPage.clickPrincipalButton();

        sleep(3000);


    }
}
