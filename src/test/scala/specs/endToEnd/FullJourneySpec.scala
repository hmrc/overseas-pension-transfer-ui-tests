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
import specsteps.BaseStepDefinitionsSteps.{andIShouldSeeTheFollowingDetails, andIShouldSeeTheHeadingX, thenIAmPresentedWithThe, thenIShouldSeeTheFollowingValuesOnThePage, whenIClickSaveAndContinueButtonOn}
import uk.gov.hmrc.otc.cucumber.stepDefinitions.Hooks.{And, Then, When}

class FullJourneySpec extends AnyFeatureSpec with Matchers {

  Feature("Is the members details journey fully connected") {

    Scenario("1. Full Journey - Start a new transfer") {
      Then("I am presented with the Dashboard Page")
      thenIAmPresentedWithThe("Dashboard Page")
        // ⚠️ No step-def match found for: I am presented with the Dashboard Page

      And("I click on Start new transfer hyperlink on Dashboard Page")

        // ⚠️ No step-def match found for: I click on Start new transfer hyperlink on Dashboard Page

      Then("I am presented with the What You Will Need Page")
      thenIAmPresentedWithThe("What You Will Need Page")
        // ⚠️ No step-def match found for: I am presented with the What You Will Need Page

      And("I click save and continue button on What You Will Need Page")
      whenIClickSaveAndContinueButtonOn("What You Will Need Page")
        // ⚠️ No step-def match found for: I click save and continue button on What You Will Need Page

      Then("I am presented with the Task List Page")
      thenIAmPresentedWithThe("Task List Page")
        // ⚠️ No step-def match found for: I am presented with the Task List Page

      Then("I see the status Not started yet for task Add details about the member")
        // ⚠️ No step-def match found for: I see the status Not started yet for task Add details about the member

      Then("I see the status Cannot start yet for task Add information about the transfer")
        // ⚠️ No step-def match found for: I see the status Cannot start yet for task Add information about the transfer

      Then("I see the status Cannot start yet for task Add information about the QROPS")
        // ⚠️ No step-def match found for: I see the status Cannot start yet for task Add information about the QROPS

      Then("I see the status Cannot start yet for task Add QROPS scheme manager's details")
        // ⚠️ No step-def match found for: I see the status Cannot start yet for task Add QROPS scheme manager's details

      Then("I see the status Cannot start yet for task Check your answers and submit the report")
        // ⚠️ No step-def match found for: I see the status Cannot start yet for task Check your answers and submit the report

      When("I click on Add details about the member hyperlink on Task List Page")
        // ⚠️ No step-def match found for: I click on Add details about the member hyperlink on Task List Page

      And("I should see the heading What is the member's name?")
        andIShouldSeeTheHeadingX("")  // auto-chosen (score=0.88, BaseStepDefinitionsSteps.scala)

      When("I enter the following data into corresponding input fields on Member Name Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Member Name Page

      And("I click continue button on Member Name Page")
        // ⚠️ No step-def match found for: I click continue button on Member Name Page

      Then("I am presented with the Member Nino Page")
      thenIAmPresentedWithThe("Member Nino Page")
        // ⚠️ No step-def match found for: I am presented with the Member Nino Page

      When("I enter the following data into corresponding input fields on Member Nino Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Member Nino Page

      And("I click save and continue button on Member Nino Page")
        // ⚠️ No step-def match found for: I click save and continue button on Member Nino Page

      Then("I am presented with the Member Date Of Birth Page")
      thenIAmPresentedWithThe("Member Date Of Birth Page")
        // ⚠️ No step-def match found for: I am presented with the Member Date Of Birth Page

      When("I enter the following data into corresponding input fields on Member Date Of Birth Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Member Date Of Birth Page

      And("I click save and continue button on Member Date Of Birth Page")
        // ⚠️ No step-def match found for: I click save and continue button on Member Date Of Birth Page

      Then("I am presented with the Members Current Address Page")
      thenIAmPresentedWithThe("Members Current Address Page")
        // ⚠️ No step-def match found for: I am presented with the Members Current Address Page

      When("I enter the following data into corresponding input fields on Members Current Address Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Members Current Address Page

      And("I click save and continue button on Members Current Address Page")
        // ⚠️ No step-def match found for: I click save and continue button on Members Current Address Page

      Then("I am presented with the Is Member Currently UK Resident Page")
      thenIAmPresentedWithThe("Is Member Currently UK Resident Page")
        // ⚠️ No step-def match found for: I am presented with the Is Member Currently UK Resident Page

      When("I select radio button Yes on Is Member Currently UK Resident Page")
        // ⚠️ No step-def match found for: I select radio button Yes on Is Member Currently UK Resident Page

      And("I click save and continue button on Is Member Currently UK Resident Page")
        // ⚠️ No step-def match found for: I click save and continue button on Is Member Currently UK Resident Page

      Then("I am presented with the Member Details Check Your Answers Page")
      thenIAmPresentedWithThe("Member Details Check Your Answers Page")
        // ⚠️ No step-def match found for: I am presented with the Member Details Check Your Answers Page

      And("I should see the following details")
        andIShouldSeeTheFollowingDetails()  // auto-chosen (score=1.00, BaseStepDefinitionsSteps.scala)

      And("I click save and continue button on Member Details Check Your Answers Page")
        // ⚠️ No step-def match found for: I click save and continue button on Member Details Check Your Answers Page

      Then("I am presented with the Task List Page")
      thenIAmPresentedWithThe("Task List Page")
        // ⚠️ No step-def match found for: I am presented with the Task List Page

      Then("I see the status Completed for task Add details about the member")

        // ⚠️ No step-def match found for: I see the status Completed for task Add details about the member

      Then("I see the status Not started yet for task Add information about the transfer")
        // ⚠️ No step-def match found for: I see the status Not started yet for task Add information about the transfer

      Then("I see the status Not started yet for task Add information about the QROPS")
        // ⚠️ No step-def match found for: I see the status Not started yet for task Add information about the QROPS

      Then("I see the status Not started yet for task Add QROPS scheme manager's details")
        // ⚠️ No step-def match found for: I see the status Not started yet for task Add QROPS scheme manager's details

      Then("I see the status Cannot start yet for task Check your answers and submit the report")
        // ⚠️ No step-def match found for: I see the status Cannot start yet for task Check your answers and submit the report

      When("I click on Add information about the QROPS hyperlink on Task List Page")
        // ⚠️ No step-def match found for: I click on Add information about the QROPS hyperlink on Task List Page

      And("I should see below input fields on QROPS Name Page")
        // ⚠️ No step-def match found for: I should see below input fields on QROPS Name Page

      When("I enter the following data into corresponding input fields on QROPS Name Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on QROPS Name Page

      And("I click save and continue button on QROPS Name Page")
        // ⚠️ No step-def match found for: I click save and continue button on QROPS Name Page

      Then("I am presented with the QROPS Reference Page")
      thenIAmPresentedWithThe("QROPS Reference Page")
        // ⚠️ No step-def match found for: I am presented with the QROPS Reference Page

      When("I enter the following data into corresponding input fields on QROPS Reference Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on QROPS Reference Page

      And("I click save and continue button on QROPS Reference Page")
        // ⚠️ No step-def match found for: I click save and continue button on QROPS Reference Page

      Then("I am presented with the QROPS Address Page")
      thenIAmPresentedWithThe("QROPS Address Page")
        // ⚠️ No step-def match found for: I am presented with the QROPS Address Page

      When("I enter the following data into corresponding input fields on QROPS Address Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on QROPS Address Page

      And("I click save and continue button on QROPS Address Page")
        // ⚠️ No step-def match found for: I click save and continue button on QROPS Address Page

      Then("I am presented with the QROPS Country Page")
      thenIAmPresentedWithThe("QROPS Country Page")
        // ⚠️ No step-def match found for: I am presented with the QROPS Country Page

      When("I enter the following data into corresponding input fields on QROPS Country Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on QROPS Country Page

      And("I click save and continue button on QROPS Country Page")
        // ⚠️ No step-def match found for: I click save and continue button on QROPS Country Page

      And("I click save and continue button on QROPS Country Page")
        // ⚠️ No step-def match found for: I click save and continue button on QROPS Country Page

      Then("I am presented with the QROPS Check Your Answers Page")
      thenIAmPresentedWithThe("QROPS Check Your Answers Page")
        // ⚠️ No step-def match found for: I am presented with the QROPS Check Your Answers Page

      And("I should see the following details")
      val pensionTransferDetails: Map[String, String] = Map(
        "Available transfer allowance"            -> "£400,100",
        "Transfer amount"                         -> "£400,200",
        "Is transfer taxable"                     -> "No",
        "Why transfer isn't taxable"              -> "The QROPS is an occupational pension scheme and the individual is an employee of the sponsoring employer.",
        "Date of transfer"                        -> "1 August 2013",
        "Is transfer cash only"                   -> "No",
        "Amount of cash"                          -> "£400,300",
        "Type of assets included in the transfer" -> "Cash,Unquoted shares,Quoted shares,Property,Other",
        "Unquoted shares"                         -> "1 added",
        "Quoted shares"                           -> "2 added",
        "Property"                                -> "1 added",
        "Other assets"                            -> "1 added"
      )
         // auto-chosen (score=1.00, BaseStepDefinitionsSteps.scala)

      And("I click save and continue button on QROPS Check Your Answers Page")
        // ⚠️ No step-def match found for: I click save and continue button on QROPS Check Your Answers Page

      Then("I am presented with the Task List Page")
      thenIAmPresentedWithThe("Task List Page")
        // ⚠️ No step-def match found for: I am presented with the Task List Page

      Then("I see the status Completed for task Add details about the member")
        // ⚠️ No step-def match found for: I see the status Completed for task Add details about the member

      Then("I see the status Completed for task Add information about the QROPS")
        // ⚠️ No step-def match found for: I see the status Completed for task Add information about the QROPS

      Then("I see the status Not started yet for task Add information about the transfer")
        // ⚠️ No step-def match found for: I see the status Not started yet for task Add information about the transfer

      Then("I see the status Not started yet for task Add QROPS scheme manager's details")
        // ⚠️ No step-def match found for: I see the status Not started yet for task Add QROPS scheme manager's details

      Then("I see the status Cannot start yet for task Check your answers and submit the report")
        // ⚠️ No step-def match found for: I see the status Cannot start yet for task Check your answers and submit the report

      When("I click on Add QROPS scheme manager's details hyperlink on Task List Page")
        // ⚠️ No step-def match found for: I click on Add QROPS scheme manager's details hyperlink on Task List Page

      Then("I am presented with the Scheme Manager Type Page")
      thenIAmPresentedWithThe("Scheme Manager Type Page")
        // ⚠️ No step-def match found for: I am presented with the Scheme Manager Type Page

      When("I select radio button Individual on Scheme Manager Type Page")
        // ⚠️ No step-def match found for: I select radio button Individual on Scheme Manager Type Page

      And("I click save and continue button on Scheme Manager Type Page")
        // ⚠️ No step-def match found for: I click save and continue button on Scheme Manager Type Page

      Then("I am presented with the Scheme Manager Name Page")
      thenIAmPresentedWithThe("Scheme Manager Name Page")
        // ⚠️ No step-def match found for: I am presented with the Scheme Manager Name Page

      When("I enter the following data into corresponding input fields on Scheme Manager Name Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Scheme Manager Name Page

      And("I click save and continue button on Scheme Manager Name Page")
        // ⚠️ No step-def match found for: I click save and continue button on Scheme Manager Name Page

      Then("I am presented with the Scheme Manager Address Page")
      thenIAmPresentedWithThe("Scheme Manager Address Page")
        // ⚠️ No step-def match found for: I am presented with the Scheme Manager Address Page

      When("I click on Return to complete your transfer report hyperlink on Scheme Manager Address Page")
        // ⚠️ No step-def match found for: I click on Return to complete your transfer report hyperlink on Scheme Manager Address Page

      Then("I am presented with the Task List Page")
      thenIAmPresentedWithThe("Task List Page")
        // ⚠️ No step-def match found for: I am presented with the Task List Page

      Then("I see the status Completed for task Add details about the member")
        // ⚠️ No step-def match found for: I see the status Completed for task Add details about the member

      Then("I see the status Not started yet for task Add information about the transfer")
        // ⚠️ No step-def match found for: I see the status Not started yet for task Add information about the transfer

      Then("I see the status Completed for task Add information about the QROPS")
        // ⚠️ No step-def match found for: I see the status Completed for task Add information about the QROPS

      Then("I see the status In progress for task Add QROPS scheme manager's details")
        // ⚠️ No step-def match found for: I see the status In progress for task Add QROPS scheme manager's details

      Then("I see the status Cannot start yet for task Check your answers and submit the report")
        // ⚠️ No step-def match found for: I see the status Cannot start yet for task Check your answers and submit the report

      When("I click on Add QROPS scheme manager's details hyperlink on Task List Page")
        // ⚠️ No step-def match found for: I click on Add QROPS scheme manager's details hyperlink on Task List Page

      Then("I am presented with the Scheme Manager Type Page")
      thenIAmPresentedWithThe("Scheme Manager Type Page")
        // ⚠️ No step-def match found for: I am presented with the Scheme Manager Type Page

      When("I select radio button Individual on Scheme Manager Type Page")
        // ⚠️ No step-def match found for: I select radio button Individual on Scheme Manager Type Page

      And("I click save and continue button on Scheme Manager Type Page")
        // ⚠️ No step-def match found for: I click save and continue button on Scheme Manager Type Page

      Then("I am presented with the Scheme Manager Name Page")
      thenIAmPresentedWithThe("Scheme Manager Name Page")
        // ⚠️ No step-def match found for: I am presented with the Scheme Manager Name Page

      When("I enter the following data into corresponding input fields on Scheme Manager Name Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Scheme Manager Name Page

      And("I click save and continue button on Scheme Manager Name Page")
        // ⚠️ No step-def match found for: I click save and continue button on Scheme Manager Name Page

      Then("I am presented with the Scheme Manager Address Page")
      thenIAmPresentedWithThe("Scheme Manager Page")
        // ⚠️ No step-def match found for: I am presented with the Scheme Manager Address Page

      When("I enter the following data into corresponding input fields on Scheme Manager Address Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Scheme Manager Address Page

      And("I click save and continue button on Scheme Manager Address Page")
        // ⚠️ No step-def match found for: I click save and continue button on Scheme Manager Address Page

      Then("I am presented with the Scheme Manager Email Page")
      thenIAmPresentedWithThe("Scheme Manager Email Page")
        // ⚠️ No step-def match found for: I am presented with the Scheme Manager Email Page

      When("I enter the following data into corresponding input fields on Scheme Manager Email Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Scheme Manager Email Page

      And("I click save and continue button on Scheme Manager Email Page")
        // ⚠️ No step-def match found for: I click save and continue button on Scheme Manager Email Page

      Then("I am presented with the Scheme Manager Telephone Page")
      thenIAmPresentedWithThe("Scheme Manager Telephone Page")
        // ⚠️ No step-def match found for: I am presented with the Scheme Manager Telephone Page

      When("I enter the following data into corresponding input fields on Scheme Manager Telephone Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Scheme Manager Telephone Page

      And("I click save and continue button on Scheme Manager Telephone Page")
        // ⚠️ No step-def match found for: I click save and continue button on Scheme Manager Telephone Page

      Then("I am presented with the Scheme Manager Check Your Answer Page")
      thenIAmPresentedWithThe("Scheme Manager Check Your Answer Page")
        // ⚠️ No step-def match found for: I am presented with the Scheme Manager Check Your Answer Page

      And("I should see the following details")
        andIShouldSeeTheFollowingDetails()  // auto-chosen (score=1.00, BaseStepDefinitionsSteps.scala)

      And("I click save and continue button on Scheme Manager Check Your Answer Page")
        // ⚠️ No step-def match found for: I click save and continue button on Scheme Manager Check Your Answer Page

      Then("I am presented with the Task List Page")
      thenIAmPresentedWithThe("Task List Page")
        // ⚠️ No step-def match found for: I am presented with the Task List Page

      Then("I see the status Completed for task Add details about the member")
        // ⚠️ No step-def match found for: I see the status Completed for task Add details about the member

      Then("I see the status Not started yet for task Add information about the transfer")
        // ⚠️ No step-def match found for: I see the status Not started yet for task Add information about the transfer

      Then("I see the status Completed for task Add information about the QROPS")
        // ⚠️ No step-def match found for: I see the status Completed for task Add information about the QROPS

      Then("I see the status Completed for task Add QROPS scheme manager's details")
        // ⚠️ No step-def match found for: I see the status Completed for task Add QROPS scheme manager's details

      Then("I see the status Cannot start yet for task Check your answers and submit the report")
        // ⚠️ No step-def match found for: I see the status Cannot start yet for task Check your answers and submit the report

      When("I click on Add information about the transfer hyperlink on Task List Page")
        // ⚠️ No step-def match found for: I click on Add information about the transfer hyperlink on Task List Page

      Then("I am presented with the Overseas Transfer Allowance Page")
      thenIAmPresentedWithThe("Overseas Transfer Allowance Page")
        // ⚠️ No step-def match found for: I am presented with the Overseas Transfer Allowance Page

      When("I enter the following data into corresponding input fields on Overseas Transfer Allowance Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Overseas Transfer Allowance Page

      And("I click save and continue button on Overseas Transfer Allowance Page")
        // ⚠️ No step-def match found for: I click save and continue button on Overseas Transfer Allowance Page

      Then("I am presented with the Amount Of Transfer Page")
      thenIAmPresentedWithThe("Amount of Transfer Page")
        // ⚠️ No step-def match found for: I am presented with the Amount Of Transfer Page

      When("I enter the following data into corresponding input fields on Amount Of Transfer Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Amount Of Transfer Page

      And("I click save and continue button on Amount Of Transfer Page")
        // ⚠️ No step-def match found for: I click save and continue button on Amount Of Transfer Page

      Then("I am presented with the Is Transfer Amount Taxable Page")
      thenIAmPresentedWithThe("Is Transfer Amount Taxable Page")
        // ⚠️ No step-def match found for: I am presented with the Is Transfer Amount Taxable Page

      When("I select radio button No on Is Transfer Amount Taxable Page")
        // ⚠️ No step-def match found for: I select radio button No on Is Transfer Amount Taxable Page

      And("I click save and continue button on Is Transfer Amount Taxable Page")
        // ⚠️ No step-def match found for: I click save and continue button on Is Transfer Amount Taxable Page

      Then("I am presented with the Why Transfer is not Taxable Page")
      thenIAmPresentedWithThe("Why Transfer is not Taxable Page")
        // ⚠️ No step-def match found for: I am presented with the Why Transfer is not Taxable Page

      When("I select checkbox The QROPS is an occupational pension scheme and the individual is an employee of the sponsoring employer. on Why Transfer is not Taxable Page")
        // ⚠️ No step-def match found for: I select checkbox The QROPS is an occupational pension scheme and the individual is an employee of the sponsoring employer. on Why Transfer is not Taxable Page

      And("I click save and continue button on Why Transfer is not Taxable Page")
        // ⚠️ No step-def match found for: I click save and continue button on Why Transfer is not Taxable Page

      Then("I am presented with the Date Of Transfer Page")
        // ⚠️ No step-def match found for: I am presented with the Date Of Transfer Page

      When("I enter the following data into corresponding input fields on Date Of Transfer Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Date Of Transfer Page

      And("I click save and continue button on Date Of Transfer Page")
        // ⚠️ No step-def match found for: I click save and continue button on Date Of Transfer Page

      Then("I am presented with the Is Transfer Cash Only Page")
        // ⚠️ No step-def match found for: I am presented with the Is Transfer Cash Only Page

      When("I select radio button No on Is Transfer Cash Only Page")
        // ⚠️ No step-def match found for: I select radio button No on Is Transfer Cash Only Page

      And("I click save and continue button on Is Transfer Cash Only Page")
        // ⚠️ No step-def match found for: I click save and continue button on Is Transfer Cash Only Page

      Then("I am presented with the Type Of Asset Page")
        // ⚠️ No step-def match found for: I am presented with the Type Of Asset Page

      When("I select checkbox Cash on Type Of Asset Page")
        // ⚠️ No step-def match found for: I select checkbox Cash on Type Of Asset Page

      And("I select checkbox Unquoted shares on Type Of Asset Page")
        // ⚠️ No step-def match found for: I select checkbox Unquoted shares on Type Of Asset Page

      And("I select checkbox Quoted shares on Type Of Asset Page")
        // ⚠️ No step-def match found for: I select checkbox Quoted shares on Type Of Asset Page

      And("I select checkbox Property on Type Of Asset Page")
        // ⚠️ No step-def match found for: I select checkbox Property on Type Of Asset Page

      And("I select checkbox Other on Type Of Asset Page")
        // ⚠️ No step-def match found for: I select checkbox Other on Type Of Asset Page

      And("I click save and continue button on Type Of Asset Page")
        // ⚠️ No step-def match found for: I click save and continue button on Type Of Asset Page

      Then("I am presented with the Amount Of Cash In Transfer Page")
        // ⚠️ No step-def match found for: I am presented with the Amount Of Cash In Transfer Page

      When("I enter the following data into corresponding input fields on Amount Of Cash In Transfer Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Amount Of Cash In Transfer Page

      And("I click save and continue button on Amount Of Cash In Transfer Page")
        // ⚠️ No step-def match found for: I click save and continue button on Amount Of Cash In Transfer Page

      Then("I am presented with the Add Unquoted Share Start Page")
        // ⚠️ No step-def match found for: I am presented with the Add Unquoted Share Start Page

      And("I click save and continue button on Add Unquoted Share Start Page")
        // ⚠️ No step-def match found for: I click save and continue button on Add Unquoted Share Start Page

      Then("I am presented with the Name Of Company Unquoted Share Page")
        // ⚠️ No step-def match found for: I am presented with the Name Of Company Unquoted Share Page

      Then("I am presented with the Name Of Company Unquoted Share Page")
        // ⚠️ No step-def match found for: I am presented with the Name Of Company Unquoted Share Page

      When("I enter the following data into corresponding input fields on Name Of Company Unquoted Share Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Name Of Company Unquoted Share Page

      And("I click save and continue button on Name Of Company Unquoted Share Page")
        // ⚠️ No step-def match found for: I click save and continue button on Name Of Company Unquoted Share Page

      Then("I am presented with the Value Of Unquoted Share Page")
        // ⚠️ No step-def match found for: I am presented with the Value Of Unquoted Share Page

      When("I enter the following data into corresponding input fields on Value Of Unquoted Share Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Value Of Unquoted Share Page

      And("I click save and continue button on Value Of Unquoted Share Page")
        // ⚠️ No step-def match found for: I click save and continue button on Value Of Unquoted Share Page

      Then("I am presented with the Number Of Unquoted Share Page")
        // ⚠️ No step-def match found for: I am presented with the Number Of Unquoted Share Page

      When("I enter the following data into corresponding input fields on Number Of Unquoted Share Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Number Of Unquoted Share Page

      And("I click save and continue button on Number Of Unquoted Share Page")
        // ⚠️ No step-def match found for: I click save and continue button on Number Of Unquoted Share Page

      Then("I am presented with the Class Of Unquoted Share Page")
        // ⚠️ No step-def match found for: I am presented with the Class Of Unquoted Share Page

      When("I enter the following data into corresponding input fields on Class Of Unquoted Share Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Class Of Unquoted Share Page

      And("I click save and continue button on Class Of Unquoted Share Page")
        // ⚠️ No step-def match found for: I click save and continue button on Class Of Unquoted Share Page

      Then("I am presented with the Unquoted Share Check Your Answers Page")
        // ⚠️ No step-def match found for: I am presented with the Unquoted Share Check Your Answers Page

      And("I should see the following details")
        andIShouldSeeTheFollowingDetails()  // auto-chosen (score=1.00, BaseStepDefinitionsSteps.scala)

      And("I click save and continue button on Unquoted Share Check Your Answers Page")
        // ⚠️ No step-def match found for: I click save and continue button on Unquoted Share Check Your Answers Page

      Then("I am presented with the Unquoted Share Amend Continue Page")
        // ⚠️ No step-def match found for: I am presented with the Unquoted Share Amend Continue Page

      And("I should see the heading You have added 1 group of unquoted shares")
        andIShouldSeeTheHeadingX("")  // auto-chosen (score=0.88, BaseStepDefinitionsSteps.scala)

      When("I select radio button No on Unquoted Share Amend Continue Page")
        // ⚠️ No step-def match found for: I select radio button No on Unquoted Share Amend Continue Page

      And("I click save and continue button on Unquoted Share Amend Continue Page")
        // ⚠️ No step-def match found for: I click save and continue button on Unquoted Share Amend Continue Page

      Then("I am presented with the Add Quoted Share Start Page")
        // ⚠️ No step-def match found for: I am presented with the Add Quoted Share Start Page

      And("I click save and continue button on Add Quoted Share Start Page")
        // ⚠️ No step-def match found for: I click save and continue button on Add Quoted Share Start Page

      Then("I am presented with the Name Of Company Quoted Share Page")
        // ⚠️ No step-def match found for: I am presented with the Name Of Company Quoted Share Page

      When("I enter the following data into corresponding input fields on Name Of Company Quoted Share Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Name Of Company Quoted Share Page

      And("I click save and continue button on Name Of Company Quoted Share Page")
        // ⚠️ No step-def match found for: I click save and continue button on Name Of Company Quoted Share Page

      Then("I am presented with the Value Of Quoted Share Page")
        // ⚠️ No step-def match found for: I am presented with the Value Of Quoted Share Page

      When("I enter the following data into corresponding input fields on Value Of Quoted Share Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Value Of Quoted Share Page

      And("I click save and continue button on Value Of Quoted Share Page")
        // ⚠️ No step-def match found for: I click save and continue button on Value Of Quoted Share Page

      Then("I am presented with the Number Of Quoted Share Page")
        // ⚠️ No step-def match found for: I am presented with the Number Of Quoted Share Page

      When("I enter the following data into corresponding input fields on Number Of Quoted Share Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Number Of Quoted Share Page

      And("I click save and continue button on Number Of Quoted Share Page")
        // ⚠️ No step-def match found for: I click save and continue button on Number Of Quoted Share Page

      Then("I am presented with the Class Of Quoted Share Page")
        // ⚠️ No step-def match found for: I am presented with the Class Of Quoted Share Page

      When("I enter the following data into corresponding input fields on Class Of Quoted Share Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Class Of Quoted Share Page

      And("I click save and continue button on Class Of Quoted Share Page")
        // ⚠️ No step-def match found for: I click save and continue button on Class Of Quoted Share Page

      Then("I am presented with the Quoted Share Check Your Answers Page")
        // ⚠️ No step-def match found for: I am presented with the Quoted Share Check Your Answers Page

      And("I should see the following details")
        andIShouldSeeTheFollowingDetails()  // auto-chosen (score=1.00, BaseStepDefinitionsSteps.scala)

      And("I click save and continue button on Quoted Share Check Your Answers Page")
        // ⚠️ No step-def match found for: I click save and continue button on Quoted Share Check Your Answers Page

      Then("I am presented with the Quoted Share Amend Continue Page")
        // ⚠️ No step-def match found for: I am presented with the Quoted Share Amend Continue Page

      And("I should see the heading You have added 1 group of quoted shares")
        andIShouldSeeTheHeadingX("")  // auto-chosen (score=0.88, BaseStepDefinitionsSteps.scala)

      When("I select radio button Yes on Quoted Share Amend Continue Page")
        // ⚠️ No step-def match found for: I select radio button Yes on Quoted Share Amend Continue Page

      And("I click save and continue button on Quoted Share Amend Continue Page")
        // ⚠️ No step-def match found for: I click save and continue button on Quoted Share Amend Continue Page

      Then("I am presented with the Second Name Of Company Quoted Share Page")
        // ⚠️ No step-def match found for: I am presented with the Second Name Of Company Quoted Share Page

      When("I enter the following data into corresponding input fields on Name Of Company Quoted Share Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Name Of Company Quoted Share Page

      And("I click save and continue button on Second Name Of Company Quoted Share Page")
        // ⚠️ No step-def match found for: I click save and continue button on Second Name Of Company Quoted Share Page

      Then("I am presented with the Second Value Of Quoted Share Page")
        // ⚠️ No step-def match found for: I am presented with the Second Value Of Quoted Share Page

      When("I enter the following data into corresponding input fields on Second Value Of Quoted Share Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Second Value Of Quoted Share Page

      And("I click save and continue button on Second Value Of Quoted Share Page")
        // ⚠️ No step-def match found for: I click save and continue button on Second Value Of Quoted Share Page

      Then("I am presented with the Second Number Of Quoted Share Page")
        // ⚠️ No step-def match found for: I am presented with the Second Number Of Quoted Share Page

      When("I enter the following data into corresponding input fields on Number Of Quoted Share Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Number Of Quoted Share Page

      And("I click save and continue button on Second Number Of Quoted Share Page")
        // ⚠️ No step-def match found for: I click save and continue button on Second Number Of Quoted Share Page

      Then("I am presented with the Second Class Of Quoted Share Page")
        // ⚠️ No step-def match found for: I am presented with the Second Class Of Quoted Share Page

      When("I enter the following data into corresponding input fields on Class Of Quoted Share Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Class Of Quoted Share Page

      And("I click save and continue button on Second Class Of Quoted Share Page")
        // ⚠️ No step-def match found for: I click save and continue button on Second Class Of Quoted Share Page

      Then("I am presented with the Second Quoted Share Check Your Answers Page")
        // ⚠️ No step-def match found for: I am presented with the Second Quoted Share Check Your Answers Page

      And("I should see the following details")
        andIShouldSeeTheFollowingDetails()  // auto-chosen (score=1.00, BaseStepDefinitionsSteps.scala)

      And("I click save and continue button on Second Quoted Share Check Your Answers Page")
        // ⚠️ No step-def match found for: I click save and continue button on Second Quoted Share Check Your Answers Page

      Then("I am presented with the Quoted Share Amend Continue 2 Page")
        // ⚠️ No step-def match found for: I am presented with the Quoted Share Amend Continue 2 Page

      And("I should see the heading You have added 2 groups of quoted shares")
        andIShouldSeeTheHeadingX("")  // auto-chosen (score=0.88, BaseStepDefinitionsSteps.scala)

      When("I select radio button No on Quoted Share Amend Continue Page")
        // ⚠️ No step-def match found for: I select radio button No on Quoted Share Amend Continue Page

      And("I click save and continue button on Quoted Share Amend Continue Page")
        // ⚠️ No step-def match found for: I click save and continue button on Quoted Share Amend Continue Page

      Then("I am presented with the Add Property Start Page")
        // ⚠️ No step-def match found for: I am presented with the Add Property Start Page

      And("I click save and continue button on Add Property Start Page")
        // ⚠️ No step-def match found for: I click save and continue button on Add Property Start Page

      Then("I am presented with the Property Address Page")
        // ⚠️ No step-def match found for: I am presented with the Property Address Page

      When("I enter the following data into corresponding input fields on Property Address Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Property Address Page

      And("I click save and continue button on Property Address Page")
        // ⚠️ No step-def match found for: I click save and continue button on Property Address Page

      When("I enter the following data into corresponding input fields on Value Of Property Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Value Of Property Page

      And("I click save and continue button on Value Of Property Page")
        // ⚠️ No step-def match found for: I click save and continue button on Value Of Property Page

      Then("I am presented with the Property Description Page")
        // ⚠️ No step-def match found for: I am presented with the Property Description Page

      When("I enter the following data into corresponding input fields on Property Description Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Property Description Page

      And("I click save and continue button on Property Description Page")
        // ⚠️ No step-def match found for: I click save and continue button on Property Description Page

      Then("I am presented with the Property Check Your Answers Page")
        // ⚠️ No step-def match found for: I am presented with the Property Check Your Answers Page

      And("I should see the following details")
        andIShouldSeeTheFollowingDetails()  // auto-chosen (score=1.00, BaseStepDefinitionsSteps.scala)

      And("I click save and continue button on Property Check Your Answers Page")
        // ⚠️ No step-def match found for: I click save and continue button on Property Check Your Answers Page

      Then("I am presented with the Property Amend Continue Page")
        // ⚠️ No step-def match found for: I am presented with the Property Amend Continue Page

      And("I should see the heading You have added 1 property")
        andIShouldSeeTheHeadingX("")  // auto-chosen (score=0.88, BaseStepDefinitionsSteps.scala)

      When("I select radio button No on Property Amend Continue Page")
        // ⚠️ No step-def match found for: I select radio button No on Property Amend Continue Page

      And("I click save and continue button on Property Amend Continue Page")
        // ⚠️ No step-def match found for: I click save and continue button on Property Amend Continue Page

      Then("I am presented with the Add Other Assets Start Page")
        // ⚠️ No step-def match found for: I am presented with the Add Other Assets Start Page

      And("I click save and continue button on Add Other Assets Start Page")
        // ⚠️ No step-def match found for: I click save and continue button on Add Other Assets Start Page

      Then("I am presented with the Other Assets Description Page")
        // ⚠️ No step-def match found for: I am presented with the Other Assets Description Page

      When("I enter the following data into corresponding input fields on Other Assets Description Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Other Assets Description Page

      And("I click save and continue button on Other Assets Description Page")
        // ⚠️ No step-def match found for: I click save and continue button on Other Assets Description Page

      Then("I am presented with the Other Assets Value Page")
        // ⚠️ No step-def match found for: I am presented with the Other Assets Value Page

      When("I enter the following data into corresponding input fields on Other Assets Value Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Other Assets Value Page

      And("I click save and continue button on Other Assets Value Page")
        // ⚠️ No step-def match found for: I click save and continue button on Other Assets Value Page

      Then("I am presented with the Other Assets Check Your Answers Page")
        // ⚠️ No step-def match found for: I am presented with the Other Assets Check Your Answers Page

      And("I should see the following details")
        andIShouldSeeTheFollowingDetails()  // auto-chosen (score=1.00, BaseStepDefinitionsSteps.scala)

      And("I click save and continue button on Other Assets Check Your Answers Page")
        // ⚠️ No step-def match found for: I click save and continue button on Other Assets Check Your Answers Page

      Then("I am presented with the Other Assets Amend Continue Page")
        // ⚠️ No step-def match found for: I am presented with the Other Assets Amend Continue Page

      And("I should see the heading You have added 1 asset")
        andIShouldSeeTheHeadingX("")  // auto-chosen (score=0.88, BaseStepDefinitionsSteps.scala)

      When("I select radio button No on Other Assets Amend Continue Page")
        // ⚠️ No step-def match found for: I select radio button No on Other Assets Amend Continue Page

      And("I click save and continue button on Other Assets Amend Continue Page")
        // ⚠️ No step-def match found for: I click save and continue button on Other Assets Amend Continue Page

      Then("I am presented with the Check Your Answers Page")
        // ⚠️ No step-def match found for: I am presented with the Check Your Answers Page

      And("I should see the following details")
        andIShouldSeeTheFollowingDetails()  // auto-chosen (score=1.00, BaseStepDefinitionsSteps.scala)

      And("I click save and continue button on Check Your Answers Page")
        // ⚠️ No step-def match found for: I click save and continue button on Check Your Answers Page

      Then("I am presented with the Task List Page")
        // ⚠️ No step-def match found for: I am presented with the Task List Page

      Then("I see the status Completed for task Add details about the member")
        // ⚠️ No step-def match found for: I see the status Completed for task Add details about the member

      Then("I see the status Completed for task Add information about the transfer")
        // ⚠️ No step-def match found for: I see the status Completed for task Add information about the transfer

      Then("I see the status Completed for task Add information about the QROPS")
        // ⚠️ No step-def match found for: I see the status Completed for task Add information about the QROPS

      Then("I see the status Completed for task Add QROPS scheme manager's details")
        // ⚠️ No step-def match found for: I see the status Completed for task Add QROPS scheme manager's details

      Then("I see the status Not started yet for task Check your answers and submit the report")
        // ⚠️ No step-def match found for: I see the status Not started yet for task Check your answers and submit the report

      And("I click on Check your answers and submit the report hyperlink on Dashboard Page")
        // ⚠️ No step-def match found for: I click on Check your answers and submit the report hyperlink on Dashboard Page

      Then("I am presented with the Final Check Your Answers Page")
        // ⚠️ No step-def match found for: I am presented with the Final Check Your Answers Page

      When("I click on final-change-members-current-address button on Final Check Your Answers Page")
        // ⚠️ No step-def match found for: I click on final-change-members-current-address button on Final Check Your Answers Page

      Then("I am presented with the Final Change Member Current Address Page")
        // ⚠️ No step-def match found for: I am presented with the Final Change Member Current Address Page

      And("I enter the following data into corresponding input fields on Final Change Member Current Address Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Final Change Member Current Address Page

      And("I click save and continue button on Final Change Member Current Address Page")
        // ⚠️ No step-def match found for: I click save and continue button on Final Change Member Current Address Page

      Then("I am presented with the Final Check Your Answers Page")
        // ⚠️ No step-def match found for: I am presented with the Final Check Your Answers Page

      And("I should see the following values on the page")
        thenIShouldSeeTheFollowingValuesOnThePage()  // auto-chosen (score=1.00, BaseStepDefinitionsSteps.scala)

      When("I click on final-change-amount-of-transfer button on Final Check Your Answers Page")
        // ⚠️ No step-def match found for: I click on final-change-amount-of-transfer button on Final Check Your Answers Page

      Then("I am presented with the Final Change Amount Of Transfer Page")
        // ⚠️ No step-def match found for: I am presented with the Final Change Amount Of Transfer Page

      When("I enter the following data into corresponding input fields on Final Change Amount Of Transfer Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Final Change Amount Of Transfer Page

      And("I click save and continue button on Final Change Amount Of Transfer Page")
        // ⚠️ No step-def match found for: I click save and continue button on Final Change Amount Of Transfer Page

      Then("I am presented with the Final Check Your Answers Page")
        // ⚠️ No step-def match found for: I am presented with the Final Check Your Answers Page

      And("I should see the following values on the page")
        thenIShouldSeeTheFollowingValuesOnThePage()  // auto-chosen (score=1.00, BaseStepDefinitionsSteps.scala)

      When("I click on final-change-qrops-reference button on Final Check Your Answers Page")
        // ⚠️ No step-def match found for: I click on final-change-qrops-reference button on Final Check Your Answers Page

      Then("I am presented with the Final Change QROPS Reference Page")
        // ⚠️ No step-def match found for: I am presented with the Final Change QROPS Reference Page

      When("I enter the following data into corresponding input fields on Final Change QROPS Reference Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Final Change QROPS Reference Page

      And("I click save and continue button on Final Change QROPS Reference Page")
        // ⚠️ No step-def match found for: I click save and continue button on Final Change QROPS Reference Page

      Then("I am presented with the Final Check Your Answers Page")
        // ⚠️ No step-def match found for: I am presented with the Final Check Your Answers Page

      And("I should see the following values on the page")
        thenIShouldSeeTheFollowingValuesOnThePage()  // auto-chosen (score=1.00, BaseStepDefinitionsSteps.scala)

      When("I click on final-change-qrops-reference button on Final Check Your Answers Page")
        // ⚠️ No step-def match found for: I click on final-change-qrops-reference button on Final Check Your Answers Page

      Then("I am presented with the Final Change QROPS Reference Page")
        // ⚠️ No step-def match found for: I am presented with the Final Change QROPS Reference Page

      When("I enter the following data into corresponding input fields on Final Change QROPS Reference Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Final Change QROPS Reference Page

      And("I click save and continue button on Final Change QROPS Reference Page")
        // ⚠️ No step-def match found for: I click save and continue button on Final Change QROPS Reference Page

      Then("I am presented with the Final Check Your Answers Page")
        // ⚠️ No step-def match found for: I am presented with the Final Check Your Answers Page

      And("I should see the following values on the page")
        thenIShouldSeeTheFollowingValuesOnThePage()  // auto-chosen (score=1.00, BaseStepDefinitionsSteps.scala)

      When("I click on final-change-scheme-managers-name button on Final Check Your Answers Page")
        // ⚠️ No step-def match found for: I click on final-change-scheme-managers-name button on Final Check Your Answers Page

      Then("I am presented with the Final Change Scheme Managers Name Page")
        // ⚠️ No step-def match found for: I am presented with the Final Change Scheme Managers Name Page

      When("I enter the following data into corresponding input fields on Final Change Scheme Managers Name Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Final Change Scheme Managers Name Page

      And("I click save and continue button on Final Change Scheme Managers Name Page")
        // ⚠️ No step-def match found for: I click save and continue button on Final Change Scheme Managers Name Page

      Then("I am presented with the Final Check Your Answers Page")
        // ⚠️ No step-def match found for: I am presented with the Final Check Your Answers Page

      And("I should see the following values on the page")
        thenIShouldSeeTheFollowingValuesOnThePage()  // auto-chosen (score=1.00, BaseStepDefinitionsSteps.scala)

      And("I click save and continue button on Final Check Your Answers Page")
        // ⚠️ No step-def match found for: I click save and continue button on Final Check Your Answers Page

      Then("I am presented with the Final Submission Page")
        // ⚠️ No step-def match found for: I am presented with the Final Submission Page

      When("I select radio button Yes on Final Submission Page")
        // ⚠️ No step-def match found for: I select radio button Yes on Final Submission Page

      And("I click save and continue button on Final Submission Page")
        // ⚠️ No step-def match found for: I click save and continue button on Final Submission Page

      Then("I am presented with the Declaration Page")
        // ⚠️ No step-def match found for: I am presented with the Declaration Page

      And("I click agree and submit button on Declaration Page")
        // ⚠️ No step-def match found for: I click agree and submit button on Declaration Page

      Then("I am presented with the Transfer Submission Page")
        // ⚠️ No step-def match found for: I am presented with the Transfer Submission Page

      And("I should see the heading Transfer submitted")
        andIShouldSeeTheHeadingX("")  // auto-chosen (score=0.88, BaseStepDefinitionsSteps.scala)

    }
  }
}
