package pages;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrincipalButtonPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(PrincipalButtonPage.class);
    public static PrincipalButtonPage instance;

    private PrincipalButtonPage() {
    }

    public static PrincipalButtonPage getInstance() {
        if (instance == null) {
            instance = new PrincipalButtonPage();
        }
        return instance;
    }

    private static By PrincipalButton = By.xpath("//button[@data-qa-id='layout-header-toggle-menu']");

    public static boolean isPrincipalButton() {
        LOG.info("Principal button is displayed");
        return driver.findElement(PrincipalButton).isDisplayed();
    }

    public void clickPrincipalButton() {
        LOG.info("Click Principal button");
        driver.findElement(PrincipalButton).click();
    }


}




