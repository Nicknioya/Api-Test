package com.nioyatech.mlhubprojecttest.StepDefinitions;

import com.nioyatech.mlhubprojecttest.Pages.DashboardPage;
import com.nioyatech.mlhubprojecttest.Pages.LoginPage;
import com.nioyatech.mlhubprojecttest.Pages.ModelsPage;
import com.nioyatech.mlhubprojecttest.Pages.ReportsPage;
import com.nioyatech.mlhubprojecttest.Utilities.ReusableMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.nioyatech.mlhubprojecttest.Pages.DashboardPage.numberStr;
import static com.nioyatech.mlhubprojecttest.Pages.DashboardPage.usageNumberStr;

public class DashboardStepDef {

    ModelsPage modelsPage = new ModelsPage();
    DashboardPage dashboardPage = new DashboardPage();
    ReportsPage reportsPage = new ReportsPage();
    LoginPage loginPage = new LoginPage();

    @When("Admin verifies top five most viewed models on dashboard page")
    public void adminVerifiesTopFiveMostViewedModelsOnDashboardPage() throws InterruptedException {


        ReusableMethods.waitForVisibility(modelsPage.mostViwedFirst, 300);

        List<String> topFiveMostViwedListInModelPage = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println(i+". Elements textleri : " + modelsPage.elementsOfModelNames.get(i).getText());
            topFiveMostViwedListInModelPage.add(modelsPage.elementsOfModelNames.get(i).getText());
        }
        System.out.println("topFiveMostViwedListInModelPage : " + topFiveMostViwedListInModelPage);

        dashboardPage.profileDropdownMenu.click();
        dashboardPage.dashBoardButtonInProfileDropdownMenu.click();
        Thread.sleep(7000);

        List<String> topFiveMostViwedListInDashboard = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println(i+". Elements textleri : " + dashboardPage.namesOfModelsInDashboard.get(i).getText());
            topFiveMostViwedListInDashboard.add(dashboardPage.namesOfModelsInDashboard.get(i).getText());
        }
        System.out.println("topFiveMostViwedListInDashboard : " + topFiveMostViwedListInDashboard);

        Assert.assertEquals(topFiveMostViwedListInModelPage,topFiveMostViwedListInDashboard);
    }

   @When("Admin verifies top five most liked models on dashboard page")
    public void adminVerifiesTopFiveMostLikedModelsOnDashboardPage() throws InterruptedException {
        ReusableMethods.waitForVisibility(modelsPage.mostViwedFirst, 300);

        List<String> topFiveMostLikedListInModelPage = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println(i+". Elements textleri : " + modelsPage.elementsOfModelNames.get(i).getText());
            topFiveMostLikedListInModelPage.add(modelsPage.elementsOfModelNames.get(i).getText());
        }
        System.out.println("topFiveMostLikedListInModelPage : " + topFiveMostLikedListInModelPage);

        dashboardPage.profileDropdownMenu.click();
        dashboardPage.dashBoardButtonInProfileDropdownMenu.click();
        Thread.sleep(10000);

        List<String> topFiveMostLikedListInDashboard = new ArrayList<>();
        for (int i = 5; i <= 9; i++) {
            System.out.println(i+". Elements textleri : " + dashboardPage.namesOfModelsInDashboard.get(i).getText());
            topFiveMostLikedListInDashboard.add(dashboardPage.namesOfModelsInDashboard.get(i).getText());
        }
        System.out.println("topFiveMostLikedListInDashboard : " + topFiveMostLikedListInDashboard);

        Assert.assertEquals(topFiveMostLikedListInModelPage,topFiveMostLikedListInDashboard);


    }


    @When("Admin goes to reports page")
    public void adminGoesToReportsPage() throws InterruptedException {
        dashboardPage.reportsButton.click();
        Thread.sleep(3000);
    }

    @Then("Admin verifies on reports page")
    public void adminVerifiesOnReportsPage() throws InterruptedException {
        Assert.assertTrue(reportsPage.userReportsText.isDisplayed());
        Thread.sleep(5000);
    }

    @When("Admin gets the number of models run in the report")
    public void adminGetsTheNumberOfModelsRunInTheReport() {
        System.out.println("reportsPage.numberOfModelsRun.getText() = " + reportsPage.numberOfModelsRun.getText());
        String  str = reportsPage.numberOfModelsRun.getText();
        String arr1[]=str.split(" ");
        System.out.println(Arrays.toString(arr1));

        List<String> strSplitList = new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            strSplitList.add(arr1[i]);
        }
        System.out.println("strSplitList = " + strSplitList);
        numberStr = strSplitList.get(2).toString();
        System.out.println("numberStr = " + numberStr);

    }

    @When("Admin goes to dashboards page")
    public void adminGoesToDashboardsPage() throws InterruptedException {
        dashboardPage.dashBoardButton.click();
        Thread.sleep(7000);

    }


    @Then("Admin verifies on dashboards page")
    public void adminVerifiesOnDashboardsPage() throws InterruptedException {
        System.out.println("loginPage.dashboardText.isDisplayed() = " + dashboardPage.dashboardText.isDisplayed());
        Assert.assertTrue(dashboardPage.dashboardText.isDisplayed());
        Thread.sleep(5000);
        
    }


    @Then("Admin verifies number of models run in reports equals number of usages on dasboard")
    public void adminVerifiesNumberOfModelsRunInReportsEqualsNumberOfUsagesOnDasboard() {
        usageNumberStr = dashboardPage.usageNumber.getText();
        System.out.println("usageNumberStr = " + usageNumberStr);
        Assert.assertEquals(numberStr,usageNumberStr);
    }

    @Then("Admin verifies that wallet balance and credit balance are equal")
    public void adminVerifiesThatWalletBalanceAndCreditBalanceAreEqual() {
        String  walletBalanceStr = dashboardPage.walletBalance.getText();
        String  creditBalanceStr = dashboardPage.creditBalance.getText();
        System.out.println("creditBalanceStr = " + creditBalanceStr);
        System.out.println("walletBalanceStr = " + walletBalanceStr);
        Assert.assertEquals(creditBalanceStr,walletBalanceStr);
    }
}