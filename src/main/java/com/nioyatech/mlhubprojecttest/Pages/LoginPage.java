package com.nioyatech.mlhubprojecttest.Pages;

import com.nioyatech.mlhubprojecttest.StepDefinitions.LoginStepDef;
import com.nioyatech.mlhubprojecttest.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButton;

    @FindBy (className ="logo-customizable")
    public WebElement loginNioyatechLogo;

    @FindBy (xpath = "(//input[@id='signInFormUsername'])[2]")
    public WebElement usernameTextBox;

    @FindBy (xpath = "(//input[@id='signInFormPassword'])[2]")
    public WebElement passwordTextBox;

    @FindBy (xpath = "(//input[@value='Sign in'])[2]")
    public WebElement signInButton;

    @FindBy (xpath = "//*[@href='/oauth2/authorization/cognito-client']")
    public WebElement cognitoclient;



    /* @FindBy (xpath = "")
    public WebElement ; */
}
