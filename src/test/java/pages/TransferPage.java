package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TransferPage extends BasePage {
    public TransferPage(WebDriver driver) { super(driver); }

    public void transfer(String amount) {
        // account dropdown ajax la load aagum, so wait panrom
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(
                By.cssSelector("#fromAccountId option"), 0));
        type(By.id("amount"), amount);
        click(By.cssSelector("input[value='Transfer']"));
    }

    public String getResultTitle() {
        return getText(By.cssSelector("#showResult .title"));
    }
}