@Test @MemberDetails @acceptance
Feature: Is member details journey fully connected

Background: Common Steps - Member Details Journey
  Given I cleared the data for the service
  When I navigate to the "Auth Login Stub Page"
  And I enter redirect URL on Auth Login Stub Page for "What You Will Need Page"
  When I enter Enrollment Key "HMRC-PODS-ORG", Identifier Name "PSAID" and Identifier Value "2131231231231" on "Auth Login Stub Page"
  And I click submit button on "Auth Login Stub Page"


  Scenario:1. Positive journey - PSA/PSP can navigate full members detail journey ROUTE 1
    Then I navigated to the "Member Name Page"
    When I enter the following data into corresponding input fields on "Member Name Page"
      | firstName | John |
      | lastName  | Doe  |
    And I click continue button on "Member Name Page"
    Then I am presented with the "Member Nino Page"
    When I enter the following data into corresponding input fields on "Member Nino Page"
      | value | QQ123456A |
    And I click save and continue button on "Member Nino Page"
    Then I am presented with the "Member Date Of Birth Page"
    When I enter the following data into corresponding input fields on "Member Date Of Birth Page"
      | day   | 31   |
      | month | 12   |
      | year  | 1991 |
    And I click save and continue button on "Member Date Of Birth Page"
    Then I am presented with the "Members Current UK Address Page"