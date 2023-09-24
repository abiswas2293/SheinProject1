package testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageClasses.HomePage;
import pageClasses.SearchPage;
import utility.CommonFunctions;

public class HomePageTests extends CommonFunctions {
    HomePage home = new HomePage();
    SearchPage search = new SearchPage();

     @Test
     public void selectSaree() throws InterruptedException {

         home.SearchBar("saree");
         search.getAllLinks();
         search.validatePageTitle("saree");
         search.clickOnLink(1);

     }

     @Test
     public void selectShirt() throws InterruptedException {

         home.SearchBar("shirt");
         search.getAllLinks();
         search.validatePageTitle("shirt");
         search.clickOnLink(1);

     }
    @Parameters({"productName"})
    @Test
    public void selectProduct(String productName) throws InterruptedException {
        home.SearchBar(productName);
        search.getAllLinks();
        search.validatePageTitle(productName);
        search.clickOnLink(1);


    }


}
