Feature: Checkout Step Two Page Feature

  @Checkoutstep2
  Scenario: Verify Checkout Step two Page
    Given User is on Checkout step two page 
    Then Page title is displyed "Checkout: Overview"
    And Cart quantity label is displayed on screen 
    And Cart description label is displayed on screen
    And Product name is displayed
    And Product description is displayed
    And Payment information is displyed
    And Shipping information is displayed
    And Price is displyed along with item price and tax
    And Total price to be paid is displyed
    And Cancel  buttons is displayed
    And Finish buttons is displayed
		When User clicked on finish button
    Then Checkout-complete page is displyed with url "https://www.saucedemo.com/checkout-complete.html"