package com.nioyatech.mlhubprojecttest.StepDefinitions;

import com.nioyatech.mlhubprojecttest.Pages.ModelsPage;
import com.nioyatech.mlhubprojecttest.Utilities.Driver;
import com.nioyatech.mlhubprojecttest.Utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static com.nioyatech.mlhubprojecttest.Pages.ModelsPage.*;

public class ModelsPageFilterStepDef {
    ModelsPage modelsPage = new ModelsPage();
    ReusableMethods reusableMethods = new ReusableMethods();
    Random random = new Random();

    @When("Unregistered user clicks Models button")
    public void unregistered_user_clicks_models_button() throws InterruptedException {

        ReusableMethods.waitForVisibility(modelsPage.modelsButton, 200);
        ReusableMethods.clickWithJS(modelsPage.modelsButton);
        //modelsPage.modelsButton.click();
    }

    @Then("Unregistered user verifies on Models Page")
    public void unregisteredUserVerifiesOnModelsPage() {
        //System.out.println(Driver.getDriver().getCurrentUrl());//https://dev.ml-hub.nioyatechai.com/models
        Assert.assertEquals("https://dev.ml-hub.nioyatechai.com/models", Driver.getDriver().getCurrentUrl());
    }

    @When("Unregistered user clicks Sort Select Box")
    public void unregisteredUserClicksSortSelectBox() throws InterruptedException {
        Thread.sleep(10000);
        modelsPage.sortBox.click();
    }

    //SortSelectBoxMostViwed
    @And("Unregistered user selects MostViwed")
    public void unregisteredUserSelectsMostViwed() throws InterruptedException {
        Thread.sleep(3000);
        modelsPage.mostViwedSelect.click();
        Thread.sleep(5000);
    }

    @Then("Unregistered user verifies Most Viwed")
    public void unregisteredUserVerifiesMostViwed() {

        ReusableMethods.waitForVisibility(modelsPage.mostViwedFirst, 300);

        List<Integer> mostViwedList = new ArrayList<>();
        for (int i = 0; i < modelsPage.mostViwedElements.size(); i++) {
            //System.out.println(i+". Elements textleri : " + modelsPage.mostViwedElements.get(i).getText());
            mostViwedList.add(Integer.valueOf(modelsPage.mostViwedElements.get(i).getText().toString()));
        }
        System.out.println("mostViwedList : " + mostViwedList);

        List<Integer> mostViwedListOfClone = new ArrayList<>(mostViwedList);

        System.out.println("mostViwedListOfClone : " + mostViwedListOfClone);
        Collections.sort(mostViwedListOfClone);
        Collections.reverse(mostViwedListOfClone);
        List<Integer> mostViwedListOfCloneSortedReverse = new ArrayList<>(mostViwedListOfClone);
        System.out.println("mostViwedListOfCloneSortedReverse : " + mostViwedListOfCloneSortedReverse);
        Assert.assertEquals(mostViwedList, mostViwedListOfCloneSortedReverse);
    }

    @When("Unregistered user goes to next page")
    public void unregisteredUserGoesToNextPage() throws InterruptedException {
        modelsPage.nextPageButton.click();
        Thread.sleep(4000);
    }

    @Then("Unregistered user verifies go to second page")
    public void unregisteredUserVerifiesGoToSecondPage() {
        Assert.assertEquals("2",modelsPage.pageNumberOfModels.getText());
    }

    @And("Unregistered user verifies back to first page")
    public void unregisteredUserVerifiesBackToFirstPage() {
        Assert.assertEquals("1",modelsPage.pageNumberOfModels.getText());
    }


    //SortSelectBoxLastUpdated
    @And("Unregistered user selects LastUpdated")
    public void unregisteredUserSelectsLastUpdated() throws InterruptedException {
        Thread.sleep(3000);
        modelsPage.lastUpdatedSelect.click();
        Thread.sleep(5000);

    }

