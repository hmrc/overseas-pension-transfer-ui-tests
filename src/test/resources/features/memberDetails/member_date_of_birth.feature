@Test @MemberDateOfBirth
Feature: When did the member leave UK?

  Background: Common Steps - Member Details Journey
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "Overseas Transfer Index Page"
    # And I enter redirect URL on Auth Login Stub Page for "Is Member Currently UK Resident Page"
    # Redirection currently does not work for any other page other than the Index page
    And I click submit button on "Auth Login Stub Page"
    Then I am presented with the "Overseas Transfer Index Page"
    And I navigated to the "Member Date Of Birth Page"
    Then I am presented with the "Member Date Of Birth Page"

  Scenario Outline: Verify the Member Date Of Birth Page
    And I should see the heading "What is <memberName>’s date of birth?"
    And I should see the hint text "For example, 31 03 1980."

    Examples:
      | memberName |
      | {0}        |

  Scenario:1. Positive journey - PSA/PSP enters all three fields of Day, Month and Year
    When I enter day "31", month "12" and year "1901" on "Member Date Of Birth Page"
    And I click save and continue button on "Member Date Of Birth Page"
    Then I am presented with the "Overseas Transfer Index Page"
# Above action would have to be rewritten upon page gets connected

  Scenario:2. Negative Journey - PSA/PSP does not enter the Day
    When I enter nothing in the "day" input field on "Member Date Of Birth Page"
    And I enter "12" in the "month" input field on "Member Date Of Birth Page"
    And I enter "1980" in the "year" input field on "Member Date Of Birth Page"
    And I click save and continue button on "Member Date Of Birth Page"
    Then I am presented with the "Member Date Of Birth Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter a day |

  Scenario:3. Negative Journey - PSA/PSP does not enter the Month
    When I enter "31" in the "day" input field on "Member Date Of Birth Page"
    And I enter nothing in the "month" input field on "Member Date Of Birth Page"
    And I enter "1980" in the "year" input field on "Member Date Of Birth Page"
    And I click save and continue button on "Member Date Of Birth Page"
    Then I am presented with the "Member Date Of Birth Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter a month |

  Scenario:4. Negative Journey - PSA/PSP does not enter the Year
    When I enter "31" in the "day" input field on "Member Date Of Birth Page"
    And I enter "12" in the "month" input field on "Member Date Of Birth Page"
    And I enter nothing in the "year" input field on "Member Date Of Birth Page"
    And I click save and continue button on "Member Date Of Birth Page"
    Then I am presented with the "Member Date Of Birth Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter a year |

  Scenario:5. Negative Journey - PSA/PSP enters a future date
    When I enter "31" in the "day" input field on "Member Date Of Birth Page"
    And I enter "12" in the "month" input field on "Member Date Of Birth Page"
    And I enter "2026" in the "year" input field on "Member Date Of Birth Page"
    And I click save and continue button on "Member Date Of Birth Page"
    Then I am presented with the "Member Date Of Birth Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter Day/Month/Year in the correct format |
    # Correct error message should be as below, needs to be changed in the application code
    #  | Enter the day, month, year in the correct format. For example 27 03 1970. |
