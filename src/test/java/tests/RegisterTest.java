package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RegisterPage;

public class RegisterTest extends BaseTest {

    @Test
    public void verifyNewUserRegistration() {
        String user = registerNewUser("Test@123");
        String title = new RegisterPage(driver).getTitle();
        Assert.assertTrue(title.contains("Welcome"), "Registration fail aachu: " + title);
    }
}