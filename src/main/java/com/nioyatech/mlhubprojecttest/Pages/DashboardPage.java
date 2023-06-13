package com.nioyatech.mlhubprojecttest.Pages;

import com.nioyatech.mlhubprojecttest.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage {
    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[@class='MuiTypography-root MuiTypography-body1 css-1p1al9p']")
    public WebElement dashboardText;

    @FindBy (css = ".MuiAvatar-root.MuiAvatar-circular.MuiAvatar-colorDefault.css-25a9u0")
    public WebElement profileDropdownMenu;
    //.MuiAvatar-root.MuiAvatar-circular.MuiAvatar-colorDefault.css-25a9u0

    @FindBy(xpath = "//*[text()='Dashboard']")
    public WebElement dashBoardButtonInProfileDropdownMenu;
    //(//*[text()='Dashboard'])[3]

    @FindBy(xpath = "(//*[text()='Dashboard'])[1]")
    public WebElement dashBoardButton;

    @FindBy(xpath = "(//*[text()='Profile'])[2]")
    public WebElement profileButtonİnProfileDropdownMenu;

    @FindBy(xpath = "//*[text()='Home']")
    public WebElement homeButtonİnProfileDropdownMenu;

    @FindBy(xpath = "//*[text()='Logout']")
    public WebElement logoutButtonİnProfileDropdownMenu;

    @FindBy(css= ".MuiTableCell-root.MuiTableCell-body.MuiTableCell-alignLeft.MuiTableCell-sizeSmall.css-1tfu9os")
    public List<WebElement> namesOfModelsInDashboard;

    @FindBy(xpath = "//*[text()='Reports']")
    public  WebElement reportsButton;

    @FindBy(xpath = "//div[text()='Usage']/following-sibling::div")
    public WebElement usageNumber;

    @FindBy(xpath = "//div[text()='Wallet']/following-sibling::div")
    public WebElement walletBalance;

    @FindBy(id= "SvgjsTspan2175")
    public WebElement creditBalance;


    public static String numberStr;
    public static String usageNumberStr;


}
