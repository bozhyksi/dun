package pages.MCadminSuppliersPage.ManageSupplierDetails.Tariffs.EditTariff;

import com.codeborne.selenide.SelenideElement;
import pages.MCadminSuppliersPage.ManageSupplierDetails.Tariffs.Tariffs;

public class EditTariff extends Tariffs {

    public SelenideElement GoBackButton() {
        return field("GoBackButtonLocator");
    }

}
