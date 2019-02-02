Feature: Home page
  As a team leaf, when i enter correct login information,
  I should be able to login

  Scenario: login as team lead

    Given user is on the login page
    When user logs in as a team lead
    Then homepage should be displayed
