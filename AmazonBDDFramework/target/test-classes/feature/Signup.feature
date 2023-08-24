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
Feature: Creating new account by clicking on Start here button
  
  
  Scenario: Clicking on Start Here button on Amazon Homepage
    Given User must be on Homepage by clicking url "https://www.amazon.ca/"
    
    When User clicks on Start Here Button
    
  
    Then Create Account dialogbox must be displayed.
    And Enter valid Your name , Mobile number or Email , Password and Password Again on Create Account form
    And Click on Continue Button
  
  