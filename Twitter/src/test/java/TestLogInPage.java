import alldata.DataSources;
import login.LogInPage;
import login.Search;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.sql.DataSource;
import java.util.concurrent.TimeUnit;

public class TestLogInPage {

    WebDriver driver;
    String baseUrl = "https://twitter.com";

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/massinissa.bahmed/AhmedPractice/Twitter/src/main/java/utilities/chromedriver 2");
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void cleanUp() {
        driver.close();
    }

    LogInPage logInPage;
    Search search;

    public void accessLogInPage() {
        this.logInPage = PageFactory.initElements(driver, LogInPage.class);
    }

    public void accessSearchPage() {
        this.search = PageFactory.initElements(driver, Search.class);
    }

    //helper method to log in
    public void toLogInTemplate() throws InterruptedException {
        accessLogInPage();
        logInPage.logInToTwitter("massi52168095", "seleniumdemo");
    }

    @Test
    public void testLogIn() throws InterruptedException {
        accessLogInPage();
        logInPage.logInToTwitter("massi52168095", "seleniumdemo");
    }

    //individual search for something
    @Test
    public void testSearch() throws InterruptedException {
        toLogInTemplate();
        accessSearchPage();
        search.searching("sports");
    }

    //from array
    @Test
    public void testSearchFomArray() throws InterruptedException {
        toLogInTemplate();
        accessSearchPage();
        search.searchFromList();
    }

    //search with dataProvider
    @Test(dataProvider = "searchListOfPhonesWithMultiTestCase", dataProviderClass = DataSources.class)
    public void phoneSearch(String n) throws InterruptedException {
        toLogInTemplate();
        accessSearchPage();
        search.constantSearch(n);

    }

    @Test(dataProvider ="searchListOfPhonesWithOneTestCase",dataProviderClass = DataSources.class)
    public void searchListW1Test (String n1, String n2, String n3, String n4) throws InterruptedException {
        toLogInTemplate();
        accessSearchPage();
        search.searchUsingDataProvider1Test(n1, n2, n3, n4);
    }
//log in functionality
    @Test(dataProvider = "testLogInFunctionality", dataProviderClass = DataSources.class)
    public void logInFuncTest(String username, String password) throws InterruptedException {
        accessLogInPage();
        logInPage.logInToTwitter(username,password);
//       String actualUrl = driver.getCurrentUrl();
//       String expectedUrl = "http://twitter.com/home";

    }
    }



