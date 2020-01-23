package TestCases.MCadminSuppliersPageTests;

import BaseMethods.BaseMethods;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import jdk.jfr.Description;
import org.testng.annotations.Test;
import pages.MCadminSuppliersPage.ManageSupplierDetails.Tariffs.Tariffs;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

import static io.qameta.allure.Allure.step;
import static pages.MCadminHomePage.MCadminHomePage.MenuButton.Suppliers;

import static pages.MCadminSuppliersPage.MCadminSuppliersPage.SupplierActions.Delete;
import static pages.MCadminSuppliersPage.MCadminSuppliersPage.SupplierActions.Edit;
import static pages.MCadminSuppliersPage.ManageSupplierDetails.Tariffs.Tariffs.TariffActions.AddNewValue;
import static pages.MCadminSuppliersPage.ManageSupplierDetails.Tariffs.Tariffs.TariffActions.DeleteVersion;

public class MCadminSuppliersPageTests extends BaseMethods {

    @Test(groups = {"MCadminSuppliersPageTests", "Regression", "Smoke"})
    @Description("Verify if MC Admin is able to Add New Supplier and Delete Supplier")
    public void VerifyIfMCAdminIsAbleToAddDeleteSupplier() {
        String supplierName = "Supplier " + RandomName();
        String supplierType = "Electricity";

        step("Login to site and navigate to Supplier tab");
        Login("TEST");

        step("Create new Supplier");
        CreateSupplier(supplierName, supplierType);

        step("Add details, fill in all required fields in Supplier details");
        mcadminSuppliersPage.ActionButton(supplierName).click();
        mcadminSuppliersPage.ActionDropDown(Edit).click();
        supplierDetails.PostalAddressField().click();
        supplierDetails.PhysicalAddressField().click();
        supplierDetails.PhysicalAddressDescriptionField().val("Morbi sem mauris.");
        supplierDetails.PhysicalStreetLine1Field().val("05913 Kensington Avenue");
        supplierDetails.PhysicalCityField().val("Johannesburg");
        supplierDetails.PhysicalCodeField().val("8154224");
        supplierDetails.PhysicalCountryField().val("South Africa");
        supplierDetails.PhysicalSubmitButton().click();
        supplierDetails.PostalAddressDescriptionField().val("Morbi sem mauris.");
        supplierDetails.PostalStreetLine1Field().val("05913 Kensington Avenue");
        supplierDetails.PostalCityField().val("Johannesburg");
        supplierDetails.PostalCodeField().val("8154224");
        supplierDetails.PostalCountryField().val("South Africa");
        supplierDetails.PostalSubmitButton().click();
        supplierDetails.DescriptionField().val("Morbi sem mauris.");
        supplierDetails.RegistrationNumberField().val("8154224");
        supplierDetails.EmailField().val("test@asd.dd");
        supplierDetails.WebAddressField().val("www.asd.aa");
        supplierDetails.PhoneField().val("123-456-789-77");
        supplierDetails.SaveButton().click();
        supplierDetails.GoBackButton().click();

        step("Check if suplier created");
        mcadminSuppliersPage.RefreshPage();
        mcadminSuppliersPage.SuppliersList().filterBy(Condition.text(supplierName)).shouldHaveSize(1);

        step("Delete Created Supplier");
        DeleteSupplier(supplierName);
    }

    @Test(groups = {"MCadminSuppliersPageTests", "Regression", "Smoke"})
    @Description("Verify if MC Admin is able to find Suppliers via Search")
    public void VerifyIfAdminIsAbleFindSuppliersViaSearch() {
        String supplierName = "Supplier " + RandomName();
        String supplierType = "Electricity";

        step("Login to site and navigate to Supplier tab");
        Login("TEST");

        step("Create new Supplier");
        CreateSupplier(supplierName, supplierType);

        step("Enter Supplier name into Search field");
        mcadminSuppliersPage.SupplierSearchField().val(supplierName);
        mcadminSuppliersPage.WaitForLoad();
        mcadminSuppliersPage.SuppliersList().filter(Condition.visible).shouldHaveSize(1);


        step("Delete Created Supplier");
        DeleteSupplier(supplierName);
    }

    @Test(groups = {"MCadminSuppliersPageTests", "Regression", "Smoke"})
    @Description("Verify if MC Admin is able to add/delete Tariff to Suplier")
    public void VerifyIfAdminIsAbleAddDeleteTariffSuplier() {

        String supplierName = "Supplier " + RandomName();
        String tariffName = "Tariff " + RandomName();
        String supplierType = "Electricity";
        String consumerType = "Retail";

        step("Login to site and navigate to Supplier tab");
        Login("TEST");

        step("Create new Supplier");
        CreateSupplier(supplierName, supplierType);

        step("Navigate to Tariff tab and click Add New Tariff");
        mcadminSuppliersPage.ActionButton(supplierName).click();
        mcadminSuppliersPage.ActionDropDown(Edit).click();
        tariffs.Title().click();
        tariffs.AddTariffButton().click();

        step("Create a new tariff");
        createNewTariffPopUp.TariffNameField().val(tariffName);
        createNewTariffPopUp.SupplieTypeField().click();
        createNewTariffPopUp.SupplieTypeDropDown(supplierType).click();
        createNewTariffPopUp.ConsumerTypeField().click();
        createNewTariffPopUp.ConsumerTypeDropDown(consumerType).click();
        createNewTariffPopUp.SaveButton().click();
        editTariff.GoBackButton().click();
        tariffs.WaitForLoad();
        tariffs.TaffirList().filter(text(tariffName)).shouldHaveSize(1);

        step("Delete created Tariff");
        tariffs.ActionButton(tariffName).click();
        tariffs.ActionDropDown(DeleteVersion).click();
        deletionPopup.DeletionPopUpDeleteButton().click();
        tariffs.TaffirList().filter(text(tariffName)).shouldHaveSize(0);

        step("Go back to Suppliers and delete Created one");
        DeleteSupplier(supplierName);
    }

}
