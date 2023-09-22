Feature: Test Login functionality

  Scenario Outline: check user can login successfully
    Given browser is opened
    When user enters <username> and <password>
    And user clicks the login button
    Then user is navigated to the home page and sees title

    Examples: 
      | username        | password     |
      | standard_user   | secret_sauce |
      | problem_user    | secret_sauce |
      | locked_out_user | secret_sauce |
