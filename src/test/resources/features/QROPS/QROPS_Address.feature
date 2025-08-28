@Test @QROPSAddress @acceptance
Feature: Entering the address of the QROPS

  Background: Common Steps - Member Details Journey
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "What You Will Need Page"
    When I enter Enrollment Key "HMRC-PODS-ORG", Identifier Name "PSAID" and Identifier Value "2131231231231" on "Auth Login Stub Page"
    And I click submit button on "Auth Login Stub Page"
    Then I am presented with the "What You Will Need Page"
    And I navigated to the "QROPS Address Page"
    Then I am presented with the "QROPS Address Page"

  Scenario Outline: Verify the Members Last UK Address Page
    And I should see the heading "Address of the QROPS"
    And I should see the input fields with below labels on "QROPS Address Page"
      | Address line 1            |
      | Address line 2            |
      | Address line 3 (optional) |
      | Address line 4 (optional) |
      | Country                   |
    Examples:
      | memberName          |
      | Undefined Undefined       |

  Scenario:1. Positive journey - PSA/PSP enters data only into the mandatory fields
    When I enter the following data into corresponding input fields on "QROPS Address Page"
      | countryCode  | United Kingdom       |
      | addressLine1 | 12 Burlington Avenue |
      | addressLine2 | Burlington Road      |
   #   | poBox        | 11223344             |
   # And I enter nothing in the "postcode" input field on "Members Current UK Address Page"
  #   When I click "postcode" on "Members Current UK Address Page"
    And I click save and continue button on "QROPS Address Page"
    Then I am presented with the "QROPS Country Page"
# Above action would have to be rewritten upon page gets connected

  Scenario:2. Positive journey - PSA/PSP enters data into all the fields
    When I enter the following data into corresponding input fields on "QROPS Address Page"
      | addressLine1 | 12 Burlington Avenue |
      | addressLine2 | Burlington Road      |
      | addressLine3 | Maidenhead           |
      | addressLine4 | Berkshire            |
      | addressLine5 | London               |
      | countryCode  | United Kingdom       |
    And I click save and continue button on "QROPS Address Page"
    Then I am presented with the "QROPS Country Page"
