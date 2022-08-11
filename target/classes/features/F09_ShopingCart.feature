@regression

Feature:Logged user could add different products to Shopping cart
  Background: user opens chrome browser.
    And user navigates to login page:"https://demo.nopcommerce.com/login?returnUrl=%2F"
    #When user enters  login email
    #And user enters login password
    #And user press on login button

    #Test Scenario 9 #adding shoes
  Scenario: user could add shoes to shopping cart

    Given user choose Apparel
    And user choose shoes subcategory
    And user add shoes to cart first step
    And user choose size
    And user add shoes to cart final step
    And user make sure to add product to cart

    #Test Scenario 9" adding digital storm
  Scenario: user could add digital storm to shopping cart
    Given user select Computers Category
    And user select Desktops subcategory
    And user add digital storm to cart
    And user make sure to add product to cart
