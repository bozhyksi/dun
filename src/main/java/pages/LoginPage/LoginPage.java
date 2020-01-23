package pages.LoginPage;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import utils.configuration.fields.Fields;

public class LoginPage extends Fields
{
    @Step
    public SelenideElement EmailAddressField()
    {
        return field("EmailAddressInputLocator");
    }

    @Step
    public SelenideElement PasswordField()
    {
        return field("PasswordInputLocator");
    }

    @Step
    public SelenideElement HomePageButton()
    {
        return field("HomePageButtonLocator");
    }

    @Step
    public SelenideElement ContinueButton()
    {
        return field("ContinueButtonLocator");
    }

    @Step
    public SelenideElement ForgotPasswordButton()
    {
        return field("ForgotPasswordButtonLocator");
    }

    @Step
    public SelenideElement SignUpButton()
    {
        return field("SignUpButtonLocator");
    }

    @Step
    public SelenideElement RemamberMeCheckbox()
    {
        return field("RemamberMeCheckboxLocator");
    }

}
