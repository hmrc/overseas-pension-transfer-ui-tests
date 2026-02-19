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

/*
 * Copyright 2025 HM Revenue & Customs
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

import org.scalatest.matchers.should.Matchers
import specpage.auth.AuthLoginStubPage
import specs.BaseSpec
import specs.tags.{AllTests, WIP}
import specsteps.BaseStepDefinitionsSteps._

class AmendJourneySpec extends BaseSpec with Matchers {

  Feature("Is the members details journey fully connected") {

    Scenario(
      "1. Amend Journey - Change member,transfer,QROPS and schemeManager details",
      AllTests,
      WIP
      )
    {
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
      whenIClickOnButtonOn("amend-change-members-current-address","Amend Submitted Transfer Page")

      Then("I am presented with the Amend Change Member Current Address Page")
      thenIAmPresentedWithThe("Amend Change Member Current Address Page")

      And("I enter the following data into corresponding input fields on Amend Change Member Current Address Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Amend Change Member Current Address Page",
        Map("addressLine1" -> "78 Queensway Crescent"))

      And("I click save and continue button on Amend Change Member Current Address Page")
      whenIClickSaveAndContinueButtonOn("Amend Change Member Current Address Page")

      Then("I am presented with the Amend Submitted Transfer Page")
      thenIAmPresentedWithThe("Amend Submitted Transfer Page")

      When("I click on amend-change-amount-of-transfer button on Amend Submitted Transfer Page")
      whenIClickOnButtonOn("amend-change-amount-of-transfer","Amend Submitted Transfer Page")

      Then("I am presented with the Amend Change Amount Of Transfer Page")
      thenIAmPresentedWithThe("Amend Change Amount Of Transfer Page")

      When("I enter the following data into corresponding input fields on Amend Change Amount Of Transfer Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Amend Change Amount Of Transfer Page",
        Map("value" -> "50000"))

      And("I click save and continue button on Amend Change Amount Of Transfer Page")
      whenIClickSaveAndContinueButtonOn("Amend Change Amount Of Transfer Page")

      Then("I am presented with the Amend Submitted Transfer Page")
      thenIAmPresentedWithThe("Amend Submitted Transfer Page")

      When("I click on amend-change-qrops-reference button on Amend Submitted Transfer Page")
      whenIClickOnButtonOn("amend-change-qrops-reference","Amend Submitted Transfer Page")

      Then("I am presented with the Amend Change QROPS Reference Page")
      thenIAmPresentedWithThe("Amend Change QROPS Reference Page")

      When("I enter the following data into corresponding input fields on Amend Change QROPS Reference Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Amend Change QROPS Reference Page",
        Map("qropsRef" -> "QROPS123456"))

      And("I click save and continue button on Amend Change QROPS Reference Page")
      whenIClickSaveAndContinueButtonOn("Amend Change QROPS Reference Page")

      Then("I am presented with the Amend Submitted Transfer Page")
      thenIAmPresentedWithThe("Amend Submitted Transfer Page")

      When("I click on amend-change-scheme-managers-name button on Amend Submitted Transfer Page")
      whenIClickOnButtonOn("amend-change-scheme-managers-name","Amend Submitted Transfer Page")

      Then("I am presented with the Amend Change Scheme Managers Name Page")
      thenIAmPresentedWithThe("Amend Change Scheme Managers Name Page")

      When("I enter the following data into corresponding input fields on Amend Change Scheme Managers Name Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Amend Change Scheme Managers Name Page",
        Map("schemeManagersFirstName" -> "Humpty","schemeManagersLastName" -> "Dumpty"))

      And("I click save and continue button on Amend Change Scheme Managers Name Page")
      whenIClickSaveAndContinueButtonOn("Amend Change Scheme Managers Name Page")

      Then("I am presented with the Amend Submitted Transfer Page")
      thenIAmPresentedWithThe("Amend Submitted Transfer Page")

      And("I click save and continue button on Amend Submitted Transfer Page")
      whenIClickSaveAndContinueButtonOn("Amend Submitted Transfer Page")

      Then("I am presented with the Submit Amendment Page")
      thenIAmPresentedWithThe("Submit Amendment Page")

      When("I select radio button Yes on Submit Amendment Page")
      whenISelectRadioButtonOn("Yes","Submit Amendment Page")

      And("I click save and continue button on Submit Amendment Page")
      whenIClickSaveAndContinueButtonOn("Submit Amendment Page")

      Then("I am presented with the Amend Declaration Page")
      thenIAmPresentedWithThe("Amend Declaration Page")

      And("I click agree and submit button on Amend Declaration Page")
      whenIClickAgreeAndSubmitButtonOn("Amend Declaration Page")

      Then("I am presented with the Transfer Submission Page")
      thenIAmPresentedWithThe("Transfer Submission Page")


    }
  }
}
