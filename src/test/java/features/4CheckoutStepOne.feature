Feature: Checkout Step one Page feature

  @Checkoutstep1
  Scenario: Verify Checkout Step one Page
    Given User is on Checkout step one page 
    Then Page title is displyed as "Checkout: Your Information"
    Then First name field is displayed
    Then Last name field is displayed
    Then Postal code field is displayed
    Then Cancel buttons is displayed
		Then Continue buttons is displayed  
		When User entered firstname as "Jayant"
		When User entered lastname as "Dhikale"
		When User entered postal code as "123456"
		When User clicked on Continue button
    Then Checkout step two page is displyed with url "https://www.saucedemo.com/checkout-step-two.html"