@Test @PsaDeclaration @acceptance
Feature: PSA Dec

  Background: Common Steps - PSA declaration journey
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "Journey entry URL"
    When I enter Enrollment Key "HMRC-PODS-ORG", Identifier Name "PSAID" and Identifier Value "A2100005" on "Auth Login Stub Page"
    # And I enter redirect URL on Auth Login Stub Page for "Is Member Currently UK Resident Page"
    And I click submit button on "Auth Login Stub Page"
    Then I am presented with the "Dashboard Page"
    And I click on "Start new transfer" hyperlink on "Dashboard Page"
    And I am presented with the "What You Will Need Page"
    And I navigated to the "Member Nino Page"
    And I am presented with the "Member Nino Page"


  Scenario: Verify PSA declaration page
    And I navigated to the "Psa Declaration Page"
    And I am presented with the "PsaDeclaration Page"
    And I should see the heading "Declaration"
    And I click save and continue button on "Psa Declaration Page"

