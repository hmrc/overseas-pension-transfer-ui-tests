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
    When I click on "Add information about the transfer" hyperlink on "Task List Page"
    Then I am presented with the "Overseas Transfer Allowance Page"
    When I enter the following data into corresponding input fields on "Overseas Transfer Allowance Page"
      | otAllowance | 400100 |
    And I click save and continue button on "Overseas Transfer Allowance Page"
    Then I am presented with the "Amount Of Transfer Page"
    When I enter the following data into corresponding input fields on "Amount Of Transfer Page"
      | value | 400200 |
    And I click save and continue button on "Amount Of Transfer Page"
    Then I am presented with the "Is Transfer Amount Taxable Page"
    When I select radio button "No" on "Is Transfer Amount Taxable Page"
    And I click save and continue button on "Is Transfer Amount Taxable Page"
    Then I am presented with the "Why Transfer is not Taxable Page"
    When I "select" checkbox "The QROPS is an occupational pension scheme and the individual is an employee of the sponsoring employer." on "Why Transfer is not Taxable Page"
    And I click save and continue button on "Why Transfer is not Taxable Page"
    Then I am presented with the "Date Of Transfer Page"
    When I enter the following data into corresponding input fields on "Date Of Transfer Page"
      | day   | 01   |
      | month | 08   |
      | year  | 1998 |
    And I click save and continue button on "Date Of Transfer Page"
    Then I am presented with the "Is Transfer Cash Only Page"
    When I select radio button "No" on "Is Transfer Cash Only Page"
    And I click save and continue button on "Is Transfer Cash Only Page"
    Then I am presented with the "Type Of Asset Page"
    When I "select" checkbox "Cash" on "Type Of Asset Page"
    And I "select" checkbox "Unquoted shares" on "Type Of Asset Page"
    And I "select" checkbox "Quoted shares" on "Type Of Asset Page"
    And I "select" checkbox "Property" on "Type Of Asset Page"
    And I "select" checkbox "Other" on "Type Of Asset Page"
    And I click save and continue button on "Type Of Asset Page"
    Then I am presented with the "Amount Of Cash In Transfer Page"
    When I enter the following data into corresponding input fields on "Amount Of Cash In Transfer Page"
      | cashInTransfer | 400300 |
    And I click save and continue button on "Amount Of Cash In Transfer Page"
    Then I am presented with the "Add Unquoted Share Start Page"
    And I click save and continue button on "Add Unquoted Share Start Page"
    Then I am presented with the "Name Of Company Unquoted Share Page"
    Then I am presented with the "Name Of Company Unquoted Share Page"
    When I enter the following data into corresponding input fields on "Name Of Company Unquoted Share Page"
      | value | Unquoted Company Name|
    And I click save and continue button on "Name Of Company Unquoted Share Page"
    Then I am presented with the "Value Of Unquoted Share Page"
    When I enter the following data into corresponding input fields on "Value Of Unquoted Share Page"
      | value | 400400 |
    And I click save and continue button on "Value Of Unquoted Share Page"
    Then I am presented with the "Number Of Unquoted Share Page"
    When I enter the following data into corresponding input fields on "Number Of Unquoted Share Page"
      | value | 400 |
    And I click save and continue button on "Number Of Unquoted Share Page"
    Then I am presented with the "Class Of Unquoted Share Page"
    When I enter the following data into corresponding input fields on "Class Of Unquoted Share Page"
      | value | Unquoted Class |
    And I click save and continue button on "Class Of Unquoted Share Page"
    Then I am presented with the "Unquoted Share Check Your Answers Page"
    And I should see the following details
      | Company name              | Unquoted Company Name |
      | Value of unquoted shares  | £400,400              |
      | Number of unquoted shares | 400                   |
      | Class of unquoted shares  | Unquoted Class        |
    And I click save and continue button on "Unquoted Share Check Your Answers Page"
    Then I am presented with the "Unquoted Share Amend Continue Page"
    And I should see the heading "You have added 1 group of unquoted shares"
    When I select radio button "No" on "Unquoted Share Amend Continue Page"
    And I click save and continue button on "Unquoted Share Amend Continue Page"
    Then I am presented with the "Add Quoted Share Start Page"
    And I click save and continue button on "Add Quoted Share Start Page"
    Then I am presented with the "Name Of Company Quoted Share Page"
    When I enter the following data into corresponding input fields on "Name Of Company Quoted Share Page"
      | value | Quoted Company Name |
    And I click save and continue button on "Name Of Company Quoted Share Page"
    Then I am presented with the "Value Of Quoted Share Page"
    When I enter the following data into corresponding input fields on "Value Of Quoted Share Page"
      | value | 400500 |
    And I click save and continue button on "Value Of Quoted Share Page"
    Then I am presented with the "Number Of Quoted Share Page"
    When I enter the following data into corresponding input fields on "Number Of Quoted Share Page"
      | value | 401 |
    And I click save and continue button on "Number Of Quoted Share Page"
    Then I am presented with the "Class Of Quoted Share Page"
    When I enter the following data into corresponding input fields on "Class Of Quoted Share Page"
      | value | Quoted Class |
    And I click save and continue button on "Class Of Quoted Share Page"
    Then I am presented with the "Quoted Share Check Your Answers Page"
    And I should see the following details
      | Company name            | Quoted Company Name |
      | Value of quoted shares  | £400,500            |
      | Number of quoted shares | 401                 |
      | Class of quoted shares  | Quoted Class        |
    And I click save and continue button on "Quoted Share Check Your Answers Page"
    Then I am presented with the "Quoted Share Amend Continue Page"
    And I should see the heading "You have added 1 group of quoted shares"
    When I select radio button "Yes" on "Quoted Share Amend Continue Page"
    And I click save and continue button on "Quoted Share Amend Continue Page"
    Then I am presented with the "Second Name Of Company Quoted Share Page"
    When I enter the following data into corresponding input fields on "Name Of Company Quoted Share Page"
      | value | Quoted Name of Company |
    And I click save and continue button on "Second Name Of Company Quoted Share Page"
    Then I am presented with the "Second Value Of Quoted Share Page"
    When I enter the following data into corresponding input fields on "Second Value Of Quoted Share Page"
      | value | 400600 |
    And I click save and continue button on "Second Value Of Quoted Share Page"
    Then I am presented with the "Second Number Of Quoted Share Page"
    When I enter the following data into corresponding input fields on "Number Of Quoted Share Page"
      | value | 402 |
    And I click save and continue button on "Second Number Of Quoted Share Page"
    Then I am presented with the "Second Class Of Quoted Share Page"
    When I enter the following data into corresponding input fields on "Class Of Quoted Share Page"
      | value | Class Quoted A|
    And I click save and continue button on "Second Class Of Quoted Share Page"
    Then I am presented with the "Second Quoted Share Check Your Answers Page"
    And I should see the following details
      | Company name            | Quoted Name of Company |
      | Value of quoted shares  | £400,600               |
      | Number of quoted shares | 402                    |
      | Class of quoted shares  | Class Quoted A         |
    And I click save and continue button on "Second Quoted Share Check Your Answers Page"
    Then I am presented with the "Quoted Share Amend Continue Page"
    And I should see the heading "You have added 2 groups of quoted shares"
    When I select radio button "No" on "Quoted Share Amend Continue Page"
    And I click save and continue button on "Quoted Share Amend Continue Page"
    Then I am presented with the "Add Property Start Page"
    And I click save and continue button on "Add Property Start Page"
    Then I am presented with the "Property Address Page"
    When I enter the following data into corresponding input fields on "Property Address Page"
      | addressLine1 | 221B Baker Street |
      | addressLine2 | Marylebone        |
      | addressLine3 | London            |
      | addressLine4 | Greater London    |
      | countryCode  | United Kingdom    |
      | postcode     | NW1 6XE           |
    And I click save and continue button on "Property Address Page"
    When I enter the following data into corresponding input fields on "Value Of Property Page"
      | value | 400700 |
    And I click save and continue button on "Value Of Property Page"
    Then I am presented with the "Property Description Page"
    When I enter the following data into corresponding input fields on "Property Description Page"
      | value | Property value description |
    And I click save and continue button on "Property Description Page"
    Then I am presented with the "Property Check Your Answers Page"
    And I should see the following details
      | Property address                          | 221B Baker Street,Marylebone,London,Greater London,United Kingdom,NW1 6XE |
      | Property value                            | £400,700                                                                  |
      | Description of the property and valuation | Property value description                                                |
    And I click save and continue button on "Property Check Your Answers Page"
    Then I am presented with the "Property Amend Continue Page"
    And I should see the heading "You have added 1 property"
    When I select radio button "No" on "Property Amend Continue Page"
    And I click save and continue button on "Property Amend Continue Page"
    Then I am presented with the "Add Other Assets Start Page"
    And I click save and continue button on "Add Other Assets Start Page"
    Then I am presented with the "Other Assets Description Page"
    When I enter the following data into corresponding input fields on "Other Assets Description Page"
      | value | Other Assets value description|
    And I click save and continue button on "Other Assets Description Page"
    Then I am presented with the "Other Assets Value Page"
    When I enter the following data into corresponding input fields on "Other Assets Value Page"
      | value | 400800 |
    And I click save and continue button on "Other Assets Value Page"
    Then I am presented with the "Other Assets Check Your Answers Page"
    And I should see the following details
      | Description of asset and valuation | Other Assets value description |
      | Value of asset                     | £400,800                       |
    And I click save and continue button on "Other Assets Check Your Answers Page"
    Then I am presented with the "Other Assets Amend Continue Page"
    And I should see the heading "You have added 1 group of assets"
    When I select radio button "No" on "Other Assets Amend Continue Page"
    And I click save and continue button on "Other Assets Amend Continue Page"
    Then I am presented with the "Check Your Answers Page"
    And I should see the following details
      | Transfer allowance                      | £400,100                                                                                                  |
      | Amount of transfer                      | £400,200                                                                                                  |
      | Is transfer taxable                     | No                                                                                                        |
      | Why transfer is not taxable             | The QROPS is an occupational pension scheme and the individual is an employee of the sponsoring employer. |
      | Date of transfer                        | 1 8 1998                                                                                                  |
      | Is transfer cash only                   | No                                                                                                        |
      | Amount of cash                          | £400,300                                                                                                  |
      | Type of assets included in the transfer | Cash,,Unquoted shares,,Quoted shares,,Property,,Other                                                     |
      | Unquoted shares                         | 1 added                                                                                                   |
      | Quoted shares                           | 2 added                                                                                                   |
      | Property                                | 1 added                                                                                                   |
      | Other assets                            | 1 added                                                                                                   |
    And I click save and continue button on "Check Your Answers Page"
    Then I am presented with the "Task List Page"
    Then I see the status "Completed" for task "Add details about the member"
    Then I see the status "Completed" for task "Add information about the transfer"
    Then I see the status "Completed" for task "Add information about the QROPS"
    Then I see the status "Completed" for task "Add QROPS scheme manager's details"
    Then I see the status "Not started yet" for task "Check your answers and submit the report"
    #   TODO submission tests