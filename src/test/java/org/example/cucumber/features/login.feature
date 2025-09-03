Feature: login
  User wants to login into the application with Admin role

  Scenario Outline: login as admin using chrome browser
    Given user is in the landing page using "<browser>"
    When user logs into the application using admin credentials
    Then user should get to the admin dashboard page

    Examples:
      | browser |
      | chrome  |
      | firefox |

  Scenario: login as admin using firefox browser
    Given user is in the landing page using "firefox"
    When user logs into the application using admin credentials
    Then user should get to the admin dashboard page

  Scenario: login with invalid credentials
    Given user is in the landing page using "chrome"
    When user logs in with invalid credentials
    Then login fails

  Scenario: login with invalid credentials fail
    Given user is in the landing page using "chrome"
    When user logs into the application using admin credentials
    Then login fails