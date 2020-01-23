package configs.verification;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;

import static com.codeborne.selenide.Condition.*;
import static io.qameta.allure.Allure.description;
import static utils.configuration.rules.OutColors.*;

/**
 * Created by Sacred on 16.10.2016.
 */
public class Verifier implements Verification {


    private void output(String description, String actual, String expected) {
        description(description);
        String format = "|%1$-50s|%2$-50s|\n";
        System.out.println(ANSI_BLUE + description);
        System.out.printf(format, ANSI_RED + "Actual", ANSI_GREEN + "Expected");
        System.out.println();
        System.out.format(format, ANSI_RED + actual.replaceAll("\n", " ").trim(), ANSI_GREEN + expected.replaceAll(".{50}", "$0\n"));
        System.out.println(ANSI_RESET);
    }

    public void verifyText(String description, SelenideElement actual, String expected) {
        if (!actual.getText().trim().equals(expected.trim())) {
            output(description, actual.getText(), expected);
        } else {
            output(description, actual.getText(), expected);
        }
        Assert.assertEquals(actual.getText(), expected);
    }

    public void verifyEquals(String description, String actual, String expected) {
        if (!actual.trim().equals(expected.trim())) {
            System.out.println("Not equals");
            output(description, actual, expected);
        } else {
            System.out.println("Equals");
            output(description, actual, expected);
        }
        Assert.assertEquals(actual, expected);
    }

    public void verifyCondition(String description, SelenideElement actual, Condition expected) {
        description(description);
        System.out.println(ANSI_CYAN + description + "\nhas condition " + ANSI_RED + expected.toString().toUpperCase() + ANSI_RESET);
        actual.shouldBe(expected);
    }

    public void containsText(String description, SelenideElement actual, String expected) {
        if (!actual.getText().trim().equals(expected.trim())) {
            output(description, actual.getText(), expected);
        } else {
            output(description, actual.getText(), expected);
        }
        actual.shouldHave(text(expected));
    }

    public void VerifyEachElementInCollection(String description, ElementsCollection collection, String expected) {
        description(description);
        System.out.println(ANSI_CYAN + description + "\nhas condition " + ANSI_RED + expected.toString().toUpperCase() + ANSI_RESET);
        for (SelenideElement actual : collection) {
            actual.shouldHave(text(expected));
        }
    }
}
