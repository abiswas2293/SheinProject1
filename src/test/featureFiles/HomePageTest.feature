@Anindita

Feature: This feature is for testing homePageTest features


  @smketest
  Scenario: Positive testcase to Select Saree
    Given At homepage go to SearchBar and select "Saree"
    When after search get all links
    And At search page validate pageTitle is "Saree"
    Then At search page click on link number "1"

  Scenario: Positive testcase to Select Shirt
    Given At homepage go to SearchBar and select "Shirt"
    When after search get all links
    And At search page validate pageTitle is "Shirt"
    Then At search page click on link number "1"


  Scenario Outline: Positive testcase to Select <Product name>
    Given At homepage go to SearchBar and select "<Product name>"
    When after search get all links
    And At search page validate pageTitle is "<Product name>"
    Then At search page click on link number "<link number>"

    Examples:
      | Product name | link number |
      | jeans        | 1           |
      | tshirt       | 4           |
      | bag          | 7           |
      | shoe         | 1           |

