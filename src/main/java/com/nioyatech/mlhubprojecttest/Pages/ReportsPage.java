package com.nioyatech.mlhubprojecttest.Pages;

import com.nioyatech.mlhubprojecttest.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportsPage {
    public ReportsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy(xpath = "//*[text()='User reports']")
public WebElement userReportsText;

@FindBy (css = ".MuiTablePagination-displayedRows.css-1axcs70")
public WebElement numberOfModelsRun;

}
