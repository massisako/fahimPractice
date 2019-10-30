package login;

import alldata.DataSources;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;

import javax.sql.DataSource;
import java.util.List;

public class Search {
    //Locator for SearchBar
    @FindBy(xpath = "//input[@aria-label='Search query']")
    WebElement searchBarTextBox;
    //Locator for the Clear X sign on Search Text Field
    @FindBy(xpath = "//div[@class='css-901oao r-1awozwy r-jwli3a r-6koalj r-18u37iz r-16y2uox r-1qd0xha r-n6v787 r-vw2c0b r-1777fci r-eljoum r-dnmrzs r-bcqeeo r-q4m81j r-qvutc0']")
    WebElement clearIcon;

    public void clearTheField(){
        clearIcon.click();
    }
    public void searching(String searchText){
        searchBarTextBox.sendKeys(searchText);
    }
     //helper method for constant searching
    public void constantSearch(String listText){
            searchBarTextBox.sendKeys(listText);
            searchBarTextBox.sendKeys(Keys.ENTER);
            searchBarTextBox.click();
    }

    public void searchFromList() {
        List<String> searchList = DataSources.getList();
        for (int i = 0; i < searchList.size(); i++) {
            constantSearch(searchList.get(i));
            clearTheField();
        }
    }
    public void searchUsingDataProvider(String n1, String n2, String n3){
        searchBarTextBox.sendKeys(n1);
        searchBarTextBox.sendKeys(Keys.ENTER);
        searchBarTextBox.click();
        clearTheField();
        searchBarTextBox.sendKeys(n2);
        searchBarTextBox.sendKeys(Keys.ENTER);
        searchBarTextBox.click();
        clearTheField();
        searchBarTextBox.sendKeys(n3);
        searchBarTextBox.sendKeys(Keys.ENTER);
        searchBarTextBox.click();
        clearTheField();
        }

    public void searchUsingDataProvider1Test (String n1, String n2, String n3, String n4) {
        searchBarTextBox.sendKeys(n1);
        searchBarTextBox.sendKeys(Keys.ENTER);
        searchBarTextBox.click();
        clearTheField();
        searchBarTextBox.sendKeys(n2);
        searchBarTextBox.sendKeys(Keys.ENTER);
        searchBarTextBox.click();
        clearTheField();
        searchBarTextBox.sendKeys(n3);
        searchBarTextBox.sendKeys(Keys.ENTER);
        searchBarTextBox.click();
        clearTheField();
        searchBarTextBox.sendKeys(n4);
        searchBarTextBox.sendKeys(Keys.ENTER);
        searchBarTextBox.click();
        clearTheField();
    }
    }






