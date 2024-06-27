Feature: WordPress site navigation

  Scenario: Verify title and download WordPress
    Given I launch the WordPress URL
    Then I should see the page title as "Blog Tool, Publishing Platform, and CMS — WordPress.org"
    When I mouse over the download menu
    And I click on the Get WordPress option
    Then I should see the text "Get WordPress"

  Scenario: Verify photo directory
    Given I am on the WordPress homepage
    When I click on the Community menu
    And I click on the Photo Directory option
    And I search for "coffee"
    Then I should see pictures displayed
