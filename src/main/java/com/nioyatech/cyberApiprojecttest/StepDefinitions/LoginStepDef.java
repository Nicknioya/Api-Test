package com.nioyatech.cyberApiprojecttest.StepDefinitions;

import com.nioyatech.cyberApiprojecttest.Pages.DashboardPage;
import com.nioyatech.cyberApiprojecttest.Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class LoginStepDef {

   LoginPage loginPage = new LoginPage();
   DashboardPage dashboardPage = new DashboardPage();

    @When("Unregistered user clicks on login button")
    public void unregisteredUserClicksOnLoginButton() throws InterruptedException {
        Thread.sleep(2000);
        loginPage.loginButton.click();
    }


    @Then("Unregistered user verifies click on login button")
    public void unregisteredUserVerifiesClickOnLoginButton() {
        Assert.assertTrue(loginPage.usernameTextBox.isDisplayed());
    }

    @When("Admin enters {string} username into text box")
    public void adminEntersUsernameIntoTextBox(String username) {
        loginPage.usernameTextBox.sendKeys(username);
    }

    @And("Admin enters {string} password into text box")
    public void adminEntersPasswordIntoTextBox(String password) {
        loginPage.passwordTextBox.sendKeys(password);
    }


    @And("Admin clicks on sign in button")
    public void adminClicksOnSignInButton() throws InterruptedException {
        loginPage.signInButton.click();
        Thread.sleep(6000);
        loginPage.cognitoclient.click();
        Thread.sleep(10000);
        loginPage.loginButton.click();
        Thread.sleep(7000);

    }

    @Then("Admin verifies successful login")
    public void adminVerifiesSuccessfulLogin() {
        System.out.println("loginPage.dashboardText.isDisplayed() = " + dashboardPage.dashboardText.isDisplayed());
        Assert.assertTrue(dashboardPage.dashboardText.isDisplayed());
    }
}
