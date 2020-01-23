package configs;

import com.codeborne.selenide.SelenideElement;
import configs.verification.Verifier;
import org.apache.commons.validator.Var;
import pages.CommonPopup.DeletionPopup.DeletionPopup;
import pages.MCadminBranchesPage.MCadminBranchesPage;
import pages.MCadminHomePage.MCadminHomePage;
import pages.LoginPage.LoginPage;
import pages.MCadminSuppliersPage.MCadminSuppliersPage;
import pages.MCadminSuppliersPage.ManageSupplierDetails.SupplierDetails.SupplierDetails;
import pages.MCadminSuppliersPage.ManageSupplierDetails.Tariffs.EditTariff.EditTariff;
import pages.MCadminSuppliersPage.ManageSupplierDetails.Tariffs.Tariffs;
import pages.MCadminSuppliersPage.Popups.CreateNewTariff.CreateNewTariffPopUp;
import pages.MCadminSuppliersPage.Popups.CreateSupplier.CreateSupplierPopUp;
import pages.MCadminUsers.Popup.CreateNewUser.CreateNewUser;
import pages.MCadminUsers.UsersList.UsersList;
import utils.configuration.fields.Fields;


import java.sql.Timestamp;
import java.util.function.Consumer;

public class MechanicApp extends PreparationForRun {

    protected Verifier verifier = new Verifier();
    protected Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    protected Fields fields = new Fields();

    protected LoginPage loginPage = new LoginPage();
    protected MCadminHomePage mcadminhomePage = new MCadminHomePage();
    protected MCadminSuppliersPage mcadminSuppliersPage = new MCadminSuppliersPage();
    protected CreateSupplierPopUp createSupplierPopUp = new CreateSupplierPopUp();
    protected DeletionPopup deletionPopup = new DeletionPopup();
    protected SupplierDetails supplierDetails = new SupplierDetails();
    protected UsersList usersList = new UsersList();
    protected CreateNewUser createNewUser = new CreateNewUser();
    protected CreateNewTariffPopUp createNewTariffPopUp = new CreateNewTariffPopUp();
    protected Tariffs tariffs = new Tariffs();
    protected EditTariff editTariff = new EditTariff();
    protected MCadminBranchesPage mCadminBranchesPage = new MCadminBranchesPage();

}

