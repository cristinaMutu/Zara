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
    private static By SelectFemeiItem = By.xpath("//a[@data-qa-action='unfold-category']//span");
    private static By SelectBestSellers = By.xpath("//a[@data-qa-action='unfold-category']/span[text()='best sellers']");
    private static By selectImageSize = By.xpath("//button[@data-qa-action='view-option-selector-button'][2]");
    private static By SelectRochieSatinata = By.xpath("//a[@data-qa-action='product-click']/h2[contains(text(),'ROCHIE MINI')]");
    private static By SelectMarime = By.xpath("//div[text()='XS']");
    private static By AdaugareCos = By.xpath("//button[@data-qa-action='add-to-cart']");
    private static By clickCosButton = By.xpath("//a[@data-qa-id='layout-header-go-to-cart']/span");
    private static By vizualizareCos = By.xpath("//div[text()='ROCHIE MINI SATINATĂ CU IMPRIMEU']");


    public static boolean isPrincipalButton() {
        LOG.info("Principal button is displayed");
        return driver.findElement(PrincipalButton).isDisplayed();
    }

    public void clickPrincipalButton() {
        LOG.info("Click Principal button");
        driver.findElement(PrincipalButton).click();
    }

    public void clickFemeiItem() {
        LOG.info("Select Femei item");
        driver.findElement(SelectFemeiItem).click();
    }

    public void clickBestSellers() {
        LOG.info("Click Best Sellers");
        driver.findElement(SelectBestSellers).click();
    }

    public void clickImageSize() {
        LOG.info("Slect Image size");
        driver.findElement(selectImageSize).click();
    }

    public void clickRochieSatinata() {
        LOG.info("Click Rochie Satinata");
        driver.findElement(SelectRochieSatinata).click();
    }

    public void clickSelectMarime() {
        LOG.info("Click Marime");
        driver.findElement(SelectMarime).click();
    }

    public void clickAdaugareCos() {
        LOG.info("Click 'Adaugare' button");
        driver.findElement(AdaugareCos).click();
    }

    public void clickBack() {
        LOG.info("Click back in broswer");
        driver.navigate().back();
    }

    public void setClickCosButton() {
        LOG.info("Click 'Cos' button");
        driver.findElement(clickCosButton).click();
    }

    public boolean isVizualizareCosDisplayed() {
        LOG.info("Is produs in Cos");
        return driver.findElement(vizualizareCos).isDisplayed();
    }


}




