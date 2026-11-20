package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountsPage;
import pages.TransferPage;

public class TransferTest extends BaseTest {

    @Test
    public void verifyFundTransfer() {
        registerNewUser("Test@123");
        new AccountsPage(driver).openTransferFunds();
        TransferPage transfer = new TransferPage(driver);
        transfer.transfer("100");
        Assert.assertEquals(transfer.getResultTitle(), "Transfer Complete!");
    }
}