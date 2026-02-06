@Test @MembersLastUKAddress @acceptance
Feature: Entering the last UK address of the member
  As a PSA/PSP

  Background: Common Steps - Member Details Journey
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "Journey entry URL"
    # And I enter redirect URL on Auth Login Stub Page for "Is Member Currently UK Resident Page"
    # Redirection currently does not work for any other page other than the Index page
    When I enter Enrollment Key "HMRC-PODS-ORG", Identifier Name "PSAID" and Identifier Value "A2100005" on "Auth Login Stub Page"
    And I click submit button on "Auth Login Stub Page"
    Then I am presented with the "Dashboard Page"
    And I click on "Start new transfer" hyperlink on "Dashboard Page"
    Then I am presented with the "What You Will Need Page"
    And I navigated to the "Members Last UK Address Page"
    Then I am presented with the "Members Last UK Address Page"

  Scenario Outline: Verify the Members Last UK Address Page
    And I should see the heading "What was <memberName>'s last principal residential address in the UK?"
    And I should see the input fields with below labels on "Members Last UK Address Page"
      | Address line 1            |
      | Address line 2            |
      | Address line 3 (optional) |
      | Address line 4 (optional) |
      | Postcode                  |
    Examples:
      | memberName          |
      | Undefined Undefined |

  Scenario:1. Positive journey - PSA/PSP enters data only into the mandatory fields
    When I enter the following data into corresponding input fields on "Members Last UK Address Page"
      | addressLine1 | 12 Burlington Avenue |
      | addressLine2 | Burlington Road      |
      | postcode     | AB1 2CD               |
    And I click save and continue button on "Members Last UK Address Page"
    Then I am presented with the "Member Date Of Leaving UK Page"
# Above action would have to be rewritten upon page gets connected

  Scenario:2. Positive journey - PSA/PSP enters data into all the fields
    When I enter the following data into corresponding input fields on "Members Last UK Address Page"
      | addressLine1 | 12 Burlington Avenue |
      | addressLine2 | Burlington Road      |
      | addressLine3 | Maidenhead           |
      | addressLine4 | Berkshire            |
      | postcode     | AB1 2CD               |
    And I click save and continue button on "Members Last UK Address Page"
    Then I am presented with the "Member Date Of Leaving UK Page"
