Feature: YouTube Video Search and Validation

  Scenario Outline: Search and validate video titles on YouTube
    Given User is on YouTube homepage
    When User searches for "<keyword>"
    And User applies Video filter
    And User selects the <index> video
    Then Video title should match

    Examples:
      | keyword                  | index |
      | Selenium Tutorial       | 3     |
      | Test Automation Tutorial| 3     |
      | Selenium Tutorial       | 10    |