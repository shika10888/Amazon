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
Feature: Your Account

  
  Scenario: Checking for the functionality of Login Message
    Given User must be on Homepage by clicking url "https://www.amazon.ca/"
    And click on Signin
      
    When Enter Email or Mobile number and Password
    And click on Signin Button
 
    Then Login message should be displayed as "Hello Username Accounts & Lists"

  