# Above action would have to be rewritten upon page gets connected

  Scenario:3. Negative journey - PSA/PSP enters more than 35 charecters for 'Address Line 1'
    When I enter the following data into corresponding input fields on "Members Last UK Address Page"
      | addressLine1 | afsdfasdfasfdsadfadsfadsfasdfasdfsadfdasfsadfasdfsadfasdfasdfasdfdasfsafdsafasdfsda |
      | addressLine2 | Burlington Road                                                                     |
      | addressLine3 | Maidenhead                                                                          |
      | addressLine4 | Berkshire                                                                           |
      | postcode     | AB1 2CD                                                                              |
    And I click save and continue button on "Members Last UK Address Page"
    Then I am presented with the "Members Last UK Address Page" error page
    And I should see the "There is a problem" and below error messages
      | Address line 1 must be 35 characters or less |
    And I should see following erroneous fields are highlighted on "Members Last UK Address Page"
      |addressLine1 |
    And Clicking each error message should focus on the corresponding input field on "Members Last UK Address Page"

  Scenario:4. Negative journey - PSA/PSP enters more than 35 characters for 'Address Line 2'
    When I enter the following data into corresponding input fields on "Members Last UK Address Page"
      | addressLine1 | 12 Burlington Court                                                                 |
      | addressLine2 | afsdfasdfasfdsadfadsfadsfasdfasdfsadfdasfsadfasdfsadfasdfasdfasdfdasfsafdsafasdfsda |
      | addressLine3 | Maidenhead                                                                          |
      | addressLine4 | Berkshire                                                                           |
      | postcode     | AB1 2CD                                                                              |
    And I click save and continue button on "Members Last UK Address Page"
    Then I am presented with the "Members Last UK Address Page" error page
    And I should see the "There is a problem" and below error messages
      | Address line 2 must be 35 characters or less |
    And I should see following erroneous fields are highlighted on "Members Last UK Address Page"
      | addressLine2 |
    And Clicking each error message should focus on the corresponding input field on "Members Last UK Address Page"

  Scenario:5. Negative journey - PSA/PSP enters more than 35 characters for 'Address Line 3'
    When I enter the following data into corresponding input fields on "Members Last UK Address Page"
      | addressLine1 | 12 Burlington Court                                                                 |
      | addressLine2 | Burlington Road                                                                     |
      | addressLine3 | afsdfasdfasfdsadfadsfadsfasdfasdfsadfdasfsadfasdfsadfasdfasdfasdfdasfsafdsafasdfsda |
      | addressLine4 | Berkshire                                                                           |
      | postcode     | AB1 2CD                                                                              |
    And I click save and continue button on "Members Last UK Address Page"
    Then I am presented with the "Members Last UK Address Page" error page
    And I should see the "There is a problem" and below error messages
      | Address line 3 must be 35 characters or less |
    And I should see following erroneous fields are highlighted on "Members Last UK Address Page"
      | addressLine3 |
    And Clicking each error message should focus on the corresponding input field on "Members Last UK Address Page"

  Scenario:6. Negative journey - PSA/PSP enters more than 35 characters for 'Address Line 4'
    When I enter the following data into corresponding input fields on "Members Last UK Address Page"
      | addressLine1 | 12 Burlington Court                                                                 |
      | addressLine2 | Burlington Road                                                                     |
      | addressLine3 | London                                                                              |
      | addressLine4 | afsdfasdfasfdsadfadsfadsfasdfasdfsadfdasfsadfasdfsadfasdfasdfasdfdasfsafdsafasdfsda |
      | postcode     | AB1 2CD                                                                              |
    And I click save and continue button on "Members Last UK Address Page"
    Then I am presented with the "Members Last UK Address Page" error page
    And I should see the "There is a problem" and below error messages
      | Address line 4 must be 35 characters or less |
    And I should see following erroneous fields are highlighted on "Members Last UK Address Page"
      | addressLine4 |
    And Clicking each error message should focus on the corresponding input field on "Members Last UK Address Page"

  Scenario:7. Negative journey - PSA/PSP does not enter the 'Address Line 1'
    When I enter the following data into corresponding input fields on "Members Last UK Address Page"
      | addressLine1 |                 |
      | addressLine2 | Burlington Road |
      | addressLine3 | Maidenhead      |
      | addressLine4 | Berkshire       |
      | postcode     | AB1 2CD          |
    And I click save and continue button on "Members Last UK Address Page"
    Then I am presented with the "Members Last UK Address Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter the first line of Undefined Undefined's last principal UK address |
    And I should see following erroneous fields are highlighted on "Members Last UK Address Page"
      | addressLine1 |
    And Clicking each error message should focus on the corresponding input field on "Members Last UK Address Page"

  Scenario:8. Negative journey - PSA/PSP does not enter the 'Address Line 2'
    When I enter the following data into corresponding input fields on "Members Last UK Address Page"
      | addressLine1 | 12, Burlington Court |
      | addressLine2 |                      |
      | addressLine3 | Maidenhead           |
      | addressLine4 | Berkshire            |
      | postcode     | AB1 2CD               |
    And I click save and continue button on "Members Last UK Address Page"
    Then I am presented with the "Members Last UK Address Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter the second line for Undefined Undefined's last principal UK address |
    And I should see following erroneous fields are highlighted on "Members Last UK Address Page"
      | addressLine2 |
    And Clicking each error message should focus on the corresponding input field on "Members Last UK Address Page"

  Scenario:9. Negative journey - PSA/PSP does not enter the 'Postcode'
    When I enter the following data into corresponding input fields on "Members Last UK Address Page"

      | addressLine1 | 12, Burlington Court |
      | addressLine2 | Burlington Road      |
      | addressLine3 | Maidenhead           |
      | addressLine4 | Berkshire            |
      | postcode     |                      |
    And I click save and continue button on "Members Last UK Address Page"
    Then I am presented with the "Members Last UK Address Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter Postcode |
    And I should see following erroneous fields are highlighted on "Members Last UK Address Page"
      | postcode |
    And Clicking each error message should focus on the corresponding input field on "Members Last UK Address Page"

  Scenario:10. Negative journey - PSA/PSP enters invalid characters into one or more input fields
    When I enter the following data into corresponding input fields on "Members Last UK Address Page"
      | addressLine1 | %%Invalid@ UK address line1 |
      | addressLine2 | %%Invalid@ UK address line2 |
      | addressLine3 | %%Invalid@ UK address Line3 |
      | addressLine4 | %%Invalid@ UK address Line4 |
      | postcode     | %%AB1 2CD                    |
    And I click save and continue button on "Members Last UK Address Page"
    Then I am presented with the "Members Last UK Address Page" error page
    And I should see the "There is a problem" and below error messages
      | Address line 1 must only include letters, numbers, spaces, hyphens, commas, full stops, ampersands, apostrophes and forward slashes |
      | Address line 2 must only include letters, numbers, spaces, hyphens, commas, full stops, ampersands, apostrophes and forward slashes |
      | Address line 3 must only include letters, numbers, spaces, hyphens, commas, full stops, ampersands, apostrophes and forward slashes |
      | Address line 4 must only include letters, numbers, spaces, hyphens, commas, full stops, ampersands, apostrophes and forward slashes |
      | Enter a UK postcode in the correct format                                                                                           |
    And I should see following erroneous fields are highlighted on "Members Last UK Address Page"
      | addressLine1 |
      | addressLine2 |
      | addressLine3 |
      | addressLine4 |
      | postcode     |
    And Clicking each error message should focus on the corresponding input field on "Members Last UK Address Page"


  Scenario:11. Negative journey - PSA/PSP enters incorrect postcode into the 'Postcode' field
    When I enter the following data into corresponding input fields on "Members Last UK Address Page"

      | addressLine1 | 12 Burlington Avenue |
      | addressLine2 | Burlington Road      |
      | addressLine3 | Maidenhead           |
      | addressLine4 | Berkshire            |
      | postcode     | SL1111JJ             |
    And I click save and continue button on "Members Last UK Address Page"
    Then I am presented with the "Members Last UK Address Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter a UK postcode in the correct format |
    And I should see following erroneous fields are highlighted on "Members Last UK Address Page"
      | postcode |
    And Clicking each error message should focus on the corresponding input field on "Members Last UK Address Page"

  #Scenario:5. Positive journey - PSA/PSP selects option to enter the address using post code screen
   # When I click on "searching the postcode." hyperlink on "Members Last UK Address Page"
    #And I am presented with the "Member Last UK Address Lookup Page"
    #And I should see the heading "Find Undefined Undefined's last principal residential address in the UK"
    #And I should see the hint text "For example, AA3 1AB."
