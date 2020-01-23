package TestCases.MCadminUsersPageTests;

import BaseMethods.BaseMethods;
import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.google.inject.Key;
import jdk.jfr.Description;
import org.testng.annotations.Test;
import pages.MCadminHomePage.MCadminHomePage;
import pages.MCadminUsers.UsersList.UsersList;

import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static pages.MCadminHomePage.MCadminHomePage.MenuButton.Users;

public class MCadminUsersPageTests extends BaseMethods {

    @Test(groups = {"MCadminUserPageTests", "Regression", "Smoke"})
    @Description("Verify if MCadmin is able to create New User")
    public void CreateNewUserTest() {
        String ContactName = RandomName();

        Login("TEST");
        mcadminhomePage.MenuButton(Users).click();
        usersList.AddNewUserButton().click();
        createNewUser.ContactNameField().setValue(ContactName);
        createNewUser.DepartmentField().click();
        createNewUser.DepartmentDropDown("CREDITORS").click();
        createNewUser.PopupTitle().click();
        createNewUser.SelectValueFromDropDown("RoleDropDownLocator", "User");
        //createNewUser.AddressLine().click();  added this action to generic method
        createNewUser.FillAddressGrid(createNewUser);
        createNewUser.EmailField().val(ContactName + "@aa.com");
        createNewUser.PhoneNumberField().val("123-456-78-9");
        createNewUser.DescrioptionField().val("Some Description Text");
        createNewUser.ApprovedCheckBox().click();
        createNewUser.SaveButton().click();
    }

    @Test(groups = {"MCadminUserPageTests", "Regression", "Smoke"})
    @Description("Verify if MCadmin is able find appropriate User via Search")
    public void VerifyIfMCadminIsAbleFindAppropriateUserViaSearch() {
        String userName;
        int userNumber = RandomNumber(5);

        Login("TEST");
        mcadminhomePage.MenuButton(Users).click();
        userName = usersList.GetUserNameByNumber(userNumber).getText();
        usersList.SearchField().val(userName);
        usersList.WaitForLoad();
        verifier.VerifyEachElementInCollection("Check each user name", usersList.AllUsersNamesList(), userName);
    }
}
