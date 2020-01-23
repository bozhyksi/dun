package pages.MCadminSuppliersPage;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import utils.configuration.fields.Fields;

import static com.codeborne.selenide.Selenide.$;


public class MCadminSuppliersPage extends Fields {

    public enum SupplierActions {
        Edit("Edit"),
        Delete("Delete");

        String act;

        SupplierActions(String action) {
            this.act = action;
        }

        public String getAct() {
            return act;
        }
    }

    public SelenideElement SupplierPageTitle() {
        return field("SupplierPageTitleLocator");
    }

    public SelenideElement SupplierSearchField() {
        return field("SupplierSearchFieldLocator");
    }

    public SelenideElement AddNewSupplierButton() {
        return field("AddNewSupplierButtonLocator");
    }

    public SelenideElement SupplyTypeButton() {
        return field("SupplyTypeButtonLocator");
    }

    public SelenideElement SupplyTypeDropDown() {
        return field("SupplyTypeDropDownLocator");
    }

    public SelenideElement SupplyDropDown(String actionName) {
        return fields("SupplyDropDownLocator", actionName);
    }

    public SelenideElement ActionDropDown(SupplierActions actionName) {
        return fields("SupplyDropDownLocator", actionName.getAct());
    }

    public ElementsCollection SuppliersList() {
        return fields("SuppliersList");
    }

    public SelenideElement ActionButton(String supplierName) {
        return getElementBySiblingName("SuppliersList", "SupplyActionsButtonListLocator", supplierName);
    }



}
