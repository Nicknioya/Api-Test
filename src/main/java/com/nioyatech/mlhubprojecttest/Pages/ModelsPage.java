package com.nioyatech.mlhubprojecttest.Pages;

import com.nioyatech.mlhubprojecttest.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ModelsPage {

    public ModelsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//img[@src='/static/media/Models.caad00f03aa2301cd66640df6e0ad6cc.svg']")
    public WebElement modelsButton;
    //"(//*[text()='Models'])[1]"


    @FindBy(xpath="//p[text()='Most Viewed']")
    public WebElement sortBox;
    // (//*[@class='MuiBox-root css-0'])[3]
    // //*[@id='demo-simple-select']
    // id="sort-select-label"

    @FindBy(xpath = "statusSelect")
    public WebElement selectStatusBox;


    @FindBy(xpath = "//*[@aria-label='Go to next page']")
    public WebElement nextPageButton;

    @FindBy(xpath = "//*[@data-testid='NavigateBeforeIcon']")
    public WebElement beforePageButton;

    @FindBy(xpath = "//div[@class='MuiBox-root css-1ez83xl']")
    public WebElement landingPagePicture;

    @FindBy(xpath = "//*[@aria-current='true']")
    public WebElement pageNumberOfModels;

    //MostViwed
    @FindBy(css="#view_count")
    public WebElement mostViwedSelect;

    @FindBy(xpath = "//p[@aria-label='Number of Model Usage']")
    public List<WebElement> mostViwedElements;

    @FindBy(xpath = "(//p[@aria-label='Number of Model Usage'])[1]")
    public WebElement mostViwedFirst;

    @FindBy(xpath = "(//p[@aria-label='Number of Model Usage'])[2]")
    public WebElement mostViwedSecond;

    @FindBy(xpath = "(//p[@aria-label='Number of Model Usage'])[15]")
    public WebElement mostViwedfifteenth;

    @FindBy(xpath = "(//p[@aria-label='Number of Model Usage'])[16]")
    public WebElement mostViwedsixteenth;

    //LastUpdated
    @FindBy(css="#modelUpdateDate")
    public WebElement lastUpdatedSelect;

    @FindBy(xpath = "//p[@aria-label='Model Update Date']")
    public List<WebElement> lastUpdatedElements;

    @FindBy(xpath = "(//p[@aria-label='Model Update Date'])[1]")
    public WebElement lastUpdatedFirst;

    @FindBy(xpath = "(//p[@aria-label='Model Update Date'])[2]")
    public WebElement lastUpdatedSecond;

    @FindBy(xpath = "(//p[@aria-label='Model Update Date'])[15]")
    public WebElement lastUpdatedfifteenth;

    @FindBy(xpath = "(//p[@aria-label='Model Update Date'])[16]")
    public WebElement lastUpdatedsixteenth;


    //MostLiked
    @FindBy(css="#like_counts")
    public WebElement mostlikedSelect;
    //(//li[@aria-selected='false'])[2]

    @FindBy(xpath = "//p[@aria-label='Number of Likes']")
    public List<WebElement> mostLikedElements;

    @FindBy(xpath = "(//p[@aria-label='Number of Likes'])[1]")
    public WebElement mostLikedFirst;

    @FindBy(xpath = "(//p[@aria-label='Number of Likes'])[2]")
    public WebElement mostLikedSecond;

    @FindBy(xpath = "(//p[@aria-label='Number of Likes'])[15]")
    public WebElement mostLikedfifteenth;

    @FindBy(xpath = "(//p[@aria-label='Number of Likes'])[16]")
    public WebElement mostLikedsixteenth;


    //modelPage_CheckBox

    @FindBy(xpath = "//span[@style='display: flex; width: 100%; justify-content: space-between;']")
    public List<WebElement> modelPageCheckBoxElements;

    @FindBy(xpath ="//span[@class='MuiTypography-root MuiTypography-body9 css-y31g2f']")
    public List<WebElement> elementsOfModelNames;

    @FindBy(xpath = "//div[@id='Domain']//span[@style='display: flex; width: 100%; justify-content: space-between;']")
    public List<WebElement> modelPageCheckBoxElementsOfDomain;

    @FindBy(xpath = "//div[@id='Task']//span[@style='display: flex; width: 100%; justify-content: space-between;']")
    public List<WebElement> modelPageCheckBoxElementsOfTask;

    @FindBy(xpath = "//div[@id='AI-Field']//span[@style='display: flex; width: 100%; justify-content: space-between;']")
    public List<WebElement> modelPageCheckBoxElementsOfAIFiled;

    @FindBy(xpath = "//div[@id='Language']//span[@style='display: flex; width: 100%; justify-content: space-between;']")
    public List<WebElement> modelPageCheckBoxElementsOfLanguage;

    @FindBy(xpath = "(//span[@style='display: flex; width: 100%; justify-content: space-between;'])[1]")
    public WebElement modelPageCheckBoxFirstElement;

    @FindBy(xpath = "(//span[@style='display: flex; width: 100%; justify-content: space-between;'])[20]")
    public WebElement modelPageCheckBoxLastElement;

    @FindBy(xpath = "//span[@class='MuiChip-label MuiChip-labelMedium css-9iedg7']")
    public List<WebElement> modelPageCheckBoxTicketElements;

    @FindBy(xpath = "//div[@class='MuiBox-root css-1wg2w10']")
    public List<WebElement> numberOfModelsElement;


    @FindBy(xpath = "(//span[@class='MuiTypography-root MuiTypography-body9 css-xu847o'])[1]")
    public WebElement moreDomainElementsButton;

    @FindBy(xpath = "(//span[@class='MuiTypography-root MuiTypography-body9 css-xu847o'])[2]")
    public WebElement moreTaskElementsButton;

    @FindBy(xpath = "(//span[@class='MuiTypography-root MuiTypography-body9 css-xu847o'])[3]")
    public WebElement moreLanguageElementsButton;



    @FindBy(xpath = "//*[text()='Back']")
    public  WebElement backButton;


    @FindBy(xpath = "(//button[text()='Clear all'])[1]")
    public WebElement aIFieldClearAllButton;

    @FindBy(xpath = "(//button[text()='Clear all'])[2]")
    public WebElement domainClearAllButton;

    @FindBy(xpath = "(//button[text()='Clear all'])[3]")
    public WebElement taskClearAllButton;

    @FindBy(xpath = "(//button[text()='Clear all'])[4]")
    public WebElement languageClearAllButton;


    //test04
    public static String modelPageCheckBoxElementsStr;
    public static String modelPageCheckBoxTicketElementsStr;
    public static String modelSearchModelsNumberStr;

    //test05
    public static String modelPageCheckBoxFirstElementClickedStr;
    public static String modelPageCheckBoxSecondElementClickedStr;
    public static String modelPageCheckBoxTicketFirstElementStr;
    public static String modelPageCheckBoxTicketSecondElementStr;



    //Model_Search
    @FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-h2 css-1pvkn6u']")
    public WebElement modelSearchModelsNumber;

    @FindBy(xpath = "//input[@placeholder='Search models by Name, Title, Entity, Class, Descriptions…']")
    public WebElement searchBox;

    @FindBy (xpath="//span[@class='MuiTypography-root MuiTypography-body10 css-19az3o5']")
    public List<WebElement> searchResultDisplayedModels;

    @FindBy (xpath = "(//span[@class='MuiTypography-root MuiTypography-body10 css-19az3o5'])[1]")
    public WebElement searchResultFirstModels;
    //@FindBy(xpath = "//*[text()='']")
    //public WebElement ;





}
