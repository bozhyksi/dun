package TestCases.LoginPageTest;

import com.codeborne.selenide.Condition;
import BaseMethods.BaseMethods;
import com.google.common.base.Supplier;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.LoginPage.LoginPage;
import pages.MCadminHomePage.MCadminHomePage;

import static com.codeborne.selenide.Condition.text;
import static io.qameta.allure.Allure.step;
import static pages.MCadminHomePage.MCadminHomePage.MenuButton.Suppliers;

public class LoginPageTest extends BaseMethods
{
    @Test(groups = {"Regression", "Smoke", "LogInPageSuit"})
    @Description("Verify if user is able to LogIn with valid credentials")
    public void VerifyIfUserIsAbleLogInWithValidCredentials() {

        loginPage.EmailAddressField().setValue("dev@byteant.com");
        loginPage.PasswordField().setValue("Instance@1");
        loginPage.HomePageButton().click();
        mcadminhomePage.MainMenu().shouldBe(Condition.visible);
    }

    @Test(groups = {"Regression", "Smoke", "LogInPageSuit"})
    @Description("Verify if user is NOT able to LogIn with invalid credentials")
    public void VerifyIfUserIsNotAbleLogInWithInvalidCredentials() {
        loginPage.EmailAddressField().setValue("IncorrectLogin@aa.ss");
        loginPage.PasswordField().setValue("IncorrectPassword");
        loginPage.HomePageButton().click();
        //validation
        loginPage.EmailAddressField().shouldBe(Condition.visible);
        loginPage.PasswordField().shouldBe(Condition.visible);
        loginPage.HomePageButton().shouldBe(Condition.visible);
    }

    @Test(groups = {"Regression", "Smoke", "LogInPageSuit"})
    @Description("Verify if user is NOT able to LogIn with empty credentials")
    public void VerifyIfUserIsNotAbleLogInWithEmptyCredentials() {
        loginPage.EmailAddressField().setValue("   ");
        loginPage.PasswordField().setValue("");
        loginPage.HomePageButton().click();
        //validation
        loginPage.EmailAddressField().shouldBe(Condition.visible);
        loginPage.PasswordField().shouldBe(Condition.visible);
        loginPage.HomePageButton().shouldBe(Condition.visible);
    }

    @Test(groups = {"Regression", "Smoke", "LogInPageSuit"})
    @Description("Verify Continue button")
    public void VerifyContinuebutton() {

        step("Log in and navigate to Supplier page");
        loginPage.EmailAddressField().setValue("dev@byteant.com");
        loginPage.PasswordField().setValue("Instance@1");
        loginPage.HomePageButton().click();
        mcadminhomePage.MainMenu().shouldBe(Condition.visible);
        mcadminhomePage.MenuButton(Suppliers).click();
        mcadminSuppliersPage.SupplierPageTitle().shouldBe(text("Suppliers"));

        step("Log Out");
        mcadminhomePage.LogOutDropDown().click();
        mcadminhomePage.SignOutButton().click();
        loginPage.EmailAddressField().shouldBe(Condition.visible);
        loginPage.PasswordField().shouldBe(Condition.visible);
        loginPage.HomePageButton().shouldBe(Condition.visible);

        step("Login vai Continue Button");
        loginPage.EmailAddressField().setValue("dev@byteant.com");
        loginPage.PasswordField().setValue("Instance@1");
        loginPage.ContinueButton().click();
        mcadminSuppliersPage.SupplierPageTitle().shouldBe(text("Suppliers"));
    }

}
