@Test @OrganisationIndividualName
Feature: Adding names of the member

  Background: Common Steps - Member Details Journey
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "Overseas Transfer Index Page"
    # And I enter redirect URL on Auth Login Stub Page for "Is Member Currently UK Resident Page"
    # Redirection currently does not work for any other page other than the Index page
    And I click submit button on "Auth Login Stub Page"
    Then I am presented with the "Overseas Transfer Index Page"
    And I navigated to the "Organisation Individual Name Page"
    And I should see the heading "Contact details of an individual within the organisation with whom HMRC should correspond"
    And I should see the input fields with below labels on "Organisation Individual Name Page"
      | First name |
      | Last name  |

  Scenario:1. Positive journey - PSA/PSP enters both the First and Last names of the organisation individual
    When I enter the following data into corresponding input fields on "Organisation Individual Name Page"
      | orgIndFirstName | John |
      | orgIndLastName  | Doe  |
    And I click save and continue button on "Organisation Individual Name Page"
    Then I am presented with the "Overseas Transfer Index Page"
# Above action would have to be rewritten upon page gets connected

  Scenario:2. Negative Journey - PSA/PSP does not enter the Last name of the organisation individual
    When I enter the following data into corresponding input fields on "Organisation Individual Name Page"
      | orgIndFirstName | John |
      | orgIndLastName  |      |
    And I click save and continue button on "Organisation Individual Name Page"
    Then I am presented with the "Organisation Individual Name Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter the individual's last name |
    And I should see following erroneous fields are highlighted on "Organisation Individual Name Page"
      | orgIndLastName |
    And Clicking each error message should focus on the corresponding input field on "Organisation Individual Name Page"

  Scenario:3. Negative Journey - PSA/PSP does not enter the First name of the organisation individual
    When I enter the following data into corresponding input fields on "Organisation Individual Name Page"
      | orgIndFirstName |     |
      | orgIndLastName  | Doe |
    And I click save and continue button on "Organisation Individual Name Page"
    Then I am presented with the "Organisation Individual Name Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter the individual's first name |
    And I should see following erroneous fields are highlighted on "Organisation Individual Name Page"
      | orgIndFirstName |
    And Clicking each error message should focus on the corresponding input field on "Organisation Individual Name Page"

  Scenario:4. Negative Journey - PSA/PSP does not enter both the First name and Last name of the organisation individual
    When I enter the following data into corresponding input fields on "Organisation Individual Name Page"
      | orgIndFirstName |  |
      | orgIndLastName  |  |
    And I click save and continue button on "Organisation Individual Name Page"
    Then I am presented with the "Organisation Individual Name Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter the individual's first name |
      | Enter the individual's last name  |
    And I should see following erroneous fields are highlighted on "Organisation Individual Name Page"
      | orgIndFirstName |
      | orgIndLastName  |
    And Clicking each error message should focus on the corresponding input field on "Organisation Individual Name Page"


  Scenario:5. Negative Journey - PSA/PSP enters invalid values for both the First name and Last name of the organisation individual
    When I enter the following data into corresponding input fields on "Organisation Individual Name Page"
      | orgIndFirstName | Invalid @firstName |
      | orgIndLastName  | Invalid @lastName  |
    And I click save and continue button on "Organisation Individual Name Page"
    Then I am presented with the "Organisation Individual Name Page" error page
    And I should see the "There is a problem" and below error messages
      | The individual's first name must only include letters, spaces, apostrophes and hyphens |
      | The individual's last name must only include letters, spaces, apostrophes and hyphens  |
    And I should see following erroneous fields are highlighted on "Organisation Individual Name Page"
      | orgIndFirstName |
      | orgIndLastName  |
    And Clicking each error message should focus on the corresponding input field on "Organisation Individual Name Page"

  Scenario:6. Negative Journey - PSA/PSP enters more than 35 characters into the First name and Last name of the organisation individual
    When I enter the following data into corresponding input fields on "Organisation Individual Name Page"
      | orgIndFirstName | More than thirty five characters in the First name of the individual |
      | orgIndLastName  | More than thirty five characters in the Last name of the individual  |
    And I click save and continue button on "Organisation Individual Name Page"
    Then I am presented with the "Organisation Individual Name Page" error page
    And I should see the "There is a problem" and below error messages
      | The individual's first name must be 35 characters or fewer |
      | The individual's last name must be 35 characters or fewer  |
    And I should see following erroneous fields are highlighted on "Organisation Individual Name Page"
      | orgIndFirstName |
      | orgIndLastName  |
    And Clicking each error message should focus on the corresponding input field on "Organisation Individual Name Page"