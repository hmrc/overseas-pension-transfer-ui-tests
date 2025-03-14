@Test @MembersLastUKAddress
Feature: Adding names of the member

  Background: Common Steps - Member Details Journey
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "Overseas Transfer Index Page"
    # And I enter redirect URL on Auth Login Stub Page for "Is Member Currently UK Resident Page"
    # Redirection currently does not work for any other page other than the Index page
    And I click submit button on "Auth Login Stub Page"
    Then I am presented with the "Overseas Transfer Index Page"
    And I navigated to the "Members Last UK Address Page"
    Then I am presented with the "Members Last UK Address Page"

  Scenario Outline: Verify the Members Last UK Address Page
    And I should see the heading "What was <memberName>'s last principal residential address in the UK?"
    And I should see the input fields with below labels on "Members Last UK Address Page"
      | Address line 1            |
      | Address line 2 (optional) |
      | Town or City              |
      | County (optional)         |
      | Postcode                  |
    Examples:
      | memberName          |
      | undefined undefined |


  Scenario:1. Positive journey - PSA/PSP enters data only into the mandatory fields
    When I enter the following data into corresponding input fields on "Members Last UK Address Page"
      | addressLine1 | Some valid UK address |
      | townOrCity   | Some town             |
      | postcode     | AB12CD                |
    And I click save and continue button on "Members Last UK Address Page"
    Then I am presented with the "Overseas Transfer Index Page"
# Above action would have to be rewritten upon page gets connected

  Scenario:2. Positive journey - PSA/PSP enters data into all the fields
    When I enter the following data into corresponding input fields on "Members Last UK Address Page"
      | addressLine1 | Some valid UK address line1 |
      | addressLine2 | Some valid UK address line2 |
      | townOrCity   | Some town                   |
      | county       | Some county                 |
      | postcode     | AB12CD                      |
    And I click save and continue button on "Members Last UK Address Page"
    Then I am presented with the "Overseas Transfer Index Page"
# Above action would have to be rewritten upon page gets connected
