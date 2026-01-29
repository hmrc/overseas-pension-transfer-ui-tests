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
import specs.BaseSpec
import specs.tags.AllTests
import specsteps.BaseStepDefinitionsSteps.{Ienterthefollowingdataintocorrespondinginputfieldson, andINavigatedToThe, andIShouldSeeTheFollowingDetails, andIShouldSeeTheHeadingX, givenIClearedTheDataForTheService, thenIAmPresentedWithThe, whenIClickSaveAndContinueButtonOn}

class QROPSDetailsFullJourneySpec extends BaseSpec with Matchers {

  Feature("Is the members details journey fully connected") {

    Scenario(
      "1. Full QROPS Details - Valid country Selected" ,
      AllTests

    ) {
      Given("I cleared the data for the service")
      givenIClearedTheDataForTheService()

      When ("I navigate to the Auth Login Stub Page")
      andINavigatedToThe("Auth Login Stub Page")

      And ("I enter redirect URL on Auth Login Stub Page for Journey entry URL")
      When ("I enter Enrollment Key HMRC-PODS-ORG, Identifier Name PSAID and Identifier Value A2100005 on Auth Login Stub Page")
      And ("I click submit button on Auth Login Stub Page")
      Then ("I am presented with the Dashboard page")
      //And I click on "Start new transfer" hyperlink on "Dashboard Page"
      //Then I am presented with the "What You Will Need Page"
      //And I click save and continue button on "What You Will Need Page"
      //Then I am presented with the "Task List Page"
//      When("I navigated to the QROPS Name Page")
//      andINavigatedToThe("QROPS Name Page")
//        // ⚠️ No step-def match found for: I navigated to the QROPS Name Page
//
//      And("I should see the heading What is the full name of the QROPS receiving the transfer?")
//      andIShouldSeeTheHeadingX("What is the full name of the QROPS receiving the transfer?")
//
//      When("I enter the following data into corresponding input fields on QROPS Name Page")
//      Ienterthefollowingdataintocorrespondinginputfieldson("QROPS Name Page",
//        Map("qropsName" -> "The great QROPS"))
//
//      And("I click save and continue button on QROPS Name Page")
//      whenIClickSaveAndContinueButtonOn("QROPS Name Page")
//
//      Then("I am presented with the QROPS Reference Page")
//      thenIAmPresentedWithThe("QROPS Reference Page")
//
//      When("I enter the following data into corresponding input fields on QROPS Reference Page")
//      Ienterthefollowingdataintocorrespondinginputfieldson("QROPS Reference Page",
//        Map("qropsRef" -> "QROPS123456"))
//
//      And("I click save and continue button on QROPS Reference Page")
//      whenIClickSaveAndContinueButtonOn("QROPS Reference Page")
//
//      Then("I am presented with the QROPS Address Page")
//      thenIAmPresentedWithThe("QROPS Address Page")
//
//      When("I enter the following data into corresponding input fields on QROPS Address Page")
//      Ienterthefollowingdataintocorrespondinginputfieldson("QROPS Reference Page",
//        Map("addressLine1" -> "21 Rosewood Close"))
//
//      And("I click save and continue button on QROPS Address Page")
//      whenIClickSaveAndContinueButtonOn("QROPS Reference Page")
//
//      Then("I am presented with the QROPS Country Page")
//      thenIAmPresentedWithThe("QROPS Country Page")
//
//      When("I enter the following data into corresponding input fields on QROPS Country Page")
//      Ienterthefollowingdataintocorrespondinginputfieldson("QROPS Country Page",
//        Map("countryCode" -> "United Kingdom"))
//
//      And("I click save and continue button on QROPS Country Page")
//      whenIClickSaveAndContinueButtonOn("QROPS Country Page")
//
//      And("I click save and continue button on QROPS Country Page")
//      whenIClickSaveAndContinueButtonOn("QROPS Country Page")
//
//      Then("I am presented with the QROPS Check Your Answers Page")
//      thenIAmPresentedWithThe("QROPS Check Your Answers Page")
//
//      And("I should see the following details")
//        andIShouldSeeTheFollowingDetails()  // auto-chosen (score=1.00, BaseStepDefinitionsSteps.scala)
//
//      And("I click save and continue button on QROPS Check Your Answers Page")
//      whenIClickSaveAndContinueButtonOn("QROPS Check Your Answers Page")
//
//      Then("I am presented with the Task List Page")
//      thenIAmPresentedWithThe("Task List Page")
    }

    Scenario("2. Full QROPS Details - Other country selected") {

      When("I navigated to the QROPS Name Page")
      andINavigatedToThe("QROPS Name Page")
      // ⚠️ No step-def match found for: I navigated to the QROPS Name Page

      And("I should see the heading What is the full name of the QROPS receiving the transfer?")
      andIShouldSeeTheHeadingX("What is the full name of the QROPS receiving the transfer?")

      When("I enter the following data into corresponding input fields on QROPS Name Page")
      Ienterthefollowingdataintocorrespondinginputfieldson("QROPS Name Page",
        Map("qropsName" -> "The great QROPS"))

      And("I click save and continue button on QROPS Name Page")
      whenIClickSaveAndContinueButtonOn("QROPS Name Page")

      Then("I am presented with the QROPS Reference Page")
      thenIAmPresentedWithThe("QROPS Reference Page")

      When("I enter the following data into corresponding input fields on QROPS Reference Page")
      Ienterthefollowingdataintocorrespondinginputfieldson("QROPS Reference Page",
        Map("qropsRef" -> "QROPS123456"))

      And("I click save and continue button on QROPS Reference Page")
      whenIClickSaveAndContinueButtonOn("QROPS Reference Page")

      Then("I am presented with the QROPS Address Page")
      thenIAmPresentedWithThe("QROPS Address Page")

      When("I enter the following data into corresponding input fields on QROPS Address Page")
      Ienterthefollowingdataintocorrespondinginputfieldson("QROPS Reference Page",
        Map("addressLine1" -> "21 Rosewood Close"))

      And("I click save and continue button on QROPS Address Page")
      whenIClickSaveAndContinueButtonOn("QROPS Reference Page")

      Then("I am presented with the QROPS Country Page")
      thenIAmPresentedWithThe("QROPS Country Page")

      When("I enter the following data into corresponding input fields on QROPS Country Page")
      Ienterthefollowingdataintocorrespondinginputfieldson("QROPS Country Page",
        Map("countryCode" -> "Other"))

      And("I click save and continue button on QROPS Country Page")
      whenIClickSaveAndContinueButtonOn("QROPS Country Page")

      Then("I am presented with the QROPS Other Country Page")
      thenIAmPresentedWithThe("QROPS Other Country Page")

      When("I enter the following data into corresponding input fields on QROPS Other Country Page")
      Ienterthefollowingdataintocorrespondinginputfieldson("QROPS Country Page",
        Map("otherEstablishedCountry" -> "Wales"))

      And("I click save and continue button on QROPS Other Country Page")
      whenIClickSaveAndContinueButtonOn("QROPS Other Country Page")

      Then("I am presented with the QROPS Check Your Answers Page")
      thenIAmPresentedWithThe("QROPS Check Your Answers Page")

      And("I should see the following details")
      andIShouldSeeTheFollowingDetails()  // auto-chosen (score=1.00, BaseStepDefinitionsSteps.scala)

      And("I click save and continue button on QROPS Check Your Answers Page")
      whenIClickSaveAndContinueButtonOn("QROPS Check Your Answers Page")

      Then("I am presented with the Task List Page")
      thenIAmPresentedWithThe("Task List Page")
    }
  }
}
