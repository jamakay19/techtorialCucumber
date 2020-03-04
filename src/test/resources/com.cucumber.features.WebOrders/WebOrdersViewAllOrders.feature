Feature: This is for test view all products page
  @smoke
  Scenario: WebOrders login positive testing 1
    Given the user navigate to the Web Orders page
    When the user provide valid username
    And the user provide valid password
    Then  the user validate the text "List of All Orders"

