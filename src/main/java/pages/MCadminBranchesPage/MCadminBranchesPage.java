package pages.MCadminBranchesPage;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import utils.configuration.fields.Fields;

public class MCadminBranchesPage extends Fields {

    public SelenideElement PageTitle() {
        return field("PageTitleLocator");
    }

    public ElementsCollection BranchesList() {
        return fields("BranchesListLocator");
    }

    public ElementsCollection GoToBranchButtonsList() {
        return fields("GoToBranchButtonsListLocator");
    }

    public ElementsCollection ExpandButtonsList() {
        return fields("ExpandButtonsListLocator");
    }

    public SelenideElement CreateBranchButton() {
        return field("CreateBranchButtonLocator");
    }

    public SelenideElement ExpandButton(String branchName) {
        return getElementBySiblingName("BranchesListLocator", "ExpandButtonsListLocator", branchName);
    }

    public SelenideElement GoToBranchButton(String branchName) {
        return getElementBySiblingName("BranchesListLocator", "GoToBranchButtonsListLocator", branchName);
    }

}
