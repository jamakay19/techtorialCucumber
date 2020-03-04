Feature: WebOrders login functionality;
  Background:
    Given the user navigate to the Web Orders page
@positive
  Scenario: WebOrders login positive testing 1

    When the user provide valid username
    And the user provide valid password
    Then the user should see home page
@negative @smoke
  Scenario: WebOrders login negative testing
    When the user provide username "Test"
    And  the user provide password "admin"
    Then the user validate text "Invalid Login or Password."
@negative @smoke
  Scenario: WebOrder login negative testing with numbers
    When the user provide username 1234
    And  the user provide password 4567
    Then the user validate text "Invalid Login or Password."
@menuList
  Scenario: WebOrder login negative testing 2
    When the user provide username "Tester" and password "tt"
    Then the user validate text "Invalid Login or Password."

  Scenario: WebOrders menu positive testing 2
    Then the user validate order menu list