    @Then("Unregistered user verifies Last Updated")
    public void unregisteredUserVerifiesLastUpdated() throws ParseException {
        System.out.println("first " + modelsPage.lastUpdatedFirst.getText());
        System.out.println("second " + modelsPage.lastUpdatedSecond.getText());

        String firstDateStr = modelsPage.lastUpdatedFirst.getText();
        String secondDateStr = modelsPage.lastUpdatedSecond.getText();
        String fifteenthDateStr = modelsPage.lastUpdatedfifteenth.getText();
        String sixteenthDateStr = modelsPage.lastUpdatedsixteenth.getText();

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date firstDate = df.parse(firstDateStr);
        Date secondDate = df.parse(secondDateStr);
        Date fifteenthDate = df.parse(fifteenthDateStr);
        Date sixteenthDate = df.parse(sixteenthDateStr);


        System.out.println(firstDate);
        System.out.println(secondDate);
        System.out.println(fifteenthDate);
        System.out.println(sixteenthDate);


        boolean check;
        if ((firstDate.after(secondDate) || firstDate.equals(secondDate))
                && (fifteenthDate.after(sixteenthDate) || fifteenthDate.equals(sixteenthDate))
                && (secondDate.after(fifteenthDate) || secondDate.equals(fifteenthDate))) {
            check = true;
        } else {
            check = false;
        }
        Assert.assertEquals(true, check);
    }

    //SortSelectBoxMostLiked
    @And("Unregistered user selects MostLiked")
    public void unregisteredUserSelectsMostLiked() throws InterruptedException {
        Thread.sleep(3000);
        modelsPage.mostlikedSelect.click();
        Thread.sleep(5000);
    }

    @Then("Unregistered user verifies Most Liked")
    public void unregisteredUserVerifiesMostLiked() {

        ReusableMethods.waitForVisibility(modelsPage.mostLikedFirst, 300);

        List<Integer> mostLikedList = new ArrayList<>();
        for (int i = 0; i < modelsPage.mostLikedElements.size(); i++) {
            //System.out.println(i+". Elements textleri : " + modelsPage.mostLikedElements.get(i).getText());
            mostLikedList.add(Integer.valueOf(modelsPage.mostLikedElements.get(i).getText().toString()));
        }
        System.out.println("mostLikedList : " + mostLikedList);

        List<Integer> mostLikedListOfClone = new ArrayList<>(mostLikedList);

        System.out.println("mostLikedListOfClone : " + mostLikedListOfClone);
        Collections.sort(mostLikedListOfClone);
        Collections.reverse(mostLikedListOfClone);
        List<Integer> mostLikedListOfCloneSortedReverse = new ArrayList<>(mostLikedListOfClone);
        System.out.println("mostLikedListOfCloneSortedReverse : " + mostLikedListOfCloneSortedReverse);
        Assert.assertEquals(mostLikedList, mostLikedListOfCloneSortedReverse);
    }

    //randomlyClicksOnOneOfCheckboxes
    @When("Unregistered user randomly clicks one of the checkboxes")
    public void unregisteredUserRandomlyClicksOneOfTheCheckboxes() throws InterruptedException {

        Thread.sleep(6000);
        int randomCheckBox = random.nextInt(modelsPage.modelPageCheckBoxElements.size());

        modelsPage.modelPageCheckBoxElements.get(randomCheckBox).click();

        modelPageCheckBoxElementsStr = modelsPage.modelPageCheckBoxElements.get(randomCheckBox).getText().toString();
        System.out.println("modelPageCheckBoxElementsStr = " + modelPageCheckBoxElementsStr);

        modelPageCheckBoxTicketElementsStr = modelsPage.modelPageCheckBoxTicketElements.get(0).getText().toString();
        System.out.println("modelPageCheckBoxTicketElementsStr = " + modelPageCheckBoxTicketElementsStr);
    }

    @Then("Unregistered user verifies randomly clicks one of the checkboxes")
    public void unregisteredUserVerifiesRandomlyClicksOneOfTheCheckboxes() {

        Assert.assertTrue(modelPageCheckBoxElementsStr.contains(modelPageCheckBoxTicketElementsStr));
    }



