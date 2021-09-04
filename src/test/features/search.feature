Feature: Search Test
  Desc

  @search @reg @smoke
  Scenario: Verify search with product name

    Given I Open Home Page "http://www.next.co.uk"
    When I enter searchTerm "Jeans"
    And I click search icon
    Then I should be re-directed to search results with page with heading as "Jeans"
    And I should see the relevant results "Jeans"
