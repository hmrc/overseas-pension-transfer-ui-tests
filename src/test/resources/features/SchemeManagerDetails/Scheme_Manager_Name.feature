@Test @SchemeManagerName @acceptance
Feature: Adding names of the Scheme Manager

  Background: Common Steps - Member Details Journey
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "What You Will Need Page"
    When I enter Enrollment Key "HMRC-PODS-ORG", Identifier Name "PSAID" and Identifier Value "2131231231231" on "Auth Login Stub Page"
    And I click submit button on "Auth Login Stub Page"
    Then I am presented with the "What You Will Need Page"
    And I navigated to the "Scheme Manager Name Page"
    And I should see the heading "What is the manager's name?"
    And I should see the input fields with below labels on "Scheme Manager Name Page"
      | First name |
      | Last name  |

  Scenario:1. Positive journey - PSA/PSP enters both the First and Last names of the Scheme Manager
    When I enter the following data into corresponding input fields on "Scheme Manager Name Page"
      | schemeManagersFirstName | John |
      | schemeManagersLastName | Doe  |
    And I click save and continue button on "Scheme Manager Name Page"
    Then I am presented with the "Organisation Individual Address Page"
# Above action would have to be rewritten upon page gets connected

  Scenario:2. Negative Journey - PSA/PSP does not enter the Last name
    When I enter the following data into corresponding input fields on "Scheme Manager Name Page"
      | schemeManagersFirstName | John |
      | schemeManagersLastName  |      |
    And I click save and continue button on "Scheme Manager Name Page"
    Then I am presented with the "Scheme Manager Name Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter the Scheme manager's last name |
    And I should see following erroneous fields are highlighted on "Scheme Manager Name Page"
      | schemeManagersLastName |
    And Clicking each error message should focus on the corresponding input field on "Scheme Manager Name Page"

  Scenario:3. Negative Journey - PSA/PSP does not enter the First name
    When I enter the following data into corresponding input fields on "Scheme Manager Name Page"
      | schemeManagersFirstName |     |
      | schemeManagersLastName  | Doe |
    And I click save and continue button on "Scheme Manager Name Page"
    Then I am presented with the "Scheme Manager Name Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter the Scheme manager's first name |
    And I should see following erroneous fields are highlighted on "Scheme Manager Name Page"
      | schemeManagersFirstName |
    And Clicking each error message should focus on the corresponding input field on "Scheme Manager Name Page"

  Scenario:4. Negative Journey - PSA/PSP does not enter both the First name and Last name
    When I enter the following data into corresponding input fields on "Scheme Manager Name Page"
      | schemeManagersFirstName |  |
      | schemeManagersLastName  |  |
    And I click save and continue button on "Scheme Manager Name Page"
    Then I am presented with the "Scheme Manager Name Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter the Scheme manager's first name |
      | Enter the Scheme manager's last name  |
    And I should see following erroneous fields are highlighted on "Scheme Manager Name Page"
      | schemeManagersFirstName |
      | schemeManagersLastName  |
    And Clicking each error message should focus on the corresponding input field on "Scheme Manager Name Page"


  Scenario:5. Negative Journey - PSA/PSP enters invalid values for both the First name and Last name
    When I enter the following data into corresponding input fields on "Scheme Manager Name Page"
      | schemeManagersFirstName | Invalid @firstName |
      | schemeManagersLastName  | Invalid @lastName  |
    And I click save and continue button on "Scheme Manager Name Page"
    Then I am presented with the "Scheme Manager Name Page" error page
    And I should see the "There is a problem" and below error messages
      | The scheme manager’s first name must only include letters, spaces, apostrophes and hyphens |
      | The scheme manager’s last name must only include letters, spaces, apostrophes and hyphens |
    And I should see following erroneous fields are highlighted on "Scheme Manager Name Page"
      | schemeManagersFirstName |
      | schemeManagersLastName  |
    And Clicking each error message should focus on the corresponding input field on "Scheme Manager Name Page"

  Scenario:6. Negative Journey - PSA/PSP enters invalid values for the First name
    When I enter the following data into corresponding input fields on "Scheme Manager Name Page"
      | schemeManagersFirstName | Invalid @firstName |
      | schemeManagersLastName  | Goodman            |
    And I click save and continue button on "Scheme Manager Name Page"
    Then I am presented with the "Scheme Manager Name Page" error page
    And I should see the "There is a problem" and below error messages
      | The scheme manager’s first name must only include letters, spaces, apostrophes and hyphens |
    And I should see following erroneous fields are highlighted on "Scheme Manager Name Page"
      | schemeManagersFirstName |
    And Clicking each error message should focus on the corresponding input field on "Scheme Manager Name Page  "

  Scenario:7. Negative Journey - PSA/PSP enters invalid values for the Last name
    When I enter the following data into corresponding input fields on "Scheme Manager Name Page"
      | schemeManagersFirstName | Goodman |
      | schemeManagersLastName  | Invalid @lastName  |
    And I click save and continue button on "Scheme Manager Name Page"
    Then I am presented with the "Scheme Manager Name Page" error page
    And I should see the "There is a problem" and below error messages
      | The scheme manager’s last name must only include letters, spaces, apostrophes and hyphens |
    And I should see following erroneous fields are highlighted on "Scheme Manager Name Page"
      | schemeManagersLastName  |
    And Clicking each error message should focus on the corresponding input field on "Scheme Manager Name Page"

  Scenario:8. Negative Journey - PSA/PSP enters invalid values (numbers) for the First name
    When I enter the following data into corresponding input fields on "Scheme Manager Name Page"
      | schemeManagersFirstName | 1Goodman  |
      | schemeManagersLastName  | Betterman |
    And I click save and continue button on "Scheme Manager Name Page"
    Then I am presented with the "Scheme Manager Name Page" error page
    And I should see the "There is a problem" and below error messages
      | The scheme manager’s first name must only include letters, spaces, apostrophes and hyphens |
    And I should see following erroneous fields are highlighted on "Scheme Manager Name Page"
      | schemeManagersFirstName |
    And Clicking each error message should focus on the corresponding input field on "Scheme Manager Name Page"

  Scenario:9. Negative Journey - PSA/PSP enters invalid values (numbers) for the Last name
    When I enter the following data into corresponding input fields on "Scheme Manager Name Page"
      | schemeManagersFirstName  | Goodman    |
      | schemeManagersLastName  | 1Betterman |
    And I click save and continue button on "Scheme Manager Name Page"
    Then I am presented with the "Scheme Manager Name Page" error page
    And I should see the "There is a problem" and below error messages
      | The scheme manager’s last name must only include letters, spaces, apostrophes and hyphens |
    And I should see following erroneous fields are highlighted on "Scheme Manager Name Page"
      | schemeManagersLastName |
    And Clicking each error message should focus on the corresponding input field on "Scheme Manager Name Page"

  Scenario:10. Negative Journey - PSA/PSP enters name more than 35 characters in the first name
    When I enter the following data into corresponding input fields on "Scheme Manager Name Page"
      | schemeManagersFirstName | Maximillian Alexander Montgomery Montgomery Montgomery|
      | schemeManagersLastName   | Betterman                                 |
    And I click save and continue button on "Scheme Manager Name Page"
    Then I am presented with the "Scheme Manager Name Page" error page
    And I should see the "There is a problem" and below error messages
      | The Scheme manager's first name must be 35 characters or less |
    And I should see following erroneous fields are highlighted on "Scheme Manager Name Page"
      | schemeManagersFirstName |
    And Clicking each error message should focus on the corresponding input field on "Scheme Manager Name Page"

  Scenario:11. Negative Journey - PSA/PSP enters name more than 35 characters in the last name
    When I enter the following data into corresponding input fields on "Scheme Manager Name Page"
      | schemeManagersFirstName | Goodman |
      | schemeManagersLastName   |  Maximillian Alexander Montgomery Montgomery Montgomery       |
    And I click save and continue button on "Scheme Manager Name Page"
    Then I am presented with the "Scheme Manager Name Page" error page
    And I should see the "There is a problem" and below error messages
      | The Scheme manager's last name must be 35 characters or less |
    And I should see following erroneous fields are highlighted on "Scheme Manager Name Page"
      | schemeManagersLastName  |
    And Clicking each error message should focus on the corresponding input field on "Scheme Manager Name Page"

  Scenario:12. Negative Journey - PSA/PSP enters invalid values (numbers) for the First name and leaves last name blank
    When I enter the following data into corresponding input fields on "Scheme Manager Name Page"
      | schemeManagersFirstName | 1Goodman |
      | schemeManagersLastName   |          |
    And I click save and continue button on "Scheme Manager Name Page"
    Then I am presented with the "Scheme Manager Name Page" error page
    And I should see the "There is a problem" and below error messages
      | The scheme manager’s first name must only include letters, spaces, apostrophes and hyphens |
      | Enter the Scheme manager's last name                                              |
    And I should see following erroneous fields are highlighted on "Scheme Manager Name Page"
      | schemeManagersFirstName |
      | schemeManagersLastName    |
    And Clicking each error message should focus on the corresponding input field on "Scheme Manager Name Page"

  Scenario:13. Positive journey - PSA/PSP enters both the First and Last names of the Scheme Manager with an apostophe
    When I enter the following data into corresponding input fields on "Scheme Manager Name Page"
      | schemeManagersFirstName | John O'Conner |
      | schemeManagersLastName  | Doe O'Conner  |
    And I click save and continue button on "Scheme Manager Name Page"
    Then I am presented with the "Organisation Individual Address Page"

  Scenario:14. Positive journey - PSA/PSP enters both the First and Last names of the Scheme Manager with exactly 35 characters
    When I enter the following data into corresponding input fields on "Scheme Manager Name Page"
      | schemeManagersFirstName | Maximillian Alexander Montgomery ab |
      | schemeManagersLastName  | Featherstoneworthingtonfield Wright |
    And I click save and continue button on "Scheme Manager Name Page"
    Then I am presented with the "Organisation Individual Address Page"
