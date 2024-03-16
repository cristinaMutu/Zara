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

        LOG.info("Select Femei item");
        principalButtonPage.clickFemeiItem();
        sleep(2000);

        LOG.info("click Best Sellers");
        principalButtonPage.clickBestSellers();
        sleep(2000);

        LOG.info ("click Imagine Size");
        principalButtonPage.clickImageSize();

        sleep(3000);

        LOG.info("click Rochie Satinata");
        principalButtonPage.clickRochieSatinata();

        sleep(2000);

        LOG.info("click Marime");
        principalButtonPage.clickSelectMarime();
        sleep(2000);

        LOG.info("click 'Adaugare' button");
        principalButtonPage.clickAdaugareCos();

        sleep(2000);

        LOG.info("Navigate back");
        principalButtonPage.clickBack();

       // LOG.info("Click Out in Meniul Principal");
       // principalButtonPage.setClickOut();

        sleep(2000);

        LOG.info("click 'Cos' button");
        principalButtonPage.setClickCosButton();

        sleep(3000);

        LOG.info("is Produs in Cos");
        Assert.assertTrue(principalButtonPage.isVizualizareCosDisplayed(), "Produs is not displayed");
    }
}
