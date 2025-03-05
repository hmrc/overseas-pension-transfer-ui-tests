@AllTests @Membercurrentlyresident
Feature: Testing of screen "Is undefined currently a resident of UK for tax purposes?"

  Background: Common Steps - Is Member a resident of UK
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "Member currently UK resident"
    And I click submit button on "Auth Login Stub Page"
    Then I am presented with the " Has Jon Doe ever been a resident in the UK for tax purposes? Page"
    And I should see the following text on the page
      | Has Jon Doe ever been a resident in the UK for tax purposes? |
    And I should see the following text on the page
      | Select One |
    And I should see the following text on the page
      | Yes |
    And I should see the following text on the page
      | No |
    And I should see the following text on the page
      | save and continue |


  @Test
  Scenario:1- Positive Journey - Select 'Yes' radio button
    When I select radio button "Yes" on "Member ever been UK Resident page"
    And I click continue button on "Member ever been UK Resident page"
    Then I am presented with the "overseas pension transfer frontend page"
    When I click continue button on "overseas pension transfer frontend page"
    And I am presented with the "member's name page"

@Test
  Scenario:1- Positive Journey - Select 'No' radio button
    When I select radio button "No" on "Member ever been UK Resident page"
    And I click continue button on "Member ever been UK Resident page"
    Then I am presented with the "overseas pension transfer frontend page"
    When I click continue button on "overseas pension transfer frontend page"
    And I am presented with the "member's name page"

  @Test
    Scenario:1- Positive Journey - Select 'No' radio button
      When I click continue button on "Member ever been UK Resident page"
    Then I should see the following text on the page
      | There is a problem |
    And I should see the following text on the page
      | Select one option |
    When I select radio button "Yes" on "Member ever been UK Resident page"
    And I click continue button on "MMember ever been UK Resident page"
    Then I am presented with the "overseas pension transfer frontend page"
    When I click continue button on "overseas pension transfer frontend page"
    And I am presented with the "member's name page"