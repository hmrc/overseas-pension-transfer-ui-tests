@Test @MembersCurrentUKAddress
Feature: Entering the last UK address of the member

  Background: Common Steps - Member Details Journey
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "Overseas Transfer Index Page"
    # And I enter redirect URL on Auth Login Stub Page for "Is Member Currently UK Resident Page"
    # Redirection currently does not work for any other page other than the Index page
    And I click submit button on "Auth Login Stub Page"
    Then I am presented with the "Overseas Transfer Index Page"
    And I navigated to the "Members Current UK Address Page"
    Then I am presented with the "Members Current UK Address Page"

  Scenario Outline: Verify the Members Last UK Address Page
    And I should see the heading "What is <memberName>'s current address?"
    And I should see the input fields with below labels on "Members Current UK Address Page"
      | Address line 1            |
      | Address line 2            |
      | Address line 3 (optional) |
      | Address line 4 (optional) |
      | Country                   |
      | Postcode (optional)       |
      | PO Box (optional)         |
    Examples:
      | memberName          |
      | Undefined Undefined |

  Scenario:1. Positive journey - PSA/PSP enters data only into the mandatory fields
    When I enter the following data into corresponding input fields on "Members Current UK Address Page"
      | countryCode  | United Kingdom       |
      | addressLine1 | 12 Burlington Avenue |
      | addressLine2 | Burlington Road      |
   #   | poBox        | 11223344             |
   # And I enter nothing in the "postcode" input field on "Members Current UK Address Page"
  #   When I click "postcode" on "Members Current UK Address Page"
    And I click save and continue button on "Members Current UK Address Page"
    Then I am presented with the "Is Member Currently UK Resident Page"
# Above action would have to be rewritten upon page gets connected

  Scenario:2. Positive journey - PSA/PSP enters data into all the fields
    When I enter the following data into corresponding input fields on "Members Current UK Address Page"
      | addressLine1 | 12 Burlington Avenue |
      | addressLine2 | Burlington Road      |
      | addressLine3 | Maidenhead           |
      | addressLine4 | Berkshire            |
      | countryCode  | United Kingdom       |
      | postcode     | AB12CD               |
      | poBox        | 11223344             |
    And I click save and continue button on "Members Current UK Address Page"
    Then I am presented with the "Is Member Currently UK Resident Page"
