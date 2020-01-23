package configs.verification;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

public interface Verification {

    void verifyText(String description, SelenideElement actual, String expected);

    void verifyEquals(String description, String actual, String expected);

    void verifyCondition(String description, SelenideElement actual, Condition expected);

}