    //randomlyClicksOnTwoOfCheckboxes
    @When("Unregistered user randomly clicks on two of the checkboxes")
    public void unregisteredUserRandomlyClicksOnTwoOfTheCheckboxes() throws InterruptedException {

        Thread.sleep(5000);
        int randomCheckBoxFirst = random.nextInt(modelsPage.modelPageCheckBoxElements.size());
        modelsPage.modelPageCheckBoxElements.get(randomCheckBoxFirst).click();

        modelPageCheckBoxFirstElementClickedStr = modelsPage.modelPageCheckBoxElements.get(randomCheckBoxFirst).getText().toString();
        System.out.println("modelPageCheckBoxFirstElementClickedStr = " + modelPageCheckBoxFirstElementClickedStr);

        Thread.sleep(5000);

        int randomCheckBoxSecond = random.nextInt(modelsPage.modelPageCheckBoxElements.size());
        modelsPage.modelPageCheckBoxElements.get(randomCheckBoxSecond).click();

        modelPageCheckBoxSecondElementClickedStr = modelsPage.modelPageCheckBoxElements.get(randomCheckBoxSecond).getText().toString();
        System.out.println("modelPageCheckBoxSecondElementClickedStr = " + modelPageCheckBoxSecondElementClickedStr);

        boolean check;
        if (modelPageCheckBoxFirstElementClickedStr.equals(modelPageCheckBoxSecondElementClickedStr)){
            check = true;
        } else {
            check = false;
        }

        if ( check == true){
            modelPageCheckBoxTicketFirstElementStr="";
            modelPageCheckBoxTicketSecondElementStr="";
        } else {
            modelPageCheckBoxTicketFirstElementStr = modelsPage.modelPageCheckBoxTicketElements.get(0).getText().toString();
            System.out.println("modelPageCheckBoxTicketFirstElementStr = " + modelPageCheckBoxTicketFirstElementStr);

            modelPageCheckBoxTicketSecondElementStr = modelsPage.modelPageCheckBoxTicketElements.get(1).getText().toString();
            System.out.println("modelPageCheckBoxTicketSecondElementStr = " + modelPageCheckBoxTicketSecondElementStr);
        }
       }


    @Then("Unregistered user verifies first clicked checkbox")
    public void unregisteredUserVerifiesFirstClickedCheckbox() {

        Assert.assertTrue(modelPageCheckBoxFirstElementClickedStr.contains(modelPageCheckBoxTicketFirstElementStr));
    }

    @Then("Unregistered user verifies second clicked checkbox")
    public void unregisteredUserVerifiesSecondClickedCheckbox() {

        Assert.assertTrue(modelPageCheckBoxSecondElementClickedStr.contains(modelPageCheckBoxTicketSecondElementStr));
    }

    //click On One Of The Model Filters In The DomainSection
    @When("Unregistered user randomly clicks on one of the Model Filters in the DomainSection")
    public void unregisteredUserRandomlyClicksOnOneOfTheModelFiltersInTheDomainSection() throws InterruptedException {
        Thread.sleep(5000);
        int randomClickFilter = random.nextInt(modelsPage.modelPageCheckBoxElementsOfDomain.size());


        modelsPage.modelPageCheckBoxElementsOfDomain.get(randomClickFilter).click();

        modelPageCheckBoxElementsStr = modelsPage.modelPageCheckBoxElementsOfDomain.get(randomClickFilter).getText().toString();
        System.out.println("modelPageCheckBoxElementsStr = " + modelPageCheckBoxElementsStr);

        modelPageCheckBoxTicketElementsStr = modelsPage.modelPageCheckBoxTicketElements.get(0).getText().toString();
        System.out.println("modelPageCheckBoxTicketElementsStr = " + modelPageCheckBoxTicketElementsStr);
    }

