package com.nioyatech.mlhubprojecttest.StepDefinitions;

import com.github.javafaker.Faker;
import com.nioyatech.mlhubprojecttest.Pages.ModelsPage;
import com.nioyatech.mlhubprojecttest.Pages.SubscribePage;
import com.nioyatech.mlhubprojecttest.Utilities.ConfigurationReader;
import com.nioyatech.mlhubprojecttest.Utilities.Driver;
import com.nioyatech.mlhubprojecttest.Utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class SubscribeStepDef{
    Faker faker = new Faker();
    SubscribePage subscribePage = new SubscribePage();

    @Given("Unregistered user goes to MLHub")
    public void unregistered_user_goes_to_ml_hub() {
        Driver.getDriver().get(ConfigurationReader.getProperty("mlHubUrl"));
        ReusableMethods.waitForVisibility(subscribePage.subscribeTextTitle,20);
    }

    @Then("Unregistered user verifies onsite")
    public void unregistered_user_verifies_onsite() {
        //System.out.println(Driver.getDriver().getTitle());//NioyatechAI Machine Learning Hub
        Assert.assertEquals("NioyatechAI Machine Learning Hub", Driver.getDriver().getTitle());

    }


    @When("Unregistered user enters {string} validEmail into text box")
    public void unregisteredUserEntersIntoTextBox(String validEmail) throws InterruptedException {
        ReusableMethods.scrollIntoViewJS(subscribePage.subscribeTextbox);
        subscribePage.subscribeTextbox.sendKeys(faker.internet().emailAddress());
        Thread.sleep(2000);
    }


    @And("Unregistered user clicks on subscribe button")
    public void unregisteredUserClicksOnSubscribeButton() throws InterruptedException {
        subscribePage.subscribeButton.click();
        Thread.sleep(2000);
    }
    @Then("Unregistered user verifies succesfully Message")
    public void unregisteredUserVerifiesSuccesfullyMessage() {
        Assert.assertEquals("Your e-mail sent successfully!.. \uD83D\uDC4F",subscribePage.successfullyMessage.getText());

    }

    @And("close browser")
    public void closeBrowser() {
        Driver.closeDriver();
    }

    @When("Unregistered user enters {string} invalidEmail into text box")
    public void unregisteredUserEntersInValidEmailIntoTextBox(String invalidEmail) throws InterruptedException {
        ReusableMethods.scrollIntoViewJS(subscribePage.subscribeTextbox);
        subscribePage.subscribeTextbox.sendKeys(invalidEmail);
        Thread.sleep(2000);
    }

    @Then("Unregistered user verifies invalid error Message")
    public void unregisteredUserVerifiesInvalidErrorMessage() {
        Assert.assertEquals("Please, enter a valid e-mail!",subscribePage.invalidMailErrorMessage.getText());

    }


    @When("Unregistered user enters {string} registeredEmail into text box")
    public void unregisteredUserEntersRegisteredEmailIntoTextBox(String registeredEmail) throws InterruptedException {
        subscribePage.subscribeTextbox.sendKeys(registeredEmail);
        Thread.sleep(2000);

    }

    @Then("Unregistered user verifies already exist Message")
    public void unregisteredUserVerifiesAlreadyExistMessage() {
        Assert.assertEquals("Opps! news subscribe with this email already exists.",subscribePage.alreadyExistMessage.getText());


    }


}

