package configs.listeners;

import configs.PreparationForRun;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class CustomTestListener extends TestListenerAdapter {

    @Override
    public void onTestFailure(ITestResult result) {
        makeScreenshot(result);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        makeScreenshot(result);
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        makeScreenshot(result);
    }

//    @Attachment(value = "Page screenshot", type = "image/png")
//    private byte[] saveScreenshot(byte[] screenshot) {
//        return screenshot;
//    }

    @Attachment(type = "image/jpg")
    private byte[] makeScreenshot(ITestResult result) {
        Object currentClass = result.getInstance();
        WebDriver driver = ((PreparationForRun) currentClass).getDriver();
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}