    @Then("Unregistered user verifies clicked on one of the Model Filters")
    public void unregisteredUserVerifiesClickedOnOneOfTheModelFilters() {
        Assert.assertTrue(modelPageCheckBoxElementsStr.contains(modelPageCheckBoxTicketElementsStr));
    }

    @Then("Unregistered user verifies filtered model count")
    public void unregisteredUserVerifiesFilteredModelCount() throws InterruptedException {
        Thread.sleep(5000);
        modelSearchModelsNumberStr = modelsPage.modelSearchModelsNumber.getText().toString();

        System.out.println("modelSearchModelsNumberStr = " + modelSearchModelsNumberStr);
        System.out.println("modelPageCheckBoxElementsStr = " + modelPageCheckBoxElementsStr);

        Assert.assertTrue(modelPageCheckBoxElementsStr.contains(modelSearchModelsNumberStr));
    }

    //click On Two Of The Model Filters In The DomainSection
    @When("Unregistered user randomly clicks on two of the Model Filters in the DomainSection")
    public void unregisteredUserRandomlyClicksOnTwoOfTheModelFiltersInTheDomainSection() throws InterruptedException {
        Thread.sleep(5000);
        int randomClickFilterFirst = random.nextInt(modelsPage.modelPageCheckBoxElementsOfDomain.size());
        modelsPage.modelPageCheckBoxElementsOfDomain.get(randomClickFilterFirst).click();

        modelPageCheckBoxFirstElementClickedStr = modelsPage.modelPageCheckBoxElementsOfDomain.get(randomClickFilterFirst).getText().toString();
        System.out.println("modelPageCheckBoxFirstElementClickedStr = " + modelPageCheckBoxFirstElementClickedStr);

        Thread.sleep(5000);

        int randomClickFilterSecond = random.nextInt(modelsPage.modelPageCheckBoxElementsOfDomain.size());
        modelsPage.modelPageCheckBoxElementsOfDomain.get(randomClickFilterSecond).click();

        modelPageCheckBoxSecondElementClickedStr = modelsPage.modelPageCheckBoxElementsOfDomain.get(randomClickFilterSecond).getText().toString();
        System.out.println("modelPageCheckBoxSecondElementClickedStr = " + modelPageCheckBoxSecondElementClickedStr);

        boolean check;
        if (modelPageCheckBoxFirstElementClickedStr.equals(modelPageCheckBoxSecondElementClickedStr)){
            check = true;
        } else {
            check = false;
        }

        if ( check == true){
            modelPageCheckBoxTicketFirstElementStr="";
            modelPageCheckBoxTicketSecondElementStr="";
        } else {
            modelPageCheckBoxTicketFirstElementStr = modelsPage.modelPageCheckBoxTicketElements.get(0).getText().toString();
            System.out.println("modelPageCheckBoxTicketFirstElementStr = " + modelPageCheckBoxTicketFirstElementStr);

            modelPageCheckBoxTicketSecondElementStr = modelsPage.modelPageCheckBoxTicketElements.get(1).getText().toString();
            System.out.println("modelPageCheckBoxTicketSecondElementStr = " + modelPageCheckBoxTicketSecondElementStr);
        }
    }

    @Then("Unregistered user verifies first clicked filter")
    public void unregisteredUserVerifiesFirstClickedFilter() {
        if(modelPageCheckBoxTicketFirstElementStr == ""){
            Assert.assertEquals("",modelPageCheckBoxTicketFirstElementStr);
        } else
        Assert.assertTrue(modelPageCheckBoxFirstElementClickedStr.contains(modelPageCheckBoxTicketFirstElementStr));
    }

    @Then("Unregistered user verifies second clicked filter")
    public void unregisteredUserVerifiesSecondClickedFilter() {
        if(modelPageCheckBoxTicketSecondElementStr == ""){
            Assert.assertEquals("",modelPageCheckBoxTicketSecondElementStr);
        } else
        Assert.assertTrue(modelPageCheckBoxSecondElementClickedStr.contains(modelPageCheckBoxTicketSecondElementStr));
    }

