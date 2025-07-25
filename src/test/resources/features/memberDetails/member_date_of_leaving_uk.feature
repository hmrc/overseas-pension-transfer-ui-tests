@Test @MemberDateOfLeavingUK @acceptance
Feature: When did the member leave UK?

  Background: Common Steps - Member Details Journey
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "Overseas Transfer Index Page"
    # And I enter redirect URL on Auth Login Stub Page for "Is Member Currently UK Resident Page"
    # Redirection currently does not work for any other page other than the Index page
    And I click submit button on "Auth Login Stub Page"
    Then I am presented with the "Overseas Transfer Index Page"
    And I navigated to the "Member Date Of Leaving UK Page"
    Then I am presented with the "Member Date Of Leaving UK Page"

  Scenario Outline: Verify the Member Date Of Leaving UK Page
    And I should see the heading "When did <memberName> leave the UK?"
    And I should see the hint text "For example, 31 03 1980."

    Examples:
      | memberName |
      |            |

  Scenario:1. Positive journey - PSA/PSP enters all three fields of Day, Month and Year
    When I enter the following data into corresponding input fields on "Member Date Of Leaving UK Page"
      | day   | 31   |
      | month | 12   |
      | year  | 1980 |
    And I click save and continue button on "Member Date Of Leaving UK Page"
    Then I am presented with the "Overseas Transfer Index Page"
