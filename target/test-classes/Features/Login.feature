#@ignore
Feature: Login Page
  As an user I should be able to login to the page
  so I can buy the product

#  @ignore
  Scenario: The user should be able to log in
    Given The user enters to login page
    When The user enters username as "test800@hotmail.com"
    And The user enters password as "test123"
    And A check-mark is displayed
    And The user clicks on sign in button
    Then The user should be logged correctly

  Scenario: The user should NOT be able to log in due to a wrong password
    Given The user enters to login page
    When The user enters username as "test800@hotmail.com"
    And The user enters password as "wrong_password"
    And The user clicks on sign in button
    Then Error message should be displayed

#  @ignore
  Scenario: The user should NOT be able to log in due to a wrong email
    Given The user enters to login page
    When The user enters username as "test800hotmail.com"
    And The user enters password as "test123"
    Then A red cross should be displayed

  Scenario: Error message is displayed when fields are left blanks
    Given The user enters to login page
    When The user enters username as ""
    And The user enters password as ""
    And The user clicks on sign in button
    Then Error message should be displayed

  Scenario: Error message is displayed when fields password is left blank
    Given The user enters to login page
    When The user enters username as "test800@hotmail.com"
    And The user enters password as ""
    And The user clicks on sign in button
    Then Error message should be displayed