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
Feature: Application Login
  I want to use this template for my feature file

  @Regtest
  Scenario: Home page Default login
    Given User is on landing Page
    ##And some other precondition
    When User loging with user "user1" and password "tt"
   # And some other action
    #And yet another action
    Then Home Page is poulated
    And Cards are displayed

	@Regtest
  Scenario: Home page Default login2
    Given User is on landing Page
    ##And some other precondition
    When User loging with user "userpepe" and password "kk"
   # And some other action
    #And yet another action
    Then Home Page is poulated
    And Cards are displayed
  
  @Smoketest @MobTest
  Scenario: Home page Default login Mobtest
    Given User is on landing Page
    ##And some other precondition
    When User loging with next dateils
   	| jenny | ariveros | auiuh@hjkl.com | 1234 |
   # And some other action
    #And yet another action
    Then Home Page is poulated
    And Cards are displayed
  
  	@Smoketest @WebTest
    Scenario Outline:: Home page Default login With different Data webtest
    Given User is on landing Page
    ##And some other precondition
    When User loging with users <Username> and passwords <Password>
   # And some other action
    #And yet another action
    Then Home Page is poulated
    And Cards are displayed
    
    Examples:
		|Username |Password |
		|User1		|Pass1		|
		|User2		|Pass2		|
		|User3		|Pass3		|
		|User4		|Pass4		|
		|User5		|Pass5		|
  