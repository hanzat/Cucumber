Feature: Google page searching feature.
#Scenario: Google page searching Test Scenario
#Given user is on searching page
#When title of page is Google
#Then user enter information they want to search
#And close browser





Scenario Outline: Google page searching Test Scenario


Given user is on searching page
When title of page is Google
Then user enter <information> they want to search
And close browser



Examples:


    |    information  |
    
    