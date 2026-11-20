package base;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ConfigReader;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        if (Boolean.parseBoolean(ConfigReader.get("headless"))) {
            options.addArguments("--headless=new");
        }
        driver = new ChromeDriver(options);
        driver.get(ConfigReader.get("baseUrl"));
    }

    @AfterMethod
    public void tearDown(ITestResult result) throws Exception {
        if (result.getStatus() == ITestResult.FAILURE) {
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            Path dir = Path.of("screenshots");
            Files.createDirectories(dir);
            Files.copy(src.toPath(), dir.resolve(result.getName() + ".png"),
                    java.nio.file.StandardCopyOption.REPLACE_EXISTING);
        }
        if (driver != null) driver.quit();
    }

    protected String registerNewUser(String password) {
        String user = "rasvind" + System.currentTimeMillis();
        new pages.HomePage(driver).clickRegister();
        new pages.RegisterPage(driver).register(user, password);
        return user;
    }
}