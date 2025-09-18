@Test @SchemeManagerDetailsE2E @acceptance @regression
Feature: Is the members details journey fully connected

  Background: Common Steps
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "Journey entry URL"
    When I enter Enrollment Key "HMRC-PODS-ORG", Identifier Name "PSAID" and Identifier Value "A2100005" on "Auth Login Stub Page"
    And I click submit button on "Auth Login Stub Page"
    Then I am presented with the "Dashboard Page"
    And I click on "Start new transfer" hyperlink on "Dashboard Page"

  Scenario:1. Full Scheme Manager Details Journey - Individual
    And I navigated to the "Scheme Manager Type Page"
    Then I am presented with the "Scheme Manager Type Page"
    When I select radio button "Individual" on "Scheme Manager Type Page"
    And I click save and continue button on "Scheme Manager Type Page"
    Then I am presented with the "Scheme Manager Name Page"
    When I enter the following data into corresponding input fields on "Scheme Manager Name Page"
      | schemeManagersFirstName | Emily   |
      | schemeManagersLastName  | Parker  |
    And I click save and continue button on "Scheme Manager Name Page"
    Then I am presented with the "Scheme Manager Address Page"
    When I enter the following data into corresponding input fields on "Scheme Manager Address Page"
      | addressLine1 | 88 Willow Street |
      | addressLine2 | Oakwood Park     |
      | addressLine3 | Stratford        |
      | addressLine4 | Greater London   |
      | addressLine5 | England          |
      | countryCode  | United Kingdom   |
    And I click save and continue button on "Scheme Manager Address Page"
    Then I am presented with the "Scheme Manager Email Page"
    When I enter the following data into corresponding input fields on "Scheme Manager Email Page"
      | emailAddress | thismail@gmail.com |
    And I click save and continue button on "Scheme Manager Email Page"
    Then I am presented with the "Scheme Manager Telephone Page"
    When I enter the following data into corresponding input fields on "Scheme Manager Telephone Page"
      | contactNumber | +441234567890 |
    And I click save and continue button on "Scheme Manager Telephone Page"
    Then I am presented with the "Scheme Manager Check Your Answer Page"
    And I should see the following details
      | Organisation or individual | Individual                                                                    |
      | Manager name               | Emily Parker                                                                  |
      | Manager address            | 88 Willow Street,Oakwood Park,Stratford,Greater London,England,United Kingdom |
      | Manager email              | thismail@gmail.com                                                            |
      | Manager telephone number   | +441234567890                                                                 |
    And I click save and continue button on "Scheme Manager Check Your Answer Page"
    Then I am presented with the "Task List Page"

  Scenario:2. Full Scheme Manager Details Journey - Organisation
    And I navigated to the "Scheme Manager Type Page"
    Then I am presented with the "Scheme Manager Type Page"
    When I select radio button "Organisation" on "Scheme Manager Type Page"
    And I click save and continue button on "Scheme Manager Type Page"
    Then I am presented with the "Organisation Name Page"
    When I enter the following data into corresponding input fields on "Organisation Name Page"
      | organisationName | Great Organisation |
    And I click save and continue button on "Organisation Name Page"
    Then I am presented with the "Organisation Individual Name Page"
    When I enter the following data into corresponding input fields on "Organisation Individual Name Page"
      | orgIndFirstName | Sarah    |
      | orgIndLastName  | Thompson |
    And I click save and continue button on "Scheme Manager Name Page"
    Then I am presented with the "Scheme Manager Address Page"
    When I enter the following data into corresponding input fields on "Scheme Manager Address Page"
      | addressLine1           | 99 Elm Street       |
      | addressLine2           | Greenfield Estate   |
      | addressLine3           | Cambridge           |
      | addressLine4           | Cambridgeshire      |
      | addressLine5           | East of England     |
      | countryCode            | United Kingdom      |
    And I click save and continue button on "Scheme Manager Address Page"
    Then I am presented with the "Scheme Manager Email Page"
    When I enter the following data into corresponding input fields on "Scheme Manager Email Page"
      | emailAddress | sarah.thompson@example.com |
    And I click save and continue button on "Scheme Manager Email Page"
    Then I am presented with the "Scheme Manager Telephone Page"
    When I enter the following data into corresponding input fields on "Scheme Manager Telephone Page"
      | contactNumber | +447712345678 |
    And I click save and continue button on "Scheme Manager Telephone Page"
    Then I am presented with the "Scheme Manager Check Your Answer Page"
    And I should see the following details
      | Organisation or individual | Organisation                                                                            |
      | Organisation name          | Great Organisation                                                                      |
      | Organisation contact       | Sarah Thompson                                                                          |
      | Manager address            | 99 Elm Street,Greenfield Estate,Cambridge,Cambridgeshire,East of England,United Kingdom |
      | Manager email              | sarah.thompson@example.com                                                              |
      | Manager telephone number   | +447712345678                                                                           |
    And I click save and continue button on "Scheme Manager Check Your Answer Page"
    Then I am presented with the "Task List Page"

  Scenario:3. Full Scheme Manager Details Journey - Organisation - CYA routing
    And I navigated to the "Scheme Manager Type Page"
    Then I am presented with the "Scheme Manager Type Page"
    When I select radio button "Organisation" on "Scheme Manager Type Page"
    And I click save and continue button on "Scheme Manager Type Page"
    Then I am presented with the "Organisation Name Page"
    When I enter the following data into corresponding input fields on "Organisation Name Page"
      | organisationName | Great Organisation |
    And I click save and continue button on "Organisation Name Page"
    Then I am presented with the "Organisation Individual Name Page"
    When I enter the following data into corresponding input fields on "Organisation Individual Name Page"
      | orgIndFirstName | Sarah    |
      | orgIndLastName  | Thompson |
    And I click save and continue button on "Scheme Manager Name Page"
    Then I am presented with the "Scheme Manager Address Page"
    When I enter the following data into corresponding input fields on "Scheme Manager Address Page"
      | addressLine1           | 99 Elm Street       |
      | addressLine2           | Greenfield Estate   |
      | addressLine3           | Cambridge           |
      | addressLine4           | Cambridgeshire      |
      | addressLine5           | East of England     |
      | countryCode            | United Kingdom      |
    And I click save and continue button on "Scheme Manager Address Page"
    Then I am presented with the "Scheme Manager Email Page"
    When I enter the following data into corresponding input fields on "Scheme Manager Email Page"
      | emailAddress | sarah.thompson@example.com |
    And I click save and continue button on "Scheme Manager Email Page"
    Then I am presented with the "Scheme Manager Telephone Page"
    When I enter the following data into corresponding input fields on "Scheme Manager Telephone Page"
      | contactNumber | +447712345678 |
    And I click save and continue button on "Scheme Manager Telephone Page"
    Then I am presented with the "Scheme Manager Check Your Answer Page"
    And I should see the following details
      | Organisation or individual | Organisation                                                                            |
      | Organisation name          | Great Organisation                                                                      |
      | Organisation contact       | Sarah Thompson                                                                          |
      | Manager address            | 99 Elm Street,Greenfield Estate,Cambridge,Cambridgeshire,East of England,United Kingdom |
      | Manager email              | sarah.thompson@example.com                                                              |
      | Manager telephone number   | +447712345678                                                                           |
    When I click on "change-organisation-name" button on "Check Your Answers Page"
    Then I am presented with the change "Organisation Name Page"
    And I click save and continue button on "Organisation Name Page"
    Then I am presented with the "Scheme Manager Check Your Answer Page"
    When I click on "change-organisation-individual-name" button on "Check Your Answers Page"
    Then I am presented with the change "Organisation Individual Name Page"
    And I click save and continue button on "Organisation Individual Name Page"
    Then I am presented with the "Scheme Manager Check Your Answer Page"
    When I click on "change-scheme-managers-address" button on "Check Your Answers Page"
    Then I am presented with the change "Scheme Manager Address Page"
    And I click save and continue button on "Scheme Manager Address Page"
    Then I am presented with the "Scheme Manager Check Your Answer Page"
    When I click on "change-scheme-managers-email" button on "Check Your Answers Page"
    Then I am presented with the change "Scheme Manager Email Page"
    And I click save and continue button on "Scheme Manager Email Page"
    Then I am presented with the "Scheme Manager Check Your Answer Page"
    And I click save and continue button on "Scheme Manager Check Your Answer Page"
    Then I am presented with the "Task List Page"