@Test   @acceptance @journey @PropertyMiniJourney
Feature: Property Mini journey(Adding properties and removing)

  Background: Common Steps - Transfer Details Journey
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "Journey entry URL"
    When I enter Enrollment Key "HMRC-PODSPP-ORG", Identifier Name "PSPID" and Identifier Value "21000005" on "Auth Login Stub Page"
    And I click submit button on "Auth Login Stub Page"
    Then I am presented with the "Dashboard Page"
    And I click on "Start new transfer" hyperlink on "Dashboard Page"
    And I am presented with the "What You Will Need Page"
    And I click save and continue button on "What You Will Need Page"
    And I navigated to the "Type Of Asset Page"
    Then I am presented with the "Type Of Asset Page"
    And I should see the heading "Type of assets included in the transfer"

  Scenario:1. PSA/PSP user is able to transfer a property
    And I "select" checkbox "Property" on "Type Of Asset Page"
    And I click save and continue button on "Type Of Asset Page"
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
    When I click on "property-address" button on "Property Check Your Answers Page"
    Then I am presented with the "Property Address Page"
    And I click save and continue button on "Property Address Page"
    Then I am presented with the "Property Check Your Answers Page"
    When I click on "property-value" button on "Property Check Your Answers Page"
    Then I am presented with the "Value Of Property Page"
    When I enter the following data into corresponding input fields on "Value Of Property Page"
      | value | 5000 |
    And I click save and continue button on "Value Of Property Page"
    When I click on "property-description" button on "Property Check Your Answers Page"
    Then I am presented with the "Property Description Page"
    When I enter the following data into corresponding input fields on "Property Description Page"
      | value | Change Property value description|
    And I click save and continue button on "Property Description Page"
    And I click save and continue button on "Property Check Your Answers Page"
    Then I am presented with the "Property Amend Continue Page"
    And I should see the heading "You have added 1 property"
    And I should see two radio buttons: "Yes" and "No"
    When I select radio button "No" on "Property Amend Continue Page"
    And I click save and continue button on "Property Amend Continue Page"
    Then I am presented with the "Check Your Answers Page"
    And I should see the heading "Check transfer details"
    And I click save and continue button on "Check Your Answers Page"


  Scenario:2 . PSA/PSP user is able to transfer multiple properties
    And I "select" checkbox "Property" on "Type Of Asset Page"
    And I click save and continue button on "Type Of Asset Page"
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
    And I should see the heading "Check transfer details"
    When I click on "change-property-amend" button on "Check Your Answers Page"
    Then I am presented with the "Change Property Amend Continue Page"
    And I should see two radio buttons: "Yes" and "No"
    When I select radio button "Yes" on "Change Property Amend Continue Page"
    And I click save and continue button on "Change Property Amend Continue Page"
    Then I am presented with the "Change Property Address Page"
    And I should see the heading "What is the property address?"
    When I enter the following data into corresponding input fields on "Property Address Page"
      | addressLine1 | addressLine one      |
      | addressLine2 | addressLine two       |
      | addressLine3 | addressLine three     |
      | addressLine4 | addressLine four      |
      | countryCode  | United Kingdom       |
      | postcode     | postcode             |
    And I click save and continue button on "Change Property Address Page"
    Then I am presented with the "Change Value Of Property Page"
    When I enter the following data into corresponding input fields on "Change Value Of Property Page"
      | value | 5000 |
    And I click save and continue button on "Change Value Of Property Page"
    Then I am presented with the "Change Property Description Page"
    And I should see the heading "Describe the property and how it was valued"
    When I enter the following data into corresponding input fields on "Change Property Description Page"
      | value | Property value description|
    And I click save and continue button on "Change Property Description Page"
    And I click save and continue button on "Property Check Your Answers Page"
    Then I am presented with the "Change Property Amend Continue 2 Page"
    And I should see the heading "You have added 2 properties"
    And I should see two radio buttons: "Yes" and "No"
    When I select radio button "No" on "Property Amend Continue Page"
    And I click save and continue button on "Property Amend Continue Page"
    Then I am presented with the "Check Your Answers Page"
    And I should see the heading "Check transfer details"
    And I click save and continue button on "Property Check Your Answers Page"

  Scenario:3 . PSA/PSP user is able to remove the property from added list
    And I "select" checkbox "Property" on "Type Of Asset Page"
    And I click save and continue button on "Type Of Asset Page"
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
    And I should see the heading "Check transfer details"
    When I click on "change-property-amend" button on "Check Your Answers Page"
    Then I am presented with the "Change Property Amend Continue Page"
    And I should see two radio buttons: "Yes" and "No"
    When I select radio button "Yes" on "Change Property Amend Continue Page"
    And I click save and continue button on "Change Property Amend Continue Page"
    Then I am presented with the "Change Property Address Page"
    And I should see the heading "What is the property address?"
    When I enter the following data into corresponding input fields on "Property Address Page"
      | addressLine1 | addressLine one      |
      | addressLine2 | addressLine two       |
      | addressLine3 | addressLine three     |
      | addressLine4 | addressLine four      |
      | countryCode  | United Kingdom       |
      | postcode     | postcode             |
    And I click save and continue button on "Change Property Address Page"
    Then I am presented with the "Change Value Of Property Page"
    When I enter the following data into corresponding input fields on "Change Value Of Property Page"
      | value | 5000 |
    And I click save and continue button on "Change Value Of Property Page"
    Then I am presented with the "Change Property Description Page"
    And I should see the heading "Describe the property and how it was valued"
    When I enter the following data into corresponding input fields on "Change Property Description Page"
      | value | Property value description|
    And I click save and continue button on "Change Property Description Page"
    And I click save and continue button on "Property Check Your Answers Page"
    Then I am presented with the "Change Property Amend Continue 2 Page"
    And I should see the heading "You have added 2 properties"
    When I click on "property-confirm-removal" button on "Property Amend Continue Page"
    Then I am presented with the "Property Confirm Removal Page"
    And I should see two radio buttons: "Yes" and "No"
    When I select radio button "Yes" on "Property Confirm Removal Page"
    And I click save and continue button on "Property Confirm Removal Page"
    Then I am presented with the "Property Amend Continue Page"
    And I should see the heading "You have added 1 property"
    When I select radio button "No" on "Property Amend Continue Page"
    And I click save and continue button on "Property Amend Continue Page"
    Then I am presented with the "Check Your Answers Page"
    And I click save and continue button on "Property Check Your Answers Page"
