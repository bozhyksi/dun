package pages.BranchAdminBuildingsPage.ManageBuildingDetails.General;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import pages.BranchAdminBuildingsPage.BuildingsPage;
import pages.CommonPopup.AddressGrid.IAddressGrid;

public class GeneralPage extends BuildingsPage implements IAddressGrid {

    public SelenideElement AddressLine() {
        return field("AddressLineButtonLocator");
    }

    public SelenideElement AddressField() {
        return field("AddressFieldLocator");
    }

    public SelenideElement StreetLine1() {
        return field("StreetLine1Locator");
    }

    public SelenideElement StreetLine2() {
        return field("StreetLine2Locator");
    }

    public SelenideElement City() {
        return field("CityLocator");
    }

    public SelenideElement Code() {
        return field("CodeLocator");
    }

    public SelenideElement Province() {
        return field("ProvinceLocator");
    }

    public SelenideElement Country() {
        return field("CountryLocator");
    }

    public SelenideElement AddressSubmitButton() {
        return field("AddressSubmitButtonLocator");
    }

    public SelenideElement AddressCancelButton() {
        return field("AddressCancelButtonLocator");
    }

    public SelenideElement CategoriesDropDownButton() {
        return field("CategoriesDropDownButtonLocator");
    }

    public SelenideElement StatusCheckBox() {
        return field("StatusCheckBoxLocator");
    }

    public SelenideElement ActiveForReadingCheckBox() {
        return field("ActiveForReadingCheckBoxLocator");
    }

    public SelenideElement CancelButton() {
        return field("CancelButtonLocator");
    }

    public SelenideElement SaveButtonLocator() {
        return field("SaveButtonLocator");
    }

    public SelenideElement PageTitle() {
        return field("PageTitleLocator");
    }

    public SelenideElement GeneralInfoTab() {
        return field("GeneralInfoTabLocator");
    }

    public ElementsCollection CategoriesDropDownValues() {
        return fields("CategoriesDropDownValuesLocator");
    }
}
