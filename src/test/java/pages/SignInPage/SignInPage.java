package pages.SignInPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SignInPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SignInPage.class);
    public static SignInPage instance;

    private SignInPage() {
    }

    public static SignInPage getInstance() {
        if (instance == null) {
            instance = new SignInPage();
        }
        return instance;
    }

    private By acceptcookie = By.id("onetrust-accept-btn-handler");
    private By initiereSesiuneButton = By.xpath("//a[@data-qa-id='header-logon-link']");
    private By enterEmail = By.xpath("//input[@name='logonId']");
    private By enterPassword = By.xpath("//input[@name='password']");
    private By initiereSesiuneenter = By.xpath("//button[@data-qa-action='logon-form-submit']");



    public void setAcceptcookie(){
        LOG.info("Click the accept button");
        driver.findElement(acceptcookie).click();
    }

    public boolean initiereSesiuneButton() {
        LOG.info("Initiere Sesiune' button is displayed");
        return driver.findElement(initiereSesiuneButton).isDisplayed();
    }

    public void clickInitiereSesiunebutton() {
        LOG.info("Click 'Initiere sesiune' button");
        driver.findElement(initiereSesiuneButton).click();
    }

    public void typeInInitiereSesiuneEmailField(String email) {
        LOG.info("Typing email address in 'E mail' field");
        driver.findElement(enterEmail).sendKeys(email);
    }

    public void typeInInitiereSesiunePasswordField(String password) {
        LOG.info("Typing password in 'Password' field");
        driver.findElement(enterPassword).sendKeys(password);
    }

    public void clickInitiereSesiuneenter(){
        LOG.info("Click 'Initiere sesiune' button");
        driver.findElement(initiereSesiuneenter).click();

    }




}
