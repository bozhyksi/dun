package configs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;

import java.util.HashMap;
import java.util.logging.Level;

import static com.codeborne.selenide.Configuration.timeout;
import static utils.configuration.rules.OutColors.ANSI_BLUE;

class DriverConfig {

    protected static WebDriver driver = null;
    private final int maxWaitTime = 15000;

    DriverConfig() {
        System.out.printf("%30s ", "|", ANSI_BLUE + "\n Drivers initiated \n");
    }

    public WebDriver getDriver() {
        if (driver == null) {
            return getChromeDriver();
        } else
            return driver;
    }

    private WebDriver getChromeDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--test-type");
        options.addArguments("--disable-notifications");
        HashMap<String, Object> chromePrefs = new HashMap<>();
        chromePrefs.put("profile.default_content_settings.popups", 1);
        chromePrefs.put("safebrowsing.enabled", true);
        LoggingPreferences logPrefs = new LoggingPreferences();
        logPrefs.enable(LogType.PERFORMANCE, Level.ALL);
        options.setExperimentalOption("prefs", chromePrefs);
        timeout = maxWaitTime;
        return driver = new ChromeDriver(options);
    }
}
