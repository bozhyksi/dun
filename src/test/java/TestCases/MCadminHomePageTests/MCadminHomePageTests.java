package TestCases.MCadminHomePageTests;
import BaseMethods.BaseMethods;
import com.codeborne.selenide.Condition;
import jdk.jfr.Description;
import org.testng.annotations.Test;
import pages.MCadminHomePage.*;
import java.util.Map;

import static pages.MCadminHomePage.MCadminHomePage.MenuButton.*;

public class MCadminHomePageTests extends BaseMethods
{
    @Test(groups = {"MCadminHomePageTests","Regression", "Smoke"})
    @Description("Verify if MCadmin is able to navigate to every menu tab")
    public void VerifyIfMCadminIsAbleNavigateEveryMenuTab()    {
        Login("TEST");

        mcadminhomePage.MenuButton(Dashboard).click();
        mcadminhomePage.PageTitle().shouldHave(Condition.text("Dashboard"));

        mcadminhomePage.MenuButton(Branches).click();
        mcadminhomePage.PageTitle().shouldHave(Condition.text("Branches"));

        mcadminhomePage.MenuButton(Users).click();
        mcadminhomePage.PageTitle().shouldHave(Condition.text("Users"));

        mcadminhomePage.MenuButton(Suppliers).click();
        mcadminhomePage.PageTitle().shouldHave(Condition.text("Suppliers"));

        mcadminhomePage.MenuButton(Equipment).click();
        mcadminhomePage.PageTitle().shouldHave(Condition.text("Equipment"));

        mcadminhomePage.MenuButton(Services).click();
        mcadminhomePage.PageTitle().shouldHave(Condition.text("Services"));

        mcadminhomePage.MenuButton(Settings).click();
        mcadminhomePage.PageTitle().shouldHave(Condition.text("Management Company Settings"));
    }

    @Test(groups = {"MCadminHomePageTests","Regression", "Smoke"})
    @Description("Verify if MCadmin is able to LogOut")
    public void VerifyIfMCadminIsAbleToLogOut() {

        Login("TEST");
        mcadminhomePage.AccountButton().click();
        mcadminhomePage.LogOutDropDown().shouldHave(Condition.text(" Sign Out")).click();
        //verification
        loginPage.EmailAddressField().shouldBe(Condition.visible);
        loginPage.PasswordField().shouldBe(Condition.visible);
        loginPage.HomePageButton().shouldBe(Condition.visible);
    }
}
