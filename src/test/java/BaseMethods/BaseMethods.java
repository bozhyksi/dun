package BaseMethods;

import com.codeborne.selenide.*;
import configs.MechanicApp;
import io.qameta.allure.Description;

import java.util.Random;
import java.lang.*;

import static com.codeborne.selenide.Condition.*;
import static pages.MCadminHomePage.MCadminHomePage.MenuButton.Suppliers;
import static pages.MCadminSuppliersPage.MCadminSuppliersPage.SupplierActions.Delete;


public class BaseMethods extends MechanicApp
{

    @Description("Delete Supplier")
    protected void DeleteSupplier(String supplierName) {
        mcadminhomePage.MenuButton(Suppliers).click();
        mcadminSuppliersPage.WaitForLoad();
        int i = mcadminSuppliersPage.SuppliersList().filterBy(text(supplierName)).size();
        if (i > 0) {
            mcadminSuppliersPage.ActionButton(supplierName).click();
            mcadminSuppliersPage.ActionDropDown(Delete).click();
            deletionPopup.DeletionPopUpDeleteButton().click();
            mcadminSuppliersPage.RefreshPage();
            mcadminSuppliersPage.SuppliersList().filterBy(text(supplierName)).shouldHaveSize(i - 1);
            System.out.println(mcadminSuppliersPage.SuppliersList().filterBy(text(supplierName)).shouldHaveSize(i - 1));
        }
    }

    @Description("Create Supplier")
    protected void CreateSupplier(String supplierName, String supplierType) {
        mcadminhomePage.MenuButton(Suppliers).click();
        mcadminSuppliersPage.WaitForLoad();
        int i = mcadminSuppliersPage.SuppliersList().filterBy(text(supplierName)).size();

        mcadminSuppliersPage.AddNewSupplierButton().click();
        createSupplierPopUp.CreateSupplierPopUpTitle().shouldHave(Condition.text("Create Supplier"));
        createSupplierPopUp.SupplierNameField().setValue(supplierName);
        createSupplierPopUp.SupplierType(supplierType).click();
        createSupplierPopUp.SaveButton().click();
        supplierDetails.GoBackButton().click();
        mcadminSuppliersPage.RefreshPage();
        mcadminSuppliersPage.SuppliersList().filterBy(text(supplierName)).shouldHaveSize(i + 1);
    }

    @Description("Precondition")
    protected void Login(String enviroment) {
        loginPage.EmailAddressField().setValue(getUsername(enviroment));
        loginPage.PasswordField().setValue(getPassword(enviroment));
        loginPage.HomePageButton().click();
    }

    protected String RandomName() {
        Random rand = new Random();
        int r = rand.nextInt(9999);
        return "AutoTest" + r;
    }

    protected int RandomNumber(int range) {
        Random rand = new Random();
        return rand.nextInt(range);
    }


}
