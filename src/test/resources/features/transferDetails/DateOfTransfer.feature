@Test @DateofTransfer
Feature: Date of Transfer

  Background: Common Steps - Member Details Journey
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "What You Will Need Page"
    When I enter Enrollment Key "HMRC-PODSPP-ORG", Identifier Name "PSPID" and Identifier Value "2131231231231" on "Auth Login Stub Page"
    And I click submit button on "Auth Login Stub Page"
    And I am presented with the "What You Will Need Page"
    And I navigated to the "Date Of Transfer Page"
    Then I am presented with the "Date Of Transfer Page"
    And I should see the heading "What was the date of the transfer?"
    And I should see the following values on the page
      | This cannot be a date in the future. |
    And I should see the hint text "For example, 31 03 2023."
   # And I should see two radio buttons: "Transfer exceeds member's overseas transfer allowance and there is an applicable exclusion." and "There is no applicable exclusion."


  Scenario:1. Positive journey - PSA/PSP enters all three fields of Day, Month and Year
    When I enter the following data into corresponding input fields on "Date Of Transfer Page"
      | day   | 31 |
      | month | 12 |
      | year  | 2024  |
    And I click save and continue button on "Date Of Transfer Page"
    Then I am presented with the "Overseas Transfer Index Page"
# Above action would have to be rewritten upon page gets connected

  Scenario:2. Positive journey - PSA/PSP enters all three fields of Day, Month and Year but enters a single digit (eg: 1 instead of 01)
    When I enter the following data into corresponding input fields on "Date Of Transfer Page"
      | day   | 1    |
      | month | 12   |
      | year  | 2024 |
    And I click save and continue button on "Date Of Transfer Page"
    Then I am presented with the "Overseas Transfer Index Page"

  Scenario:3. Negative Journey - PSA/PSP enters day in a wrong format
    When I enter the following data into corresponding input fields on "Date Of Transfer Page"
      | day   | 32    |
      | month | 12   |
      | year  | 1980 |
    And I click save and continue button on "Date Of Transfer Page"
    Then I am presented with the "Date Of Transfer Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter the day, month, year in the correct format. For example, 27 03 1970 |
    And I should see following erroneous fields are highlighted on "Date Of Transfer Page"
      | day |
    And Clicking each error message should focus on the corresponding input field on "Date Of Transfer Page"

  Scenario:4. Negative Journey - PSA/PSP enters day in a wrong format - Leap year (29th Feb 2003)
    When I enter the following data into corresponding input fields on "Date Of Transfer Page"
      | day   | 29   |
      | month | 02   |
      | year  | 2023 |
    And I click save and continue button on "Date Of Transfer Page"
    Then I am presented with the "Date Of Transfer Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter the day, month, year in the correct format. For example, 27 03 1970 |
    And I should see following erroneous fields are highlighted on "Date Of Transfer Page"
      | day |
    And Clicking each error message should focus on the corresponding input field on "Date Of Transfer Page"

  Scenario:5. Negative Journey - PSA/PSP enters month in a wrong format - (29/13/2003)
    When I enter the following data into corresponding input fields on "Date Of Transfer Page"
      | day   | 29   |
      | month | 13   |
      | year  | 2003 |
    And I click save and continue button on "Date Of Transfer Page"
    Then I am presented with the "Date Of Transfer Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter the day, month, year in the correct format. For example, 27 03 1970 |
    And I should see following erroneous fields are highlighted on "Date Of Transfer Page"
      | month |
    And Clicking each error message should focus on the corresponding input field on "Date Of Transfer Page"

  Scenario:6. Negative Journey - PSA/PSP enters month in a wrong format (letter) - Leap year (29/ABC/2003)
    When I enter the following data into corresponding input fields on "Date Of Transfer Page"
      | day   | 29   |
      | month | ABC  |
      | year  | 2003 |
    And I click save and continue button on "Date Of Transfer Page"
    Then I am presented with the "Date Of Transfer Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter the day, month, year in the correct format. For example, 27 03 1970 |
    And I should see following erroneous fields are highlighted on "Date Of Transfer Page"
      | month |
    And Clicking each error message should focus on the corresponding input field on "Date Of Transfer Page"

  Scenario:7. Negative Journey - PSA/PSP enters the Year of Birth < 1901 (29/12/1900)
    When I enter the following data into corresponding input fields on "Date Of Transfer Page"
      | day   | 29   |
      | month | 12   |
      | year  | 1900 |
    And I click save and continue button on "Date Of Transfer Page"
    Then I am presented with the "Date Of Transfer Page" error page
    And I should see the "There is a problem" and below error messages
      | Date cannot be before 1901, or in the future |
    And I should see following erroneous fields are highlighted on "Date Of Transfer Page"
      | year |
    And Clicking each error message should focus on the corresponding input field on "Date Of Transfer Page"

  Scenario:8. Negative Journey - PSA/PSP enters the Year of Birth > current date
    When I enter the following data into corresponding input fields on "Date Of Transfer Page"
      | day   | 29   |
      | month | 12   |
      | year  | 2025 |
    And I click save and continue button on "Date Of Transfer Page"
    Then I am presented with the "Date Of Transfer Page" error page
    And I should see the "There is a problem" and below error messages
      | Date cannot be before 1901, or in the future |
    And I should see following erroneous fields are highlighted on "Date Of Transfer Page"
      | year |
    And Clicking each error message should focus on the corresponding input field on "Date Of Transfer Page"

  Scenario:9. Negative Journey - PSA/PSP enters the Day of Birth as an alphabet (Sun)
    When I enter the following data into corresponding input fields on "Date Of Transfer Page"
      | day   | sun  |
      | month | 12   |
      | year  | 2022 |
    And I click save and continue button on "Date Of Transfer Page"
    Then I am presented with the "Date Of Transfer Page" error page
    And I should see the "There is a problem" and below error messages
      | The Day/Month/Year Field must only include numbers |
    And I should see following erroneous fields are highlighted on "Date Of Transfer Page"
      | day |
    And Clicking each error message should focus on the corresponding input field on "Date Of Transfer Page"

  Scenario:10. Positive journey - PSA/PSP enters the month of leaving using alphabets (eg: Sept)
    When I enter the following data into corresponding input fields on "Date Of Transfer Page"
      | day   | 1    |
      | month | Sep  |
      | year  | 1991 |
    And I click save and continue button on "Date Of Transfer Page"
    Then I am presented with the "Overseas Transfer Index Page"

  Scenario:11. Negative Journey - PSA/PSP enters enters the wrong input using random alphabet and special character for month of Leaving
    When I enter the following data into corresponding input fields on "Date Of Transfer Page"
      | day   | 12    |
      | month | %Jan |
      | year  | 2022 |
    And I click save and continue button on "Date Of Transfer Page"
    Then I am presented with the "Date Of Transfer Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter the day, month, year in the correct format. For example, 27 03 1970 |
    And I should see following erroneous fields are highlighted on "Date Of Transfer Page"
      | month |
    And Clicking each error message should focus on the corresponding input field on "Date Of Transfer Page"

  Scenario:12. Negative Journey - PSA/PSP enters the year of Leaving using alphabets
    When I enter the following data into corresponding input fields on "Date Of Transfer Page"
      | day   | 12     |
      | month | 10     |
      | year  | Twenty |
    And I click save and continue button on "Date Of Transfer Page"
    Then I am presented with the "Date Of Transfer Page" error page
    And I should see the "There is a problem" and below error messages
      | The Day/Month/Year Field must only include numbers |
    And I should see following erroneous fields are highlighted on "Date Of Transfer Page"
      | year |
    And Clicking each error message should focus on the corresponding input field on "Date Of Transfer Page"

  Scenario:13. Negative Journey - PSA/PSP does not enter the Date
    When I enter the following data into corresponding input fields on "Date Of Transfer Page"
      | day   |  |
      | month |  |
      | year  |  |
    And I click save and continue button on "Date Of Transfer Page"
    Then I am presented with the "Date Of Transfer Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter the date of the transfer|
    And I should see following erroneous fields are highlighted on "Date Of Transfer Page"
      | day |
    And Clicking each error message should focus on the corresponding input field on "Date Of Transfer Page"

  Scenario:14. Negative Journey - PSA/PSP does not enter the Day
    When I enter the following data into corresponding input fields on "Date Of Transfer Page"
      | day   |      |
      | month | 12   |
      | year  | 1980 |
    And I click save and continue button on "Date Of Transfer Page"
    Then I am presented with the "Date Of Transfer Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter a day |
    And I should see following erroneous fields are highlighted on "Date Of Transfer Page"
      | day |
    And Clicking each error message should focus on the corresponding input field on "Date Of Transfer Page"

  Scenario:15. Negative Journey - PSA/PSP does not enter the Month
    When I enter the following data into corresponding input fields on "Date Of Transfer Page"
      | day   | 31   |
      | month |      |
      | year  | 1980 |
    And I click save and continue button on "Date Of Transfer Page"
    Then I am presented with the "Date Of Transfer Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter a month |
    And I should see following erroneous fields are highlighted on "Date Of Transfer Page"
      | month |
    And Clicking each error message should focus on the corresponding input field on "Date Of Transfer Page"

  Scenario:16. Negative Journey - PSA/PSP does not enter the Year
    When I enter the following data into corresponding input fields on "Date Of Transfer Page"
      | day   | 31 |
      | month | 12 |
      | year  |    |
    And I click save and continue button on "Date Of Transfer Page"
    Then I am presented with the "Date Of Transfer Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter a year |
    And I should see following erroneous fields are highlighted on "Date Of Transfer Page"
      | year |
    And Clicking each error message should focus on the corresponding input field on "Date Of Transfer Page"
