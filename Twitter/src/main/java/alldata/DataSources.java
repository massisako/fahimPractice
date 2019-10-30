package alldata;

import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.List;

public class DataSources {
    public static List<String> getList() {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("sport");
        itemsList.add("news");
        itemsList.add("politics");
        itemsList.add("nothing");
        itemsList.add("Toothpaste");
        itemsList.add("iphone");
        itemsList.add("games");
        itemsList.add("macAir");

        return itemsList;

    }

//    @DataProvider(name = "twitterSearchItems")
//    public Object[][] twitterSearchItems() {
//            return new Object[][]{
//                    {"algeria"},
//                    {"usa"},
//                    {"new york"}
//
//            };
//        }

    @DataProvider(name = "searchListOfPhonesWithOneTestCase")
    public Object[][] phonesSearch() {
            return new Object[][]{
                    {"iphone",
                     "computer",
                     "galaxy",
                     "motorola",}
            };
        }
    @DataProvider(name = "searchListOfPhonesWithMultiTestCase")
    public Object[][] phonesSearchWithOneTestCase() {
        return new Object[][]{
                {"iphone"},
                {"computer"},
                {"galaxy"},
                {"motorola"}
        };
    }
    @DataProvider(name = "testLogInFunctionality")
    public Object[][] credentialList(){
     return new Object [][]{
             {"smt@","seleniumdemo"},
             {"@gmail.com","seleniumdemo"},
             {"massi52168095","jbqweiofub"},
             {"ouhwefb","huiygwe"}
     };
    }

}
