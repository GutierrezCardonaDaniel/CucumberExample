Feature: multiply
  new multiplication feature for the calculator

  Scenario Outline: multiply two numbers
    Given the first number is <n1>
    And the second number is <n2>
    When the calculator multiplies both numbers
    Then the resulting value should be <result>

    Examples:
      | n1 | n2 | result |
      | 1  | 3  | 3      |
      | 3  | 5  | 15     |
      | 6  | 0  | 1      |

  Scenario: multiply two numbers directly
    Given the first number is 2
    And the second number is 2
    When the calculator multiplies both numbers
    Then the resulting value should be 4
