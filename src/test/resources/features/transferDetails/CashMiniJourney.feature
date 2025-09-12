@Test @CashMiniJourney @acceptance
Feature: Unquoted Share Mini journey(Adding  and removing Unquoted Shares)

  Background: Common Steps - Transfer Details Journey
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "Journey entry URL"
    When I enter Enrollment Key "HMRC-PODSPP-ORG", Identifier Name "PSPID" and Identifier Value "21000005" on "Auth Login Stub Page"
    And I click submit button on "Auth Login Stub Page"
    And I am presented with the "What You Will Need Page"
    And I navigated to the "Type Of Asset Page"
    Then I am presented with the "Type Of Asset Page"
    And I should see the heading "Type of assets included in the transfer"

  Scenario:1. PSA/PSP user is able to transfer a Cash and Unquoted Shares
    And I "select" checkbox "Cash" on "Type Of Asset Page"
    And I "select" checkbox "Unquoted shares" on "Type Of Asset Page"
    And I click save and continue button on "Type Of Asset Page"
    Then I am presented with the "Amount Of Cash In Transfer Page"
    And I should see the heading "What is the amount of cash?"
    When I enter the following data into corresponding input fields on "Amount Of Cash In Transfer Page"
      | cashInTransfer | £500 |
    And I click save and continue button on "Amount Of Cash In Transfer Page"
    Then I am presented with the "Add Unquoted Share Start Page"
    And I should see the following values on the page
      | The following questions are about Unquoted shares that is part of this transfer. |
    And I click save and continue button on "Add Unquoted Share Start Page"
    Then I am presented with the "Name Of Company Unquoted Share Page"
    And I should see the heading "What is the name of the company these unquoted shares relate to?"
    When I enter the following data into corresponding input fields on "Name Of Company Unquoted Share Page"
      | value | Company XYZ|
    And I click save and continue button on "Name Of Company Unquoted Share Page"
    Then I am presented with the "Value Of Unquoted Share Page"
    When I enter the following data into corresponding input fields on "Value Of Unquoted Share Page"
      | value | 500 |
    And I click save and continue button on "Value Of Unquoted Share Page"
    Then I am presented with the "Number Of Unquoted Share Page"
    And I should see the heading "How many unquoted shares in this company are part of this transfer?"
    When I enter the following data into corresponding input fields on "Number Of Unquoted Share Page"
      | value | 100 |
    And I click save and continue button on "Number Of Unquoted Share Page"
    Then I am presented with the "Class Of Unquoted Share Page"
    And I should see the heading "What class are these unquoted shares?"
    When I enter the following data into corresponding input fields on "Class Of Unquoted Share Page"
      | value | Class A|
    And I click save and continue button on "Class Of Unquoted Share Page"
    Then I am presented with the "Unquoted Share Check Your Answers Page"
    And I should see the heading "Check your answers"
    When I click on "change-unquoted-shares-company-name" button on "Unquoted Share Check Your Answers Page"
    Then I am presented with the "Change Name Of Company Unquoted Share Page"
    When I enter the following data into corresponding input fields on "Name Of Company Unquoted Share Page"
      | value | Company ABC|
    And I click save and continue button on "Change Name Of Company Unquoted Share Page"
    When I click on "change-unquoted-shares-value" button on "Unquoted Share Check Your Answers Page"
    Then I am presented with the "Change Value Of Unquoted Share Page"
    When I enter the following data into corresponding input fields on "Change Value Of Unquoted Share Page"
      | value | 5000 |
    And I click save and continue button on "Change Value Of Unquoted Share Page"
    When I click on "change-unquoted-shares-number" button on "Unquoted Share Check Your Answers Page"
    Then I am presented with the "Change Number Of Unquoted Share Page"
    When I enter the following data into corresponding input fields on "Change Number Of Unquoted Share Page"
      | value | 10 |
    And I click save and continue button on "Change Number Of Unquoted Share Page"
    When I click on "change-unquoted-shares-class" button on "Unquoted Share Check Your Answers Page"
    Then I am presented with the "Change Class Of Unquoted Share Page"
    When I enter the following data into corresponding input fields on "Change Class Of Unquoted Share Page"
      | value | Class B |
    And I click save and continue button on "Change Class Of Unquoted Share Page"
    Then I am presented with the "Unquoted Share Check Your Answers Page"
    And I click save and continue button on "Unquoted Share Check Your Answers Page"
    Then I am presented with the "Unquoted Share Amend Continue Page"
    And I should see the heading "You have added 1 group of unquoted shares"
    And I should see two radio buttons: "Yes" and "No"
    When I select radio button "No" on "Unquoted Share Amend Continue Page"
    And I click save and continue button on "Unquoted Share Amend Continue Page"
    Then I am presented with the "Check Your Answers Page"
    And I should see the heading "Check your answers"
    #And I click save and continue button on "Check Your Answers Page"
    When I click on "change-type-of-asset" button on "Check Your Answers Page"
    Then I am presented with the "Change Type Of Asset Page"
    And I "unselect" checkbox "Unquoted shares" on "Type Of Asset Page"
    And I "select" checkbox "Quoted shares" on "Type Of Asset Page"
    And I click save and continue button on "Type Of Asset Page"
    Then I am presented with the "Amount Of Cash In Transfer Page"
    And I click save and continue button on "Amount Of Cash In Transfer Page"
    Then I am presented with the "Add Quoted Share Start Page"
    And I should see the following values on the page
      | The following questions are about quoted shares that is part of this transfer. |
    And I click save and continue button on "Add Quoted Share Start Page"
    Then I am presented with the "Name Of Company Quoted Share Page"
    And I should see the heading "What is the name of the company these quoted shares relate to?"
    When I enter the following data into corresponding input fields on "Name Of Company Quoted Share Page"
      | value | Company XYZ|
    And I click save and continue button on "Name Of Company Quoted Share Page"
    Then I am presented with the "Value Of Quoted Share Page"
    When I enter the following data into corresponding input fields on "Value Of Quoted Share Page"
      | value | 500 |
    And I click save and continue button on "Value Of Quoted Share Page"
    Then I am presented with the "Number Of Quoted Share Page"
    And I should see the heading "How many quoted shares in this company are part of this transfer?"
    When I enter the following data into corresponding input fields on "Number Of Quoted Share Page"
      | value | 100 |
    And I click save and continue button on "Number Of Quoted Share Page"
    Then I am presented with the "Class Of Quoted Share Page"
    And I should see the heading "What class are these quoted shares?"
    When I enter the following data into corresponding input fields on "Class Of Quoted Share Page"
      | value | Class A|
    And I click save and continue button on "Class Of Quoted Share Page"
    Then I am presented with the "Quoted Share Check Your Answers Page"
    And I click save and continue button on "Quoted Share Check Your Answers Page"
    Then I am presented with the "Quoted Share Amend Continue Page"
    And I should see the heading "You have added 1 group of quoted shares"
    And I should see two radio buttons: "Yes" and "No"
    When I select radio button "No" on "Quoted Share Amend Continue Page"
    And I click save and continue button on "Quoted Share Amend Continue Page"
    Then I am presented with the "Check Your Answers Page"
    And I should see the heading "Check your answers"
    And I click save and continue button on "Check Your Answers Page"

  Scenario:2. PSA/PSP user is able to transfer a Cash and Property
    And I "select" checkbox "Cash" on "Type Of Asset Page"
    And I "select" checkbox "Property" on "Type Of Asset Page"
    And I click save and continue button on "Type Of Asset Page"
    Then I am presented with the "Amount Of Cash In Transfer Page"
    And I should see the heading "What is the amount of cash?"
    When I enter the following data into corresponding input fields on "Amount Of Cash In Transfer Page"
      | cashInTransfer | £500 |
    And I click save and continue button on "Amount Of Cash In Transfer Page"
    And I navigated to the "Add Property Start Page"
    Then I am presented with the "Add Property Start Page"
    And I should see the following values on the page
      | The following questions are about property that is part of this transfer. |
    And I click save and continue button on "Add Property Start Page"
    Then I am presented with the "Property Address Page"
    And I should see the heading "What is the property address?"
    When I enter the following data into corresponding input fields on "Property Address Page"
      | addressLine1 | addressLine1         |
      | addressLine2 | addressLine2         |
      | addressLine3 | addressLine3         |
      | addressLine4 | addressLine4         |
      | countryCode  | United Kingdom       |
      | postcode     | postcode             |
    And I click save and continue button on "Property Address Page"
    Then I am presented with the "Value Of Property Page"
    When I enter the following data into corresponding input fields on "Value Of Property Page"
      | value | 500 |
    And I click save and continue button on "Value Of Property Page"
    Then I am presented with the "Property Description Page"
    And I should see the heading "Describe the property and how it was valued"
    When I enter the following data into corresponding input fields on "Property Description Page"
      | value | Property value description|
    And I click save and continue button on "Property Description Page"
    Then I am presented with the "Property Check Your Answers Page"
    And I should see the heading "Check your answers"
    And I click save and continue button on "Property Check Your Answers Page"
    Then I am presented with the "Property Amend Continue Page"
    And I should see the heading "You have added 1 property"
    And I should see two radio buttons: "Yes" and "No"
    When I select radio button "No" on "Property Amend Continue Page"
    And I click save and continue button on "Property Amend Continue Page"
    Then I am presented with the "Check Your Answers Page"
    And I should see the heading "Check your answers"
    And I click save and continue button on "Check Your Answers Page"

  Scenario:3. PSA/PSP user is able to transfer a Cash and Other assets
    And I "select" checkbox "Cash" on "Type Of Asset Page"
    And I "select" checkbox "Other" on "Type Of Asset Page"
    And I click save and continue button on "Type Of Asset Page"
    Then I am presented with the "Amount Of Cash In Transfer Page"
    And I should see the heading "What is the amount of cash?"
    When I enter the following data into corresponding input fields on "Amount Of Cash In Transfer Page"
      | cashInTransfer | £500 |
    And I click save and continue button on "Amount Of Cash In Transfer Page"
    And I navigated to the "Add Other Assets Start Page"
    Then I am presented with the "Add Other Assets Start Page"
    And I should see the following values on the page
      | The following questions are about Other Assets that is part of this transfer. |
    And I click save and continue button on "Add Other Assets Start Page"
    Then I am presented with the "Other Assets Description Page"
    And I should see the heading "Describe the asset and how it was valued"
    When I enter the following data into corresponding input fields on "Other Assets Description Page"
      | value | Other Assets value description|
    And I click save and continue button on "Other Assets Description Page"
    Then I am presented with the "Other Assets Value Page"
    When I enter the following data into corresponding input fields on "Other Assets Value Page"
      | value | 500 |
    And I click save and continue button on "Other Assets Value Page"
    Then I am presented with the "Other Assets Check Your Answers Page"
    And I should see the heading "Check your answers"
    And I click save and continue button on "Other Assets Check Your Answers Page"
    Then I am presented with the "Other Assets Amend Continue Page"
    And I should see the heading "You have added 1 group of assets"
    And I should see two radio buttons: "Yes" and "No"
    When I select radio button "No" on "Other Assets Amend Continue Page"
    And I click save and continue button on "Other Assets Amend Continue Page"
    Then I am presented with the "Check Your Answers Page"
    And I should see the heading "Check your answers"
    And I click save and continue button on "Check Your Answers Page"