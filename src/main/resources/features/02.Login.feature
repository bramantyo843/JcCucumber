Feature: Login User

  Scenario: User valid login
    When User enter username password valid
    And User click button login valid
    Then User valid credentials