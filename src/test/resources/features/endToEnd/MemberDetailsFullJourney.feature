@Test @MembersE2E @acceptance @regression
Feature: Is the members details journey fully connected

  Background: Common Steps
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "Journey entry URL"
    When I enter Enrollment Key "HMRC-PODS-ORG", Identifier Name "PSAID" and Identifier Value "A2100005" on "Auth Login Stub Page"
    And I click submit button on "Auth Login Stub Page"
    Then I am presented with the "Dashboard Page"
    And I click on "Start new transfer" hyperlink on "Dashboard Page"
    Then I am presented with the "What You Will Need Page"
    And I click save and continue button on "What You Will Need Page"
    Then I am presented with the "Task List Page"

  Scenario:1. Full Members Journey - Member is currently UK resident
    Then I navigated to the "Member Name Page"
    And I should see the heading "What is the member's name?"
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
    And I should see the following details
      | Name                      | John Doe                                                                                 |
      | Is member a UK resident for tax purposes | Yes                                                                                      |
      | Date of birth             | 31 December 1991                                                                               |
      | National Insurance number | QQ123456A                                                                                |
      | Principal residential address | 12 Burlington Avenue,Burlington Road,Maidenhead,Berkshire,United Kingdom,AB12CD,11223344 |
    And I click save and continue button on "Member Details Check Your Answers Page"
    Then I am presented with the "Task List Page"

  Scenario:2. Full Members Journey - Member is not currently or ever been UK resident
    Then I navigated to the "Member Name Page"
    And I should see the heading "What is the member's name?"
    When I enter the following data into corresponding input fields on "Member Name Page"
      | firstName | Sarah |
      | lastName  | Smith |
    And I click continue button on "Member Name Page"
    Then I am presented with the "Member Nino Page"
    When I enter the following data into corresponding input fields on "Member Nino Page"
      | value | QQ123456A |
    And I click save and continue button on "Member Nino Page"
    Then I am presented with the "Member Date Of Birth Page"
    When I enter the following data into corresponding input fields on "Member Date Of Birth Page"
      | day   | 15   |
      | month | 06   |
      | year  | 1974 |
    And I click save and continue button on "Member Date Of Birth Page"
    Then I am presented with the "Members Current Address Page"
    When I enter the following data into corresponding input fields on "Members Current Address Page"
      | addressLine1 | 1 Main Street  |
      | addressLine2 | Main Town      |
      | addressLine3 | Kenilworth     |
      | addressLine4 | Warwickshire   |
      | countryCode  | United Kingdom |
      | postcode     | WA15BC         |
    And I click save and continue button on "Members Current Address Page"
    Then I am presented with the "Is Member Currently UK Resident Page"
    When I select radio button "No" on "Is Member Currently UK Resident Page"
    And I click save and continue button on "Is Member Currently UK Resident Page"
    Then I am presented with the "Has Member Ever Been UK Resident Page"
    When I select radio button "No" on "Has Member Ever Been UK Resident Page"
    And I click save and continue button on "Has Member Ever Been UK Resident Page"
    Then I am presented with the "Member Details Check Your Answers Page"
    And I should see the following details
      | Name                              | Sarah Smith                                                           |
      | Is member a UK resident for tax purposes         | No                                                                    |
      | Have they ever been a UK resident for tax purposes | No                                                                    |
      | Date of birth                     | 15 June 1974                                                             |
      | National Insurance number         | QQ123456A                                                             |
      | Principal residential address     | 1 Main Street,Main Town,Kenilworth,Warwickshire,United Kingdom,WA15BC |
    And I click save and continue button on "Member Details Check Your Answers Page"
    Then I am presented with the "Task List Page"

  Scenario: 3. Full Members Journey - Member is not currently but has been UK resident with manual address entry
    Then I navigated to the "Member Name Page"
    And I should see the heading "What is the member's name?"
    When I enter the following data into corresponding input fields on "Member Name Page"
      | firstName | Rebecca |
      | lastName  | Miller  |
    And I click continue button on "Member Name Page"
    Then I am presented with the "Member Nino Page"
    When I enter the following data into corresponding input fields on "Member Nino Page"
      | value | QQ112233B |
    And I click save and continue button on "Member Nino Page"
    Then I am presented with the "Member Date Of Birth Page"
    When I enter the following data into corresponding input fields on "Member Date Of Birth Page"
      | day   | 04   |
      | month | 09   |
      | year  | 1980 |
    And I click save and continue button on "Member Date Of Birth Page"
    Then I am presented with the "Members Current Address Page"
    When I enter the following data into corresponding input fields on "Members Current Address Page"
      | addressLine1 | 78 Kingsway Crescent |
      | addressLine2 | Westfield Avenue     |
      | countryCode  | United Kingdom       |
      | postcode     | BA15XY               |
    And I click save and continue button on "Members Current Address Page"
    Then I am presented with the "Is Member Currently UK Resident Page"
    When I select radio button "No" on "Is Member Currently UK Resident Page"
    And I click save and continue button on "Is Member Currently UK Resident Page"
    Then I am presented with the "Has Member Ever Been UK Resident Page"
    When I select radio button "Yes" on "Has Member Ever Been UK Resident Page"
    And I click save and continue button on "Has Member Ever Been UK Resident Page"
    And I am presented with the "Members Last UK Address Page"
    When I enter the following data into corresponding input fields on "Members Last UK Address Page"
      | addressLine1 | 9 Greenbank Terrace |
      | addressLine2 | Old Road             |
      | postcode     | ZZ99ZZ               |
    And I click save and continue button on "Members Last UK Address Page"
    Then I am presented with the "Member Date Of Leaving UK Page"
    When I enter the following data into corresponding input fields on "Member Date Of Leaving UK Page"
      | day   | 20   |
      | month | 10   |
      | year  | 2015 |
    And I click save and continue button on "Member Date Of Leaving UK Page"
    Then I am presented with the "Member Details Check Your Answers Page"
    And I should see the following details
      | Name                              | Rebecca Miller                                              |
      | Is member a UK resident for tax purposes | No                                                          |
      | Have they ever been a UK resident for tax purposes| Yes                                                         |
      | Date of birth                     | 4 September 1980                                                    |
      | National Insurance number         | QQ112233B                                                   |
      | Principal residential address     | 78 Kingsway Crescent,Westfield Avenue,United Kingdom,BA15XY |
      | Last UK address                   | 9 Greenbank Terrace,Old Road,ZZ9 9ZZ                        |
      | Date member left UK               | 20 October 2015                                                  |
    And I click save and continue button on "Member Details Check Your Answers Page"
    Then I am presented with the "Task List Page"

  Scenario: 4. Full Members Journey - Member is currently UK resident with no Nino
    Then I navigated to the "Member Name Page"
    And I should see the heading "What is the member's name?"
    When I enter the following data into corresponding input fields on "Member Name Page"
      | firstName | Angelo   |
      | lastName  | McMannis |
    And I click continue button on "Member Name Page"
    Then I am presented with the "Member Nino Page"
    When I click on "Member doesn't have a National Insurance number." hyperlink on "Member Nino Page"
    And I am presented with the "Member Does Not Have NINO Page"
    When I enter "Individual has recently moved to the UK and has not been issued a NINO yet." in the textarea field on "Member Does Not Have NINO Page"
    And I click save and continue button on "Member Does Not Have NINO Page"
    Then I am presented with the "Member Date Of Birth Page"
    When I enter the following data into corresponding input fields on "Member Date Of Birth Page"
      | day   | 14   |
      | month | 08   |
      | year  | 1990 |
    And I click save and continue button on "Member Date Of Birth Page"
    Then I am presented with the "Members Current Address Page"
    When I enter the following data into corresponding input fields on "Members Current Address Page"
      | addressLine1 | 7 Falcon Lane         |
      | addressLine2 | Riverside Gardens     |
      | addressLine3 | Reading               |
      | addressLine4 | Berkshire             |
      | countryCode  | United Kingdom        |
      | postcode     | RG12XY                |
      | poBox        | 77889911              |
    And I click save and continue button on "Members Current Address Page"
    Then I am presented with the "Is Member Currently UK Resident Page"
    When I select radio button "Yes" on "Is Member Currently UK Resident Page"
    And I click save and continue button on "Is Member Currently UK Resident Page"
    Then I am presented with the "Member Details Check Your Answers Page"
    And I should see the following details
      | Name                             | Angelo McMannis                                                                  |
      | Is member a UK resident for tax purposes | Yes                                                                              |
      | Date of birth                    | 14 August 1990                                                                        |
      | Why no National Insurance number | Individual has recently moved to the UK and has not been issued a NINO yet.      |
      | Principal residential address    | 7 Falcon Lane,Riverside Gardens,Reading,Berkshire,United Kingdom,RG12XY,77889911 |
    And I click save and continue button on "Member Details Check Your Answers Page"
    Then I am presented with the "Task List Page"