# Above action would have to be rewritten upon page gets connected

  Scenario:3. Negative journey - PSA/PSP enters more than 35 charecters for 'Address Line 1'
    When I enter the following data into corresponding input fields on "Members Current UK Address Page"
      | addressLine1 | afsdfasdfasfdsadfadsfadsfasdfasdfsadfdasfsadfasdfsadfasdfasdfasdfdasfsafdsafasdfsda |
      | addressLine2 | Burlington Road                                                                     |
      | addressLine3 | Maidenhead                                                                          |
      | addressLine4 | Berkshire                                                                           |
      | countryCode  | United Kingdom                                                                      |
      | postcode     | AB12CD                                                                              |
      | poBox        | 11223344                                                                            |
    And I click save and continue button on "Members Current UK Address Page"
    Then I am presented with the "Members Current UK Address Page" error page
    And I should see the "There is a problem" and below error messages
      | Address line 1 must be 35 characters or less |
    And I should see following erroneous fields are highlighted on "Members Current UK Address Page"
      |addressLine1 |
    And Clicking each error message should focus on the corresponding input field on "Members Current UK Address Page"

  Scenario:4. Negative journey - PSA/PSP enters more than 35 characters for 'Address Line 2'
    When I enter the following data into corresponding input fields on "Members Current UK Address Page"
      | addressLine1 | 12 Burlington Court                                                                 |
      | addressLine2 | afsdfasdfasfdsadfadsfadsfasdfasdfsadfdasfsadfasdfsadfasdfasdfasdfdasfsafdsafasdfsda |
      | addressLine3 | Maidenhead                                                                          |
      | addressLine4 | Berkshire                                                                           |
      | countryCode  | United Kingdom                                                                      |
      | postcode     | AB12CD                                                                              |
      | poBox        | 11223344                                                                            |
    And I click save and continue button on "Members Current UK Address Page"
    Then I am presented with the "Members Current UK Address Page" error page
    And I should see the "There is a problem" and below error messages
      | Address line 2 must be 35 characters or less |
    And I should see following erroneous fields are highlighted on "Members Current UK Address Page"
      | addressLine2 |
    And Clicking each error message should focus on the corresponding input field on "Members Current UK Address Page"

  Scenario:5. Negative journey - PSA/PSP enters more than 35 characters for 'Address Line 3'
    When I enter the following data into corresponding input fields on "Members Current UK Address Page"
      | addressLine1 | 12 Burlington Court                                                                 |
      | addressLine2 | Burlington Road                                                                        |
      | addressLine3 | afsdfasdfasfdsadfadsfadsfasdfasdfsadfdasfsadfasdfsadfasdfasdfasdfdasfsafdsafasdfsda |
      | addressLine4 | Berkshire                                                                           |
      | countryCode  | United Kingdom                                                                      |
      | postcode     | AB12CD                                                                              |
      | poBox        | 11223344                                                                            |
    And I click save and continue button on "Members Current UK Address Page"
    Then I am presented with the "Members Current UK Address Page" error page
    And I should see the "There is a problem" and below error messages
      | Address line 3 must be 35 characters or less |
    And I should see following erroneous fields are highlighted on "Members Current UK Address Page"
      | addressLine3 |
    And Clicking each error message should focus on the corresponding input field on "Members Current UK Address Page"

  Scenario:6. Negative journey - PSA/PSP enters more than 35 characters for 'Address Line 4'
    When I enter the following data into corresponding input fields on "Members Current UK Address Page"
      | addressLine1 | 12 Burlington Court                                                                 |
      | addressLine2 | Burlington Road                                                                     |
      | addressLine3 | London                                                                              |
      | addressLine4 | afsdfasdfasfdsadfadsfadsfasdfasdfsadfdasfsadfasdfsadfasdfasdfasdfdasfsafdsafasdfsda |
      | countryCode  | United Kingdom                                                                      |
      | postcode     | AB12CD                                                                              |
      | poBox        | 11223344                                                                            |
    And I click save and continue button on "Members Current UK Address Page"
    Then I am presented with the "Members Current UK Address Page" error page
    And I should see the "There is a problem" and below error messages
      | Address line 4 must be 35 characters or less |
    And I should see following erroneous fields are highlighted on "Members Current UK Address Page"
      | addressLine4 |
    And Clicking each error message should focus on the corresponding input field on "Members Current UK Address Page"

  Scenario:7. Negative journey - PSA/PSP enters more than 35 characters for 'Post Code'
    When I enter the following data into corresponding input fields on "Members Current UK Address Page"
      | addressLine1 | 12 Burlington Court |
      | addressLine2 | Burlington Road     |
      | addressLine3 | London              |
      | addressLine4 | Maidenhead          |
      | countryCode  | United Kingdom      |
      | postcode     | AB12JSAB12JSAB12JSAB12JSAB12JSAB12JSAB12JSAB12JSAB12JSAB12JSAB12JSAB12JSAB12JS            |
      | poBox        | 11223344            |
    And I click save and continue button on "Members Current UK Address Page"
    Then I am presented with the "Members Current UK Address Page" error page
    And I should see the "There is a problem" and below error messages
      | Postcode must be 35 characters or less |
    And I should see following erroneous fields are highlighted on "Members Current UK Address Page"
      | postcode |
    And Clicking each error message should focus on the corresponding input field on "Members Current UK Address Page"

  Scenario:8. Negative journey - PSA/PSP enters more than 35 characters for 'PO Box'
    When I enter the following data into corresponding input fields on "Members Current UK Address Page"
      | addressLine1 | 12 Burlington Court                      |
      | addressLine2 | Burlington Road                          |
      | addressLine3 | London                                   |
      | addressLine4 | Maidenhead                               |
      | countryCode  | United Kingdom                           |
      | postcode     | SL12JS                                   |
      | poBox        | 1111122222333334444455555666667777788888 |
    And I click save and continue button on "Members Current UK Address Page"
    Then I am presented with the "Members Current UK Address Page" error page
    And I should see the "There is a problem" and below error messages
      | PO Box must be 35 characters or less |
    And I should see following erroneous fields are highlighted on "Members Current UK Address Page"
      | poBox |
    And Clicking each error message should focus on the corresponding input field on "Members Current UK Address Page"

  Scenario:9. Negative journey - PSA/PSP does not enter the 'Address Line 1'
    When I enter the following data into corresponding input fields on "Members Current UK Address Page"
      | addressLine1 |                 |
      | addressLine2 | Burlington Road |
      | addressLine3 | London          |
      | addressLine4 | Maidenhead      |
      | countryCode  | United Kingdom  |
      | postcode     | SL12JS          |
      | poBox        | 11223344        |
    And I click save and continue button on "Members Current UK Address Page"
    Then I am presented with the "Members Current UK Address Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter the first line of Undefined Undefined's address |
    And I should see following erroneous fields are highlighted on "Members Current UK Address Page"
      | addressLine1 |
    And Clicking each error message should focus on the corresponding input field on "Members Current UK Address Page"

  Scenario:10. Negative journey - PSA/PSP does not enter the 'Address Line 2'
    When I enter the following data into corresponding input fields on "Members Current UK Address Page"
      | addressLine1 | 12 Burlington Court |
      | addressLine2 |                     |
      | addressLine3 | London              |
      | addressLine4 | Maidenhead          |
      | countryCode  | United Kingdom      |
      | postcode     | SL12JS              |
      | poBox        | 11223344            |
    And I click save and continue button on "Members Current UK Address Page"
    Then I am presented with the "Members Current UK Address Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter the second line of Undefined Undefined's address |
    And I should see following erroneous fields are highlighted on "Members Current UK Address Page"
      | addressLine2 |
    And Clicking each error message should focus on the corresponding input field on "Members Current UK Address Page"

  Scenario:11. Negative journey - PSA/PSP does not enter the 'Country Code'
    When I enter the following data into corresponding input fields on "Members Current UK Address Page"
      | addressLine1 | 12 Burlington Court |
      | addressLine2 | Burlington Road     |
      | addressLine3 | London              |
      | addressLine4 | Maidenhead          |
     # | countryCode  |                     |
      | postcode     | SL12JS              |
      | poBox        | 11223344            |
    And I click save and continue button on "Members Current UK Address Page"
    Then I am presented with the "Members Current UK Address Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter a country |
    And I should see following erroneous fields are highlighted on "Members Current UK Address Page"
      | countryCode |
    And Clicking each error message should focus on the corresponding input field on "Members Current UK Address Page"

  Scenario:12. Negative journey - PSA/PSP enters invalid characters into one or more input fields
    When I enter the following data into corresponding input fields on "Members Current UK Address Page"
      | addressLine1 | %%Invalid@ UK address line1 |
      | addressLine2 | %%Invalid@ UK address line2 |
      | addressLine3 | %%Invalid@ UK address Line3 |
      | addressLine4 | %%Invalid@ UK address Line4 |
  #   | countryCode  | %%Invalid@ Country Code     |
      | postcode     | %%Invalid postcode          |
      | poBox        | %%Invalid PO Box            |
    And I click save and continue button on "Members Current UK Address Page"
    Then I am presented with the "Members Current UK Address Page" error page
    And I should see the "There is a problem" and below error messages
      | Address line 1 must only include letters, numbers, spaces, hyphens, commas, full stops, ampersands, apostrophes and forward slashes |
      | Address line 2 must only include letters, numbers, spaces, hyphens, commas, full stops, ampersands, apostrophes and forward slashes |
      | Address line 3 must only include letters, numbers, spaces, hyphens, commas, full stops, ampersands, apostrophes and forward slashes |
      | Address line 4 must only include letters, numbers, spaces, hyphens, commas, full stops, ampersands, apostrophes and forward slashes |
    #  | Enter a country                                                                                                                     |
      | Postcode must only include letters, numbers or spaces                                                                               |
      | PO Box must only include letters, numbers or spaces                                                                                 |
    And I should see following erroneous fields are highlighted on "Members Current UK Address Page"
      | addressLine1 |
      | addressLine2 |
      | addressLine3 |
      | addressLine4 |
      | countryCode  |
      | postcode     |
      | poBox        |
    And Clicking each error message should focus on the corresponding input field on "Members Current UK Address Page"
