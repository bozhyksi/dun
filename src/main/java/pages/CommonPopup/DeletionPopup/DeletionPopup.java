package pages.CommonPopup.DeletionPopup;

import com.codeborne.selenide.SelenideElement;
import utils.configuration.fields.Fields;

public class DeletionPopup extends Fields {

    public SelenideElement DeletionPopUpDeleteButton() {
        return field("DeletionPopUpDeleteButtonLocator");
    }
}
