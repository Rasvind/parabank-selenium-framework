package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountsPage extends BasePage {
    public AccountsPage(WebDriver driver) { super(driver); }

    public void openAccountsOverview() { click(By.linkText("Accounts Overview")); }

    public void openTransferFunds() { click(By.linkText("Transfer Funds")); }

    public void logout() { click(By.linkText("Log Out")); }

    public String getHeading() { return getText(By.cssSelector("h1.title")); }
}