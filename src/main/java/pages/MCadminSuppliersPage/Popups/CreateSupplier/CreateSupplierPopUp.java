package pages.MCadminSuppliersPage.Popups.CreateSupplier;

import com.codeborne.selenide.SelenideElement;
import pages.MCadminSuppliersPage.MCadminSuppliersPage;

public class CreateSupplierPopUp extends MCadminSuppliersPage {

    public SelenideElement SupplierType(String typeName) {
        return fields("SypplierTypeListLocator", typeName);
    }

    public SelenideElement SaveButton() {
        return field("SaveButtonLocator");
    }

    public SelenideElement CancelButton() {
        return field("CancelButtonLocator");
    }

    public SelenideElement SupplierNameField() {
        return field("SupplierNameFieldLocator");
    }

    public SelenideElement CreateSupplierPopUpTitle() {
        return field("CreateSupplierPopUpTitleLocator");
    }

}