    //click On One Of The Model Filters In The AIFieldSection
    @When("Unregistered user randomly clicks on one of the Model Filters in the AIFieldSection")
    public void unregisteredUserRandomlyClicksOnOneOfTheModelFiltersInTheAIFieldSection() throws InterruptedException {
        Thread.sleep(5000);
        int randomClickFilter = random.nextInt(modelsPage.modelPageCheckBoxElementsOfAIFiled.size());

        modelsPage.modelPageCheckBoxElementsOfAIFiled.get(randomClickFilter).click();

        modelPageCheckBoxElementsStr = modelsPage.modelPageCheckBoxElementsOfAIFiled.get(randomClickFilter).getText().toString();
        System.out.println("modelPageCheckBoxElementsStr = " + modelPageCheckBoxElementsStr);

        modelPageCheckBoxTicketElementsStr = modelsPage.modelPageCheckBoxTicketElements.get(0).getText().toString();
        System.out.println("modelPageCheckBoxTicketElementsStr = " + modelPageCheckBoxTicketElementsStr);
    }

    //click On Two Of The Model Filters In The AIFieldSection
    @When("Unregistered user randomly clicks on two of the Model Filters in the AIFieldSection")
    public void unregisteredUserRandomlyClicksOnTwoOfTheModelFiltersInTheAIFieldSection() throws InterruptedException {
        Thread.sleep(8000);
        int randomClickFilterFirst = random.nextInt(modelsPage.modelPageCheckBoxElementsOfAIFiled.size());
        modelsPage.modelPageCheckBoxElementsOfAIFiled.get(randomClickFilterFirst).click();

        modelPageCheckBoxFirstElementClickedStr = modelsPage.modelPageCheckBoxElementsOfAIFiled.get(randomClickFilterFirst).getText().toString();
        System.out.println("modelPageCheckBoxFirstElementClickedStr = " + modelPageCheckBoxFirstElementClickedStr);

        Thread.sleep(5000);

        int randomClickFilterSecond = random.nextInt(modelsPage.modelPageCheckBoxElementsOfAIFiled.size());
        modelsPage.modelPageCheckBoxElementsOfAIFiled.get(randomClickFilterSecond).click();

        modelPageCheckBoxSecondElementClickedStr = modelsPage.modelPageCheckBoxElementsOfAIFiled.get(randomClickFilterSecond).getText().toString();
        System.out.println("modelPageCheckBoxSecondElementClickedStr = " + modelPageCheckBoxSecondElementClickedStr);


        boolean check;
        if (modelPageCheckBoxFirstElementClickedStr.equals(modelPageCheckBoxSecondElementClickedStr)){
            check = true;
        } else {
            check = false;
        }

        if ( check == true){
            modelPageCheckBoxTicketFirstElementStr="";
            modelPageCheckBoxTicketSecondElementStr="";
        } else {
            modelPageCheckBoxTicketFirstElementStr = modelsPage.modelPageCheckBoxTicketElements.get(0).getText().toString();
            System.out.println("modelPageCheckBoxTicketFirstElementStr = " + modelPageCheckBoxTicketFirstElementStr);

            modelPageCheckBoxTicketSecondElementStr = modelsPage.modelPageCheckBoxTicketElements.get(1).getText().toString();
            System.out.println("modelPageCheckBoxTicketSecondElementStr = " + modelPageCheckBoxTicketSecondElementStr);
        }
    }

    @When("Unregistered user randomly clicks on one of the Model Filters in the TaskSection")
    public void unregisteredUserRandomlyClicksOnOneOfTheModelFiltersInTheTaskSection() throws InterruptedException {
        Thread.sleep(5000);
        int randomClickFilter = random.nextInt(modelsPage.modelPageCheckBoxElementsOfTask.size());

        modelsPage.modelPageCheckBoxElementsOfTask.get(randomClickFilter).click();

        modelPageCheckBoxElementsStr = modelsPage.modelPageCheckBoxElementsOfTask.get(randomClickFilter).getText().toString();
        System.out.println("modelPageCheckBoxElementsStr = " + modelPageCheckBoxElementsStr);

        modelPageCheckBoxTicketElementsStr = modelsPage.modelPageCheckBoxTicketElements.get(0).getText().toString();
        System.out.println("modelPageCheckBoxTicketElementsStr = " + modelPageCheckBoxTicketElementsStr);
    }

