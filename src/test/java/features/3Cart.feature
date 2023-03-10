
Feature: Cart Page feature

  @Cart
  Scenario: Verify Cart Page
    Given User is on Cart page 
    Then Page title is displyed as  "Your Cart"
    Then Cart quantity label is displayed
    Then Cart description label is displayed
    Then Item name is displayed as "Sauce Labs Backpack"
    Then Remove buttons is displayed
		Then Continue shopping buttons is displayed 
		Then Checkout buttons is displayed   
		When User clicked on Checkout button
    Then Checkout step one page is displyed with url "https://www.saucedemo.com/checkout-step-one.html"