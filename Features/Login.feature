Feature: Login functionality for store.demoqa.com

#  Scenario: Verify that user is able to successfully login to demoqa.com website
#      Given User is on store.demoqa.com
#      When User clicks on MyAccount link
#      Then User is taken to Login Page
#      When User enters a valid username and password
#      Then User is able to login

  Scenario: Verify that when the user clicks on MyAccount link then Login page is displayed
      Given User is on store.demoqa.com
      When User clicks on MyAccount link
      And User clicks on the Log in link in the side menu
      Then User is taken to Login Page

#  Scenario: Verify that user is able to login using valid username and password
#      Given User is on store.demoqa.com
#      When User clicks on MyAccount link
#      And User logs in using valid username and password
#      Then User is taken to MyAccount page

  Scenario: Verify that user is not able to login using invalid username and a valid password
      Given User is on store.demoqa.com
      When User clicks on MyAccount link
      And User logs in using an invalid username and valid password
      Then User is shown invalid login message