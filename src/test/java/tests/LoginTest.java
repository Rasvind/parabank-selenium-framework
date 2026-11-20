package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountsPage;
import pages.HomePage;

public class LoginTest extends BaseTest {

    @Test
    public void verifyInvalidLogin() {
        HomePage home = new HomePage(driver);
        home.login("wronguser", "wrongpass");
        Assert.assertTrue(home.getErrorMessage().contains("could not be verified"));
    }

    @Test
    public void verifyValidLogin() {
        String user = registerNewUser("Test@123");
        AccountsPage accounts = new AccountsPage(driver);
        accounts.logout();
        new HomePage(driver).login(user, "Test@123");
        Assert.assertEquals(accounts.getHeading(), "Accounts Overview");
    }
}