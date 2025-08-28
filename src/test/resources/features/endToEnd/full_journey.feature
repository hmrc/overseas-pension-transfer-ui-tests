@Test @E2E @acceptance
Feature: Is journey fully connected

  Background: Common Steps
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "What You Will Need Page"
    When I enter Enrollment Key "HMRC-PODS-ORG", Identifier Name "PSAID" and Identifier Value "2131231231231" on "Auth Login Stub Page"
    And I click submit button on "Auth Login Stub Page"


  Scenario:1. Full Members Journey - Member is currently UK resident
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
    Then I am presented with the "Members Current Address Page"
    When I enter the following data into corresponding input fields on "Members Current Address Page"
      | addressLine1 | 12 Burlington Avenue |
      | addressLine2 | Burlington Road      |
      | addressLine3 | Maidenhead           |
      | addressLine4 | Berkshire            |
      | countryCode  | United Kingdom       |
      | postcode     | AB12CD               |
      | poBox        | 11223344             |
    And I click save and continue button on "Members Current Address Page"
    Then I am presented with the "Is Member Currently UK Resident Page"
    When I select radio button "Yes" on "Is Member Currently UK Resident Page"
    And I click save and continue button on "Is Member Currently UK Resident Page"
    Then I am presented with the "Member Details Check Your Answers Page"

  Scenario:2. Full Members Journey - Member is not currently or ever been UK resident
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
    Then I am presented with the "Members Current Address Page"
    When I enter the following data into corresponding input fields on "Members Current Address Page"
      | addressLine1 | 12 Burlington Avenue |
      | addressLine2 | Burlington Road      |
      | addressLine3 | Maidenhead           |
      | addressLine4 | Berkshire            |
      | countryCode  | United Kingdom       |
      | postcode     | AB12CD               |
      | poBox        | 11223344             |
    And I click save and continue button on "Members Current Address Page"
    Then I am presented with the "Is Member Currently UK Resident Page"
    When I select radio button "No" on "Is Member Currently UK Resident Page"
    And I click save and continue button on "Is Member Currently UK Resident Page"
    Then I am presented with the "Has Member Ever Been UK Resident Page"
    When I select radio button "No" on "Has Member Ever Been UK Resident Page"
    And I click save and continue button on "Has Member Ever Been UK Resident Page"
    Then I am presented with the "Member Details Check Your Answers Page"

  Scenario:3. Full Members Journey - Member is not currently but has been UK resident with Address Lookup
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
    Then I am presented with the "Members Current Address Page"
    When I enter the following data into corresponding input fields on "Members Current Address Page"
      | addressLine1 | 12 Burlington Avenue |
      | addressLine2 | Burlington Road      |
      | addressLine3 | Maidenhead           |
      | addressLine4 | Berkshire            |
      | countryCode  | United Kingdom       |
      | postcode     | AB12CD               |
      | poBox        | 11223344             |
    And I click save and continue button on "Members Current Address Page"
    Then I am presented with the "Is Member Currently UK Resident Page"
    When I select radio button "No" on "Is Member Currently UK Resident Page"
    And I click save and continue button on "Is Member Currently UK Resident Page"
    Then I am presented with the "Has Member Ever Been UK Resident Page"
    When I select radio button "Yes" on "Has Member Ever Been UK Resident Page"
    And I click save and continue button on "Has Member Ever Been UK Resident Page"
    Then I am presented with the "Member Details Check Your Answers Page"
    When I select radio button "Yes" on "Has Member Ever Been UK Resident Page"
    And I click save and continue button on "Has Member Ever Been UK Resident Page"
    Then I am presented with the "Members Last UK Address Lookup Page"
    When I enter the following data into corresponding input fields on "Members Last UK Address Lookup Page"
      | value | ZZ11ZZ |
    And I click save and continue button on "Members Last UK Address Lookup Page"
    And I am presented with the "Select Members Last UK Address Page"
    And I select radio button "2 Other Place, Some District, ZZ1 1ZZ" on "Select Members Last UK Address Page"
    And I click save and continue button on "Select Members Last UK Address Page"
    And I am presented with the "Confirm Members Last UK Address Page"
    And I click save and continue button on "Confirm Members Last UK Address Page"
    And I am presented with the "Member Date Of Leaving UK Page"
    When I enter the following data into corresponding input fields on "Member Date Of Leaving UK Page"
      | day   | 1    |
      | month | 12   |
      | year  | 1991 |
    And I click save and continue button on "Member Date Of Leaving UK Page"
    Then I am presented with the "Member Details Check Your Answers Page"

  Scenario:4. Full Members Journey - Member is not currently but has been UK resident with manual address entry
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
    Then I am presented with the "Members Current Address Page"
    When I enter the following data into corresponding input fields on "Members Current Address Page"
      | addressLine1 | 12 Burlington Avenue |
      | addressLine2 | Burlington Road      |
      | addressLine3 | Maidenhead           |
      | addressLine4 | Berkshire            |
      | countryCode  | United Kingdom       |
      | postcode     | AB12CD               |
      | poBox        | 11223344             |
    And I click save and continue button on "Members Current Address Page"
    Then I am presented with the "Is Member Currently UK Resident Page"
    When I select radio button "No" on "Is Member Currently UK Resident Page"
    And I click save and continue button on "Is Member Currently UK Resident Page"
    Then I am presented with the "Has Member Ever Been UK Resident Page"
    When I select radio button "Yes" on "Has Member Ever Been UK Resident Page"
    And I click save and continue button on "Has Member Ever Been UK Resident Page"
    Then I am presented with the "Member Details Check Your Answers Page"
    When I select radio button "Yes" on "Has Member Ever Been UK Resident Page"
    And I click save and continue button on "Has Member Ever Been UK Resident Page"
    Then I am presented with the "Members Last UK Address Lookup Page"
    When I click on "enter the address manually" hyperlink on "Members Last UK Address Lookup Page"
    And I am presented with the "Members Last UK Address Page"
    When I enter the following data into corresponding input fields on "Members Last UK Address Page"
      | addressLine1 | 12 Burlington Avenue |
      | addressLine2 | Burlington Road      |
      | postcode     | AB12CD               |
    And I click save and continue button on "Members Last UK Address Page"
    Then I am presented with the "Member Date Of Leaving UK Page"
    When I enter the following data into corresponding input fields on "Member Date Of Leaving UK Page"
      | day   | 1    |
      | month | 12   |
      | year  | 1991 |
    And I click save and continue button on "Member Date Of Leaving UK Page"
    Then I am presented with the "Member Details Check Your Answers Page"

  Scenario:5. Full Members Journey - Member is currently UK resident with no Nino
    Then I navigated to the "Member Name Page"
    When I enter the following data into corresponding input fields on "Member Name Page"
      | firstName | John |
      | lastName  | Doe  |
    And I click continue button on "Member Name Page"
    Then I am presented with the "Member Nino Page"
    When I click on "Member doesn't have a National Insurance number." hyperlink on "Member Nino Page"
    And I am presented with the "Member Does Not Have NINO Page"
    When I enter "This is the reason for not having NINO" in the textarea field on "Member Does Not Have NINO Page"
    And I click save and continue button on "Member Does Not Have NINO Page"
    Then I am presented with the "Member Date Of Birth Page"
    When I enter the following data into corresponding input fields on "Member Date Of Birth Page"
      | day   | 31   |
      | month | 12   |
      | year  | 1991 |
    And I click save and continue button on "Member Date Of Birth Page"
    Then I am presented with the "Members Current Address Page"
    When I enter the following data into corresponding input fields on "Members Current Address Page"
      | addressLine1 | 12 Burlington Avenue |
      | addressLine2 | Burlington Road      |
      | addressLine3 | Maidenhead           |
      | addressLine4 | Berkshire            |
      | countryCode  | United Kingdom       |
      | postcode     | AB12CD               |
      | poBox        | 11223344             |
    And I click save and continue button on "Members Current Address Page"
    Then I am presented with the "Is Member Currently UK Resident Page"
    When I select radio button "Yes" on "Is Member Currently UK Resident Page"
    And I click save and continue button on "Is Member Currently UK Resident Page"
    Then I am presented with the "Member Details Check Your Answers Page"