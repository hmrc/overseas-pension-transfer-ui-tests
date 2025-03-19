@Test @MembersLastUKAddress
Feature: Adding names of the member
  As a PSA/PSP

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
      | Town or city              |
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

  Scenario:3. Negative journey - PSA/PSP does not enter the 'Address Line 1'
    When I enter the following data into corresponding input fields on "Members Last UK Address Page"
      | addressLine1 |           |
      | townOrCity   | Some town |
      | postcode     | AB12CD    |
    And I click save and continue button on "Members Last UK Address Page"
    Then I am presented with the "Members Last UK Address Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter the first line of undefined undefined's last principal UK address |

  Scenario:4. Negative journey - PSA/PSP does not enter the 'Town or city'
    When I enter the following data into corresponding input fields on "Members Last UK Address Page"
      | addressLine1 | Some valid UK address line1 |
      | townOrCity   |                             |
      | postcode     | AB12CD                      |
    And I click save and continue button on "Members Last UK Address Page"
    Then I am presented with the "Members Last UK Address Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter the Town or city for undefined undefined's last principal UK address |

  Scenario:5. Negative journey - PSA/PSP does not enter the 'Postcode'
    When I enter the following data into corresponding input fields on "Members Last UK Address Page"
      | addressLine1 | Some valid UK address line1 |
      | townOrCity   | Some Town                   |
      | postcode     |                             |
    And I click save and continue button on "Members Last UK Address Page"
    Then I am presented with the "Members Last UK Address Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter Postcode |

  Scenario:6. Negative journey - PSA/PSP enters more than 35 characters into the 'Address Line 1' field
    When I enter the following data into corresponding input fields on "Members Last UK Address Page"
      | addressLine1 | The Address Line 1 longer than 35 characters, yes it is longer than limit |
      | townOrCity   | Some town                                                                 |
      | postcode     | AB12CD                                                                    |
    And I click save and continue button on "Members Last UK Address Page"
    Then I am presented with the "Members Last UK Address Page" error page
    And I should see the "There is a problem" and below error messages
      | Address line 1 must be 35 characters or less |

  Scenario:7. Negative journey - PSA/PSP enters more than 35 characters into the 'Address Line 2' field
    When I enter the following data into corresponding input fields on "Members Last UK Address Page"
      | addressLine1 | Some valid UK address line1                                                   |
      | addressLine2 | The Address Line 2 longer than 35 characters, yes it is longer than the limit |
      | townOrCity   | Some town                                                                     |
      | postcode     | AB12CD                                                                        |
    And I click save and continue button on "Members Last UK Address Page"
    Then I am presented with the "Members Last UK Address Page" error page
    And I should see the "There is a problem" and below error messages
      | Address line 2 must be 35 characters or less |

  Scenario:8. Negative journey - PSA/PSP enters more than 35 characters into the 'Town or city' field
    When I enter the following data into corresponding input fields on "Members Last UK Address Page"
      | addressLine1 | Some valid UK address line1                                             |
      | townOrCity   | Town or city longer than 35 characters, yes it is longer than the limit |
      | postcode     | AB12CD                                                                  |
    And I click save and continue button on "Members Last UK Address Page"
    Then I am presented with the "Members Last UK Address Page" error page
    And I should see the "There is a problem" and below error messages
      | Town or city must be 35 characters or less |

  Scenario:9. Negative journey - PSA/PSP enters more than 35 characters into the 'County' field
    When I enter the following data into corresponding input fields on "Members Last UK Address Page"
      | addressLine1 | Some valid UK address line1                                                 |
      | townOrCity   | Some Town                                                                   |
      | county       | This county name longer than 35 characters, yes it is longer than the limit |
      | postcode     | AB12CD                                                                      |
    And I click save and continue button on "Members Last UK Address Page"
    Then I am presented with the "Members Last UK Address Page" error page
    And I should see the "There is a problem" and below error messages
      | County must be 35 characters or less |

  Scenario:10. Negative journey - PSA/PSP enters invalid characters into one or more input fields
    When I enter the following data into corresponding input fields on "Members Last UK Address Page"
      | addressLine1 | Invalid@ UK address line1 |
      | addressLine2 | Invalid@ UK address line2 |
      | townOrCity   | Invalid@ Town name        |
      | county       | Invalid@ county name      |
      | postcode     | AB12CD                    |
    And I click save and continue button on "Members Last UK Address Page"
    Then I am presented with the "Members Last UK Address Page" error page
    And I should see the "There is a problem" and below error messages
      | Address line 1 must only include letters, numbers, spaces, hyphens, commas, full stops, ampersands, apostrophes and forward slashes |
      | Address line 2 must only include letters, numbers, spaces, hyphens, commas, full stops, ampersands, apostrophes and forward slashes |
      | Town or city must only include letters, numbers, spaces, hyphens, commas, full stops, ampersands, apostrophes and forward slashes   |
      | County must only include letters, numbers, spaces, hyphens, commas, full stops, ampersands, apostrophes and forward slashes         |

  Scenario:11. Negative journey - PSA/PSP enters incorrect postcode into the 'Postcode' field
    When I enter the following data into corresponding input fields on "Members Last UK Address Page"
      | addressLine1 | Some valid UK address line1 |
      | townOrCity   | Some Town                   |
      | postcode     | Z1922RH                     |
    And I click save and continue button on "Members Last UK Address Page"
    Then I am presented with the "Members Last UK Address Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter a UK postcode in the correct format |