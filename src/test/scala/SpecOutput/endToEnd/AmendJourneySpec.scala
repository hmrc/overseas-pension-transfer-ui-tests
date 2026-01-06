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

class AmendJourneySpec extends AnyFeatureSpec with Matchers {

  Feature("Is the members details journey fully connected") {

    Scenario("1. Amend Journey - Change member,transfer,QROPS and schemeManager details") {
      Then("I am presented with the Dashboard Page")
        // ⚠️ No step-def match found for: I am presented with the Dashboard Page

      And("I click on Member Name hyperlink on Dashboard Page")
        // ⚠️ No step-def match found for: I click on Member Name hyperlink on Dashboard Page

      Then("I am presented with the Submitted Transfer Summary Page")
        // ⚠️ No step-def match found for: I am presented with the Submitted Transfer Summary Page

      When("I click on view-amend button on Submitted Transfer Summary Page")
        // ⚠️ No step-def match found for: I click on view-amend button on Submitted Transfer Summary Page

      Then("I am presented with the View Amend Page")
        // ⚠️ No step-def match found for: I am presented with the View Amend Page

      And("I should see two radio buttons: View this QROPS transfer report and Amend this QROPS transfer report")
        // ⚠️ No step-def match found for: I should see two radio buttons: View this QROPS transfer report and Amend this QROPS transfer report

      When("I select radio button Amend this QROPS transfer report on View Amend Page")
        // ⚠️ No step-def match found for: I select radio button Amend this QROPS transfer report on View Amend Page

      And("I click save and continue button on View Amend Page")
        // ⚠️ No step-def match found for: I click save and continue button on View Amend Page

      Then("I am presented with the Amend Submitted Transfer Page")
        // ⚠️ No step-def match found for: I am presented with the Amend Submitted Transfer Page

      When("I click on amend-change-members-current-address button on Amend Submitted Transfer Page")
        // ⚠️ No step-def match found for: I click on amend-change-members-current-address button on Amend Submitted Transfer Page

      Then("I am presented with the Amend Change Member Current Address Page")
        // ⚠️ No step-def match found for: I am presented with the Amend Change Member Current Address Page

      And("I enter the following data into corresponding input fields on Amend Change Member Current Address Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Amend Change Member Current Address Page

      And("I click save and continue button on Amend Change Member Current Address Page")
        // ⚠️ No step-def match found for: I click save and continue button on Amend Change Member Current Address Page

      Then("I am presented with the Amend Submitted Transfer Page")
        // ⚠️ No step-def match found for: I am presented with the Amend Submitted Transfer Page

      And("I should see the following values on the page")
        thenIShouldSeeTheFollowingValuesOnThePage()  // auto-chosen (score=1.00, BaseStepDefinitionsSteps.scala)

      When("I click on amend-change-amount-of-transfer button on Amend Submitted Transfer Page")
        // ⚠️ No step-def match found for: I click on amend-change-amount-of-transfer button on Amend Submitted Transfer Page

      Then("I am presented with the Amend Change Amount Of Transfer Page")
        // ⚠️ No step-def match found for: I am presented with the Amend Change Amount Of Transfer Page

      When("I enter the following data into corresponding input fields on Amend Change Amount Of Transfer Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Amend Change Amount Of Transfer Page

      And("I click save and continue button on Amend Change Amount Of Transfer Page")
        // ⚠️ No step-def match found for: I click save and continue button on Amend Change Amount Of Transfer Page

      Then("I am presented with the Amend Submitted Transfer Page")
        // ⚠️ No step-def match found for: I am presented with the Amend Submitted Transfer Page

      And("I should see the following values on the page")
        thenIShouldSeeTheFollowingValuesOnThePage()  // auto-chosen (score=1.00, BaseStepDefinitionsSteps.scala)

      When("I click on amend-change-qrops-reference button on Amend Submitted Transfer Page")
        // ⚠️ No step-def match found for: I click on amend-change-qrops-reference button on Amend Submitted Transfer Page

      Then("I am presented with the Amend Change QROPS Reference Page")
        // ⚠️ No step-def match found for: I am presented with the Amend Change QROPS Reference Page

      When("I enter the following data into corresponding input fields on Amend Change QROPS Reference Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Amend Change QROPS Reference Page

      And("I click save and continue button on Amend Change QROPS Reference Page")
        // ⚠️ No step-def match found for: I click save and continue button on Amend Change QROPS Reference Page

      Then("I am presented with the Amend Submitted Transfer Page")
        // ⚠️ No step-def match found for: I am presented with the Amend Submitted Transfer Page

      And("I should see the following values on the page")
        thenIShouldSeeTheFollowingValuesOnThePage()  // auto-chosen (score=1.00, BaseStepDefinitionsSteps.scala)

      When("I click on amend-change-scheme-managers-name button on Amend Submitted Transfer Page")
        // ⚠️ No step-def match found for: I click on amend-change-scheme-managers-name button on Amend Submitted Transfer Page

      Then("I am presented with the Amend Change Scheme Managers Name Page")
        // ⚠️ No step-def match found for: I am presented with the Amend Change Scheme Managers Name Page

      When("I enter the following data into corresponding input fields on Amend Change Scheme Managers Name Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Amend Change Scheme Managers Name Page

      And("I click save and continue button on Amend Change Scheme Managers Name Page")
        // ⚠️ No step-def match found for: I click save and continue button on Amend Change Scheme Managers Name Page

      Then("I am presented with the Amend Submitted Transfer Page")
        // ⚠️ No step-def match found for: I am presented with the Amend Submitted Transfer Page

      And("I should see the following values on the page")
        thenIShouldSeeTheFollowingValuesOnThePage()  // auto-chosen (score=1.00, BaseStepDefinitionsSteps.scala)

      And("I click save and continue button on Amend Submitted Transfer Page")
        // ⚠️ No step-def match found for: I click save and continue button on Amend Submitted Transfer Page

      Then("I am presented with the Submit Amendment Page")
        // ⚠️ No step-def match found for: I am presented with the Submit Amendment Page

      When("I select radio button Yes on Submit Amendment Page")
        // ⚠️ No step-def match found for: I select radio button Yes on Submit Amendment Page

      And("I click save and continue button on Submit Amendment Page")
        // ⚠️ No step-def match found for: I click save and continue button on Submit Amendment Page

      Then("I am presented with the Amend Declaration Page")
        // ⚠️ No step-def match found for: I am presented with the Amend Declaration Page

      And("I click agree and submit button on Amend Declaration Page")
        // ⚠️ No step-def match found for: I click agree and submit button on Amend Declaration Page

      Then("I am presented with the Transfer Submission Page")
        // ⚠️ No step-def match found for: I am presented with the Transfer Submission Page

      And("I should see the heading Transfer submitted")
        // ⚠️ No step-def match found for: I should see the heading Transfer submitted

    }
  }
}
