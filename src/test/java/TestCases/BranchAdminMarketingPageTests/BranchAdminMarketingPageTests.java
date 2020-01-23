package TestCases.BranchAdminMarketingPageTests;

import BaseMethods.BaseMethods;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.testng.annotations.Test;
import pages.MCadminHomePage.MCadminHomePage;

import static io.qameta.allure.Allure.step;
import static pages.MCadminHomePage.MCadminHomePage.MenuButton.Branches;

public class BranchAdminMarketingPageTests extends BaseMethods {

    @Test(groups = {"Regression", "Smoke", "BuildingsTest"})
    @Description("Verify if Branch Admin is able add Buildings")
    public void VerifyIfBranchAdminIsAbleAddBuildings() {
        step("Test Data");
        String branchName = "American Tower Corporation";

        step("Go to Branch");
        Login("TEST");
        mcadminhomePage.MenuButton(Branches).click();
        mCadminBranchesPage.GoToBranchButton(branchName).click();


    }

}