    @When("Unregistered user randomly clicks on two of the Model Filters in the TaskSection")
    public void unregisteredUserRandomlyClicksOnTwoOfTheModelFiltersInTheTaskSection() throws InterruptedException {
        Thread.sleep(5000);
        int randomClickFilterFirst = random.nextInt(modelsPage.modelPageCheckBoxElementsOfTask.size());
        modelsPage.modelPageCheckBoxElementsOfTask.get(randomClickFilterFirst).click();

        modelPageCheckBoxFirstElementClickedStr = modelsPage.modelPageCheckBoxElementsOfTask.get(randomClickFilterFirst).getText().toString();
        System.out.println("modelPageCheckBoxFirstElementClickedStr = " + modelPageCheckBoxFirstElementClickedStr);

        Thread.sleep(5000);

        int randomClickFilterSecond = random.nextInt(modelsPage.modelPageCheckBoxElementsOfTask.size());
        modelsPage.modelPageCheckBoxElementsOfTask.get(randomClickFilterSecond).click();

        modelPageCheckBoxSecondElementClickedStr = modelsPage.modelPageCheckBoxElementsOfTask.get(randomClickFilterSecond).getText().toString();
        System.out.println("modelPageCheckBoxSecondElementClickedStr = " + modelPageCheckBoxSecondElementClickedStr);

        boolean check;
        if (modelPageCheckBoxFirstElementClickedStr.equals(modelPageCheckBoxSecondElementClickedStr)){
            check = true;
        } else {
            check = false;
        }

        if ( check == true){
            modelPageCheckBoxTicketFirstElementStr="";
            modelPageCheckBoxTicketSecondElementStr="";
        } else {
            modelPageCheckBoxTicketFirstElementStr = modelsPage.modelPageCheckBoxTicketElements.get(0).getText().toString();
            System.out.println("modelPageCheckBoxTicketFirstElementStr = " + modelPageCheckBoxTicketFirstElementStr);

            modelPageCheckBoxTicketSecondElementStr = modelsPage.modelPageCheckBoxTicketElements.get(1).getText().toString();
            System.out.println("modelPageCheckBoxTicketSecondElementStr = " + modelPageCheckBoxTicketSecondElementStr);
        }
    }

    @When("Unregistered user randomly clicks on one of the Model Filters in the LanguageSection")
    public void unregisteredUserRandomlyClicksOnOneOfTheModelFiltersInTheLanguageSection() throws InterruptedException {
        Thread.sleep(5000);
        int randomClickFilter = random.nextInt(modelsPage.modelPageCheckBoxElementsOfLanguage.size());

        modelsPage.modelPageCheckBoxElementsOfLanguage.get(randomClickFilter).click();

        modelPageCheckBoxElementsStr = modelsPage.modelPageCheckBoxElementsOfLanguage.get(randomClickFilter).getText().toString();
        System.out.println("modelPageCheckBoxElementsStr = " + modelPageCheckBoxElementsStr);

        modelPageCheckBoxTicketElementsStr = modelsPage.modelPageCheckBoxTicketElements.get(0).getText().toString();
        System.out.println("modelPageCheckBoxTicketElementsStr = " + modelPageCheckBoxTicketElementsStr);
    }

