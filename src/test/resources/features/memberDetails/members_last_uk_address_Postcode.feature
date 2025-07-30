@Test @MembersLastUKAddressPostcode
Feature: Entering the last UK address of the member using postcode
  As a PSA/PSP

  Background: Common Steps - Member Details Journey
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "What You Will Need Page"
    When I enter Enrollment Key "HMRC-PODS-ORG", Identifier Name "PSAID" and Identifier Value "2131231231231" on "Auth Login Stub Page"
    # And I enter redirect URL on Auth Login Stub Page for "Is Member Currently UK Resident Page"
    # Redirection currently does not work for any other page other than the Index page
    And I click submit button on "Auth Login Stub Page"
    Then I am presented with the "What You Will Need Page"
    And I navigated to the "Members Last UK Address Lookup Page"
    Then I am presented with the "Members Last UK Address Lookup Page"

  Scenario Outline: Verify the Members Last UK Address Page
    And I should see the heading "Find <memberName>'s last principal residential address in the UK"
    And I should see the input fields with below labels on "Members Last UK Address Lookup Page"
      | Postcode |
    Examples:
      | memberName          |
      | Undefined Undefined |

  Scenario:1. Positive journey - PSA/PSP enters post code and selects the required address
    When I enter the following data into corresponding input fields on "Members Last UK Address Lookup Page"
      | value | ZZ11ZZ |
    And I click save and continue button on "Members Last UK Address Lookup Page"
    And I am presented with the "Select Members Last UK Address Page"
    Then I should see the heading "Select Undefined Undefined's last UK address"
    And I select radio button "2 Other Place, Some District, ZZ1 1ZZ" on "Select Members Last UK Address Page"
    And I click save and continue button on "Select Members Last UK Address Page"
    And I am presented with the "Confirm Members Last UK Address Page"
    And I should see the following values on the page
      | value         |
      | 2 Other Place |
      | Some District |
      | ZZ1 1ZZ       |
    And I click save and continue button on "Confirm Members Last UK Address Page"
    And I am presented with the "Member Date Of Leaving UK Page"
# Above action would have to be rewritten upon page gets connected

  Scenario:2. Positive journey - PSA/PSP selects option to enter the address manually in the post code screen
    When I click on "enter the address manually" hyperlink on "Members Last UK Address Lookup Page"
    And I am presented with the "Members Last UK Address Page"
    And I should see the heading "What was Undefined Undefined's last principal residential address in the UK?"

  Scenario:3. Positive - PSA/PSP selects the option to select a different postcode in the address selection screen
    When I enter the following data into corresponding input fields on "Members Last UK Address Lookup Page"
      | value | ZZ11ZZ |
    And I click save and continue button on "Members Last UK Address Lookup Page"
    And I am presented with the "Select Members Last UK Address Page"
    And I click on "different postcode" hyperlink on "Select Members Last UK Address Page"
    And I am presented with the "Members Last UK Address Lookup Page"

  Scenario:4. Positive Journey - PSA/PSP selects the option to enter the address manually in the address selection screen
    When I enter the following data into corresponding input fields on "Members Last UK Address Lookup Page"
      | value | ZZ11ZZ |
    And I click save and continue button on "Members Last UK Address Lookup Page"
    And I am presented with the "Select Members Last UK Address Page"
    And I click on "enter the address manually" hyperlink on "Select Members Last UK Address Page"
    And I am presented with the "Members Last UK Address Page"
    And I should see the heading "What was Undefined Undefined's last principal residential address in the UK?"

  Scenario:5. Positive Journey - PSA/PSP clicks on the link to select a different address in the confirm last address screen
    When I enter the following data into corresponding input fields on "Members Last UK Address Lookup Page"
      | value | ZZ11ZZ |
    And I click save and continue button on "Members Last UK Address Lookup Page"
    And I am presented with the "Select Members Last UK Address Page"
    Then I should see the heading "Select Undefined Undefined's last UK address"
    And I select radio button "2 Other Place, Some District, ZZ1 1ZZ" on "Select Members Last UK Address Page"
    And I click save and continue button on "Select Members Last UK Address Page"
    And I am presented with the "Confirm Members Last UK Address Page"
    And I should see the following values on the page
      | value         |
      | 2 Other Place |
      | Some District |
      | ZZ1 1ZZ       |
    And I click on "select a different address" hyperlink on "Confirm Members Last UK Address Page"
    And I am presented with the "Members Last UK Address Lookup Page"

  Scenario:6. Positive Journey - PSA/PSP clicks on the link to select a different address in the confirm last address screen
    When I enter the following data into corresponding input fields on "Members Last UK Address Lookup Page"
      | value | ZZ11ZZ |
    And I click save and continue button on "Members Last UK Address Lookup Page"
    And I am presented with the "Select Members Last UK Address Page"
    Then I should see the heading "Select Undefined Undefined's last UK address"
    And I select radio button "2 Other Place, Some District, ZZ1 1ZZ" on "Select Members Last UK Address Page"
    And I click save and continue button on "Select Members Last UK Address Page"
    And I am presented with the "Confirm Members Last UK Address Page"
    And I should see the following values on the page
      | value         |
      | 2 Other Place |
      | Some District |
      | ZZ1 1ZZ       |
    And I click on "enter the address manually" hyperlink on "Confirm Members Last UK Address Page"
    And I am presented with the "Members Last UK Address Page"
    And I should see the heading "What was Undefined Undefined's last principal residential address in the UK?"

  Scenario:7. Negative journey - PSA/PSP does not enter the 'Postcode'
    When I enter the following data into corresponding input fields on "Members Last UK Address Lookup Page"
      | value |  |
    And I click save and continue button on "Members Last UK Address Lookup Page"
    Then I am presented with the "Members Last UK Address Lookup Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter a full UK postcode |
    And I should see following erroneous fields are highlighted on "Members Last UK Address Lookup Page"
      | value |
    And Clicking each error message should focus on the corresponding input field on "Members Last UK Address Lookup Page"

  Scenario:8. Negative journey - PSA/PSP enters 'Postcode' in the wrong format (eg:ZZ11ZZSS)
    When I enter the following data into corresponding input fields on "Members Last UK Address Lookup Page"
      | value | ZZ11ZZSS |
    And I click save and continue button on "Members Last UK Address Lookup Page"
    Then I am presented with the "Members Last UK Address Lookup Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter a full UK postcode in the correct format |
    And I should see following erroneous fields are highlighted on "Members Last UK Address Lookup Page"
      | value |
    And Clicking each error message should focus on the corresponding input field on "Members Last UK Address Lookup Page"

  Scenario:9. Negative journey - PSA/PSP does not select any option in select address page
    When I enter the following data into corresponding input fields on "Members Last UK Address Lookup Page"
      | value | ZZ11ZZ |
    And I click save and continue button on "Members Last UK Address Lookup Page"
    And I am presented with the "Select Members Last UK Address Page"
    Then I should see the heading "Select Undefined Undefined's last UK address"
    And I click save and continue button on "Select Members Last UK Address Page"
    And I should see the "There is a problem" and below error messages
      | Select the member's last UK address |
    And Clicking each error message should focus on the corresponding input field on "Select Members Last UK Address Page"
