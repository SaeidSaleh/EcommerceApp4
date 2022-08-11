@regression

Feature:Logged user could Create successful Order
  Background: user opens chrome browser.
    And user navigates to login page:"https://demo.nopcommerce.com/login?returnUrl=%2F"
    When user enters  login email
    And user enters login password
    And user press on login button
  #Test Scenario 12
  Scenario: user make successful order
    Given user select Computers Category
    And user select Desktops subcategory
    And user add digital storm to cart
    And user click on shopping cart
    And user agree on terms and conditions
    And user enter shopping data
    And user press continue 3 times one by one
    And user confirm order
    #And user make sure of making order
