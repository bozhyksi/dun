package pages.MCadminUsers.UsersList;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import utils.configuration.fields.Fields;

public class UsersList extends Fields {

    public SelenideElement UserListTab() {
        return field("UserListTabLocator");
    }

    public SelenideElement SearchField() {
        return field("UserSearchFieldLocator");
    }

    public SelenideElement AddNewUserButton() {
        return field("AddNewUserButtonLocator");
    }

    public SelenideElement GetUserNameByNumber(int userNumber) {
        return fields("UsersNamesListLocator", userNumber);
    }

    public ElementsCollection AllUsersNamesList() {
        return fields("UsersNamesListLocator");
    }
}
