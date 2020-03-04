Feature: This is for Web Order all products

  Scenario: Validation of all products data
    Given the user navigate to the Web Orders page
    When the user provide valid username
    And the user provide valid password
    Then the user click view all products button
    And the user validate product table