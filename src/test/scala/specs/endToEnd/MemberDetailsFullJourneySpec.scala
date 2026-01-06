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
import org.scalatest.featurespec.AnyFeatureSpec
import uk.gov.hmrc.otc.cucumber.stepDefinitions.Hooks.{And, Then, When}

class MemberDetailsFullJourneySpec extends AnyFeatureSpec with Matchers {

  Feature("Is the members details journey fully connected") {

    Scenario("1. Full Members Journey - Member is currently UK resident") {
      Then("I navigated to the Member Name Page")
      And("I should see the heading What is the member's name?")
      When("I enter the following data into corresponding input fields on Member Name Page")
      And("I click continue button on Member Name Page")
      Then("I am presented with the Member Nino Page")
      When("I enter the following data into corresponding input fields on Member Nino Page")
      And("I click save and continue button on Member Nino Page")
      Then("I am presented with the Member Date Of Birth Page")
      When("I enter the following data into corresponding input fields on Member Date Of Birth Page")
      And("I click save and continue button on Member Date Of Birth Page")
      Then("I am presented with the Members Current Address Page")
      When("I enter the following data into corresponding input fields on Members Current Address Page")
      And("I click save and continue button on Members Current Address Page")
      Then("I am presented with the Is Member Currently UK Resident Page")
      When("I select radio button Yes on Is Member Currently UK Resident Page")
      And("I click save and continue button on Is Member Currently UK Resident Page")
      Then("I am presented with the Member Details Check Your Answers Page")
      And("I should see the following details")
      And("I click save and continue button on Member Details Check Your Answers Page")
      Then("I am presented with the Task List Page")
    }

    Scenario("2. Full Members Journey - Member is not currently or ever been UK resident") {
      Then("I navigated to the Member Name Page")
      And("I should see the heading What is the member's name?")
      When("I enter the following data into corresponding input fields on Member Name Page")
      And("I click continue button on Member Name Page")
      Then("I am presented with the Member Nino Page")
      When("I enter the following data into corresponding input fields on Member Nino Page")
      And("I click save and continue button on Member Nino Page")
      Then("I am presented with the Member Date Of Birth Page")
      When("I enter the following data into corresponding input fields on Member Date Of Birth Page")
      And("I click save and continue button on Member Date Of Birth Page")
      Then("I am presented with the Members Current Address Page")
      When("I enter the following data into corresponding input fields on Members Current Address Page")
      And("I click save and continue button on Members Current Address Page")
      Then("I am presented with the Is Member Currently UK Resident Page")
      When("I select radio button No on Is Member Currently UK Resident Page")
      And("I click save and continue button on Is Member Currently UK Resident Page")
      Then("I am presented with the Has Member Ever Been UK Resident Page")
      When("I select radio button No on Has Member Ever Been UK Resident Page")
      And("I click save and continue button on Has Member Ever Been UK Resident Page")
      Then("I am presented with the Member Details Check Your Answers Page")
      And("I should see the following details")
      And("I click save and continue button on Member Details Check Your Answers Page")
      Then("I am presented with the Task List Page")
    }

    Scenario("3. Full Members Journey - Member is not currently but has been UK resident with Address Lookup") {
      Then("I navigated to the Member Name Page")
      And("I should see the heading What is the member's name?")
      When("I enter the following data into corresponding input fields on Member Name Page")
      And("I click continue button on Member Name Page")
      Then("I am presented with the Member Nino Page")
      When("I enter the following data into corresponding input fields on Member Nino Page")
      And("I click save and continue button on Member Nino Page")
      Then("I am presented with the Member Date Of Birth Page")
      When("I enter the following data into corresponding input fields on Member Date Of Birth Page")
      And("I click save and continue button on Member Date Of Birth Page")
      Then("I am presented with the Members Current Address Page")
      When("I enter the following data into corresponding input fields on Members Current Address Page")
      And("I click save and continue button on Members Current Address Page")
      Then("I am presented with the Is Member Currently UK Resident Page")
      When("I select radio button No on Is Member Currently UK Resident Page")
      And("I click save and continue button on Is Member Currently UK Resident Page")
      Then("I am presented with the Has Member Ever Been UK Resident Page")
      When("I select radio button Yes on Has Member Ever Been UK Resident Page")
      And("I click save and continue button on Has Member Ever Been UK Resident Page")
      Then("I am presented with the Members Last UK Address Lookup Page")
      When("I enter the following data into corresponding input fields on Members Last UK Address Lookup Page")
      And("I click save and continue button on Members Last UK Address Lookup Page")
      And("I am presented with the Select Members Last UK Address Page")
      And("I select radio button 2 Other Place, Some District, ZZ1 1ZZ on Select Members Last UK Address Page")
      And("I click save and continue button on Select Members Last UK Address Page")
      And("I am presented with the Confirm Members Last UK Address Page")
      And("I click save and continue button on Confirm Members Last UK Address Page")
      And("I am presented with the Member Date Of Leaving UK Page")
      When("I enter the following data into corresponding input fields on Member Date Of Leaving UK Page")
      And("I click save and continue button on Member Date Of Leaving UK Page")
      Then("I am presented with the Member Details Check Your Answers Page")
      And("I should see the following details")
      And("I click save and continue button on Member Details Check Your Answers Page")
      Then("I am presented with the Task List Page")
    }

    Scenario("4. Full Members Journey - Member is not currently but has been UK resident with manual address entry") {
      Then("I navigated to the Member Name Page")
      And("I should see the heading What is the member's name?")
      When("I enter the following data into corresponding input fields on Member Name Page")
      And("I click continue button on Member Name Page")
      Then("I am presented with the Member Nino Page")
      When("I enter the following data into corresponding input fields on Member Nino Page")
      And("I click save and continue button on Member Nino Page")
      Then("I am presented with the Member Date Of Birth Page")
      When("I enter the following data into corresponding input fields on Member Date Of Birth Page")
      And("I click save and continue button on Member Date Of Birth Page")
      Then("I am presented with the Members Current Address Page")
      When("I enter the following data into corresponding input fields on Members Current Address Page")
      And("I click save and continue button on Members Current Address Page")
      Then("I am presented with the Is Member Currently UK Resident Page")
      When("I select radio button No on Is Member Currently UK Resident Page")
      And("I click save and continue button on Is Member Currently UK Resident Page")
      Then("I am presented with the Has Member Ever Been UK Resident Page")
      When("I select radio button Yes on Has Member Ever Been UK Resident Page")
      And("I click save and continue button on Has Member Ever Been UK Resident Page")
      Then("I am presented with the Members Last UK Address Lookup Page")
      When("I click on enter the address manually hyperlink on Members Last UK Address Lookup Page")
      And("I am presented with the Members Last UK Address Page")
      When("I enter the following data into corresponding input fields on Members Last UK Address Page")
      And("I click save and continue button on Members Last UK Address Page")
      Then("I am presented with the Member Date Of Leaving UK Page")
      When("I enter the following data into corresponding input fields on Member Date Of Leaving UK Page")
      And("I click save and continue button on Member Date Of Leaving UK Page")
      Then("I am presented with the Member Details Check Your Answers Page")
      And("I should see the following details")
      And("I click save and continue button on Member Details Check Your Answers Page")
      Then("I am presented with the Task List Page")
    }

    Scenario("5. Full Members Journey - Member is currently UK resident with no Nino") {
      Then("I navigated to the Member Name Page")
      And("I should see the heading What is the member's name?")
      When("I enter the following data into corresponding input fields on Member Name Page")
      And("I click continue button on Member Name Page")
      Then("I am presented with the Member Nino Page")
      When("I click on Member doesn't have a National Insurance number. hyperlink on Member Nino Page")
      And("I am presented with the Member Does Not Have NINO Page")
      When("I enter Individual has recently moved to the UK and has not been issued a NINO yet. in the textarea field on Member Does Not Have NINO Page")
      And("I click save and continue button on Member Does Not Have NINO Page")
      Then("I am presented with the Member Date Of Birth Page")
      When("I enter the following data into corresponding input fields on Member Date Of Birth Page")
      And("I click save and continue button on Member Date Of Birth Page")
      Then("I am presented with the Members Current Address Page")
      When("I enter the following data into corresponding input fields on Members Current Address Page")
      And("I click save and continue button on Members Current Address Page")
      Then("I am presented with the Is Member Currently UK Resident Page")
      When("I select radio button Yes on Is Member Currently UK Resident Page")
      And("I click save and continue button on Is Member Currently UK Resident Page")
      Then("I am presented with the Member Details Check Your Answers Page")
      And("I should see the following details")
      And("I click save and continue button on Member Details Check Your Answers Page")
      Then("I am presented with the Task List Page")
    }
  }
}
