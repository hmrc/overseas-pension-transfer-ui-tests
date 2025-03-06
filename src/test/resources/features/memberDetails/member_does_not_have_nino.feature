@Ignore @Test @DoesNotHaveNINO
Feature: Adding details for the member who does not have NINO

  Background: : Common Steps - Reason for no NINO
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "Member does not have NINO"
    And I click submit button on "Auth Login Stub Page"
    Then I am presented with the "Member does not have NINO Page"
    Then I should see the following text on the page
      | Why doesn’t Jon Doe have a National Insurance number? |
    Then I should see the following text on the page
      | If the member has another HMRC reference number that relates to them as an individual, please give that number. |
    When I click save and continue button on "overseas pension transfer frontend page"

  @Test
  Scenario:1- Happy Path for entering the reason for no NINO
    When I enter "Card got lost and complaint raised" for "Why doesn’t Jon Doe have a National Insurance number?" on "Member does not have NINO Page"
    And I enter "250.5500" for "Litres Of Pure Alcohol" on "Adjustment Volume With Spr Page"
    And I click save and continue button on " Member does not have NINO Page"
    Then I am presented with the "overseas pension transfer frontend page"
    When I click continue button on "overseas pension transfer frontend page"
    And I am presented with the "member's name page"


