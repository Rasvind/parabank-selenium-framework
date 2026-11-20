package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private By username = By.name("username");
    private By password = By.name("password");
    private By loginBtn = By.cssSelector("input[value='Log In']");
    private By registerLink = By.linkText("Register");
    private By errorMsg = By.cssSelector("p.error");

    public HomePage(WebDriver driver) { super(driver); }

    public void login(String user, String pass) {
        type(username, user);
        type(password, pass);
        click(loginBtn);
    }

    public void clickRegister() { click(registerLink); }

    public String getErrorMessage() { return getText(errorMsg); }
}