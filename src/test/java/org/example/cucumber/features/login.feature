Feature: login
  I want to login into the application as an admin user

  Scenario: login as admin using chrome browser
    Given I am in the landing page using "chrome"
    When I login into the application using admin credentials
    Then I should get to the admin dashboard page

  Scenario: login as admin using firefox browser
    Given I am in the landing page using "firefox"
    When I login into the application using admin credentials
    Then I should get to the admin dashboard page

  Scenario: login with invalid credentials
    Given I am in the landing page using "firefox"
    When I login with invalid credentials
    Then Login fails

