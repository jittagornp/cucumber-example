Feature: Calculator

  Scenario: add1
    Given x is 1 and y is 2
    When x plus y
    Then the result should be 3

  Scenario: add2
    Given x is 10 and y is 20
    When x plus y
    Then the result should be 30

  Scenario: minus
    Given x is 5 and y is 3
    When x minus y
    Then the result should be 2

  Scenario: multiply
    Given x is 2 and y is 3
    When x multiplied by y
    Then the result should be 6

  Scenario: divide
    Given x is 6 and y is 3
    When x divided by y
    Then the result should be 2