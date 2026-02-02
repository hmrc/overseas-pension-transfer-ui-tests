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
import specsteps.BaseStepDefinitionsSteps._
import uk.gov.hmrc.otc.cucumber.stepDefinitions.Hooks.{And, Then, When}

class MemberDetailsFullJourneySpec extends AnyFeatureSpec with Matchers {

  Feature("Is the members details journey fully connected") {

    Scenario("1. Full Members Journey - Member is currently UK resident") {
      Then("I navigated to the Member Name Page")
      andINavigatedToThe("Member Name Page")

      And("I should see the heading What is the member's name?")
        andIShouldSeeTheHeadingX("What is the member's name?")  // auto-chosen (score=0.88, BaseStepDefinitionsSteps.scala)

      When("I enter the following data into corresponding input fields on Member Name Page")
      Ienterthefollowingdataintocorrespondinginputfieldson("Member Name Page",
        Map("firstName" -> "John"))

      And("I click continue button on Member Name Page")
      whenIClickContinueButtonOn("Member Name Page")

      Then("I am presented with the Member Nino Page")
      thenIAmPresentedWithThe("Member Nino Page")

      When("I enter the following data into corresponding input fields on Member Nino Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Member Nino Page",
        Map("value" -> "QQ987654B"))

      And("I click save and continue button on Member Nino Page")
      whenIClickSaveAndContinueButtonOn("Member Nino Page")

      Then("I am presented with the Member Date Of Birth Page")
      thenIAmPresentedWithThe("Member Date Of Birth Page")

      When("I enter the following data into corresponding input fields on Member Date Of Birth Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Member Date Of Birth Page",
        Map("day" -> "14"))

      And("I click save and continue button on Member Date Of Birth Page")
      whenIClickSaveAndContinueButtonOn("Member Date Of Birth Page")

      Then("I am presented with the Members Current Address Page")
      thenIAmPresentedWithThe("Members Current Address Page")

      When("I enter the following data into corresponding input fields on Members Current Address Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Members Current Address Page",
        Map("day" -> "14"))

      And("I click save and continue button on Members Current Address Page")
      whenIClickSaveAndContinueButtonOn("Members Current Address Page")

      Then("I am presented with the Is Member Currently UK Resident Page")
      thenIAmPresentedWithThe("Is Member Currently UK Resident Page")

      When("I select radio button Yes on Is Member Currently UK Resident Page")
      whenISelectRadioButtonOn("Yes" , "Is Member Currently UK Resident")

      And("I click save and continue button on Is Member Currently UK Resident Page")
      whenIClickSaveAndContinueButtonOn("Is Member Currently UK Resident Page")

      Then("I am presented with the Member Details Check Your Answers Page")
      thenIAmPresentedWithThe("Member Details Check Your Answers Page")

      And("I should see the following details")
        andIShouldSeeTheFollowingDetails()  // auto-chosen (score=1.00, BaseStepDefinitionsSteps.scala)

      And("I click save and continue button on Member Details Check Your Answers Page")
      whenIClickSaveAndContinueButtonOn("Member Details Check Your Answers Page")

      Then("I am presented with the Task List Page")
      thenIAmPresentedWithThe("Task List Page")

    }

    Scenario("2. Full Members Journey - Member is not currently or ever been UK resident") {
      Then("I navigated to the Member Name Page")
      andINavigatedToThe("Member Name Page")

      And("I should see the heading What is the member's name?")
      andIShouldSeeTheHeadingX("What is the member's name?")  // auto-chosen (score=0.88, BaseStepDefinitionsSteps.scala)

      When("I enter the following data into corresponding input fields on Member Name Page")
      Ienterthefollowingdataintocorrespondinginputfieldson("Member Name Page",
        Map("firstName" -> "Sarah"))

      And("I click continue button on Member Name Page")
      whenIClickContinueButtonOn("Member Name Page")

      Then("I am presented with the Member Nino Page")
      thenIAmPresentedWithThe("Member Nino Page")

      When("I enter the following data into corresponding input fields on Member Nino Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Member Nino Page",
        Map("value" -> "QQ987654B"))

      And("I click save and continue button on Member Nino Page")
      whenIClickSaveAndContinueButtonOn("Member Nino Page")

      Then("I am presented with the Member Date Of Birth Page")
      thenIAmPresentedWithThe("Member Date Of Birth Page")

      When("I enter the following data into corresponding input fields on Member Date Of Birth Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Member Date Of Birth Page",
        Map("day" -> "14"))

      And("I click save and continue button on Member Date Of Birth Page")
      whenIClickSaveAndContinueButtonOn("Member Date Of Birth Page")

      Then("I am presented with the Members Current Address Page")
      thenIAmPresentedWithThe("Members Current Address Page")

      When("I enter the following data into corresponding input fields on Members Current Address Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Members Current Address Page",
        Map("day" -> "14"))

      And("I click save and continue button on Members Current Address Page")
      whenIClickSaveAndContinueButtonOn("Members Current Address Page")

      Then("I am presented with the Is Member Currently UK Resident Page")
      thenIAmPresentedWithThe("Is Member Currently UK Resident Page")

      When("I select radio button No on Is Member Currently UK Resident Page")
      whenISelectRadioButtonOn("No" , "Is Member Currently UK Resident")

      And("I click save and continue button on Is Member Currently UK Resident Page")
      whenIClickSaveAndContinueButtonOn("Is Member Currently UK Resident Page")

      Then("I am presented with the Has Member Ever Been UK Resident Page")
      thenIAmPresentedWithThe("Has Member Ever Been UK Resident Page")

      When("I select radio button No on Has Member Ever Been UK Resident Page")
      whenISelectRadioButtonOn("No" , "Has Member Ever Been UK Resident Page")

      And("I click save and continue button on Has Member Ever Been UK Resident Page")
      whenIClickSaveAndContinueButtonOn("Has Member Ever Been UK Resident Page")

      Then("I am presented with the Member Details Check Your Answers Page")
      thenIAmPresentedWithThe("Member Details Check Your Answers Page")

      And("I should see the following details")
        andIShouldSeeTheFollowingDetails()  // auto-chosen (score=1.00, BaseStepDefinitionsSteps.scala)

      And("I click save and continue button on Member Details Check Your Answers Page")
      whenIClickSaveAndContinueButtonOn("Member Details Check Your Answers Page")

      Then("I am presented with the Task List Page")
      thenIAmPresentedWithThe("Member Details Check Your Answers Page")
    }

    Scenario("3. Full Members Journey - Member is not currently but has been UK resident with manual address entry") {
      Then("I navigated to the Member Name Page")
      andINavigatedToThe("Member Name Page")

      And("I should see the heading What is the member's name?")
      andIShouldSeeTheHeadingX("What is the member's name?")  // auto-chosen (score=0.88, BaseStepDefinitionsSteps.scala)

      When("I enter the following data into corresponding input fields on Member Name Page")
      Ienterthefollowingdataintocorrespondinginputfieldson("Member Name Page",
        Map("firstName" -> "Sarah"))

      And("I click continue button on Member Name Page")
      whenIClickContinueButtonOn("Member Name Page")

      Then("I am presented with the Member Nino Page")
      thenIAmPresentedWithThe("Member Nino Page")

      When("I enter the following data into corresponding input fields on Member Nino Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Member Nino Page",
        Map("value" -> "QQ987654B"))

      And("I click save and continue button on Member Nino Page")
      whenIClickSaveAndContinueButtonOn("Member Nino Page")

      Then("I am presented with the Member Date Of Birth Page")
      thenIAmPresentedWithThe("Member Date Of Birth Page")

      When("I enter the following data into corresponding input fields on Member Date Of Birth Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Member Date Of Birth Page",
        Map("day" -> "14"))

      And("I click save and continue button on Member Date Of Birth Page")
      whenIClickSaveAndContinueButtonOn("Member Date Of Birth Page")

      Then("I am presented with the Members Current Address Page")
      thenIAmPresentedWithThe("Members Current Address Page")

      When("I enter the following data into corresponding input fields on Members Current Address Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Members Current Address Page",
        Map("day" -> "14"))

      And("I click save and continue button on Members Current Address Page")
      whenIClickSaveAndContinueButtonOn("Members Current Address Page")

      Then("I am presented with the Is Member Currently UK Resident Page")
      thenIAmPresentedWithThe("Is Member Currently UK Resident Page")

      When("I select radio button No on Is Member Currently UK Resident Page")
      whenISelectRadioButtonOn("No" , "Is Member Currently UK Resident")

      And("I click save and continue button on Is Member Currently UK Resident Page")
      whenIClickSaveAndContinueButtonOn("Is Member Currently UK Resident Page")

      Then("I am presented with the Has Member Ever Been UK Resident Page")
      thenIAmPresentedWithThe("Has Member Ever Been UK Resident Page")

      When("I select radio button Yes on Has Member Ever Been UK Resident Page")
      whenISelectRadioButtonOn("Yes" , "Has Member Ever Been UK Resident Page")

      And("I click save and continue button on Has Member Ever Been UK Resident Page")
      whenIClickSaveAndContinueButtonOn("Has Member Ever Been UK Resident Page")

      Then("I am presented with the Members Last UK Address Lookup Page")
      thenIAmPresentedWithThe("Members Last UK Address Lookup Page")

      When("I enter the following data into corresponding input fields on Members Last UK Address Lookup Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Members Last UK Address Lookup Page",
        Map("addressLine1" -> "9 Greenbank Terrace"))

      And("I click save and continue button on Members Last UK Address Lookup Page")
      whenIClickSaveAndContinueButtonOn("Members Last UK Address Lookup Page")

      And("I am presented with the Member Date Of Leaving UK Page")
      thenIAmPresentedWithThe("Members Last UK Address Lookup Page")

      When("I enter the following data into corresponding input fields on Member Date Of Leaving UK Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Members Last UK Address Lookup Page",
        Map("addressLine1" -> "9 Greenbank Terrace"))

      And("I click save and continue button on Member Date Of Leaving UK Page")
      whenIClickSaveAndContinueButtonOn("Members Last UK Address Lookup Page")

      Then("I am presented with the Member Details Check Your Answers Page")
      thenIAmPresentedWithThe("Member Details Check Your Answers Page")

      And("I should see the following details")
        andIShouldSeeTheFollowingDetails()  // auto-chosen (score=1.00, BaseStepDefinitionsSteps.scala)

      And("I click save and continue button on Member Details Check Your Answers Page")
      whenIClickSaveAndContinueButtonOn("Member Details Check Your Answers Page")

      Then("I am presented with the Task List Page")
      thenIAmPresentedWithThe("Task List Page")

    }

    Scenario("4. Full Members Journey - Member is currently UK resident with no Nino") {
      Then("I navigated to the Member Name Page")
      andINavigatedToThe("Member Name Page")

      And("I should see the heading What is the member's name?")
      andIShouldSeeTheHeadingX("What is the member's name?")  // auto-chosen (score=0.88, BaseStepDefinitionsSteps.scala)

      When("I enter the following data into corresponding input fields on Member Name Page")
      Ienterthefollowingdataintocorrespondinginputfieldson("Member Name Page",
        Map("firstName" -> "Sarah"))

      And("I click continue button on Member Name Page")
      whenIClickContinueButtonOn("Member Name Page")

      Then("I am presented with the Member Nino Page")
      thenIAmPresentedWithThe("Member Nino Page")

      When("I click on Member doesn't have a National Insurance number. hyperlink on Member Nino Page")
      whenIClickOnHyperlinkOn("Member doesn't have a National Insurance number.","Member Nino Page")

      And("I am presented with the Member Does Not Have NINO Page")
      thenIAmPresentedWithThe("Member Does Not Have NINO Page")

      When("I enter Individual has recently moved to the UK and has not been issued a NINO yet. in the textarea field on Member Does Not Have NINO Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Member Does Not Have NINO Page",
        Map("value" -> "Individual has recently moved"))

      And("I click save and continue button on Member Does Not Have NINO Page")
      whenIClickSaveAndContinueButtonOn("Member Does Not Have NINO Page")

      Then("I am presented with the Member Date Of Birth Page")
      thenIAmPresentedWithThe("Member Date Of Birth Page")

      When("I enter the following data into corresponding input fields on Member Date Of Birth Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Member Date Of Birth Page",
        Map("day" -> "14"))

      And("I click save and continue button on Member Date Of Birth Page")
      whenIClickSaveAndContinueButtonOn("Member Date Of Birth Page")

      Then("I am presented with the Members Current Address Page")
      thenIAmPresentedWithThe("Members Current Address Page")

      When("I enter the following data into corresponding input fields on Members Current Address Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Members Current Address Page",
        Map("day" -> "14"))

      And("I click save and continue button on Members Current Address Page")
      whenIClickSaveAndContinueButtonOn("Members Current Address Page")

      Then("I am presented with the Is Member Currently UK Resident Page")
      thenIAmPresentedWithThe("Is Member Currently UK Resident Page")

      When("I select radio button Yes on Is Member Currently UK Resident Page")
      whenISelectRadioButtonOn("Yes" , "Is Member Currently UK Resident")

      And("I click save and continue button on Is Member Currently UK Resident Page")
      whenIClickSaveAndContinueButtonOn("Is Member Currently UK Resident Page")

      Then("I am presented with the Member Details Check Your Answers Page")
      thenIAmPresentedWithThe("Member Details Check Your Answers Page")

      And("I should see the following details")
      andIShouldSeeTheFollowingDetails()  // auto-chosen (score=1.00, BaseStepDefinitionsSteps.scala)

      And("I click save and continue button on Member Details Check Your Answers Page")
      whenIClickSaveAndContinueButtonOn("Member Details Check Your Answers Page")

      Then("I am presented with the Task List Page")
      thenIAmPresentedWithThe("Task List Page")

    }
  }
}