# Above action would have to be rewritten upon page gets connected

  Scenario:3. Negative journey - PSA/PSP enters more than 35 charecters for 'Address Line 1' in the QROPS address page
    When I enter the following data into corresponding input fields on "QROPS Address Page"
      | addressLine1 | afsdfasdfasfdsadfadsfadsfasdfasdfsadfdasfsadfasdfsadfasdfasdfasdfdasfsafdsafasdfsda |
      | addressLine2 | Burlington Road                                                                     |
      | addressLine3 | Maidenhead                                                                          |
      | addressLine4 | Berkshire                                                                           |
      | addressLine5 | London                                                                              |
      | countryCode  | United Kingdom                                                                      |
    And I click save and continue button on "QROPS Address Page"
    Then I am presented with the "QROPS Address Page" error page
    And I should see the "There is a problem" and below error messages
      | Address line 1 must be 35 characters or less |
    And I should see following erroneous fields are highlighted on "QROPS Address Page"
      |addressLine1 |
    And Clicking each error message should focus on the corresponding input field on "QROPS Address Page"

  Scenario:4. Negative journey - PSA/PSP enters more than 35 characters for 'Address Line 2' in the QROPS address page
    When I enter the following data into corresponding input fields on "QROPS Address Page"
      | addressLine1 | 12 Burlington Court                                                                 |
      | addressLine2 | afsdfasdfasfdsadfadsfadsfasdfasdfsadfdasfsadfasdfsadfasdfasdfasdfdasfsafdsafasdfsda |
      | addressLine3 | Maidenhead                                                                          |
      | addressLine4 | Berkshire                                                                           |
      | addressLine5 | London                                                                              |
      | countryCode  | United Kingdom                                                                      |
    And I click save and continue button on "QROPS Address Page"
    Then I am presented with the "QROPS Address Page" error page
    And I should see the "There is a problem" and below error messages
      | Address line 2 must be 35 characters or less |
    And I should see following erroneous fields are highlighted on "QROPS Address Page"
      | addressLine2 |
    And Clicking each error message should focus on the corresponding input field on "QROPS Address Page"

  Scenario:5. Negative journey - PSA/PSP enters more than 35 characters for 'Address Line 3' in the QROPS address page
    When I enter the following data into corresponding input fields on "QROPS Address Page"
      | addressLine1 | 12 Burlington Court                                                                 |
      | addressLine2 | Burlington Road                                                                     |
      | addressLine3 | afsdfasdfasfdsadfadsfadsfasdfasdfsadfdasfsadfasdfsadfasdfasdfasdfdasfsafdsafasdfsda |
      | addressLine4 | Berkshire                                                                           |
      | addressLine5 | London                                                                              |
      | countryCode  | United Kingdom                                                                      |
    And I click save and continue button on "QROPS Address Page"
    Then I am presented with the "QROPS Address Page" error page
    And I should see the "There is a problem" and below error messages
      | Address line 3 must be 35 characters or less |
    And I should see following erroneous fields are highlighted on "QROPS Address Page"
      | addressLine3 |
    And Clicking each error message should focus on the corresponding input field on "QROPS Address Page"

  Scenario:6. Negative journey - PSA/PSP enters more than 35 characters for 'Address Line 4' in the QROPS address page
    When I enter the following data into corresponding input fields on "QROPS Address Page"
      | addressLine1 | 12 Burlington Court                                                                 |
      | addressLine2 | Burlington Road                                                                     |
      | addressLine3 | London                                                                              |
      | addressLine4 | afsdfasdfasfdsadfadsfadsfasdfasdfsadfdasfsadfasdfsadfasdfasdfasdfdasfsafdsafasdfsda |
      | addressLine5 | London                                                                              |
      | countryCode  | United Kingdom                                                                      |
    And I click save and continue button on "QROPS Address Page"
    Then I am presented with the "QROPS Address Page" error page
    And I should see the "There is a problem" and below error messages
      | Address line 4 must be 35 characters or less |
    And I should see following erroneous fields are highlighted on "QROPS Address Page"
      | addressLine4 |
    And Clicking each error message should focus on the corresponding input field on "QROPS Address Page"

  Scenario:7. Negative journey - PSA/PSP enters more than 35 characters for 'Address Line 5' in the QROPS address page
    When I enter the following data into corresponding input fields on "QROPS Address Page"
      | addressLine1 | 12 Burlington Court                                                                 |
      | addressLine2 | Burlington Road                                                                     |
      | addressLine3 | Maidenhead                                                                          |
      | addressLine4 | Berkshire                                                                           |
      | addressLine5 | afsdfasdfasfdsadfadsfadsfasdfasdfsadfdasfsadfasdfsadfasdfasdfasdfdasfsafdsafasdfsda |
      | countryCode  | United Kingdom                                                                      |
    And I click save and continue button on "QROPS Address Page"
    Then I am presented with the "QROPS Address Page" error page
    And I should see the "There is a problem" and below error messages
      | Address line 5 must be 35 characters or less |
    And I should see following erroneous fields are highlighted on "QROPS Address Page"
      | addressLine5 |
    And Clicking each error message should focus on the corresponding input field on "QROPS Address Page"

  Scenario:8. Negative journey - PSA/PSP does not enter the 'Address Line 1' in the QROPS address page
    When I enter the following data into corresponding input fields on "QROPS Address Page"
      | addressLine1 |                 |
      | addressLine2 | Burlington Road |
      | addressLine3 | London          |
      | addressLine4 | Maidenhead      |
      | addressLine5 | Berkshire       |
      | countryCode  | United Kingdom  |
    And I click save and continue button on "QROPS Address Page"
    Then I am presented with the "QROPS Address Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter the first line of QROPS address |
    And I should see following erroneous fields are highlighted on "QROPS Address Page"
      | addressLine1 |
    And Clicking each error message should focus on the corresponding input field on "QROPS Address Page"

  Scenario:9. Negative journey - PSA/PSP does not enter the 'Address Line 2' in the QROPS address page
    When I enter the following data into corresponding input fields on "QROPS Address Page"
      | addressLine1 | 12 Burlington Court |
      | addressLine2 |                     |
      | addressLine3 | London              |
      | addressLine4 | Maidenhead          |
      | addressLine5 | Berkshire           |
      | countryCode  | United Kingdom      |
    And I click save and continue button on "QROPS Address Page"
    Then I am presented with the "QROPS Address Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter the second line of QROPS address |
    And I should see following erroneous fields are highlighted on "QROPS Address Page"
      | addressLine2 |
    And Clicking each error message should focus on the corresponding input field on "QROPS Address Page"

  Scenario:10. Negative journey - PSA/PSP does not enter the 'Country' field in QROPS address page
    When I enter the following data into corresponding input fields on "QROPS Address Page"
      | addressLine1 | 12 Burlington Court |
      | addressLine2 | Burlington Road     |
      | addressLine3 | London              |
      | addressLine4 | Maidenhead          |
      | addressLine5 | Berkshire           |
      | countryCode  |                     |
    And I click save and continue button on "QROPS Address Page"
    Then I am presented with the "QROPS Address Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter a country |
