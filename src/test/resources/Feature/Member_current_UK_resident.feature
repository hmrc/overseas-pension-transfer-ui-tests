@AllTests @Membercurrentlyresident
Feature: Testing of screen "Is undefined currently a resident of UK for tax purposes?"

  Background: : Common Steps - Is Member a resident of UK
    Given I access the url "http://localhost:15600/overseas-pension-transfer-frontend/member-is-resident-uk"
    When I see the page "Member current UK Resident page"
    And I see the heading "Is undefined currently a resident of UK for tax purposes?"
    And I see the sentence "Choose One"
    And I see a radio button "Yes"
    And I see a radio button "No"
    And I see the sentence "Return to task list"
    And I see the sentence "Is this page not working properly? (opens in new tab)"

  @Test
  Scenario:1- Positive Journey - Select 'Yes' radio button
    When I select the radio button "Yes" on "Member current UK Resident page"
    And I click continue button on "Member current UK Resident page"
    Then I see the page "overseas pension transfer frontend page"
    When I click continue button on "overseas pension transfer frontend page"
    And I see the page "member's name page"

@Test
  Scenario:1- Positive Journey - Select 'No' radio button
    When I select the radio button "No" on "Member current UK Resident page"
    And I click continue button on "Member current UK Resident page"
    Then I see the page "overseas pension transfer frontend page"
    When I click continue button on "overseas pension transfer frontend page"
    And I see the page "member's name page"

  @Test
    Scenario:1- Positive Journey - Select 'No' radio button
      When I click continue button on "Member current UK Resident page"
      And I see the sentence "There is a problem"
      And I see the sentence "Select one option"
