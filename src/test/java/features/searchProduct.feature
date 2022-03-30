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
Feature: Search Product in test web
  I want to use this template for my feature file

  @SearchProductTest
  Scenario: Search Product Tom
    Given User is on Greencart website
    When User searched with shortname "Tom" and extracted actual name of product
    Then User searched for same Shortname "Tom" in offers page to check if product exist
    And Validate product name in offers page match with landing page
    
    @SearchProductTest
  Scenario Outline: Search Product whit many Parameters
    Given User is on Greencart website
    When User searched with shortname <name> from list and extracted actual name of product
    Then User searched for same Shortname <name> from list in offers page to check if product exist
    And Validate product name in offers page match with landing page
    
    Examples:
		|name|
		|Tom|
		|Beet|