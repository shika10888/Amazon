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
@signed_in
Feature: Sorting
 
  Scenario: Checking for the functionality of Sorting 
    
    Given User should be on User Account Page
    
    When User enters any keyword.Click on Search 
    And Click on Sort option & select price Low to high sorting criteria
    
    Then Items with the least price must be displayed first followed by items of higher price.

 