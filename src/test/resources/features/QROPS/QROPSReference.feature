@Test @QROPSReference @acceptance
Feature: Adding QROPS Reference

  Background: Common Steps - QROPS Details Journey
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "Journey entry URL"
    When I enter Enrollment Key "HMRC-PODS-ORG", Identifier Name "PSAID" and Identifier Value "A2100005" on "Auth Login Stub Page"
    And I click submit button on "Auth Login Stub Page"
    Then I am presented with the "Dashboard Page"
    And I click on "Start new transfer" hyperlink on "Dashboard Page"
    Then I am presented with the "What You Will Need Page"
    And I navigated to the "QROPS Reference Page"
    And I should see the heading "What is the QROPS reference?"
    And I should see below input fields on "QROPS Reference Page"
      | qropsRef |

  Scenario Outline:1. Positive journey - PSA/PSP enters a valid QROPS reference
    When I enter the following data into corresponding input fields on "QROPS Reference Page"
      | qropsRef | <qropsReference> |
    And I click save and continue button on "QROPS Reference Page"
    Then I am presented with the "QROPS Address Page"

    Examples:
      | qropsReference |
      | QROPS123456    |
      | 123456         |

  Scenario:2. Negative Journeys - PSA/PSP does not enter anything in QROPS reference field
    When I enter the following data into corresponding input fields on "QROPS Reference Page"
      | qropsRef |  |
    And I click save and continue button on "QROPS Reference Page"
    Then I am presented with the "QROPS Reference Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter the QROPS Reference |
    And I should see following erroneous fields are highlighted on "QROPS Reference Page"
      | qropsRef |
    And Clicking each error message should focus on the corresponding input field on "QROPS Reference Page"

  Scenario:3. Negative Journeys - PSA/PSP enters QROPS reference number in an invalid format (eg: 123456AB)
    When I enter the following data into corresponding input fields on "QROPS Reference Page"
      | qropsRef | 123456AB |
    And I click save and continue button on "QROPS Reference Page"
    Then I am presented with the "QROPS Reference Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter the QROPS reference in a valid format |
    And I should see following erroneous fields are highlighted on "QROPS Reference Page"
      | qropsRef |
    And Clicking each error message should focus on the corresponding input field on "QROPS Reference Page"


  Scenario:4. Negative Journeys - PSA/PSP enters any charecters other than QROPS  in the QROPS reference number field (eg: PROPS123456)
    When I enter the following data into corresponding input fields on "QROPS Reference Page"
      | qropsRef | PROPS123456 |
    And I click save and continue button on "QROPS Reference Page"
    Then I am presented with the "QROPS Reference Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter the QROPS reference in a valid format |
    And I should see following erroneous fields are highlighted on "QROPS Reference Page"
      | qropsRef |
    And Clicking each error message should focus on the corresponding input field on "QROPS Reference Page"
