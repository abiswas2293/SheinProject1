 package objectRepository;

public class RegistrationPageLocators {

    public String getAllProductsLink = "//div[@class='sc-bcXHqe ProductList__PLPContainer-sc-8lnc8o-1 cppHWG hSZegP']//div[contains(@class,'ProductList')]/a";

    public String productSelectionLinkBYIndex(int index) {
        return "//div[@class='sc-bcXHqe ProductList__PLPContainer-sc-8lnc8o-1 cppHWG hSZegP']//div[contains(@class,'ProductList')][" + index + "]";
    }

    public String searchPageTitle(String productName) {
        return "//h1[text()='" + productName + "']";
    }

    public String RelavanceDropDown="//div[@class='Selectstyled__DropDownSelected-sc-j3bykl-2 exOamp']";
}
