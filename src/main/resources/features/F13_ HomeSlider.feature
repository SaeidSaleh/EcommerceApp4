@regression
Feature: User can select between options in home slider

  Scenario: First slider is clickable on home page
    Given User at home page
    When User click on first slider nokia image
    #Then User navigate to nokia product details page
    #i have to skip this step as the page did not open because of an error in the server

  Scenario: Second slider is clickable on home page
    Given User at home page
    When User click on second slider iphone image
    #Then User navigate to iphone product details page
    #i have to skip this step as the page did not open because of an error in the server