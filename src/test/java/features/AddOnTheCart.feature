#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Add product on the cart
  I want to use this template for my feature file

  @AddProductOnTheCart
  Scenario: Add product on the cart
    Given User is on Greencart website
    When User searched with shortname "Tom" and extracted actual name of product
    And User add one more the product "Tomato"
    And User click on to Add to cart from the product "Tomato"
    Then User verifie if buttons exist
    And User verifie if the products "Tomatooo" are on the cartpage