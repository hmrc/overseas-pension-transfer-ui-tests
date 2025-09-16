@Test @TransferDetailsE2E @acceptance
Feature: Is the members details journey fully connected

  Background: Common Steps
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "Journey entry URL"
    When I enter Enrollment Key "HMRC-PODS-ORG", Identifier Name "PSAID" and Identifier Value "A2100005" on "Auth Login Stub Page"
    And I click submit button on "Auth Login Stub Page"
    Then I am presented with the "Dashboard Page"
    And I click on "Start new transfer" hyperlink on "Dashboard Page"

  Scenario:1. Full Transfer Details - Transfer Amount Taxable with applicable exclusion - Cash only
    And I navigated to the "Overseas Transfer Allowance Page"
    Then I am presented with the "Overseas Transfer Allowance Page"
    When I enter the following data into corresponding input fields on "Overseas Transfer Allowance Page"
      | otAllowance | 100100 |
    And I click save and continue button on "Overseas Transfer Allowance Page"
    Then I am presented with the "Amount Of Transfer Page"
    When I enter the following data into corresponding input fields on "Amount Of Transfer Page"
      | value | 100200 |
    And I click save and continue button on "Amount Of Transfer Page"
    Then I am presented with the "Is Transfer Amount Taxable Page"
    When I select radio button "Yes" on "Is Transfer Amount Taxable Page"
    And I click save and continue button on "Is Transfer Amount Taxable Page"
    Then I am presented with the "Why Transfer Amount Taxable Page"
    When I select radio button "Transfer exceeds member's overseas transfer allowance and there is an applicable exclusion." on "Why Transfer Amount Taxable Page"
    And I click save and continue button on "Why Transfer Amount Taxable Page"
    Then I am presented with the "Applicable Transfer Exclusion Page"
    When I "select" checkbox "The QROPS is an occupational pension scheme and the individual is an employee of the sponsoring employer." on "Applicable Transfer Exclusion Page"
    And I "select" checkbox "Both the individual and QROPS are resident in the same country." on "Applicable Transfer Exclusion Page"
    And I click save and continue button on "Applicable Transfer Exclusion Page"
    Then I am presented with the "Amount Of Tax Deducted Page"
    When I enter the following data into corresponding input fields on "Amount Of Tax Deducted Page"
      | taxDeducted | 100300 |
    And I click save and continue button on "Amount Of Tax Deducted Page"
    Then I am presented with the "Net Amount Transferred After Tax Page"
    When I enter the following data into corresponding input fields on "Net Amount Transferred After Tax Page"
      | netAmount | 100400 |
    And I click save and continue button on "Net Amount Transferred After Tax Page"
    Then I am presented with the "Date Of Transfer Page"
    When I enter the following data into corresponding input fields on "Date Of Transfer Page"
      | day   | 31 |
      | month | 12 |
      | year  | 2024  |
    And I click save and continue button on "Date Of Transfer Page"
    Then I am presented with the "Is Transfer Cash Only Page"
    When I select radio button "Yes" on "Is Transfer Cash Only Page"
    And I click save and continue button on "Is Transfer Cash Only Page"
    Then I am presented with the "Transfer Details Check Your Answers Page"
    And I should see the following details
      | Transfer allowance                       | £100,100                                                                                                                                                                   |
      | Amount of transfer                       | £100,200                                                                                                                                                                   |
      | Is transfer taxable                      | Yes                                                                                                                                                                        |
      | Why is this a taxable overseas transfer? | Transfer exceeds member's overseas transfer allowance and there is an applicable exclusion.                                                                                |
      | Applicable exclusion                     | The QROPS is an occupational pension scheme and the individual is an employee of the sponsoring employer.,,Both the individual and QROPS are resident in the same country. |
      | Amount deducted at 25%                   | £100,300                                                                                                                                                                   |
      | Net amount                               | £100,400                                                                                                                                                                   |
      | Date of transfer                         | 31 12 2024                                                                                                                                                                 |
      | Is transfer cash only                    | Yes                                                                                                                                                                        |
      | Type of assets included in the transfer  | Cash                                                                                                                                                                       |
    And I click save and continue button on "Transfer Details Check Your Answers Page"
    Then I am presented with the "Task List Page"

  Scenario:2. Full Transfer Details - Transfer Amount Taxable with no applicable exclusion - Cash only
    And I navigated to the "Overseas Transfer Allowance Page"
    Then I am presented with the "Overseas Transfer Allowance Page"
    When I enter the following data into corresponding input fields on "Overseas Transfer Allowance Page"
      | otAllowance | 200100 |
    And I click save and continue button on "Overseas Transfer Allowance Page"
    Then I am presented with the "Amount Of Transfer Page"
    When I enter the following data into corresponding input fields on "Amount Of Transfer Page"
      | value | 200200 |
    And I click save and continue button on "Amount Of Transfer Page"
    Then I am presented with the "Is Transfer Amount Taxable Page"
    When I select radio button "Yes" on "Is Transfer Amount Taxable Page"
    And I click save and continue button on "Is Transfer Amount Taxable Page"
    Then I am presented with the "Why Transfer Amount Taxable Page"
    When I select radio button "There is no applicable exclusion." on "Why Transfer Amount Taxable Page"
    And I click save and continue button on "Why Transfer Amount Taxable Page"
    Then I am presented with the "Amount Of Tax Deducted Page"
    When I enter the following data into corresponding input fields on "Amount Of Tax Deducted Page"
      | taxDeducted | 200300 |
    And I click save and continue button on "Amount Of Tax Deducted Page"
    Then I am presented with the "Net Amount Transferred After Tax Page"
    When I enter the following data into corresponding input fields on "Net Amount Transferred After Tax Page"
      | netAmount | 200400 |
    And I click save and continue button on "Net Amount Transferred After Tax Page"
    Then I am presented with the "Date Of Transfer Page"
    When I enter the following data into corresponding input fields on "Date Of Transfer Page"
      | day   | 13   |
      | month | 02   |
      | year  | 2020 |
    And I click save and continue button on "Date Of Transfer Page"
    Then I am presented with the "Is Transfer Cash Only Page"
    When I select radio button "Yes" on "Is Transfer Cash Only Page"
    And I click save and continue button on "Is Transfer Cash Only Page"
    Then I am presented with the "Transfer Details Check Your Answers Page"
    And I should see the following details
      | Transfer allowance                       | £200,100                          |
      | Amount of transfer                       | £200,200                          |
      | Is transfer taxable                      | Yes                               |
      | Why is this a taxable overseas transfer? | There is no applicable exclusion. |
      | Amount deducted at 25%                   | £200,300                          |
      | Net amount                               | £200,400                          |
      | Date of transfer                         | 13 2 2020                         |
      | Is transfer cash only                    | Yes                               |
      | Type of assets included in the transfer  | Cash                              |
    And I click save and continue button on "Transfer Details Check Your Answers Page"
    Then I am presented with the "Task List Page"

  Scenario:3. Full Transfer Details - Transfer Amount Is Not Taxable - Cash only
    And I navigated to the "Overseas Transfer Allowance Page"
    Then I am presented with the "Overseas Transfer Allowance Page"
    When I enter the following data into corresponding input fields on "Overseas Transfer Allowance Page"
      | otAllowance | 300100 |
    And I click save and continue button on "Overseas Transfer Allowance Page"
    Then I am presented with the "Amount Of Transfer Page"
    When I enter the following data into corresponding input fields on "Amount Of Transfer Page"
      | value | 300200 |
    And I click save and continue button on "Amount Of Transfer Page"
    Then I am presented with the "Is Transfer Amount Taxable Page"
    When I select radio button "No" on "Is Transfer Amount Taxable Page"
    And I click save and continue button on "Is Transfer Amount Taxable Page"
    Then I am presented with the "Why Transfer is not Taxable Page"
    When I "select" checkbox "The QROPS is an occupational pension scheme and the individual is an employee of the sponsoring employer." on "Why Transfer is not Taxable Page"
    And I click save and continue button on "Why Transfer is not Taxable Page"
    Then I am presented with the "Date Of Transfer Page"
    When I enter the following data into corresponding input fields on "Date Of Transfer Page"
      | day   | 15   |
      | month | 10   |
      | year  | 2002 |
    And I click save and continue button on "Date Of Transfer Page"
    Then I am presented with the "Is Transfer Cash Only Page"
    When I select radio button "Yes" on "Is Transfer Cash Only Page"
    And I click save and continue button on "Is Transfer Cash Only Page"
    Then I am presented with the "Transfer Details Check Your Answers Page"
    And I should see the following details
      | Transfer allowance                      | £300,100                                                                                                  |
      | Amount of transfer                      | £300,200                                                                                                  |
      | Is transfer taxable                     | No                                                                                                        |
      | Why transfer is not taxable             | The QROPS is an occupational pension scheme and the individual is an employee of the sponsoring employer. |
      | Date of transfer                        | 15 10 2002                                                                                                |
      | Is transfer cash only                   | Yes                                                                                                       |
      | Type of assets included in the transfer | Cash                                                                                                      |
    And I click save and continue button on "Transfer Details Check Your Answers Page"
    Then I am presented with the "Task List Page"

  Scenario:4. Full Transfer Details - Transfer Amount Is Not Taxable - Cash, Unquoted, Quoted, Properties, Other
    And I navigated to the "Overseas Transfer Allowance Page"
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
    And I should see the heading "You have added 1 asset"
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

  Scenario:5 . Full Transfer Details - Transfer Amount Is Not Taxable - Unquoted, Quoted, Other
    And I navigated to the "Overseas Transfer Allowance Page"
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
    And I "select" checkbox "Unquoted shares" on "Type Of Asset Page"
    And I "select" checkbox "Quoted shares" on "Type Of Asset Page"
    And I "select" checkbox "Other" on "Type Of Asset Page"
    And I click save and continue button on "Type Of Asset Page"
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
    When I select radio button "No" on "Quoted Share Amend Continue Page"
    And I click save and continue button on "Quoted Share Amend Continue Page"
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
    And I should see the heading "You have added 1 asset"
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
      | Type of assets included in the transfer | Unquoted shares,,Quoted shares,,Other                                                                     |
      | Unquoted shares                         | 1 added                                                                                                   |
      | Quoted shares                           | 1 added                                                                                                   |
      | Other assets                            | 1 added                                                                                                   |
    And I click save and continue button on "Check Your Answers Page"
    Then I am presented with the "Task List Page"
