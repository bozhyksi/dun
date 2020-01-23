package utils.configuration.screen;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

/**
 * Created by Home on 10/18/17.
 */
public class Screener {

    private String USERHOME = System.getProperty("user.home");
    private String FOLDER = "SetupScreens";
    private String RESULT_FILENAME = "";

    /**
     * Take screen.
     */
    public void takeScreen() {
        RESULT_FILENAME = generateRandom(10);
        File scrFile = ((TakesScreenshot) getWebDriver()).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File(USERHOME + "\\" + FOLDER + "\\" + RESULT_FILENAME + ".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }

    /**
     * Generate random string.
     *
     * @param length the length
     * @return the string
     */
    public String generateRandom(int length) {
        Random random = new Random();
        char[] digits = new char[length];
        digits[0] = (char) (random.nextInt(9) + '1');
        for (int i = 1; i < length; i++) {
            digits[i] = (char) (random.nextInt(10) + '0');
        }
        return new String(digits);
    }
}
