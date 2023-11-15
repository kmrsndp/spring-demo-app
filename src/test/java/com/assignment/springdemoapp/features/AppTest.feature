Feature: Demo app test

  @Login @Smoke
  Scenario Outline: Should test Demo app login with multiple users
    Given user is on the application login page
    When user enters "<username>" and "<password>"
    And clicks on submit
    Then user should be able to log in
    And user should be redirected to homepage
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |
      | problem_user  | secret_sauce |