    @When("Unregistered user randomly clicks on two of the Model Filters in the LanguageSection")
    public void unregisteredUserRandomlyClicksOnTwoOfTheModelFiltersInTheLanguageSection() throws InterruptedException {
        Thread.sleep(5000);
        int randomClickFilterFirst = random.nextInt(modelsPage.modelPageCheckBoxElementsOfLanguage.size());
        modelsPage.modelPageCheckBoxElementsOfLanguage.get(randomClickFilterFirst).click();

        modelPageCheckBoxFirstElementClickedStr = modelsPage.modelPageCheckBoxElementsOfLanguage.get(randomClickFilterFirst).getText().toString();
        System.out.println("modelPageCheckBoxFirstElementClickedStr = " + modelPageCheckBoxFirstElementClickedStr);

        Thread.sleep(5000);

        int randomClickFilterSecond = random.nextInt(modelsPage.modelPageCheckBoxElementsOfLanguage.size());
        modelsPage.modelPageCheckBoxElementsOfLanguage.get(randomClickFilterSecond).click();

        modelPageCheckBoxSecondElementClickedStr = modelsPage.modelPageCheckBoxElementsOfLanguage.get(randomClickFilterSecond).getText().toString();
        System.out.println("modelPageCheckBoxSecondElementClickedStr = " + modelPageCheckBoxSecondElementClickedStr);


        boolean check;
       if (modelPageCheckBoxFirstElementClickedStr.equals(modelPageCheckBoxSecondElementClickedStr)){
                check = true;
       } else {
                check = false;
       }

       if ( check == true){
                modelPageCheckBoxTicketFirstElementStr="";
                modelPageCheckBoxTicketSecondElementStr="";
            } else {
                modelPageCheckBoxTicketFirstElementStr = modelsPage.modelPageCheckBoxTicketElements.get(0).getText().toString();
                System.out.println("modelPageCheckBoxTicketFirstElementStr = " + modelPageCheckBoxTicketFirstElementStr);

                modelPageCheckBoxTicketSecondElementStr = modelsPage.modelPageCheckBoxTicketElements.get(1).getText().toString();
                System.out.println("modelPageCheckBoxTicketSecondElementStr = " + modelPageCheckBoxTicketSecondElementStr);
            }

    }

    @When("Unregistered user clicks moreDomainElementsButton")
    public void unregisteredUserClicksMoreDomainElementsButton() throws InterruptedException {
        Thread.sleep(3000);
        modelsPage.moreDomainElementsButton.click();
    }


    @And("Unregistered user clicks BackButton")
    public void unregisteredUserClicksBackButton() throws InterruptedException {
        Thread.sleep(3000);
        modelsPage.backButton.click();
    }

    @When("Unregistered user Clears all DomainCheckboxes")
    public void unregisteredUserClearsAllDomainCheckboxes() throws InterruptedException {
        Thread.sleep(3000);
        modelsPage.domainClearAllButton.click();
    }

    @And("Unregistered user verifies Cleared all checkboxes")
    public void unregisteredUserVerifiesClearedAllCheckboxes() throws InterruptedException {
        System.out.println("modelsPage.modelPageCheckBoxTicketElements.size() = " + modelsPage.modelPageCheckBoxTicketElements.size());

        Thread.sleep(3000);
        Assert.assertEquals(0,modelsPage.modelPageCheckBoxTicketElements.size());
    }

    @When("Unregistered user clicks moreTaskElementsButton")
    public void unregisteredUserClicksMoreTaskElementsButton() throws InterruptedException {
        Thread.sleep(3000);
        modelsPage.moreTaskElementsButton.click();
    }

    @When("Unregistered user Clears all TaskCheckboxes")
    public void unregisteredUserClearsAllTaskCheckboxes() throws InterruptedException {
        Thread.sleep(3000);
        modelsPage.taskClearAllButton.click();
    }

    @When("Unregistered user clicks moreLanguageElementsButton")
    public void unregisteredUserClicksMoreLanguageElementsButton() throws InterruptedException {
        Thread.sleep(3000);
        modelsPage.moreLanguageElementsButton.click();
    }

    @When("Unregistered user Clears all LanguageCheckboxes")
    public void unregisteredUserClearsAllLanguageCheckboxes() throws InterruptedException {
        Thread.sleep(3000);
        modelsPage.languageClearAllButton.click();
    }

