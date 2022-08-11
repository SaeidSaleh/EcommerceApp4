@regression

Feature:Logged user could add different products to Wishlist
  Background: user opens chrome browser.
    And user navigates to login page:"https://demo.nopcommerce.com/"

    #Test Scenario 10 #adding shoes
  Scenario: user could add shoes to wishlist

    Given user choose Electronics
    And user choose cell camera & photos subcategory
    And user add camera to wishlist
    And user make sure to add product to wishlist

    #Test Scenario 10" adding digital storm
  Scenario: user add digital storm to wishlist

    Given user select Computers Category
    And user select Desktops subcategory
    And user add digital storm to wishlist
    And user make sure to add product to wishlist
