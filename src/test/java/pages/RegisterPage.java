package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage {
    public RegisterPage(WebDriver driver) { super(driver); }

    public void register(String user, String pass) {
        type(By.id("customer.firstName"), "Rasvind");
        type(By.id("customer.lastName"), "Sahaya");
        type(By.id("customer.address.street"), "12 Anna Salai");
        type(By.id("customer.address.city"), "Chennai");
        type(By.id("customer.address.state"), "Tamil Nadu");
        type(By.id("customer.address.zipCode"), "600001");
        type(By.id("customer.phoneNumber"), "9876543210");
        type(By.id("customer.ssn"), "123456");
        type(By.id("customer.username"), user);
        type(By.id("customer.password"), pass);
        type(By.id("repeatedPassword"), pass);
        click(By.cssSelector("input[value='Register']"));
    }

    public String getTitle() { return getText(By.cssSelector("h1.title")); }
}