package pages.BranchAdminBuildingsPage.ManageBuildingDetails.OperationsAgreement;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import pages.BranchAdminBuildingsPage.BuildingsPage;

public class OperationsAgreementPage extends BuildingsPage {

    public ElementsCollection DropDownsList() {
        return fields("DropDownsListLocator");
    }

    public ElementsCollection DropDownsItemsList() {
        return fields("DropDownsItemsListLocator");
    }

    public SelenideElement PageTitleLocator() {
        return field("PageTitleLocator");
    }

    public SelenideElement OperationsAgreementTab() {
        return field("OperationsAgreementTabLocator");
    }

    public SelenideElement SaveButton() {
        return field("SaveButtonLocator");
    }

    public SelenideElement CancelButton() {
        return field("CancelButtonLocator");
    }
}
