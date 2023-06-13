package com.nioyatech.mlhubprojecttest.Pages;

import com.nioyatech.mlhubprojecttest.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SubscribePage {

    public SubscribePage(){
        PageFactory.initElements(Driver.getDriver(),this );
    }
    @FindBy(xpath = "//*[text()='Subscribe the newsletter']")
    public WebElement subscribeTextTitle;

    @FindBy(xpath = "//input[@placeholder='example@nioyatech.com']")
    public WebElement subscribeTextbox;

    @FindBy(xpath = "//*[text()='SUBSCRIBE']")
    public WebElement subscribeButton;

    @FindBy(xpath = "//*[text()='Please, enter a valid e-mail!']")
    public WebElement invalidMailErrorMessage;

    @FindBy(xpath = "//*[text()='Your e-mail sent successfully!.. \uD83D\uDC4F']")
    public WebElement successfullyMessage;

    @FindBy(xpath = "(//*[@type='button'])[24]")
    public WebElement successfullyMessageButton;


    @FindBy(xpath = "//*[text()='Opps! news subscribe with this email already exists.']")
    public WebElement alreadyExistMessage;

    @FindBy(xpath = "(//*[@type='button'])[24]")
    public WebElement alreadyExistMessageButton;





}

