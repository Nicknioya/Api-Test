package com.nioyatech.mlhubprojecttest.StepDefinitions;

import com.nioyatech.mlhubprojecttest.Utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

  @Before
   public void setUp() {
       Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       Driver.getDriver().manage().window().maximize();
       Driver.getDriver().manage().window().setSize(new Dimension(1200,1100));
   }

    @After
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshots");
        }
            Driver.closeDriver();

    }

}
