package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RegisterPage extends BasePage {

    public static final Logger LOG = LoggerFactory.getLogger(RegisterPage.class);
    public static RegisterPage instance;

    private RegisterPage() {
    }

    public static RegisterPage getInstance() {
        if (instance == null) {
            instance = new RegisterPage();
        }
        return instance;
    }

    private static By Inregistrativa = By.xpath("//button[@data-qa-action='logon-view-alternate-button']//span");
    private static By enterEmail = By.xpath("//input[@name='email']");
    private static By enterPassword = By.xpath("//input[@data-qa-input-qualifier='password']");
    private static By enterNume = By.xpath("//input[@data-qa-input-qualifier='firstName']");
    private static By enterNumeFamilie = By.xpath("//input[@data-qa-input-qualifier='lastName']");
    // private static By enterPrefix = By.xpath("//input[@name='phone.prefix']");
    private static By enterTelefon = By.xpath("//input[@type='tel']");
    private static By acceptPolitica = By.xpath("//div[@data-name='privacyCheck']//span[@class='zds-checkbox-control']");
    private static By creareCont = By.xpath("//button[@role='button']");


    public void clickInregistrativaButton() {
        LOG.info("Click Inregistrativa button");
        driver.findElement(Inregistrativa).click();
    }

    public void typeInEmailField(String email) {
        LOG.info("Typing email address in 'E mail' field");
        driver.findElement(enterEmail).sendKeys(email);
    }

    public void typeInPasswordField(String password) {
        LOG.info("Typing Password in 'Password' field");
        driver.findElement(enterPassword).sendKeys(password);
    }

    public void typeInNumeField(String nume) {
        LOG.info("Typing Nume in 'Nume' field");
        driver.findElement(enterNume).sendKeys(nume);
    }

    public void typeInNumeFamilieField(String numeF) {
        LOG.info("Typing NumeFamilie in 'NumeFamilie' field");
        driver.findElement(enterNumeFamilie).sendKeys(numeF);
    }

    // public void typeInPrefixField(String prefix) {
    //   LOG.info("Typing Prefix in 'Prefix' field");
    //  driver.findElement(enterPrefix).sendKeys(prefix);
    //}

    public void typeInTelefonField(String telefon) {
        LOG.info("Typing Telefon in 'Telefon' field");
        driver.findElement(enterTelefon).sendKeys(telefon);
    }

    public void clickOnAcceptCheckBox() {
        LOG.info("Click on Accept Check Box");
        WebElement element = driver.findElement(acceptPolitica);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
    }

    public void setAcceptPolitica() {
        LOG.info("Click accept");
        driver.findElement(acceptPolitica).click();
    }

    public void setCreareCont() {
        LOG.info("Click creare cont");
        driver.findElement(creareCont).click();
    }

}
