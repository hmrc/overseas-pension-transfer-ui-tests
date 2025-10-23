@Test @Dashboard @acceptance @regression
Feature: Is the members details journey fully connected

  Background: Common Steps
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "Journey entry URL"
    When I enter Enrollment Key "HMRC-PODS-ORG", Identifier Name "PSAID" and Identifier Value "A2100005" on "Auth Login Stub Page"
    And I click submit button on "Auth Login Stub Page"

  Scenario:1. Dashboard Journey - Can create and continue and In Progress Transfer
    Then I am presented with the "Dashboard Page"
    And I click on "Start new transfer" hyperlink on "Dashboard Page"
    Then I am presented with the "What You Will Need Page"
    And I click save and continue button on "What You Will Need Page"
    Then I am presented with the "Task List Page"
    When I click on "Add details about the member" hyperlink on "Task List Page"
    And I should see the heading "What is the member's name?"
    When I enter the following data into corresponding input fields on "Member Name Page"
      | firstName | Jeffrey   |
      | lastName  | Jefferson |
    And I click continue button on "Member Name Page"
    Then I am presented with the "Member Nino Page"
    When I click on "Return to task list" hyperlink on "Member Nino Page"
    When I click on "Return to Report a transfer to a QROPS dashboard" hyperlink on "Task List Page"
    Then I am presented with the "Dashboard Page"
    And I should see the following details in the dashboard
      | Member name       | Status      | Transfer reference | Last updated |
      | Jeffrey Jefferson | In progress | -                  | <TODAY_DATE> |
    When I click on "Jeffrey Jefferson" hyperlink on "Dashboard Page"
    Then I am presented with the "Task List Page"
#    Then I see the status "In progress" for task "Add details about the member" //TODO revert this when the update to the tasklist is made

  Scenario:2. Dashboard Journey - Can view a submitted journey
    Then I am presented with the "Dashboard Page"
    And I should see the following details in the dashboard ignoring last updated
      | Member name    | Status            | Transfer reference |
      | Malcolm Mendes | Submitted to HMRC | QT564339           |
    When I click on "Malcolm Mendes" hyperlink on Dashboard Page version "006"
    Then I am presented with the "View Submitted Page"
    When I click on "Return to Report a transfer to a QROPS dashboard" hyperlink on "View Submitted Page"
    Then I am presented with the "Dashboard Page"
