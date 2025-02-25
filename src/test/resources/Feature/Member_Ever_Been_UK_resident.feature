@AllTests @Membercurrentlyresident
Feature: Testing of screen "Is undefined currently a resident of UK for tax purposes?"

  Background: : Common Steps - Is Member a resident of UK
    Given I access the url "http://localhost:15600/overseas-pension-transfer-frontend/member-has-ever-been-resident-uk"
    When I see the page "Member ever been UK Resident page"
    And I see the heading "Has Unidentified Unidentified ever been a resident in the UK for tax purposes?"
    And I see the sentence "Select One"
    And I see a radio button "Yes"
    And I see a radio button "No"
    And I see the sentence "Return to task list"


  @Test
  Scenario:1- Positive Journey - Select 'Yes' radio button
    When I select radio button "Yes" on "Member ever been UK Resident page"
    And I click continue button on "Member current UK Resident page"
    Then I am presented with the page "overseas pension transfer frontend page"
    When I click continue button on "overseas pension transfer frontend page"
    And I am presented with the page "member's name page"

@Test
  Scenario:1- Positive Journey - Select 'No' radio button
    When I select radio button "No" on "Member ever been UK Resident page"
    And I click continue button on "Member current UK Resident page"
    Then I am presented with the page "overseas pension transfer frontend page"
    When I click continue button on "overseas pension transfer frontend page"
    And I am presented with the page "member's name page"

  @Test
    Scenario:1- Positive Journey - Select 'No' radio button
      When I click continue button on "Member current UK Resident page"
      And I see the sentence "There is a problem"
      And I see the sentence "Select one option"
