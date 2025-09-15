@Test   @IsTransferCashOnly @acceptance
Feature: Is transfer cash only?

  Background: Common Steps - Transfer Details Journey
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "Journey entry URL"
    When I enter Enrollment Key "HMRC-PODSPP-ORG", Identifier Name "PSPID" and Identifier Value "21000005" on "Auth Login Stub Page"
    And I click submit button on "Auth Login Stub Page"
    Then I am presented with the "Dashboard Page"
    And I click on "Start new transfer" hyperlink on "Dashboard Page"
    And I am presented with the "What You Will Need Page"
    And I navigated to the "Is Transfer Cash Only Page"
    Then I am presented with the "Is Transfer Cash Only Page"
    And I should see the heading "Is the transfer made up of cash only?"
    And I should see the hint text "Select one."
    And I should see two radio buttons: "Yes" and "No"

  Scenario:1. Positive Journey - Select 'Yes' radio button
    When I select radio button "Yes" on "Is Transfer Cash Only Page"
    And I click save and continue button on "Is Transfer Cash Only Page"
    Then I am presented with the "Transfer Details Check Your Answers Page"

  Scenario:2. Positive Journey - Select 'No' radio button
    When I select radio button "No" on "Is Transfer Cash Only Page"
    And I click save and continue button on "Is Transfer Cash Only Page"
    Then I am presented with the "Type Of Asset Page"

  Scenario:3. Negative Journey - No Selection Error
    When I click save and continue button on "Is Transfer Cash Only Page"
    Then I am presented with the "Is Transfer Cash Only Page" error page
    And I should see the "There is a problem" and below error messages
      | Select yes if the transfer is cash only|
    And Clicking each error message should focus on the corresponding input field on "Is Transfer Cash Only Page"