    @When("Unregistered user enters {string} word into search box")
    public void unregisteredUserEntersWordIntoSearchBox(String searchedWord) throws InterruptedException {
        Thread.sleep(4000);
        modelsPage.searchBox.sendKeys(searchedWord);
        System.out.println("modelsPage.searchBox.getText() = " + modelsPage.searchBox.  getText());
        Thread.sleep(4000);
    }



    @Then("Unregistered user verifies viewed models {string}")
    public void unregisteredUserVerifiesViewedModels(String searchedWord) throws InterruptedException {
        Thread.sleep(3000);

        int searchWordCount = 0;
        if(modelsPage.searchResultDisplayedModels.size() != 0){
           for (int i = 0; i < modelsPage.searchResultDisplayedModels.size(); i++) {
                System.out.println(i+". Elements textleri : " + modelsPage.searchResultDisplayedModels.get(i).getText());
               if(modelsPage.searchResultDisplayedModels.get(i).getText().contains(searchedWord)){
                   searchWordCount ++;
               }
           }
            Assert.assertTrue(modelsPage.searchResultDisplayedModels.size()-1 == searchWordCount);

        }
           else {
           Assert.assertEquals(0,modelsPage.searchResultDisplayedModels.size());
      }

    }

    @When("Unregistered user clears the search box")
    public void unregisteredUserClearsTheSearchBox() {
        modelsPage.searchBox.clear();
    }

    @Then("Unregistered user verifies clear the search box")
    public void unregisteredUserVerifiesClearTheSearchBox() {
        System.out.println("modelsPage.searchBox.getText() = " + modelsPage.searchBox.getText());
        Assert.assertEquals("",modelsPage.searchBox.getText());

    }



    












   /* @When("Unregistered user clicks all checkboxes")
    public void unregisteredUserClicksAllCheckboxes() throws InterruptedException {
        Thread.sleep(3000);
        for(int i=0, n=modelsPage.modelPageCheckBoxElements.size(); i<n; i++) {
            modelsPage.modelPageCheckBoxElements.get(i).click();
            Thread.sleep(4000);
        }


        List<String> modelPageCheckBoxElementsList = new ArrayList<>();
        for (int i = 0; i < modelsPage.modelPageCheckBoxElements.size(); i++) {
            //System.out.println(i+". Elements textleri : " + modelsPage.modelPageCheckBoxElements.get(i).getText());
            modelPageCheckBoxElementsList.add(modelsPage.modelPageCheckBoxElements.get(i).getText().toString());
        }


        List<String> modelPageCheckBoxTicketElementsList = new ArrayList<>();
        for (int i = 0; i < modelsPage.modelPageCheckBoxTicketElements.size(); i++) {
            //System.out.println(i+". Elements textleri : " + modelsPage.modelPageCheckBoxTicketElements.get(i).getText());
            modelPageCheckBoxTicketElementsList.add(modelsPage.modelPageCheckBoxTicketElements.get(i).getText().toString());
        }

        System.out.println("modelPageCheckBoxElementsList = " + modelPageCheckBoxElementsList);
        System.out.println("modelPageCheckBoxTicketElementsList = " + modelPageCheckBoxTicketElementsList);

         Assert.assertTrue(modelPageCheckBoxElementsList.contains(modelPageCheckBoxTicketElementsList));

    }

    @Then("Unregistered user verifies clicked all checkboxes")
    public void unregisteredUserVerifiesClickedAllCheckboxes() {

    }


    @When("Unregistered user Clears all checkboxes")
    public void unregisteredUserClearsAllCheckboxes() {
        modelsPage.aIFieldClearAllButton.click();

        modelsPage.domainClearAllButton.click();

        modelsPage.taskClearAllButton.click();

        modelsPage.languageClearAllButton.click();

    }

    @Then("Unregistered user verifies Cleared all checkboxes")
    public void unregisteredUserVerifiesClearedAllCheckboxes() {
    }*/
}
