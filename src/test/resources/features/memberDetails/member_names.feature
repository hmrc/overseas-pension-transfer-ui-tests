@Test @MemberName
Feature: Adding names of the member

  Background: Common Steps - Member Details Journey
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "Overseas Transfer Index Page"
    # And I enter redirect URL on Auth Login Stub Page for "Is Member Currently UK Resident Page"
    # Redirection currently does not work for any other page other than the Index page
    And I click submit button on "Auth Login Stub Page"
    Then I am presented with the "Overseas Transfer Index Page"
    And I click continue button on "Overseas Transfer Index Page"
    Then I am presented with the "Member Name Page"
    And I should see the heading "What is the member's name?"
    And I should see the input fields with below labels on "Member Name Page"
      | First name |
      | Last name  |

  Scenario:1. Positive journey - PSA/PSP enters both the First and Last names of the member
    When I enter the following data into corresponding input fields on "Member Name Page"
      | firstName | John |
      | lastName  | Doe  |
    And I click continue button on "Member Name Page"
    Then I am presented with the "Overseas Transfer Index Page"
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