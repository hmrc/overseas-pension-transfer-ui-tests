@Test @IsCurrentlyResident
Feature: Is the member currently a resident of UK for tax purposes?

  Background: Common Steps - Member Details Journey
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "Is Member currently a resident of UK"
    And I click submit button on "Auth Login Stub Page"
    Then I am presented with the "Is member a resident in the UK for tax purposes? Page"
    And I should see the following text on the page
      | Is Jon Doe currently a resident in the UK for tax purposes? |
      | Select One                                                  |
      | Yes                                                         |
      | No                                                          |
      | save and continue                                           |

  @Test
  Scenario Outline: Positive Journey - Select '<option>' radio button
    When I select radio button "<option>" on "Member current UK Resident page"
    And I click continue button on "Member current UK Resident page"
    Then I am presented with the "overseas pension transfer frontend page"
    When I click continue button on "overseas pension transfer frontend page"
    And I am presented with the "member's name page"

    Examples:
      | option |
      | Yes    |
      | No     |

  @Test
  Scenario: Negative Journey - No Selection Error
    When I click continue button on "Member current UK Resident page"
    Then I should see the following text on the page
      | There is a problem |
      | Select one option  |
    When I select radio button "Yes" on "Member current UK Resident page"
    And I click continue button on "Member current UK Resident page"
    Then I am presented with the "overseas pension transfer frontend page"
    When I click continue button on "overseas pension transfer frontend page"
    And I am presented with the "member's name page"