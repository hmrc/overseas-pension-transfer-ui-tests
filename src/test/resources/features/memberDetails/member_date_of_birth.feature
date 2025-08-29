@Test @MemberDateOfBirth @acceptance
Feature: What is member's date of birth?

  Background: Common Steps - Member Details Journey
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "What You Will Need Page"
    # And I enter redirect URL on Auth Login Stub Page for "Is Member Currently UK Resident Page"
    # Redirection currently does not work for any other page other than the Index page
    When I enter Enrollment Key "HMRC-PODS-ORG", Identifier Name "PSAID" and Identifier Value "2131231231231" on "Auth Login Stub Page"
    And I click submit button on "Auth Login Stub Page"
    Then I am presented with the "What You Will Need Page"
    And I navigated to the "Member Date Of Birth Page"
    Then I am presented with the "Member Date Of Birth Page"

  Scenario Outline: Verify the Member Date Of Birth Page
    And I should see the heading "What is <memberName>’s date of birth?"
    And I should see the hint text "For example, 31 03 1980."

    Examples:
      | memberName          |
      | Undefined Undefined |

  Scenario:1. Positive journey - PSA/PSP enters all three fields of Day, Month and Year
    When I enter the following data into corresponding input fields on "Member Date Of Birth Page"
      | day   | 31   |
      | month | 12   |
      | year  | 1991 |
    And I click save and continue button on "Member Date Of Birth Page"
    Then I am presented with the "Members Current Address Page"

  Scenario:2. Positive journey - PSA/PSP enters all three fields of Day, Month and Year but enters a single digit (eg: 1 instead of 01)
    When I enter the following data into corresponding input fields on "Member Date Of Birth Page"
      | day   | 1    |
      | month | 12   |
      | year  | 1991 |
    And I click save and continue button on "Member Date Of Birth Page"
    Then I am presented with the "Members Current Address Page"

  Scenario:3. Negative Journey - PSA/PSP enters day in a wrong format
    When I enter the following data into corresponding input fields on "Member Date Of Birth Page"
      | day   | 32    |
      | month | 12   |
      | year  | 1980 |
    And I click save and continue button on "Member Date Of Birth Page"
    Then I am presented with the "Member Date Of Birth Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter the day, month, year in the correct format. For example, 27 03 1970 |
    And I should see following erroneous fields are highlighted on "Member Date Of Birth Page"
      | day |
    And Clicking each error message should focus on the corresponding input field on "Member Date Of Birth Page"

  Scenario:4. Negative Journey - PSA/PSP enters day in a wrong format - Leap year (29th Feb 2003)
    When I enter the following data into corresponding input fields on "Member Date Of Birth Page"
      | day   | 29   |
      | month | 02   |
      | year  | 2003 |
    And I click save and continue button on "Member Date Of Birth Page"
    Then I am presented with the "Member Date Of Birth Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter the day, month, year in the correct format. For example, 27 03 1970 |
    And I should see following erroneous fields are highlighted on "Member Date Of Birth Page"
      | day |
    And Clicking each error message should focus on the corresponding input field on "Member Date Of Birth Page"

  Scenario:5. Negative Journey - PSA/PSP enters month in a wrong format (eg: 13)
    When I enter the following data into corresponding input fields on "Member Date Of Birth Page"
      | day   | 29   |
      | month | 13   |
      | year  | 2003 |
    And I click save and continue button on "Member Date Of Birth Page"
    Then I am presented with the "Member Date Of Birth Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter the day, month, year in the correct format. For example, 27 03 1970 |
    And I should see following erroneous fields are highlighted on "Member Date Of Birth Page"
      | month |
    And Clicking each error message should focus on the corresponding input field on "Member Date Of Birth Page"

  Scenario:6. Negative Journey - PSA/PSP enters the Month of Birth  with random alphabets (e.g. ABC)
    When I enter the following data into corresponding input fields on "Member Date Of Birth Page"
      | day   | 29   |
      | month | ABC  |
      | year  | 2003 |
    And I click save and continue button on "Member Date Of Birth Page"
    Then I am presented with the "Member Date Of Birth Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter the day, month, year in the correct format. For example, 27 03 1970 |
    And I should see following erroneous fields are highlighted on "Member Date Of Birth Page"
      | month |
    And Clicking each error message should focus on the corresponding input field on "Member Date Of Birth Page"

  Scenario:7. Negative Journey - PSA/PSP enters enters the Year of Birth  < 1901 (e.g. 1900)
    When I enter the following data into corresponding input fields on "Member Date Of Birth Page"
      | day   | 29   |
      | month | 12   |
      | year  | 1900 |
    And I click save and continue button on "Member Date Of Birth Page"
    Then I am presented with the "Member Date Of Birth Page" error page
    And I should see the "There is a problem" and below error messages
      | Date cannot be before 1901, or in the future |
    And I should see following erroneous fields are highlighted on "Member Date Of Birth Page"
      | year |
    And Clicking each error message should focus on the corresponding input field on "Member Date Of Birth Page"


  Scenario:8. Negative Journey - PSA/PSP enters enters the Year of Birth  > current date (e.g. 2026)
    When I enter the following data into corresponding input fields on "Member Date Of Birth Page"
      | day   | 29   |
      | month | 12   |
      | year  | 2026 |
    And I click save and continue button on "Member Date Of Birth Page"
    Then I am presented with the "Member Date Of Birth Page" error page
    And I should see the "There is a problem" and below error messages
      | Date cannot be before 1901, or in the future |
      # Correct error message should be as below, needs to be changed in the application code
    #  | Enter the day, month, year in the correct format. For example 27 03 1970. |
    And I should see following erroneous fields are highlighted on "Member Date Of Birth Page"
      | year |
    And Clicking each error message should focus on the corresponding input field on "Member Date Of Birth Page"


  Scenario:9. Negative Journey - PSA/PSP enters enters the day of birth using alphabets (e.g. Mon)
    When I enter the following data into corresponding input fields on "Member Date Of Birth Page"
      | day   | Mon  |
      | month | 12   |
      | year  | 2000 |
    And I click save and continue button on "Member Date Of Birth Page"
    Then I am presented with the "Member Date Of Birth Page" error page
    And I should see the "There is a problem" and below error messages
      | The Day/Month/Year Field must only include numbers |
    And I should see following erroneous fields are highlighted on "Member Date Of Birth Page"
      | day |
    And Clicking each error message should focus on the corresponding input field on "Member Date Of Birth Page"

  Scenario:10. Positive journey - PSA/PSP enters the month of birth using alphabets(eg: January)
    When I enter the following data into corresponding input fields on "Member Date Of Birth Page"
      | day   | 1       |
      | month | January |
      | year  | 2000    |
    And I click save and continue button on "Member Date Of Birth Page"
    Then I am presented with the "Members Current Address Page"

  Scenario:11. Negative Journey - PSA/PSP enters the wrong input using random alphabet and special character for month of birth(e.g. %ABC)
    When I enter the following data into corresponding input fields on "Member Date Of Birth Page"
      | day   | 12    |
      | month | %ABC |
      | year  | 2000 |
    And I click save and continue button on "Member Date Of Birth Page"
    Then I am presented with the "Member Date Of Birth Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter the day, month, year in the correct format. For example, 27 03 1970 |
    And I should see following erroneous fields are highlighted on "Member Date Of Birth Page"
      | month |
    And Clicking each error message should focus on the corresponding input field on "Member Date Of Birth Page"

  Scenario:12. Negative Journey - PSA/PSP enters the year of birth using alphabets(e.g. Twenty)
    When I enter the following data into corresponding input fields on "Member Date Of Birth Page"
      | day   | 01     |
      | month | 01     |
      | year  | Twenty |
    And I click save and continue button on "Member Date Of Birth Page"
    Then I am presented with the "Member Date Of Birth Page" error page
    And I should see the "There is a problem" and below error messages
      | The Day/Month/Year Field must only include numbers |
    And I should see following erroneous fields are highlighted on "Member Date Of Birth Page"
      | year |
    And Clicking each error message should focus on the corresponding input field on "Member Date Of Birth Page"

  Scenario:13. Negative Journey - PSA/PSP does not enter the Date
    When I enter the following data into corresponding input fields on "Member Date Of Birth Page"
      | day   |  |
      | month |  |
      | year  |  |
    And I click save and continue button on "Member Date Of Birth Page"
    Then I am presented with the "Member Date Of Birth Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter the date of birth |
    And I should see following erroneous fields are highlighted on "Member Date Of Birth Page"
      | day |
    And Clicking each error message should focus on the corresponding input field on "Member Date Of Birth Page"


  Scenario:14. Negative Journey - PSA/PSP does not enter the Day
    When I enter the following data into corresponding input fields on "Member Date Of Birth Page"
      | day   |      |
      | month | 12   |
      | year  | 1980 |
    And I click save and continue button on "Member Date Of Birth Page"
    Then I am presented with the "Member Date Of Birth Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter a day |
    And I should see following erroneous fields are highlighted on "Member Date Of Birth Page"
      | value.day |
    And Clicking each error message should focus on the corresponding input field on "Member Date Of Birth Page"


  Scenario:15. Negative Journey - PSA/PSP does not enter the Month
    When I enter the following data into corresponding input fields on "Member Date Of Birth Page"
      | day   | 31   |
      | month |      |
      | year  | 1980 |
    And I click save and continue button on "Member Date Of Birth Page"
    Then I am presented with the "Member Date Of Birth Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter a month |
    And I should see following erroneous fields are highlighted on "Member Date Of Birth Page"
      | value.month |
    And Clicking each error message should focus on the corresponding input field on "Member Date Of Birth Page"

  Scenario:16. Negative Journey - PSA/PSP does not enter the Year
    When I enter the following data into corresponding input fields on "Member Date Of Birth Page"
      | day        | 31 |
      | month      | 12 |
      | value.year |    |
    And I click save and continue button on "Member Date Of Birth Page"
    Then I am presented with the "Member Date Of Birth Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter a year |
    And I should see following erroneous fields are highlighted on "Member Date Of Birth Page"
      | year |
    And Clicking each error message should focus on the corresponding input field on "Member Date Of Birth Page"


  Scenario:17. Negative Journey - PSA/PSP does not enter the Month and Year
    When I enter the following data into corresponding input fields on "Member Date Of Birth Page"
      | day   |      |
      | month |      |
      | year  | 2000 |
    And I click save and continue button on "Member Date Of Birth Page"
    Then I am presented with the "Member Date Of Birth Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter a day and a month |
    And I should see following erroneous fields are highlighted on "Member Date Of Birth Page"
      | value.day |
    And Clicking each error message should focus on the corresponding input field on "Member Date Of Birth Page"

  Scenario:18. Negative Journey - PSA/PSP does not enter the Month and Year
    When I enter the following data into corresponding input fields on "Member Date Of Birth Page"
      | day   |    |
      | month | 11 |
      | year  |    |
    And I click save and continue button on "Member Date Of Birth Page"
    Then I am presented with the "Member Date Of Birth Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter a day and a year |
    And I should see following erroneous fields are highlighted on "Member Date Of Birth Page"
      | value.day |
    And Clicking each error message should focus on the corresponding input field on "Member Date Of Birth Page"


  Scenario:19. Negative Journey - PSA/PSP does not enter the Month and Year
    When I enter the following data into corresponding input fields on "Member Date Of Birth Page"
      | day   | 11 |
      | month |   |
      | year  |   |
    And I click save and continue button on "Member Date Of Birth Page"
    Then I am presented with the "Member Date Of Birth Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter a month and a year |
    And I should see following erroneous fields are highlighted on "Member Date Of Birth Page"
      | value.month |
    And Clicking each error message should focus on the corresponding input field on "Member Date Of Birth Page"

