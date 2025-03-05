@AllTests @ReasonfornoNINO
Feature: Entry page for adding details for member not having NINO

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

  @Test
  Scenario:2- Negative test – No data entered
    When I enter “” for “Why doesn’t Jon Doe have a National Insurance number?” on "Member does not have NINO Page"
    And I click save and continue button on " Member does not have NINO Page"
    Then I should see the following text on the page
      | There is a problem |
    And I should see the following text on the page
      | Enter the reason the member does not have a National Insurance number and a reference we can use to identify them |
    And I click on  “Enter the reason the member does not have a National Insurance number and a reference we can use to identify them”
    When I click on "Enter the reason the member does not have a National Insurance number and a reference we can use to identify them" hyperlink on "Member does not have NINO Page"
    And I enter “Card got lost and complaint raised” for “Why doesn’t Jon Doe have a National Insurance number?” on "Member does not have NINO Page"
    And I click save and continue button on " Member does not have NINO Page"
    Then I am presented with the "overseas pension transfer frontend page"
    When I click continue button on "overseas pension transfer frontend page"
    And I am presented with the "member's name page"


  @Test
  Scenario:3- Happy Path for entering the reason for no NINO with only one character
    When I enter “A” for “Why doesn’t Jon Doe have a National Insurance number?” on "Member does not have NINO Page"
    And I click save and continue button on " Member does not have NINO Page"
    Then I am presented with the "overseas pension transfer frontend page"
    When I click continue button on "overseas pension transfer frontend page"
    And I am presented with the "member's name page"

  @Test
  Scenario:4- Happy Path for entering the reason for no NINO with 160 characters
    When I enter “I do not have NI number currently. I had it till last month, but was lost in London. I have raised a complaint with required authorities and are looking at it.” for “Why doesn’t Jon Doe have a National Insurance number?” on "Member does not have NINO Page"
    And I click save and continue button on " Member does not have NINO Page"
    Then I am presented with the "overseas pension transfer frontend page"
    When I click continue button on "overseas pension transfer frontend page"
    And I am presented with the "member's name page"

  @Test
  Scenario:5- Negative test – data entered greater than 160 characters
    When I enter “I do not have NI number currently. I had it till last month but was lost in London. I have raised a complaint with required authorities and are looking at it. Thank You.” for “Why doesn’t Jon Doe have a National Insurance number?” on "Member does not have NINO Page"
    And I click save and continue button on " Member does not have NINO Page"
    Then I should see the following text on the page
      | There is a problem |
    And I should see the following text on the page
      | The reason for not having a National Insurance number and reference in its place must be 160 characters or fewer |
    And I click on “Enter the reason the member does not have a National Insurance number and a reference we can use to identify them” hyperlink on " Member does not have NINO Page"
  // And I click on "Tell us if you have adjustments to declare" hyperlink on "Task List Page"
    And I enter “Card got lost and complaint raised” for “Why doesn’t Jon Doe have a National Insurance number?” on "Member does not have NINO Page"
    And I click save and continue button on " Member does not have NINO Page"
    Then I am presented with the "overseas pension transfer frontend page"
    When I click continue button on "overseas pension transfer frontend page"
    And I am presented with the "member's name page"