# Above action would have to be rewritten upon page gets connected

  Scenario:2. Positive journey - PSA/PSP enters all three fields of Day, Month and Year but enters a single digit (eg: 1 instead of 01)
    When I enter the following data into corresponding input fields on "Member Date Of Leaving UK Page"
      | day   | 1    |
      | month | 12   |
      | year  | 1991 |
    And I click save and continue button on "Member Date Of Leaving UK Page"
    Then I am presented with the "Overseas Transfer Index Page"

  Scenario:3. Negative Journey - PSA/PSP enters day in a wrong format
    When I enter the following data into corresponding input fields on "Member Date Of Leaving UK Page"
      | day   | 32    |
      | month | 12   |
      | year  | 1980 |
    And I click save and continue button on "Member Date Of Leaving UK Page"
    Then I am presented with the "Member Date Of Leaving UK Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter the day, month, year in the correct format. For example, 27 03 1970 |
    And I should see following erroneous fields are highlighted on "Member Date Of Leaving UK Page"
      | day |
    And Clicking each error message should focus on the corresponding input field on "Member Date Of Leaving UK Page"

  Scenario:4. Negative Journey - PSA/PSP enters day in a wrong format - Leap year (29th Feb 2003)
    When I enter the following data into corresponding input fields on "Member Date Of Leaving UK Page"
      | day   | 29   |
      | month | 02   |
      | year  | 2003 |
    And I click save and continue button on "Member Date Of Leaving UK Page"
    Then I am presented with the "Member Date Of Leaving UK Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter the day, month, year in the correct format. For example, 27 03 1970 |
    And I should see following erroneous fields are highlighted on "Member Date Of Leaving UK Page"
      | day |
    And Clicking each error message should focus on the corresponding input field on "Member Date Of Leaving UK Page"

  Scenario:5. Negative Journey - PSA/PSP enters month in a wrong format - (29/13/2003)
    When I enter the following data into corresponding input fields on "Member Date Of Leaving UK Page"
      | day   | 29   |
      | month | 13   |
      | year  | 2003 |
    And I click save and continue button on "Member Date Of Leaving UK Page"
    Then I am presented with the "Member Date Of Leaving UK Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter the day, month, year in the correct format. For example, 27 03 1970 |
    And I should see following erroneous fields are highlighted on "Member Date Of Leaving UK Page"
      | month |
    And Clicking each error message should focus on the corresponding input field on "Member Date Of Leaving UK Page"

  Scenario:6. Negative Journey - PSA/PSP enters month in a wrong format (letter) - Leap year (29/ABC/2003)
    When I enter the following data into corresponding input fields on "Member Date Of Leaving UK Page"
      | day   | 29   |
      | month | ABC  |
      | year  | 2003 |
    And I click save and continue button on "Member Date Of Leaving UK Page"
    Then I am presented with the "Member Date Of Leaving UK Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter the day, month, year in the correct format. For example, 27 03 1970 |
    And I should see following erroneous fields are highlighted on "Member Date Of Leaving UK Page"
      | month |
    And Clicking each error message should focus on the corresponding input field on "Member Date Of Leaving UK Page"

  Scenario:7. Negative Journey - PSA/PSP enters the Year of Birth < 1901 (29/12/1900)
    When I enter the following data into corresponding input fields on "Member Date Of Leaving UK Page"
      | day   | 29   |
      | month | 12   |
      | year  | 1900 |
    And I click save and continue button on "Member Date Of Leaving UK Page"
    Then I am presented with the "Member Date Of Leaving UK Page" error page
    And I should see the "There is a problem" and below error messages
      | Date cannot be before 1901, or in the future |
    And I should see following erroneous fields are highlighted on "Member Date Of Leaving UK Page"
      | year |
    And Clicking each error message should focus on the corresponding input field on "Member Date Of Leaving UK Page"

  Scenario:8. Negative Journey - PSA/PSP enters the Year of Birth > current date
    When I enter the following data into corresponding input fields on "Member Date Of Leaving UK Page"
      | day   | 29   |
      | month | 12   |
      | year  | 2025 |
    And I click save and continue button on "Member Date Of Leaving UK Page"
    Then I am presented with the "Member Date Of Leaving UK Page" error page
    And I should see the "There is a problem" and below error messages
      | Date cannot be before 1901, or in the future |
    And I should see following erroneous fields are highlighted on "Member Date Of Leaving UK Page"
      | year |
    And Clicking each error message should focus on the corresponding input field on "Member Date Of Leaving UK Page"

  Scenario:9. Negative Journey - PSA/PSP enters the Day of Birth as an alphabet (Sun)
    When I enter the following data into corresponding input fields on "Member Date Of Leaving UK Page"
      | day   | sun  |
      | month | 12   |
      | year  | 2022 |
    And I click save and continue button on "Member Date Of Leaving UK Page"
    Then I am presented with the "Member Date Of Leaving UK Page" error page
    And I should see the "There is a problem" and below error messages
      | The Day/Month/Year Field must only include numbers |
    And I should see following erroneous fields are highlighted on "Member Date Of Leaving UK Page"
      | day |
    And Clicking each error message should focus on the corresponding input field on "Member Date Of Leaving UK Page"

  Scenario:10. Positive journey - PSA/PSP enters the month of leaving using alphabets (eg: Sept)
    When I enter the following data into corresponding input fields on "Member Date Of Leaving UK Page"
      | day   | 1    |
      | month | Sep  |
      | year  | 1991 |
    And I click save and continue button on "Member Date Of Leaving UK Page"
    Then I am presented with the "Overseas Transfer Index Page"

  Scenario:11. Negative Journey - PSA/PSP enters enters the wrong input using random alphabet and special character for month of Leaving
    When I enter the following data into corresponding input fields on "Member Date Of Leaving UK Page"
      | day   | 12    |
      | month | %Jan |
      | year  | 2022 |
    And I click save and continue button on "Member Date Of Leaving UK Page"
    Then I am presented with the "Member Date Of Leaving UK Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter the day, month, year in the correct format. For example, 27 03 1970 |
    And I should see following erroneous fields are highlighted on "Member Date Of Leaving UK Page"
      | month |
    And Clicking each error message should focus on the corresponding input field on "Member Date Of Leaving UK Page"

  Scenario:12. Negative Journey - PSA/PSP enters the year of Leaving using alphabets
    When I enter the following data into corresponding input fields on "Member Date Of Leaving UK Page"
      | day   | 12     |
      | month | 10     |
      | year  | Twenty |
    And I click save and continue button on "Member Date Of Leaving UK Page"
    Then I am presented with the "Member Date Of Leaving UK Page" error page
    And I should see the "There is a problem" and below error messages
      | The Day/Month/Year Field must only include numbers |
    And I should see following erroneous fields are highlighted on "Member Date Of Leaving UK Page"
      | year |
    And Clicking each error message should focus on the corresponding input field on "Member Date Of Leaving UK Page"

  Scenario:13. Negative Journey - PSA/PSP does not enter the Date
    When I enter the following data into corresponding input fields on "Member Date Of Leaving UK Page"
      | day   |  |
      | month |  |
      | year  |  |
    And I click save and continue button on "Member Date Of Leaving UK Page"
    Then I am presented with the "Member Date Of Leaving UK Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter the date of leaving the UK |
    And I should see following erroneous fields are highlighted on "Member Date Of Leaving UK Page"
      | day |
    And Clicking each error message should focus on the corresponding input field on "Member Date Of Leaving UK Page"

  Scenario:14. Negative Journey - PSA/PSP does not enter the Day
    When I enter the following data into corresponding input fields on "Member Date Of Leaving UK Page"
      | day   |      |
      | month | 12   |
      | year  | 1980 |
    And I click save and continue button on "Member Date Of Leaving UK Page"
    Then I am presented with the "Member Date Of Leaving UK Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter a Day |
    And I should see following erroneous fields are highlighted on "Member Date Of Leaving UK Page"
      | day |
    And Clicking each error message should focus on the corresponding input field on "Member Date Of Leaving UK Page"

  Scenario:15. Negative Journey - PSA/PSP does not enter the Month
    When I enter the following data into corresponding input fields on "Member Date Of Leaving UK Page"
      | day   | 31   |
      | month |      |
      | year  | 1980 |
    And I click save and continue button on "Member Date Of Leaving UK Page"
    Then I am presented with the "Member Date Of Leaving UK Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter a Month |
    And I should see following erroneous fields are highlighted on "Member Date Of Leaving UK Page"
      | month |
    And Clicking each error message should focus on the corresponding input field on "Member Date Of Leaving UK Page"

  Scenario:16. Negative Journey - PSA/PSP does not enter the Year
    When I enter the following data into corresponding input fields on "Member Date Of Leaving UK Page"
      | day   | 31 |
      | month | 12 |
      | year  |    |
    And I click save and continue button on "Member Date Of Leaving UK Page"
    Then I am presented with the "Member Date Of Leaving UK Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter a Year |
    And I should see following erroneous fields are highlighted on "Member Date Of Leaving UK Page"
      | year |
    And Clicking each error message should focus on the corresponding input field on "Member Date Of Leaving UK Page"

  Scenario:17. Negative Journey - PSA/PSP enters a future date
    When I enter the following data into corresponding input fields on "Member Date Of Leaving UK Page"
      | day   | 31   |
      | month | 12   |
      | year  | 2026 |
    And I click save and continue button on "Member Date Of Leaving UK Page"
    Then I am presented with the "Member Date Of Leaving UK Page" error page
    And I should see the "There is a problem" and below error messages
      | Date cannot be before 1901, or in the future |