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
Feature: Title of your feature
	I want to use this template for my feature file

Scenario Outline: Navigate menu bar to verify artical in the page
    Given the page "http://buitech.co.uk/" is visited
    And maximize the window
    When "link=NEWS" element is clicked
    And "<Element>" is scrolled into view
    And "<Element>" element is clicked
    Then assert that the page title is "<Page Title>"
    And assert that the url is "<Url>"
    And assert that the text "css=h1" element is "<Header>"

    Examples: 
      | Element                            | Page Title                    | Url                                                                 | Header                        |
      | link=Testing, why bother?          | Testing, why not bother?      | http://buitech.co.uk/software-testing-news/testing-why-bother       | Testing, why bother?          |
      | link=Screens are the new printers! | Screens are the new printers! | http://buitech.co.uk/software-testing-news/screens-are-new-printers | Screens are the new printers! |
      | link=Eating your own dog food      | Eating your own dog food      | http://buitech.co.uk/software-testing-news/eating-your-own-dog-food | Eating your own dog food      |
