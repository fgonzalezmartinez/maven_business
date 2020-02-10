Feature: Buy a product
  As an user I should be able to login to the page
  so I can buy the product

  Scenario: The users should be able to buy an object
    Given The user logs in as user "test800@hotmail.com" with password "test123"
    When The user clicks the women menu
    And The user adds a product to the cart
    And The user proceeds to checkout