Feature: Validation of Product information
  Background:
    Given the user navigate to the Web Orders page
    When the user provide  username "Tester"
    And the user provide  password "test"

  Scenario Outline: Validation of Edit Order
  *the user click edit button
  *the user change <customerName>
  *the user change <street>
  *the user change <city>
  *the user change <state>
  *the user change <zip>
    Examples:
      | customerName | street       | city        | state | zip   |
      | Muammer      | 2200 e devon | Des Plaines | IL    | 60018 |
    When the user click update button
    Then the user validate updated order info
