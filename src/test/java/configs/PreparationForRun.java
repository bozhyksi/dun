package configs;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.configuration.fields.Fields;

import static com.codeborne.selenide.Selenide.open;

public class PreparationForRun extends DriverConfig {

    private String DemoSTAGE = "http://dunamis.demo.byteant.com/login";
    private String usernameDemoSTAGE = "//";
    private String passwordDemoSTAGE = "//";


    private String DemoTEST = "http://dunamistest.demo.byteant.com/login";
    private String usernameDemoTEST = "dev@byteant.com";
    private String passwordDemoTEST = "Instance@1";


    public String getUsername(String env) {
        if (env.equals("TEST"))
            return usernameDemoTEST;
        else if (env.equals("STAGE"))
            return usernameDemoSTAGE;
        else return null;
    }

    public String getPassword(String env) {
        if (env.equals("TEST"))
            return passwordDemoTEST;
        else if (env.equals("STAGE"))
            return passwordDemoSTAGE;
        else return null;
    }

    protected String getBaseURL(String Environment) {
        if (Environment.equals("TEST"))
            return DemoTEST;
        else if (Environment.equals("STAGE"))
            return DemoSTAGE;
        else
            return null;
    }

    @BeforeMethod(alwaysRun=true ,description = "Configure browser and start")
    public void beforeMethod() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));
        Configuration.timeout = 15000;

        if (driver == null) {
            WebDriverRunner.setWebDriver(getDriver());
            open(getBaseURL("TEST"));
        }
    }

    @AfterMethod(alwaysRun=true, description = "Close browser")
    public void afterMethod() {
        if (driver != null) {
            WebDriverRunner.getWebDriver().quit();
            driver = null;
        } else {
            WebDriverRunner.getWebDriver().quit();
        }
    }

    public void OpenWebSite(String env) {
        open(getBaseURL(env));
    }
}
