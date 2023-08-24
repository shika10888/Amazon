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
Feature: Sign in
 
  Scenario: Checking for the functionality of Sign in for customers already having account on Amazon
    Given User must be on Homepage by clicking url "https://www.amazon.ca/"
    And click on Sign in
    
    When Enter Valid Email or Mobile number
    And click on continue Button
   
    Then User must be navigated to Password field
    And click on Sign in Button
  