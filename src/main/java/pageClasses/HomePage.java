package pageClasses;

import utility.CommonFunctions;
import objectRepository.HomePageLocators;

public class HomePage extends CommonFunctions {

    HomePageLocators LC = new HomePageLocators();

public void SearchBar(String product) throws InterruptedException {
      typeText(LC.searchBar,product);
      pressEnter();
}

}
