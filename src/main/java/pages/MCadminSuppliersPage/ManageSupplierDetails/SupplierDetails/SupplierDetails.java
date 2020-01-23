package pages.MCadminSuppliersPage.ManageSupplierDetails.SupplierDetails;

import com.codeborne.selenide.SelenideElement;
import pages.MCadminSuppliersPage.MCadminSuppliersPage;

public class SupplierDetails extends MCadminSuppliersPage {

    public SelenideElement GoBackButton() {
        return field("GoBackButtonLocator");
    }

    public SelenideElement DescriptionField() {
        return field("DescriptionFieldLocator");
    }

    public SelenideElement PhysicalAddressField() {
        return field("PhysicalAddressFieldLocator");
    }

    public SelenideElement PhysicalStreetLine1Field() {
        return field("PhysicalStreetLine1FieldLocator");
    }

    public SelenideElement PhysicalCityField() {
        return field("PhysicalCityFieldLocator");
    }

    public SelenideElement PhysicalCodeField() {
        return field("PhysicalCodeFieldLocator");
    }

    public SelenideElement PhysicalCountryField() {
        return field("PhysicalCountryFieldLocator");
    }

    public SelenideElement PhysicalSubmitButton() {
        return field("PhysicalSubmitButton");
    }

    public SelenideElement PhysicalCancelButton() {
        return field("PhysicalCancelButton");
    }

    public SelenideElement PostalAddressField() {
        return field("PostalAddressFieldLocator");
    }

    public SelenideElement PostalStreetLine1Field() {
        return field("PostalStreetLine1FieldLocator");
    }

    public SelenideElement PostalCityField() {
        return field("PostalCityFieldLocator");
    }

    public SelenideElement PostalCodeField() {
        return field("PostalCodeFieldLocator");
    }

    public SelenideElement PostalCountryField() {
        return field("PostalCountryFieldLocator");
    }

    public SelenideElement PostalSubmitButton() {
        return field("PostalSubmitButton");
    }

    public SelenideElement PostalCancelButton() {
        return field("PostalCancelButton");
    }

    public SelenideElement RegistrationNumberField() {
        return field("RegistrationNumberFieldLocator");
    }

    public SelenideElement VATnumberField() {
        return field("VATnumberFieldLocator");
    }

    public SelenideElement WebAddressField() {
        return field("WebAddressFieldLocator");
    }

    public SelenideElement EmailField() {
        return field("EmailFieldLocator");
    }

    public SelenideElement PhoneField() {
        return field("PhoneFieldLocator");
    }

    public SelenideElement SaveButton() {
        return field("SaveButtonLocator");
    }

    public SelenideElement PhysicalAddressDescriptionField() {
        return field("PhysicalAddressDescriptionFieldLocator");
    }

    public SelenideElement PostalAddressDescriptionField() {
        return field("PostalAddressDescriptionFieldLocator");
    }
}
