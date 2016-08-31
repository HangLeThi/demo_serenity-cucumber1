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
Feature: Test Buitech website
  in order to verify that all links in website are work correctly

  @tag1
  Scenario Outline: verify the menu
    Given Buitech home page "http://buitech.co.uk/" is opened
    And It is maximized
    When "<Element>" is clicked
    #And the "<Element>" is scroll
    # And I Scroll down to verify the title
    And the "<Title Page>" is displayed

    
    Examples: 
      | Element                | Title Page        |
      | Link=testing-services  | Testing Services  |
      | Link=testing-solutions | Testing Solutions |
      | Link=resources         | Resources         |
      | Link=clients           | Clients           |
      | /                      | Home              |
