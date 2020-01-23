package pages.MCadminUsers.Popup.CreateNewUser;

import com.codeborne.selenide.SelenideElement;
import pages.CommonPopup.AddressGrid.IAddressGrid;
import pages.MCadminUsers.UsersList.UsersList;

public class CreateNewUser extends UsersList implements IAddressGrid {

    public SelenideElement PopupTitle() {
        return field("CreateNewUserPopupTitleLocator");
    }

    public SelenideElement ContactNameField() {
        return field("ContactNameFieldLocator");
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
        return field("ProvinceLocatior");
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

    public SelenideElement EmailField() {
        return field("EmailFieldLocator");
    }

    public SelenideElement PhoneNumberField() {
        return field("PhoneNumberFieldLocator");
    }

    public SelenideElement DescrioptionField() {
        return field("DescrioptionFieldLocator");
    }

    public SelenideElement ApprovedCheckBox() {
        return field("ApprovedCheckBoxLocator");
    }

    public SelenideElement CancelButton() {
        return field("CancelButtonLocator");
    }

    public SelenideElement SaveButton() {
        return field("SaveButtonLocator");
    }

    public SelenideElement DepartmentField() {
        return field("DepartmentFieldLocator");
    }

    public SelenideElement DepartmentDropDown(String value) {
        return fields("DepartmentDropdownLocator", value);
    }

    public SelenideElement AddressLine() {
        return field("AddressLineLocator");
    }

}
