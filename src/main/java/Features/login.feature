Feature: Google page searching feature.
#Scenario: Google page searching Test Scenario
#Given user is on searching page
#When title of page is Google
#Then user enter information they want to search
#And close browser


#username=====================//input[@name='username']
#pass=============//input[@name='password']
#loginBTM========//input[@type='submit']

Scenario Outline: Google page searching Test Scenario


Given user is on searching page
When title of page is Google
Then user enter information they want to search
And close browser



Examples:


    |    information  |
    
    #use Scenario Outline when using examples.
    #use Scenario when there is no examples.