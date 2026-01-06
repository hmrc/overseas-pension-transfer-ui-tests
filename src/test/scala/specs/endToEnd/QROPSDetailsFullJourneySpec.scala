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

class QROPSDetailsFullJourneySpec extends AnyFeatureSpec with Matchers {

  Feature("Is the members details journey fully connected") {

    Scenario("1. Full QROPS Details - Valid country Selected") {
      When("I navigated to the QROPS Name Page")
      And("I should see the heading What is the full name of the QROPS receiving the transfer?")
      And("I should see below input fields on QROPS Name Page")
      When("I enter the following data into corresponding input fields on QROPS Name Page")
      And("I click save and continue button on QROPS Name Page")
      Then("I am presented with the QROPS Reference Page")
      When("I enter the following data into corresponding input fields on QROPS Reference Page")
      And("I click save and continue button on QROPS Reference Page")
      Then("I am presented with the QROPS Address Page")
      When("I enter the following data into corresponding input fields on QROPS Address Page")
      And("I click save and continue button on QROPS Address Page")
      Then("I am presented with the QROPS Country Page")
      When("I enter the following data into corresponding input fields on QROPS Country Page")
      And("I click save and continue button on QROPS Country Page")
      And("I click save and continue button on QROPS Country Page")
      Then("I am presented with the QROPS Check Your Answers Page")
      And("I should see the following details")
      And("I click save and continue button on QROPS Check Your Answers Page")
      Then("I am presented with the Task List Page")
    }

    Scenario("2. Full QROPS Details - Other country selected") {
      When("I navigated to the QROPS Name Page")
      And("I should see the heading What is the full name of the QROPS receiving the transfer?")
      And("I should see below input fields on QROPS Name Page")
      When("I enter the following data into corresponding input fields on QROPS Name Page")
      And("I click save and continue button on QROPS Name Page")
      Then("I am presented with the QROPS Reference Page")
      When("I enter the following data into corresponding input fields on QROPS Reference Page")
      And("I click save and continue button on QROPS Reference Page")
      Then("I am presented with the QROPS Address Page")
      When("I enter the following data into corresponding input fields on QROPS Address Page")
      And("I click save and continue button on QROPS Address Page")
      Then("I am presented with the QROPS Country Page")
      When("I enter the following data into corresponding input fields on QROPS Country Page")
      And("I click save and continue button on QROPS Country Page")
      And("I click save and continue button on QROPS Country Page")
      Then("I am presented with the QROPS Other Country Page")
      When("I enter the following data into corresponding input fields on QROPS Other Country Page")
      And("I click save and continue button on QROPS Other Country Page")
      Then("I am presented with the QROPS Check Your Answers Page")
      And("I should see the following details")
      And("I click save and continue button on QROPS Check Your Answers Page")
      Then("I am presented with the Task List Page")
    }
  }
}
