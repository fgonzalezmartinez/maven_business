@tag
Feature: Validate Employees API

  @GETWithoutParams
  Scenario: Validate user can get and array of employees
    Given User sets valid auth key
    When User sends a Get request to /users "/users"
    Then User should get 200 as Expected Status Code
    And User should get an array of employees