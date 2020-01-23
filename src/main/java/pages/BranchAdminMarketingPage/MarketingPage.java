package pages.BranchAdminMarketingPage;

import com.codeborne.selenide.SelenideElement;
import utils.configuration.fields.Fields;

public class MarketingPage extends Fields {

    public SelenideElement PageTitle() {
        return field("PageTitleLocator");
    }

    public SelenideElement AddBuildingButton() {
        return field("AddBuildingButtonLocator");
    }

}
