@Test @FullJourneye2e @acceptance
Feature: Is the members details journey fully connected

  Background: Common Steps
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "What You Will Need Page"
    When I enter Enrollment Key "HMRC-PODS-ORG", Identifier Name "PSAID" and Identifier Value "2131231231231" on "Auth Login Stub Page"
    And I click submit button on "Auth Login Stub Page"

  Scenario:1. Full Journey - Start a new transfer
#   TODO add in dashboard
    Then I am presented with the "What You Will Need Page"
    And I click save and continue button on "What You Will Need Page"
    Then I am presented with the "Task List Page"
    Then I see the status "Not started yet" for task "Add details about the member"
    Then I see the status "Cannot start yet" for task "Add information about the transfer"
    Then I see the status "Cannot start yet" for task "Add information about the QROPS"
    Then I see the status "Cannot start yet" for task "Add QROPS scheme manager's details"
    Then I see the status "Cannot start yet" for task "Check your answers and submit the report"
    When I click on "Add details about the member" hyperlink on "Task List Page"
    And I should see the heading "What is the member's name?"
    When I enter the following data into corresponding input fields on "Member Name Page"
      | firstName | Amelia |
      | lastName  | Hayes  |
    And I click continue button on "Member Name Page"
    Then I am presented with the "Member Nino Page"
    When I enter the following data into corresponding input fields on "Member Nino Page"
      | value | QQ987654B |
    And I click save and continue button on "Member Nino Page"
    Then I am presented with the "Member Date Of Birth Page"
    When I enter the following data into corresponding input fields on "Member Date Of Birth Page"
      | day   | 14   |
      | month | 7    |
      | year  | 1986 |
    And I click save and continue button on "Member Date Of Birth Page"
    Then I am presented with the "Members Current Address Page"
    When I enter the following data into corresponding input fields on "Members Current Address Page"
      | addressLine1 | 78 Kingsway Crescent |
      | addressLine2 | Westfield Avenue     |
      | addressLine3 | Bath                 |
      | addressLine4 | Somerset             |
      | countryCode  | United Kingdom       |
      | postcode     | BA15XY               |
      | poBox        | 55667788             |
    And I click save and continue button on "Members Current Address Page"
    Then I am presented with the "Is Member Currently UK Resident Page"
    When I select radio button "Yes" on "Is Member Currently UK Resident Page"
    And I click save and continue button on "Is Member Currently UK Resident Page"
    Then I am presented with the "Member Details Check Your Answers Page"
    And I should see the following details
      | Name                      | Amelia Hayes                                                                                  |
      | Is member a UK resident   | Yes                                                                                           |
      | Date of birth             | 14 7 1986                                                                                     |
      | National Insurance number | QQ987654B                                                                                     |
      | Current address           | 78 Kingsway Crescent,Westfield Avenue,Bath,Somerset,United Kingdom,BA15XY,55667788           |
    And I click save and continue button on "Member Details Check Your Answers Page"
    Then I am presented with the "Task List Page"
    Then I see the status "Completed" for task "Add details about the member"
    Then I see the status "Not started yet" for task "Add information about the transfer"
    Then I see the status "Not started yet" for task "Add information about the QROPS"
    Then I see the status "Not started yet" for task "Add QROPS scheme manager's details"
    Then I see the status "Cannot start yet" for task "Check your answers and submit the report"
    When I click on "Add information about the QROPS" hyperlink on "Task List Page"
    And I should see the heading "What is the full name of the QROPS receiving the transfer?"
    And I should see below input fields on "QROPS Name Page"
      | qropsName |
    When I enter the following data into corresponding input fields on "QROPS Name Page"
      | qropsName | The great QROPS |
    And I click save and continue button on "QROPS Name Page"
    Then I am presented with the "QROPS Reference Page"
    When I enter the following data into corresponding input fields on "QROPS Reference Page"
      | qropsRef | QROPS123456 |
    And I click save and continue button on "QROPS Reference Page"
    Then I am presented with the "QROPS Address Page"
    When I enter the following data into corresponding input fields on "QROPS Address Page"
      | addressLine1 | 21 Rosewood Close |
      | addressLine2 | Maple Hill Estate |
      | addressLine3 | Basingstoke       |
      | addressLine4 | Hampshire         |
      | addressLine5 | England           |
      | countryCode  | United Kingdom    |
    And I click save and continue button on "QROPS Address Page"
    Then I am presented with the "QROPS Country Page"
    When I enter the following data into corresponding input fields on "QROPS Country Page"
      | countryCode | United Kingdom |
    And I click save and continue button on "QROPS Country Page"
    And I click save and continue button on "QROPS Country Page"
    Then I am presented with the "QROPS Check Your Answers Page"
    And I should see the following details
      | QROPS full name                  | The great QROPS                                                                  |
      | QROPS reference                  | QROPS123456                                                                      |
      | QROPS address                    | 21 Rosewood Close,Maple Hill Estate,Basingstoke,Hampshire,England,United Kingdom |
      | Country or territory established | United Kingdom                                                                   |
    And I click save and continue button on "QROPS Check Your Answers Page"
    Then I am presented with the "Task List Page"
    Then I see the status "Completed" for task "Add details about the member"
    Then I see the status "Completed" for task "Add information about the QROPS"
    Then I see the status "Not started yet" for task "Add information about the transfer"
    Then I see the status "Not started yet" for task "Add QROPS scheme manager's details"
    Then I see the status "Cannot start yet" for task "Check your answers and submit the report"
    When I click on "Add QROPS scheme manager's details" hyperlink on "Task List Page"
    Then I am presented with the "Scheme Manager Type Page"
    When I select radio button "Individual" on "Scheme Manager Type Page"
    And I click save and continue button on "Scheme Manager Type Page"
    Then I am presented with the "Scheme Manager Name Page"
    When I enter the following data into corresponding input fields on "Scheme Manager Name Page"
      | schemeManagersFirstName | Emily   |
      | schemeManagersLastName  | Parker  |
    And I click save and continue button on "Scheme Manager Name Page"
    Then I am presented with the "Scheme Manager Address Page"
    When I click on "Return to task list" hyperlink on "Scheme Manager Address Page"
    Then I am presented with the "Task List Page"
    Then I see the status "Completed" for task "Add details about the member"
    Then I see the status "Not started yet" for task "Add information about the transfer"
    Then I see the status "Completed" for task "Add information about the QROPS"
    Then I see the status "In progress" for task "Add QROPS scheme manager's details"
    Then I see the status "Cannot start yet" for task "Check your answers and submit the report"
    When I click on "Add QROPS scheme manager's details" hyperlink on "Task List Page"
    Then I am presented with the "Scheme Manager Type Page"
    When I select radio button "Individual" on "Scheme Manager Type Page"
    And I click save and continue button on "Scheme Manager Type Page"
    Then I am presented with the "Scheme Manager Name Page"
    When I enter the following data into corresponding input fields on "Scheme Manager Name Page"
      | schemeManagersFirstName | Emily   |
      | schemeManagersLastName  | Parker  |
    And I click save and continue button on "Scheme Manager Name Page"
    Then I am presented with the "Scheme Manager Address Page"
    When I enter the following data into corresponding input fields on "Scheme Manager Address Page"
      | addressLine1 | 88 Willow Street |
      | addressLine2 | Oakwood Park     |
      | addressLine3 | Stratford        |
      | addressLine4 | Greater London   |
      | addressLine5 | England          |
      | countryCode  | United Kingdom   |
    And I click save and continue button on "Scheme Manager Address Page"
    Then I am presented with the "Scheme Manager Email Page"
    When I enter the following data into corresponding input fields on "Scheme Manager Email Page"
      | emailAddress | thismail@gmail.com |
    And I click save and continue button on "Scheme Manager Email Page"
    Then I am presented with the "Scheme Manager Telephone Page"
    When I enter the following data into corresponding input fields on "Scheme Manager Telephone Page"
      | contactNumber | +441234567890 |
    And I click save and continue button on "Scheme Manager Telephone Page"
    Then I am presented with the "Scheme Manager Check Your Answer Page"
    And I should see the following details
      | Organisation or individual | Individual                                                                    |
      | Manager name               | Emily Parker                                                                  |
      | Manager address            | 88 Willow Street,Oakwood Park,Stratford,Greater London,England,United Kingdom |
      | Manager email              | thismail@gmail.com                                                            |
      | Manager telephone number   | +441234567890                                                                 |
    And I click save and continue button on "Scheme Manager Check Your Answer Page"
    Then I am presented with the "Task List Page"
    Then I see the status "Completed" for task "Add details about the member"
    Then I see the status "Not started yet" for task "Add information about the transfer"
    Then I see the status "Completed" for task "Add information about the QROPS"
    Then I see the status "Completed" for task "Add QROPS scheme manager's details"
    Then I see the status "Cannot start yet" for task "Check your answers and submit the report"
#   TODO transfer details tests
#   TODO submission tests
