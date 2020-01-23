package pages.MCadminSuppliersPage.Popups.CreateNewTariff;

import com.codeborne.selenide.SelenideElement;
import pages.MCadminSuppliersPage.ManageSupplierDetails.Tariffs.EditTariff.EditTariff;
import pages.MCadminSuppliersPage.ManageSupplierDetails.Tariffs.Tariffs;

public class CreateNewTariffPopUp extends Tariffs {

    public SelenideElement PopupTitle() {
        return field("PopupTitleLocator");
    }

    public SelenideElement SupplieTypeField() {
        return field("SupplieTypeFieldLocator");
    }

    public SelenideElement SupplieTypeDropDown(String valueName) {
        return fields("SupplieTypeDropDownLocator", valueName);
    }

    public SelenideElement ConsumerTypeField() {
        return field("ConsumerTypeFieldLocator");
    }

    public SelenideElement TariffNameField() {
        return field("TariffNameLocator");
    }

    public SelenideElement ConsumerTypeDropDown(String value) {
        return fields("ConsumerTypeDropDownLocator", value);
    }

    public SelenideElement SaveButton() {
        return field("SaveButtonLocator");
    }

}
