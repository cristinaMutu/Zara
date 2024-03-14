package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.BasePage;
import pages.PrincipalButtonPage;
import pages.RegisterPage;
import pages.SignInPage.SignInPage;

public class BaseTest {

    public SignInPage signInPage = SignInPage.getInstance();
    public PrincipalButtonPage  principalButtonPage = PrincipalButtonPage.getInstance();
    public RegisterPage registerPage = RegisterPage.getInstance();


    @BeforeSuite
    public void init() {
        BasePage.setUp();
    }

    @AfterSuite
    public void tearDown() {
        BasePage.tearDown();
    }
}
