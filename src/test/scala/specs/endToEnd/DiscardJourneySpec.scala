/*
 * Copyright 2026 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package specs.endToEnd

import org.scalatest.matchers.should.Matchers
import specpage.auth.AuthLoginStubPage
import specs.BaseSpec
import specs.tags.AllTests
import specsteps.BaseStepDefinitionsSteps.*

class DiscardJourneySpec extends BaseSpec with Matchers {

  Feature("Is the members discard transfer") {

    Scenario(
      "1. Discard Journey - In progress Transfer",
      AllTests
    ) {
      Given("I cleared the data for the service")
        givenIClearedTheDataForTheService()
      When ("I navigate to the Auth Login Stub Page")
        navigateToPage(AuthLoginStubPage)
      And ("I enter redirect URL on Auth Login Stub Page for Journey entry URL")
        whenIEnterRedirectURLOnAuthLoginStubPageFor("Journey entry URL")
      When ("I enter Enrollment Key HMRC-PODS-ORG, Identifier Name PSAID and Identifier Value A2100005 on Auth Login Stub Page and submit")
        whenIEnterEnrollmentKey("HMRC-PODS-ORG","PSAID","A2100005","Auth Login Stub Page")
      And ("I click submit button on Auth Login Stub Page")
        whenIClickSubmitButtonOn("Auth Login Stub Page")
      Then ("I am presented with the Dashboard page")
        thenIAmPresentedWithThe("Dashboard Page")
      And ("I click on Start new transfer hyperlink on Dashboard Page")
        whenIClickStartNewTransferLink("Dashboard Page")
      Then ("I am presented with the What You Will Need Page")
        thenIAmPresentedWithThe("What You Will Need Page")
      And ("I click save and continue button on What You Will Need Page")
        whenIClickSaveAndContinueButtonOn("What You Will Need Page")
      Then ("I am presented with the Task List Page")
        thenIAmPresentedWithThe("Task List Page")
      When("I click on Add details about the member hyperlink on Task List Page")
        whenIClickStartMemberDetailsLink("Task List Page")
      Then("I am presented with the Member's Name Page")
        thenIAmPresentedWithThe("Member Name Page")
      When("I enter the following data into corresponding input fields on Member Name Page")
        Ienterthefollowingdataintocorrespondinginputfieldson(
          Map("firstName" -> "Humpty","lastName" -> "Dumpty")
        )
      When("I click continue button on Member Name Page")
        whenIClickSaveAndContinueButtonOn("Member Name Page")
      When("I click the return to Task List link")
        whenIClickOnReturnToTaskListLink()
      Then("I am presented with the Task List Page")
        thenIAmPresentedWithThe("Task List Page")
      When("I click on the Discard transfer report link")
        whenIClickDiscardTransferReportsLink("Task List Page")
      Then("I am presented with the Discard Confirmation Page")
        thenIAmPresentedWithThe("Discard Confirmation Page")
      When("I select radio button No on Discard Confirmation Page")
        whenISelectRadioButtonOn("No" , "Discard Confirmation Page")
      And ("I click save and continue button on Discard Confirmation Page")
        whenIClickSaveAndContinueButtonOn("Discard Confirmation Page")
      Then ("I am presented with the Task List Page")
        thenIAmPresentedWithThe("Task List Page")
      When("I click on the Discard transfer report link")
        whenIClickDiscardTransferReportsLink("Task List Page")
      Then("I am presented with the Discard Confirmation Page")
        thenIAmPresentedWithThe("Discard Confirmation Page")
      When("I select radio button Yes on Discard Confirmation Page")
        whenISelectRadioButtonOn("Yes" , "Discard Confirmation Page")
      And ("I click save and continue button on Discard Confirmation Page")
        whenIClickSaveAndContinueButtonOn("Discard Confirmation Page")
      Then ("I am presented with the Dashboard page")
        thenIAmPresentedWithThe("Dashboard Page")
    }

    Scenario(
      "2. Discard Journey - Amend Transfer",
      AllTests
    ) {
      Given("I cleared the data for the service")
        givenIClearedTheDataForTheService()
      When ("I navigate to the Auth Login Stub Page")
        navigateToPage(AuthLoginStubPage)
      And ("I enter redirect URL on Auth Login Stub Page for Journey entry URL")
        whenIEnterRedirectURLOnAuthLoginStubPageFor("Journey entry URL")
      When ("I enter Enrollment Key HMRC-PODS-ORG, Identifier Name PSAID and Identifier Value A2100005 on Auth Login Stub Page and submit")
        whenIEnterEnrollmentKey("HMRC-PODS-ORG","PSAID","A2100005","Auth Login Stub Page")
      And ("I click submit button on Auth Login Stub Page")
        whenIClickSubmitButtonOn("Auth Login Stub Page")
      Then ("I am presented with the Dashboard page")
        thenIAmPresentedWithThe("Dashboard Page")
      And("I click on Member Name hyperlink on Dashboard Page")
        whenIClickOnMemberNameLink("Dashboard Page")
      Then("I am presented with the Submitted Transfer Summary Page")
        thenIAmPresentedWithThe("Submitted Transfer Summary Page")
      When("I click on view-amend button on Submitted Transfer Summary Page")
        whenIClickOnViewAmendLink("Submitted Transfer Summary Page")
      Then("I am presented with the View Amend Page")
        thenIAmPresentedWithThe("View Amend Page")
      When("I select radio button Amend this QROPS transfer report on View Amend Page")
        whenISelectRadioButtonOn("Amend this QROPS transfer report","View Amend Page")
      And("I click save and continue button on View Amend Page")
        whenIClickSaveAndContinueButtonOn("View Amend Page")
      Then("I am presented with the Amend Submitted Transfer Page")
        thenIAmPresentedWithThe("Amend Submitted Transfer Page")
      When("I click on amend-change-members-current-address button on Amend Submitted Transfer Page")
        whenIClickOnButtonOn("amend-change-members-current-address")
      Then("I am presented with the Amend Change Member Current Address Page")
        thenIAmPresentedWithThe("Amend Change Member Current Address Page")
      And("I enter the following data into corresponding input fields on Amend Change Member Current Address Page")
        Ienterthefollowingdataintocorrespondinginputfieldson (
          Map("addressLine1" -> "78 Queensway Crescent")
        )
      And("I click save and continue button on Amend Change Member Current Address Page")
        whenIClickSaveAndContinueButtonOn("Amend Change Member Current Address Page")
      Then("I am presented with the Amend Submitted Transfer Page")
        thenIAmPresentedWithThe("Amend Submitted Transfer Page")
      When("I click on Discard Amendment hyperlink on Amend Submitted Transfer Page")
        whenIClickDiscardAmendmentLink("Amend Submitted Transfer Page")
      Then("I am presented with the Discard Amend Confirmation Page")
        thenIAmPresentedWithThe("Discard Amend Confirmation Page")
      When("I select radio button No on Discard Amend Confirmation Page")
        whenISelectRadioButtonOn("No" , "Discard Amend Confirmation Page")
      And ("I click save and continue button on Discard Amend Confirmation Page")
        whenIClickSaveAndContinueButtonOn("Discard Amend Confirmation Page")
      Then("I am presented with the Amend Submitted Transfer Page")
        thenIAmPresentedWithThe("Amend Submitted Transfer Page")
      When("I click on Discard Amendment hyperlink on Amend Submitted Transfer Page")
        whenIClickDiscardAmendmentLink("Amend Submitted Transfer Page")
      Then("I am presented with the Discard Amend Confirmation Page")
        thenIAmPresentedWithThe("Discard Amend Confirmation Page")
      When("I select radio button Yes on Discard Amend Confirmation Page")
        whenISelectRadioButtonOn("Yes" , "Discard Amend Confirmation Page")
      And ("I click save and continue button on Discard Amend Confirmation Page")
        whenIClickSaveAndContinueButtonOn("Discard Amend Confirmation Page")
      Then ("I am presented with the Dashboard page")
        thenIAmPresentedWithThe("Dashboard Page")
    }
  }
}
