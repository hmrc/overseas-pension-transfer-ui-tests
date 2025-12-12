@Test @regression @amendJourney
Feature: Is the members details journey fully connected

  Background: Common Steps
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "Journey entry URL"
    When I enter Enrollment Key "HMRC-PODS-ORG", Identifier Name "PSAID" and Identifier Value "A2100005" on "Auth Login Stub Page"
    And I click submit button on "Auth Login Stub Page"

  Scenario:1. Amend Journey - Change member,transfer,QROPS and schemeManager details
    Then I am presented with the "Dashboard Page"
    And I click on "Member Name" hyperlink on "Dashboard Page"
    Then I am presented with the "Submitted Transfer Summary Page"
    When I click on "view-amend" button on "Submitted Transfer Summary Page"
    Then I am presented with the "View Amend Page"
    And I should see two radio buttons: "View this QROPS transfer report" and "Amend this QROPS transfer report"
    When I select radio button "Amend this QROPS transfer report" on "View Amend Page"
    And I click save and continue button on "View Amend Page"
    Then I am presented with the "Amend Submitted Transfer Page"
    When I click on "amend-change-members-current-address" button on "Amend Submitted Transfer Page"
    Then I am presented with the "Amend Change Member Current Address Page"
    And I enter the following data into corresponding input fields on "Amend Change Member Current Address Page"
      | addressLine1 | 78 Queensway Crescent |
    And I click save and continue button on "Amend Change Member Current Address Page"
    Then I am presented with the "Amend Submitted Transfer Page"
    And I should see the following values on the page
      | Principal residential address | 78 Queensway Crescent |

    When I click on "amend-change-amount-of-transfer" button on "Amend Submitted Transfer Page"
    Then I am presented with the "Amend Change Amount Of Transfer Page"
    When I enter the following data into corresponding input fields on "Amend Change Amount Of Transfer Page"
      | value | 50000 |
    And I click save and continue button on "Amend Change Amount Of Transfer Page"
    Then I am presented with the "Amend Submitted Transfer Page"
    And I should see the following values on the page
      | Transfer Amount | £50000 |

    When I click on "amend-change-qrops-reference" button on "Amend Submitted Transfer Page"
    Then I am presented with the "Amend Change QROPS Reference Page"
    When I enter the following data into corresponding input fields on "Amend Change QROPS Reference Page"
      | qropsRef | QROPS123456 |
    And I click save and continue button on "Amend Change QROPS Reference Page"
    Then I am presented with the "Amend Submitted Transfer Page"
    And I should see the following values on the page
      | qropsRef | QROPS123456 |

    When I click on "amend-change-scheme-managers-name" button on "Amend Submitted Transfer Page"
    Then I am presented with the "Amend Change Scheme Managers Name Page"
    When I enter the following data into corresponding input fields on "Amend Change Scheme Managers Name Page"
      | schemeManagersFirstName | Humpty |
      | schemeManagersLastName  | Dumpty |
    And I click save and continue button on "Amend Change Scheme Managers Name Page"
    Then I am presented with the "Amend Submitted Transfer Page"
    And I should see the following values on the page
      | Manager Name | Humpty Dumpty |

    And I click save and continue button on "Amend Submitted Transfer Page"
    Then I am presented with the "Submit Amendment Page"
    When I select radio button "Yes" on "Submit Amendment Page"
    And I click save and continue button on "Submit Amendment Page"
    Then I am presented with the "Amend Declaration Page"
    And I click agree and submit button on "Amend Declaration Page"
    Then I am presented with the "Transfer Submission Page"
    And I should see the heading "Transfer submitted"