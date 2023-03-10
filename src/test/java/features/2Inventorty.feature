
Feature: Inventory Page feature

  @Inventory
  Scenario: Verify Inventory Page
    Given User is on Inventory page
    Then App logo is displayed
    Then Options Menu is displayed
    Then Cart button is displayed
    Then Product sorting button is displyed 
    Then Page title is displyed as "Products"
    Then All inventory products are displayed
    Then Add to cart buttons are displayed
    Then Social media handles are displayed on footers left hand side
    When User choosed a product and clicked on add to cart button
    When user clicks on Cart  button
    Then Cart page is displyed with url "https://www.saucedemo.com/cart.html"