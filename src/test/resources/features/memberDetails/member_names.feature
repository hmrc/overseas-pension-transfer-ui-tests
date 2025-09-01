@Test @MemberName @acceptance
Feature: Adding names of the member

  Background: Common Steps - Member Details Journey
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "What You Will Need Page"
    When I enter Enrollment Key "HMRC-PODS-ORG", Identifier Name "PSAID" and Identifier Value "2131231231231" on "Auth Login Stub Page"
    And I click submit button on "Auth Login Stub Page"
    And I am presented with the "What You Will Need Page"
#    And I click continue button on "Overseas Transfer Index Page"
    Then I navigated to the "Member Name Page"
    And I should see the heading "What is the member's name?"
    And I should see the input fields with below labels on "Member Name Page"
      | First name |
      | Last name  |

  Scenario:1. Positive journey - PSA/PSP enters both the First and Last names of the member
    When I enter the following data into corresponding input fields on "Member Name Page"
      | firstName | John |
      | lastName  | Doe  |
    And I click continue button on "Member Name Page"
    Then I am presented with the "Member Nino Page"
# Above action would have to be rewritten upon page gets connected

  Scenario:2. Negative Journey - PSA/PSP does not enter the Last name
    When I enter the following data into corresponding input fields on "Member Name Page"
      | firstName | John |
      | lastName  |      |
    And I click continue button on "Member Name Page"
    Then I am presented with the "Member Name Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter the member's last name |
    And I should see following erroneous fields are highlighted on "Member Name Page"
      | lastName |
    And Clicking each error message should focus on the corresponding input field on "Member Name Page"

  Scenario:3. Negative Journey - PSA/PSP does not enter the First name
    When I enter the following data into corresponding input fields on "Member Name Page"
      | firstName |     |
      | lastName  | Doe |
    And I click continue button on "Member Name Page"
    Then I am presented with the "Member Name Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter the member's first name |
    And I should see following erroneous fields are highlighted on "Member Name Page"
      | firstName |
    And Clicking each error message should focus on the corresponding input field on "Member Name Page"

  Scenario:4. Negative Journey - PSA/PSP does not enter both the First name and Last name
    When I enter the following data into corresponding input fields on "Member Name Page"
      | firstName |  |
      | lastName  |  |
    And I click continue button on "Member Name Page"
    Then I am presented with the "Member Name Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter the member's first name |
      | Enter the member's last name  |
    And I should see following erroneous fields are highlighted on "Member Name Page"
      | firstName |
      | lastName  |
    And Clicking each error message should focus on the corresponding input field on "Member Name Page"


  Scenario:5. Negative Journey - PSA/PSP enters invalid values for both the First name and Last name
    When I enter the following data into corresponding input fields on "Member Name Page"
      | firstName | Invalid @firstName |
      | lastName  | Invalid @lastName  |
    And I click continue button on "Member Name Page"
    Then I am presented with the "Member Name Page" error page
    And I should see the "There is a problem" and below error messages
      | The member's first name must only include letters, apostrophes and hyphens |
      | The member's last name must only include letters, apostrophes and hyphens  |
    And I should see following erroneous fields are highlighted on "Member Name Page"
      | firstName |
      | lastName  |
    And Clicking each error message should focus on the corresponding input field on "Member Name Page"

  Scenario:6. Negative Journey - PSA/PSP enters invalid values for the First name
    When I enter the following data into corresponding input fields on "Member Name Page"
      | firstName | Invalid @firstName |
      | lastName  | Goodman            |
    And I click continue button on "Member Name Page"
    Then I am presented with the "Member Name Page" error page
    And I should see the "There is a problem" and below error messages
      | The member's first name must only include letters, apostrophes and hyphens |
    And I should see following erroneous fields are highlighted on "Member Name Page"
      | firstName |
    And Clicking each error message should focus on the corresponding input field on "Member Name Page"

  Scenario:7. Negative Journey - PSA/PSP enters invalid values for the Last name
    When I enter the following data into corresponding input fields on "Member Name Page"
      | firstName | Goodman |
      | lastName  | Invalid @lastName  |
    And I click continue button on "Member Name Page"
    Then I am presented with the "Member Name Page" error page
    And I should see the "There is a problem" and below error messages
      | The member's last name must only include letters, apostrophes and hyphens |
    And I should see following erroneous fields are highlighted on "Member Name Page"
      | lastName |
    And Clicking each error message should focus on the corresponding input field on "Member Name Page"

  Scenario:8. Negative Journey - PSA/PSP enters invalid values (numbers) for the First name
    When I enter the following data into corresponding input fields on "Member Name Page"
      | firstName | 1Goodman  |
      | lastName  | Betterman |
    And I click continue button on "Member Name Page"
    Then I am presented with the "Member Name Page" error page
    And I should see the "There is a problem" and below error messages
      | The member's first name must only include letters, apostrophes and hyphens |
    And I should see following erroneous fields are highlighted on "Member Name Page"
      | firstName |
    And Clicking each error message should focus on the corresponding input field on "Member Name Page"

  Scenario:9. Negative Journey - PSA/PSP enters invalid values (numbers) for the Last name
    When I enter the following data into corresponding input fields on "Member Name Page"
      | firstName | Goodman    |
      | lastName  | 1Betterman |
    And I click continue button on "Member Name Page"
    Then I am presented with the "Member Name Page" error page
    And I should see the "There is a problem" and below error messages
      | The member's last name must only include letters, apostrophes and hyphens |
    And I should see following erroneous fields are highlighted on "Member Name Page"
      | lastName |
    And Clicking each error message should focus on the corresponding input field on "Member Name Page"

  Scenario:10. Negative Journey - PSA/PSP enters name more than 35 characters in the first name
    When I enter the following data into corresponding input fields on "Member Name Page"
      | firstName | Maximillian Alexander Montgomery asdffads |
      | lastName  | Betterman                                 |
    And I click continue button on "Member Name Page"
    Then I am presented with the "Member Name Page" error page
    And I should see the "There is a problem" and below error messages
      | Member's first name must be 35 characters or less |
    And I should see following erroneous fields are highlighted on "Member Name Page"
      | firstName |
    And Clicking each error message should focus on the corresponding input field on "Member Name Page"

  Scenario:11. Negative Journey - PSA/PSP enters name more than 35 characters in the last name
    When I enter the following data into corresponding input fields on "Member Name Page"
      | firstName | Goodman                      |
      | lastName  | Featherstoneworthingtonfield dsfasfasdfasdfa|
    And I click continue button on "Member Name Page"
    Then I am presented with the "Member Name Page" error page
    And I should see the "There is a problem" and below error messages
      | Member's last name must be 35 characters or less |
    And I should see following erroneous fields are highlighted on "Member Name Page"
      | lastName |
    And Clicking each error message should focus on the corresponding input field on "Member Name Page"

  Scenario:12. Negative Journey - PSA/PSP enters invalid values (numbers) for the First name and leaves last name blank
    When I enter the following data into corresponding input fields on "Member Name Page"
      | firstName | 1Goodman |
      | lastName  |          |
    And I click continue button on "Member Name Page"
    Then I am presented with the "Member Name Page" error page
    And I should see the "There is a problem" and below error messages
      | The member's first name must only include letters, apostrophes and hyphens |
      | Enter the member's last name                                               |
    And I should see following erroneous fields are highlighted on "Member Name Page"
      | firstName |
      | lastName     |
    And Clicking each error message should focus on the corresponding input field on "Member Name Page"

  Scenario:13. Positive journey - PSA/PSP enters both the First and Last names of the member with an apostophe
    When I enter the following data into corresponding input fields on "Member Name Page"
      | firstName | John O'Conner |
      | lastName  | Doe O'Conner  |
    And I click continue button on "Member Name Page"
    Then I am presented with the "Member Nino Page"

  Scenario:14. Positive journey - PSA/PSP enters both the First and Last names of the member with exactly 35 charecters
    When I enter the following data into corresponding input fields on "Member Name Page"
      | firstName | Maximillian Alexander Montgomery ab |
      | lastName  | Featherstoneworthingtonfield Wright |
    And I click continue button on "Member Name Page"
    Then I am presented with the "Member Nino Page"
