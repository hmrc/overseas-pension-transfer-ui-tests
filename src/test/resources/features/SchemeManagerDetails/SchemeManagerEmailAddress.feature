@Test @SchemeManagerEmailAddress
Feature: Entering the email address of the Scheme Manager

  Background: Common Steps - Member Details Journey
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "Overseas Transfer Index Page"
    # And I enter redirect URL on Auth Login Stub Page for "Is Member Currently UK Resident Page"
    # Redirection currently does not work for any other page other than the Index page
    And I click submit button on "Auth Login Stub Page"
    Then I am presented with the "Overseas Transfer Index Page"
    And I navigated to the "Scheme Manager Email Page"
    Then I am presented with the "Scheme Manager Email Page"
    And I should see the heading "What is the scheme manager's email address?"
    And I should see the hint text "For example, name@example.com."

  Scenario:1. Positive journey - PSA/PSP enters the valid email address
    When I enter the following data into corresponding input fields on "Scheme Manager Email Page"
      | emailAddress | thismail@gmail.com |
    And I click save and continue button on "Scheme Manager Email Page"
    Then I am presented with the "Scheme Manager Telephone Page"
# Above action would have to be rewritten upon page gets connected

  Scenario:2. Negative journey - PSA/PSP does not enter anything in the email field
    When I enter the following data into corresponding input fields on "Scheme Manager Email Page"
      | emailAddress |  |
    And I click save and continue button on "Scheme Manager Email Page"
    Then I am presented with the "Scheme Manager Email Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter the scheme manager's email address |
    And I should see following erroneous fields are highlighted on "Scheme Manager Email Page"
      | emailAddress |
    And Clicking each error message should focus on the corresponding input field on "Scheme Manager Email Page"

  Scenario:3. Negative journey - PSA/PSP enters email address in an incorrect format
    When I enter the following data into corresponding input fields on "Scheme Manager Email Page"
      | emailAddress | noreply |
    And I click save and continue button on "Scheme Manager Email Page"
    Then I am presented with the "Scheme Manager Email Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter an email address in the correct format like, name@example.com |
    And I should see following erroneous fields are highlighted on "Scheme Manager Email Page"
      | emailAddress |
    And Clicking each error message should focus on the corresponding input field on "Scheme Manager Email Page"

  Scenario:4. Negative journey - PSA/PSP enters more than 254 characters for 'Address Line 3' in the Scheme Manager address page
    When I enter the following data into corresponding input fields on "Organisation Individual Address Page"
      | emailAddress | longemaillongemaillongemaillongemaillongemaillongemaillongemaillongemaillongemaillongemaillongemaillongemaillongemaillongemaillongemaillongemaillongemaillongemaillongemaillongemaillongemaillongemaillongemaillongemaillongemaillongemaillongemaillongemaillongemail@gmail.com |
    And I click save and continue button on "Scheme Manager Email Page"
    Then I am presented with the "Scheme Manager Email Page" error page
    And I should see the "There is a problem" and below error messages
      | Email address must be 254 characters or less |
    And I should see following erroneous fields are highlighted on "Scheme Manager Email Page"
      | emailAddress |
    And Clicking each error message should focus on the corresponding input field on "Scheme Manager Email Page"