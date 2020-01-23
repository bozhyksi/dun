package pages.MCadminSuppliersPage.ManageSupplierDetails.Tariffs;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import pages.MCadminSuppliersPage.MCadminSuppliersPage;

public class Tariffs extends MCadminSuppliersPage {

    public enum TariffActions {
        AddNewVersion("Add new version"),
        EditVersion("Edit version"),
        DeleteVersion("Delete version"),
        AddNewValue("Add new value");

        private String act;

        TariffActions(String action) {
            this.act = action;
        }

        public String getAct() {
            return act;
        }
    }

    public SelenideElement Title() {
        return field("TitleLocator");
    }

    public SelenideElement SearchField() {
        return field("SearchFieldLocator");
    }

    public SelenideElement AddTariffButton() {
        return field("AddTariffButtonLocator");
    }

    public ElementsCollection TaffirList() {
        return fields("TariffListLocator");
    }

    public SelenideElement ActionButtonList() {
        return field("ActionButtonListLocator");
    }

    public SelenideElement ActionDropDown(TariffActions action) {
        return fields("ActionDropDownLocator", action.getAct());
    }

    public SelenideElement ActionButton(String supplierName) {
        return getElementBySiblingName("TariffListLocator", "ActionButtonListLocator", supplierName);
    }

}
