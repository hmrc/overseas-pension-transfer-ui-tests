@Test @SchemeManagerTelephone @acceptance
Feature: Entering the Telephone Number of the Scheme Manager

  Background: Common Steps - Member Details Journey
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "Journey entry URL"
    When I enter Enrollment Key "HMRC-PODS-ORG", Identifier Name "PSAID" and Identifier Value "A2100005" on "Auth Login Stub Page"
    And I click submit button on "Auth Login Stub Page"
    Then I am presented with the "Dashboard Page"
    And I click on "Start new transfer" hyperlink on "Dashboard Page"
    Then I am presented with the "What You Will Need Page"
    And I navigated to the "Scheme Manager Telephone Page"
    Then I am presented with the "Scheme Manager Telephone Page"
    And I should see the heading "What is the scheme manager's telephone number?"
    And I should see the hint text "All numbers should include the area, dialling or country code for example, +441234567890."

  Scenario:1. Positive journey - PSA/PSP enters the valid email address
    When I enter the following data into corresponding input fields on "Scheme Manager Telephone Page"
      | contactNumber | +441234567890 |
    And I click save and continue button on "Scheme Manager Telephone Page"
    Then I am presented with the "Scheme Manager Check Your Answer Page"
# Above action would have to be rewritten upon page gets connected

  Scenario:2. Positive journey - PSA/PSP enters the valid email address without the +
    When I enter the following data into corresponding input fields on "Scheme Manager Telephone Page"
      | contactNumber | 1234567890 |
    And I click save and continue button on "Scheme Manager Telephone Page"
    Then I am presented with the "Scheme Manager Check Your Answer Page"

  Scenario:3. Negative journey - PSA/PSP does not enter anything in the telephone field
    When I enter the following data into corresponding input fields on "Scheme Manager Telephone Page"
      | contactNumber |  |
    And I click save and continue button on "Scheme Manager Telephone Page"
    Then I am presented with the "Scheme Manager Telephone Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter the scheme manager's telephone number |
    And I should see following erroneous fields are highlighted on "Scheme Manager Telephone Page"
      | contactNumber |
    And Clicking each error message should focus on the corresponding input field on "Scheme Manager Telephone Page"

  Scenario:3. Negative journey - PSA/PSP enters telephone number in an incorrect format
    When I enter the following data into corresponding input fields on "Scheme Manager Telephone Page"
      | contactNumber | noreply |
    And I click save and continue button on "Scheme Manager Telephone Page"
    Then I am presented with the "Scheme Manager Telephone Page" error page
    And I should see the "There is a problem" and below error messages
      | Telephone number must only include numbers or a + at the beginning |
    And I should see following erroneous fields are highlighted on "Scheme Manager Telephone Page"
      | contactNumber |
    And Clicking each error message should focus on the corresponding input field on "Scheme Manager Telephone Page"

  Scenario:4. Negative journey - PSA/PSP enters more than 35 characters for 'Telephone' in the Scheme Manager telephone page
    When I enter the following data into corresponding input fields on "Scheme Manager Telephone Page"
      | contactNumber | 1111122222333334444455555566666777778888899999000000 |
    And I click save and continue button on "Scheme Manager Telephone Page"
    Then I am presented with the "Scheme Manager Telephone Page" error page
    And I should see the "There is a problem" and below error messages
      | Telephone number must be 35 characters or less |
    And I should see following erroneous fields are highlighted on "Scheme Manager Telephone Page"
      | contactNumber |
    And Clicking each error message should focus on the corresponding input field on "Scheme Manager Telephone Page"