#    And I should see following erroneous fields are highlighted on "Members Current UK Address Page"
#      | countryCode |
    And Clicking each error message should focus on the corresponding input field on "QROPS Address Page"

  Scenario:11. Negative journey - PSA/PSP enters invalid charecters in Address Line 1 field in QROPS address page
    When I enter the following data into corresponding input fields on "QROPS Address Page"
      | addressLine1 | %12 Burlington Court |
      | addressLine2 | Burlington Road      |
      | addressLine3 | London               |
      | addressLine4 | Maidenhead           |
      | addressLine5 | Berkshire            |
      | countryCode  | United Kingdom       |
    And I click save and continue button on "QROPS Address Page"
    Then I am presented with the "QROPS Address Page" error page
    And I should see the "There is a problem" and below error messages
      | Address line 1 must only include letters, numbers, spaces, hyphens, commas, full stops, ampersands, apostrophes and forward slashes |
    And Clicking each error message should focus on the corresponding input field on "QROPS Address Page"

  Scenario:12. Negative journey - PSA/PSP enters invalid charecters in Address Line 2 field in QROPS address page
    When I enter the following data into corresponding input fields on "QROPS Address Page"
      | addressLine1 | 12 Burlington Court |
      | addressLine2 | %Burlington Road    |
      | addressLine3 | London              |
      | addressLine4 | Maidenhead          |
      | addressLine5 | Berkshire           |
      | countryCode  | United Kingdom      |
    And I click save and continue button on "QROPS Address Page"
    Then I am presented with the "QROPS Address Page" error page
    And I should see the "There is a problem" and below error messages
      | Address line 2 must only include letters, numbers, spaces, hyphens, commas, full stops, ampersands, apostrophes and forward slashes |
    And Clicking each error message should focus on the corresponding input field on "QROPS Address Page"

  Scenario:13. Negative journey - PSA/PSP enters invalid charecters in Address Line 3 field in QROPS address page
    When I enter the following data into corresponding input fields on "QROPS Address Page"
      | addressLine1 | 12 Burlington Court |
      | addressLine2 | Burlington Road     |
      | addressLine3 | %London             |
      | addressLine4 | Maidenhead          |
      | addressLine5 | Berkshire           |
      | countryCode  | United Kingdom      |
    And I click save and continue button on "QROPS Address Page"
    Then I am presented with the "QROPS Address Page" error page
    And I should see the "There is a problem" and below error messages
      | Address line 3 must only include letters, numbers, spaces, hyphens, commas, full stops, ampersands, apostrophes and forward slashes |
    And Clicking each error message should focus on the corresponding input field on "QROPS Address Page"

  Scenario:14. Negative journey - PSA/PSP enters invalid charecters in Address Line 4 field in QROPS address page
    When I enter the following data into corresponding input fields on "QROPS Address Page"
      | addressLine1 | 12 Burlington Court |
      | addressLine2 | Burlington Road     |
      | addressLine3 | London              |
      | addressLine4 | %Maidenhead         |
      | addressLine5 | Berkshire           |
      | countryCode  | United Kingdom      |
    And I click save and continue button on "QROPS Address Page"
    Then I am presented with the "QROPS Address Page" error page
    And I should see the "There is a problem" and below error messages
      | Address line 4 must only include letters, numbers, spaces, hyphens, commas, full stops, ampersands, apostrophes and forward slashes |
    And Clicking each error message should focus on the corresponding input field on "QROPS Address Page"

  Scenario:15. Negative journey - PSA/PSP enters invalid charecters in Address Line 5 field in QROPS address page
    When I enter the following data into corresponding input fields on "QROPS Address Page"
      | addressLine1 | 12 Burlington Court |
      | addressLine2 | Burlington Road     |
      | addressLine3 | London              |
      | addressLine4 | Maidenhead          |
      | addressLine5 | %Berkshire          |
      | countryCode  | United Kingdom      |
    And I click save and continue button on "QROPS Address Page"
    Then I am presented with the "QROPS Address Page" error page
    And I should see the "There is a problem" and below error messages
      | Address line 5 must only include letters, numbers, spaces, hyphens, commas, full stops, ampersands, apostrophes and forward slashes |
    And Clicking each error message should focus on the corresponding input field on "QROPS Address Page"