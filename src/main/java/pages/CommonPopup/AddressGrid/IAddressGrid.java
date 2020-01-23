package pages.CommonPopup.AddressGrid;

import com.codeborne.selenide.SelenideElement;

public interface IAddressGrid {

    SelenideElement AddressLine();

    SelenideElement AddressField();

    SelenideElement StreetLine1();

    SelenideElement StreetLine2();

    SelenideElement City();

    SelenideElement Code();

    SelenideElement Province();

    SelenideElement Country();

    SelenideElement AddressSubmitButton();

    SelenideElement AddressCancelButton();
}
