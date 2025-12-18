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

class SchemeManagerDetailsFullJourneySpec extends AnyFeatureSpec with Matchers {

  Feature("Is the members details journey fully connected") {

    Scenario("1. Full Scheme Manager Details Journey - Individual") {
      And("I navigated to the Scheme Manager Type Page")
      Then("I am presented with the Scheme Manager Type Page")
      When("I select radio button Individual on Scheme Manager Type Page")
      And("I click save and continue button on Scheme Manager Type Page")
      Then("I am presented with the Scheme Manager Name Page")
      When("I enter the following data into corresponding input fields on Scheme Manager Name Page")
      And("I click save and continue button on Scheme Manager Name Page")
      Then("I am presented with the Scheme Manager Address Page")
      When("I enter the following data into corresponding input fields on Scheme Manager Address Page")
      And("I click save and continue button on Scheme Manager Address Page")
      Then("I am presented with the Scheme Manager Email Page")
      When("I enter the following data into corresponding input fields on Scheme Manager Email Page")
      And("I click save and continue button on Scheme Manager Email Page")
      Then("I am presented with the Scheme Manager Telephone Page")
      When("I enter the following data into corresponding input fields on Scheme Manager Telephone Page")
      And("I click save and continue button on Scheme Manager Telephone Page")
      Then("I am presented with the Scheme Manager Check Your Answer Page")
      And("I should see the following details")
      And("I click save and continue button on Scheme Manager Check Your Answer Page")
      Then("I am presented with the Task List Page")
    }

    Scenario("2. Full Scheme Manager Details Journey - Organisation") {
      And("I navigated to the Scheme Manager Type Page")
      Then("I am presented with the Scheme Manager Type Page")
      When("I select radio button Organisation on Scheme Manager Type Page")
      And("I click save and continue button on Scheme Manager Type Page")
      Then("I am presented with the Organisation Name Page")
      When("I enter the following data into corresponding input fields on Organisation Name Page")
      And("I click save and continue button on Organisation Name Page")
      Then("I am presented with the Organisation Individual Name Page")
      When("I enter the following data into corresponding input fields on Organisation Individual Name Page")
      And("I click save and continue button on Scheme Manager Name Page")
      Then("I am presented with the Scheme Manager Address Page")
      When("I enter the following data into corresponding input fields on Scheme Manager Address Page")
      And("I click save and continue button on Scheme Manager Address Page")
      Then("I am presented with the Scheme Manager Email Page")
      When("I enter the following data into corresponding input fields on Scheme Manager Email Page")
      And("I click save and continue button on Scheme Manager Email Page")
      Then("I am presented with the Scheme Manager Telephone Page")
      When("I enter the following data into corresponding input fields on Scheme Manager Telephone Page")
      And("I click save and continue button on Scheme Manager Telephone Page")
      Then("I am presented with the Scheme Manager Check Your Answer Page")
      And("I should see the following details")
      And("I click save and continue button on Scheme Manager Check Your Answer Page")
      Then("I am presented with the Task List Page")
    }

    Scenario("3. Full Scheme Manager Details Journey - Organisation - CYA routing") {
      And("I navigated to the Scheme Manager Type Page")
      Then("I am presented with the Scheme Manager Type Page")
      When("I select radio button Organisation on Scheme Manager Type Page")
      And("I click save and continue button on Scheme Manager Type Page")
      Then("I am presented with the Organisation Name Page")
      When("I enter the following data into corresponding input fields on Organisation Name Page")
      And("I click save and continue button on Organisation Name Page")
      Then("I am presented with the Organisation Individual Name Page")
      When("I enter the following data into corresponding input fields on Organisation Individual Name Page")
      And("I click save and continue button on Scheme Manager Name Page")
      Then("I am presented with the Scheme Manager Address Page")
      When("I enter the following data into corresponding input fields on Scheme Manager Address Page")
      And("I click save and continue button on Scheme Manager Address Page")
      Then("I am presented with the Scheme Manager Email Page")
      When("I enter the following data into corresponding input fields on Scheme Manager Email Page")
      And("I click save and continue button on Scheme Manager Email Page")
      Then("I am presented with the Scheme Manager Telephone Page")
      When("I enter the following data into corresponding input fields on Scheme Manager Telephone Page")
      And("I click save and continue button on Scheme Manager Telephone Page")
      Then("I am presented with the Scheme Manager Check Your Answer Page")
      And("I should see the following details")
      When("I click on change-organisation-name button on Check Your Answers Page")
      Then("I am presented with the change Organisation Name Page")
      And("I click save and continue button on Organisation Name Page")
      Then("I am presented with the Scheme Manager Check Your Answer Page")
      When("I click on change-organisation-individual-name button on Check Your Answers Page")
      Then("I am presented with the change Organisation Individual Name Page")
      And("I click save and continue button on Organisation Individual Name Page")
      Then("I am presented with the Scheme Manager Check Your Answer Page")
      When("I click on change-scheme-managers-address button on Check Your Answers Page")
      Then("I am presented with the change Scheme Manager Address Page")
      And("I click save and continue button on Scheme Manager Address Page")
      Then("I am presented with the Scheme Manager Check Your Answer Page")
      When("I click on change-scheme-managers-email button on Check Your Answers Page")
      Then("I am presented with the change Scheme Manager Email Page")
      And("I click save and continue button on Scheme Manager Email Page")
      Then("I am presented with the Scheme Manager Check Your Answer Page")
      And("I click save and continue button on Scheme Manager Check Your Answer Page")
      Then("I am presented with the Task List Page")
    }
  }
}
