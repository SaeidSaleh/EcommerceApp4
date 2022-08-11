@regression

Feature:Logged user could add different products to compare list
  Background: user opens chrome browser.
    And user navigates to login page:"https://demo.nopcommerce.com/login?returnUrl=%2F"
    #When user enters  login email
    #And user enters login password
    #And user press on login button

    #Test Scenario 10
    # adding shoes
  Scenario: user could add shoes to Compare list

    Given user choose Apparel
    And user choose shoes subcategory
    And user choose red shoes
    And user choose size
    And user add shoes to Compare list
    And user make sure to add product to Compare list

    #Test Scenario 10"
    # adding digital storm
  Scenario: user add digital storm to Compare list

    Given user select Computers Category
    And user select Desktops subcategory
    And user add digital storm to Compare list
    And user make sure to add product to Compare list
