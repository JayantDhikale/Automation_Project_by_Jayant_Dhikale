
Feature: Login Page feature

  @login
  Scenario: Verify Login Page
    Given User is on login page url "https://www.saucedemo.com/"
    Then Login logo is displayed
    Then Username field is displayed
    Then Password field is displyed
    Then Login button is displayed
    Then Accceptable usernames are displayed below login button
    Then Accceptable password is displayed below login button
    When User enters username as "standard_user"
    When User enters password as "secret_sauce"
    When user clicks on login  button
    Then Inventory page is displyed with url "https://www.saucedemo.com/inventory.html"