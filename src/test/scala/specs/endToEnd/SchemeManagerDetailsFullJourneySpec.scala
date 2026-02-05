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

import org.scalatest.featurespec.AnyFeatureSpec
import org.scalatest.matchers.should.Matchers
import specs.BaseSpec
import specsteps.BaseStepDefinitionsSteps._

class SchemeManagerDetailsFullJourneySpec extends BaseSpec with Matchers {

  Feature("Is the members details journey fully connected") {

    Scenario("1. Full Scheme Manager Details Journey - Individual") {
      And("I navigated to the Scheme Manager Type Page")
      andINavigatedToThe("Scheme Manager Type Page")

      Then("I am presented with the Scheme Manager Type Page")
      thenIAmPresentedWithThe("Scheme Manager Type Page ")

      When("I select radio button Individual on Scheme Manager Type Page")
      whenISelectRadioButtonOn("Individual" , "Scheme Manager Type")

      And("I click save and continue button on Scheme Manager Type Page")
      whenIClickSaveAndContinueButtonOn("Scheme Manager Type Page")

      Then("I am presented with the Scheme Manager Name Page")
      thenIAmPresentedWithThe("Scheme Manager Name Page")

      When("I enter the following data into corresponding input fields on Scheme Manager Name Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Scheme Manager Name Page",
        Map("schemeManagersFirstName" -> "Emily"))

      And("I click save and continue button on Scheme Manager Name Page")
      whenIClickSaveAndContinueButtonOn("Scheme Manager Name Page")

      Then("I am presented with the Scheme Manager Address Page")
      thenIAmPresentedWithThe("Scheme Manager Address Page")

      When("I enter the following data into corresponding input fields on Scheme Manager Address Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Scheme Manager Address Page",
        Map("addressLine1" -> "88 Willow Street"))

      And("I click save and continue button on Scheme Manager Address Page")
      whenIClickSaveAndContinueButtonOn("Scheme Manager Address Page")

      Then("I am presented with the Scheme Manager Email Page")
      thenIAmPresentedWithThe("Scheme Manager Email Page")

      When("I enter the following data into corresponding input fields on Scheme Manager Email Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Scheme Manager Email Page",
        Map("emailAddress" -> "thismail@gmail.com"))

      And("I click save and continue button on Scheme Manager Email Page")
      whenIClickSaveAndContinueButtonOn("Scheme Manager Email Page")

      Then("I am presented with the Scheme Manager Telephone Page")
      thenIAmPresentedWithThe("Scheme Manager Telephone Page")

      When("I enter the following data into corresponding input fields on Scheme Manager Telephone Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Scheme Manager Telephone Page",
        Map("contactNumber" -> "+441234567890"))

      And("I click save and continue button on Scheme Manager Telephone Page")
      whenIClickSaveAndContinueButtonOn("Scheme Manager Telephone Page")

      Then("I am presented with the Scheme Manager Check Your Answer Page")
      thenIAmPresentedWithThe("Scheme Manager Check Your Answer Page")

      And("I should see the following details")
      andIShouldSeeTheFollowingDetails()  // auto-chosen (score=1.00, BaseStepDefinitionsSteps.scala)
      thenIAmPresentedWithThe("QROPS Check Your Answers Page")

      And("I click save and continue button on Scheme Manager Check Your Answer Page")
      whenIClickSaveAndContinueButtonOn("Scheme Manager Check Your Answer Page")

      Then("I am presented with the Task List Page")
      thenIAmPresentedWithThe("Task List Page")


    }

    Scenario("2. Full Scheme Manager Details Journey - Organisation") {
      And("I navigated to the Scheme Manager Type Page")
      andINavigatedToThe("Scheme Manager Type Page")

      Then("I am presented with the Scheme Manager Type Page")
      thenIAmPresentedWithThe("Scheme Manager Type Page")

      When("I select radio button Organisation on Scheme Manager Type Page")
      whenISelectRadioButtonOn("Organisation" , "Scheme Manager Type")

      And("I click save and continue button on Scheme Manager Type Page")
      whenIClickSaveAndContinueButtonOn("Scheme Manager Type Page")

      Then("I am presented with the Organisation Name Page")
      thenIAmPresentedWithThe("Organisation Name Page")

      When("I enter the following data into corresponding input fields on Organisation Name Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Organisation Name Page",
        Map("organisationName" -> "Great Organisation"))

      And("I click save and continue button on Organisation Name Page")
      whenIClickSaveAndContinueButtonOn("Organisation Name Page")

      Then("I am presented with the Organisation Individual Name Page")
      thenIAmPresentedWithThe("Organisation Individual Name Page")

      When("I enter the following data into corresponding input fields on Organisation Individual Name Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Organisation Name Page",
        Map("orgIndFirstName" -> "Sarah"))

      And("I click save and continue button on Scheme Manager Name Page")
      whenIClickSaveAndContinueButtonOn("Scheme Manager Name  Page")

      Then("I am presented with the Scheme Manager Address Page")
      thenIAmPresentedWithThe("Scheme Manager Address Page")

      When("I enter the following data into corresponding input fields on Scheme Manager Address Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Scheme Manager Address Page",
        Map("addressLine1" -> "88 Willow Street"))

      And("I click save and continue button on Scheme Manager Address Page")
      whenIClickSaveAndContinueButtonOn("Scheme Manager Address Page")

      Then("I am presented with the Scheme Manager Email Page")
      thenIAmPresentedWithThe("Scheme Manager Email Page")

      When("I enter the following data into corresponding input fields on Scheme Manager Email Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Scheme Manager Email Page",
        Map("emailAddress" -> "thismail@gmail.com"))

      And("I click save and continue button on Scheme Manager Email Page")
      whenIClickSaveAndContinueButtonOn("Scheme Manager Email Page")

      Then("I am presented with the Scheme Manager Telephone Page")
      thenIAmPresentedWithThe("Scheme Manager Telephone Page")

      When("I enter the following data into corresponding input fields on Scheme Manager Telephone Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Scheme Manager Telephone Page",
        Map("contactNumber" -> "+441234567890"))

      And("I click save and continue button on Scheme Manager Telephone Page")
      whenIClickSaveAndContinueButtonOn("Scheme Manager Telephone Page")

      Then("I am presented with the Scheme Manager Check Your Answer Page")
      thenIAmPresentedWithThe("Scheme Manager Check Your Answer Page")

      And("I should see the following details")
      andIShouldSeeTheFollowingDetails()  // auto-chosen (score=1.00, BaseStepDefinitionsSteps.scala)
      thenIAmPresentedWithThe("QROPS Check Your Answers Page")

      And("I click save and continue button on Scheme Manager Check Your Answer Page")
      whenIClickSaveAndContinueButtonOn("Scheme Manager Check Your Answer Page")

      Then("I am presented with the Task List Page")
      thenIAmPresentedWithThe("Task List Page")

    }

    Scenario("3. Full Scheme Manager Details Journey - Organisation - CYA routing") {
      And("I navigated to the Scheme Manager Type Page")
      andINavigatedToThe("Scheme Manager Type Page")

      Then("I am presented with the Scheme Manager Type Page")
      thenIAmPresentedWithThe("Scheme Manager Type Page")

      When("I select radio button Organisation on Scheme Manager Type Page")
      whenISelectRadioButtonOn("Organisation" , "Scheme Manager Type")

      And("I click save and continue button on Scheme Manager Type Page")
      whenIClickSaveAndContinueButtonOn("Scheme Manager Type Page")

      Then("I am presented with the Organisation Name Page")
      thenIAmPresentedWithThe("Organisation Name Page")

      When("I enter the following data into corresponding input fields on Organisation Name Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Organisation Name Page",
        Map("organisationName" -> "Great Organisation"))

      And("I click save and continue button on Organisation Name Page")
      whenIClickSaveAndContinueButtonOn("Organisation Name Page")

      Then("I am presented with the Organisation Individual Name Page")
      thenIAmPresentedWithThe("Organisation Individual Name Page")

      When("I enter the following data into corresponding input fields on Organisation Individual Name Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Organisation Name Page",
        Map("orgIndFirstName" -> "Sarah"))

      And("I click save and continue button on Scheme Manager Name Page")
      whenIClickSaveAndContinueButtonOn("Scheme Manager Name  Page")

      Then("I am presented with the Scheme Manager Address Page")
      thenIAmPresentedWithThe("Scheme Manager Address Page")

      When("I enter the following data into corresponding input fields on Scheme Manager Address Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Scheme Manager Address Page",
        Map("addressLine1" -> "88 Willow Street"))

      And("I click save and continue button on Scheme Manager Address Page")
      whenIClickSaveAndContinueButtonOn("Scheme Manager Address Page")

      Then("I am presented with the Scheme Manager Email Page")
      thenIAmPresentedWithThe("Scheme Manager Email Page")

      When("I enter the following data into corresponding input fields on Scheme Manager Email Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Scheme Manager Email Page",
        Map("emailAddress" -> "thismail@gmail.com"))

      And("I click save and continue button on Scheme Manager Email Page")
      whenIClickSaveAndContinueButtonOn("Scheme Manager Email Page")

      Then("I am presented with the Scheme Manager Telephone Page")
      thenIAmPresentedWithThe("Scheme Manager Telephone Page")

      When("I enter the following data into corresponding input fields on Scheme Manager Telephone Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Scheme Manager Telephone Page",
        Map("contactNumber" -> "+441234567890"))

      And("I click save and continue button on Scheme Manager Telephone Page")
      whenIClickSaveAndContinueButtonOn("Scheme Manager Telephone Page")

      Then("I am presented with the Scheme Manager Check Your Answer Page")
      thenIAmPresentedWithThe("Scheme Manager Check Your Answer Page")

      And("I should see the following details")
      andIShouldSeeTheFollowingDetails()  // auto-chosen (score=1.00, BaseStepDefinitionsSteps.scala)

      When("I click on change-organisation-name button on Check Your Answers Page")
      whenIClickOnButtonOn("change-organisation-name","Check Your Answers Page")

      Then("I am presented with the change Organisation Name Page")
      thenIAmPresentedWithThe("change Organisation Name")

      When("I enter the following data into corresponding input fields on change Organisation Name Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("change Organisation Name Page",
        Map("organisationName" -> "Great Organisation changed"))

      And("I click save and continue button on Organisation Name Page")
      whenIClickSaveAndContinueButtonOn("Organisation Name Page")

      Then("I am presented with the Scheme Manager Check Your Answer Page")
      thenIAmPresentedWithThe("Scheme Manager Check Your Answer Page")

      When("I click on change-scheme-managers-address button on Check Your Answers Page")
      whenIClickOnButtonOn("change-scheme-managers-address","Check Your Answers Page")

      Then("I am presented with the change Scheme Manager Address Page")
      thenIAmPresentedWithThe("Scheme Manager Address Page")

      And("I click save and continue button on Scheme Manager Address Page")
      whenIClickSaveAndContinueButtonOn("Scheme Manager Address Page")

      Then("I am presented with the Scheme Manager Check Your Answer Page")
      thenIAmPresentedWithThe("Scheme Manager Check Your Answer Page")

      When("I click on change-scheme-managers-email button on Check Your Answers Page")
      whenIClickOnButtonOn("change-scheme-managers-email","Check Your Answers Page")

      Then("I am presented with the change Scheme Manager Email Page")
      thenIAmPresentedWithThe("Scheme Manager Email Page")

      When("I enter the following data into corresponding input fields on Scheme Manager EmailPage")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Scheme Manager EmailPage",
        Map("email" -> "changed@email.com"))

      And("I click save and continue button on Scheme Manager Email Page")
      whenIClickSaveAndContinueButtonOn("Scheme Manager EmailPage")

      Then("I am presented with the Scheme Manager Check Your Answer Page")
      thenIAmPresentedWithThe("Scheme Manager Check Your Answer Page")

      And("I click save and continue button on Scheme Manager Check Your Answer Page")
      whenIClickSaveAndContinueButtonOn("Scheme Manager Check Your Answer Page")

      Then("I am presented with the Task List Page")
      thenIAmPresentedWithThe("Task List Page")
    }
  }
}
