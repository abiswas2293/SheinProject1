@Anindita

Feature: This feature is for testing homePageTest features

  Background: Data Preperation step (works like before method)
    Given At homepage go to SearchBar and select "Saree"
    When after search get all links
    And At search page validate pageTitle is "Saree"


  Scenario: Positive testcase to Select Saree to click link 1
    Then At search page click on link number "1"

  @smketest
  Scenario: Positive testcase to Select Saree to click link 2
    Then At search page click on link number "2"

