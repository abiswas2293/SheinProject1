package pageClasses;

import objectRepository.SearchPageLocators;
import org.openqa.selenium.WebElement;
import utility.CommonFunctions;

public class SearchPage extends CommonFunctions {
    SearchPageLocators spl = new SearchPageLocators();

    public void validatePageTitle(String productName) {
        assertion(spl.searchPageTitle(productName), productName);
    }

    public void getAllLinks() throws InterruptedException {
        Thread.sleep(5000);
        for (WebElement element : returnListOfWebElements(spl.getAllProductsLink)) {
            System.out.println(element.getAttribute("href"));
        }
    }

    public void clickOnLink(int productNumber) throws InterruptedException {
        Thread.sleep(5000);
        click(spl.productSelectionLinkBYIndex(productNumber));
    }




}
