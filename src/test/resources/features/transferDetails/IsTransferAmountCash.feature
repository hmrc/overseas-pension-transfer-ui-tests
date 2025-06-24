@Test   @IsTransferAmountCash
Feature: Is Transfer amount cash?

  Background: Common Steps - Member Details Journey
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
   # And I enter redirect URL on Auth Login Stub Page for "Overseas Transfer Index Page"
   And I enter redirect URL on Auth Login Stub Page for "What You Will Need Page"
    # And I enter redirect URL on Auth Login Stub Page for "Member Has Ever Been UK Resident Page"
    # Redirection currently does not work for any other page other than the Index page
    When I enter Enrollment Key "HMRC-PODS-ORG", Identifier Name "PSAID" and Identifier Value "2131231231231" on "Auth Login Stub Page"
    And I click submit button on "Auth Login Stub Page"
   #Then I am presented with the "Overseas Transfer Index Page"
   #And I click continue button on "Overseas Transfer Index Page"
    And I am presented with the "What You Will Need Page"
    And I navigated to the "Is Transfer Amount Cash Page"
    Then I am presented with the "Is Transfer Amount Cash Page"
    And I should see the heading "Is the transfer made up of cash only?"
    And I should see the hint text "Select one."
    And I should see two radio buttons: "Yes" and "No"

  Scenario:1. Positive Journey - Select 'Yes' radio button
    When I select radio button "Yes" on "Is Transfer Amount Cash Page"
    And I click save and continue button on "Is Transfer Amount Cash Page"
    Then I am presented with the "Overseas Transfer Index Page"
# Above action would have to be rewritten upon page gets connected

  Scenario:2. Positive Journey - Select 'No' radio button
    When I select radio button "No" on "Is Transfer Amount Cash Page"
    And I click save and continue button on "Is Transfer Amount Cash Page"
    Then I am presented with the "Overseas Transfer Index Page"
# Above action would have to be rewritten upon page gets connected

  Scenario:3. Negative Journey - No Selection Error
    When I click save and continue button on "Is Transfer Amount Cash Page"
    Then I am presented with the "Is Transfer Amount Cash Page" error page
    And I should see the "There is a problem" and below error messages
      | Select yes if the transfer is cash only|
    And Clicking each error message should focus on the corresponding input field on "Is Transfer Amount Cash Page"