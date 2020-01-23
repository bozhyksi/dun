package pages.MCadminHomePage;

import com.codeborne.selenide.SelenideElement;
import utils.configuration.fields.*;

import java.util.HashMap;
import java.util.Hashtable;

public class MCadminHomePage extends Fields
{
    public enum MenuButton {
        Dashboard,
        Branches,
        Users,
        Suppliers,
        Equipment,
        Services,
        Settings
    }

    public SelenideElement MainMenu()
    {
        return field("MainMenuLocator");
    }

    public SelenideElement MenuButton(MenuButton buttonName) {
        HashMap <MenuButton, Integer> menuHashMap = new HashMap <>(){{
            put(MenuButton.Dashboard, 0);
            put(MenuButton.Branches, 1);
            put(MenuButton.Users, 2);
            put(MenuButton.Suppliers, 3);
            put(MenuButton.Equipment, 4);
            put(MenuButton.Services, 5);
            put(MenuButton.Settings, 6);
        }};
        return fields("MainMenuLocator", menuHashMap.get(buttonName));
    }

    public SelenideElement PageTitle(){
        return field("PageTitleLocator");
    }

    public SelenideElement AccountButton(){
        return field("AccountButtonLocator");
    }

    public SelenideElement LogOutDropDown(){
        return field("LogOutDropDownLocator");
    }

    public SelenideElement SignOutButton() {
        return field("SignOutButtonLocator");
    }
}


