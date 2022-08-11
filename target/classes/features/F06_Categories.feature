@regression

Feature: Logged user could select different Categories

  Background: user opens chrome browser.
    And user navigates to login page:"https://demo.nopcommerce.com/login?returnUrl=%2F"
    #When user enters  login email
    #And user enters login password
    #And user press on login button
    # Test Scenario 6
    Scenario: Logged user will select Computers Category and then select Desktops subcategory
      and again choose Apparel Category and then select shoes subcategory

      Given user select Computers Category
      And user select Desktops subcategory
      And make sure the select success1

      Given user choose Apparel
      And user choose shoes subcategory
      And make sure the select success2


