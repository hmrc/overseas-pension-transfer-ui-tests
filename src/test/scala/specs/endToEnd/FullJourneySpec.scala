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

class FullJourneySpec extends BaseSpec with Matchers {

  Feature("Is the members details journey fully connected") {

    Scenario("1. Full Journey - Start a new transfer") {


      Then("I am presented with the Dashboard Page")
      thenIAmPresentedWithThe("Dashboard Page")
        // ⚠️ No step-def match found for: I am presented with the Dashboard Page

      And("I click on Start new transfer hyperlink on Dashboard Page")
      whenIClickOnHyperlinkOn("Start a new transfer","Dashboard Page")

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
      thenISeeTheStatusForTask("Not started yet","Add details about the member")
        // ⚠️ No step-def match found for: I see the status Not started yet for task Add details about the member

      Then("I see the status Cannot start yet for task Add information about the transfer")
      thenISeeTheStatusForTask("Cannot start yet","Add information about the transfer")
        // ⚠️ No step-def match found for: I see the status Cannot start yet for task Add information about the transfer

      Then("I see the status Cannot start yet for task Add information about the QROPS")
      thenISeeTheStatusForTask("Cannot start yet","Add information about the QROPS")
        // ⚠️ No step-def match found for: I see the status Cannot start yet for task Add information about the QROPS

      Then("I see the status Cannot start yet for task Add QROPS scheme manager's details")
      thenISeeTheStatusForTask("Cannot start yet","Add QROPS scheme manager's details")
        // ⚠️ No step-def match found for: I see the status Cannot start yet for task Add QROPS scheme manager's details

      Then("I see the status Cannot start yet for task Check your answers and submit the report")
      thenISeeTheStatusForTask("Cannot start yet","Check your answers and submit the report")
        // ⚠️ No step-def match found for: I see the status Cannot start yet for task Check your answers and submit the report

      When("I click on Add details about the member hyperlink on Task List Page")
      whenIClickOnHyperlinkOn("Add details about the member","Task List Page")
        // ⚠️ No step-def match found for: I click on Add details about the member hyperlink on Task List Page

      And("I should see the heading What is the member's name?")
        andIShouldSeeTheHeadingX("What is the member's name?")  // auto-chosen (score=0.88, BaseStepDefinitionsSteps.scala)

      When("I enter the following data into corresponding input fields on Member Name Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Member Name Page",
        Map("memberFirstName" -> "Amelia"))

        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Member Name Page

      And("I click continue button on Member Name Page")
      whenIClickSaveAndContinueButtonOn("Member Name Page")
        // ⚠️ No step-def match found for: I click continue button on Member Name Page

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
      Ienterthefollowingdataintocorrespondinginputfieldson ("Member Date Of Birth Page",
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
        andIShouldSeeTheFollowingDetails()
      // auto-chosen (score=1.00, BaseStepDefinitionsSteps.scala)

      And("I click save and continue button on Member Details Check Your Answers Page")
      whenIClickSaveAndContinueButtonOn("Member Details Check Your Answers Page")
        // ⚠️ No step-def match found for: I click save and continue button on Member Details Check Your Answers Page

      Then("I am presented with the Task List Page")
      thenIAmPresentedWithThe("Task List Page")
        // ⚠️ No step-def match found for: I am presented with the Task List Page

      Then("I see the status Completed for task Add details about the member")
      thenISeeTheStatusForTask("Completed","Add details about the member")

        // ⚠️ No step-def match found for: I see the status Completed for task Add details about the member

      Then("I see the status Not started yet for task Add information about the transfer")
      thenISeeTheStatusForTask("Not started yet","Add information about the transfer")
        // ⚠️ No step-def match found for: I see the status Not started yet for task Add information about the transfer

      Then("I see the status Not started yet for task Add information about the QROPS")
      thenISeeTheStatusForTask("Not started yet","Add information about the QROPS")
        // ⚠️ No step-def match found for: I see the status Not started yet for task Add information about the QROPS

      Then("I see the status Not started yet for task Add QROPS scheme manager's details")
      thenISeeTheStatusForTask("Not started yet","Add QROPS scheme manager's details")
        // ⚠️ No step-def match found for: I see the status Not started yet for task Add QROPS scheme manager's details

      Then("I see the status Cannot start yet for task Check your answers and submit the report")
      thenISeeTheStatusForTask("Not started yet","Check your answers and submit the report")
        // ⚠️ No step-def match found for: I see the status Cannot start yet for task Check your answers and submit the report

      When("I click on Add information about the QROPS hyperlink on Task List Page")
      whenIClickOnHyperlinkOn(" QROPS","Task List Page")
        // ⚠️ No step-def match found for: I click on Add information about the QROPS hyperlink on Task List Page

      And("I should see below input fields on QROPS Name Page")
      andIShouldSeeBelowInputFieldsOn(("Name","QROPS Name Page"))
        // ⚠️ No step-def match found for: I should see below input fields on QROPS Name Page

      When("I enter the following data into corresponding input fields on QROPS Name Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("QROPS Name Page",
        Map("qropsName" -> "The great QROPS"))
      // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on QROPS Name Page

      And("I click save and continue button on QROPS Name Page")
      whenIClickSaveAndContinueButtonOn("QROPS Name Page")
        // ⚠️ No step-def match found for: I click save and continue button on QROPS Name Page

      Then("I am presented with the QROPS Reference Page")
      thenIAmPresentedWithThe("QROPS Reference Page")
        // ⚠️ No step-def match found for: I am presented with the QROPS Reference Page

      When("I enter the following data into corresponding input fields on QROPS Reference Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("QROPS Reference Page",
        Map("qropsRef" -> "QROPS123456"))

        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on QROPS Reference Page

      And("I click save and continue button on QROPS Reference Page")
      whenIClickSaveAndContinueButtonOn("QROPS Reference Page")
        // ⚠️ No step-def match found for: I click save and continue button on QROPS Reference Page

      Then("I am presented with the QROPS Address Page")
      thenIAmPresentedWithThe("QROPS Address Page")
        // ⚠️ No step-def match found for: I am presented with the QROPS Address Page

      When("I enter the following data into corresponding input fields on QROPS Address Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("QROPS Address Page",
        Map("addressLine1" -> "21 Rosewood Close"))

      // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on QROPS Address Page

      And("I click save and continue button on QROPS Address Page")
      whenIClickSaveAndContinueButtonOn("QROPS Address Page")
        // ⚠️ No step-def match found for: I click save and continue button on QROPS Address Page

      Then("I am presented with the QROPS Country Page")
      thenIAmPresentedWithThe("QROPS Country Page")
        // ⚠️ No step-def match found for: I am presented with the QROPS Country Page

      When("I enter the following data into corresponding input fields on QROPS Country Page")
      Ienterthefollowingdataintocorrespondinginputfieldson("Member Date Of Birth Page",
        Map("countryCode" -> "United Kingdom"))
      // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on QROPS Country Page

      And("I click save and continue button on QROPS Country Page")
      whenIClickSaveAndContinueButtonOn("QROPS Country Page")
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
      whenIClickSaveAndContinueButtonOn("QROPS Check Your Answers Page")
        // ⚠️ No step-def match found for: I click save and continue button on QROPS Check Your Answers Page

      Then("I am presented with the Task List Page")
      thenIAmPresentedWithThe("Task List Page")
        // ⚠️ No step-def match found for: I am presented with the Task List Page

      Then("I see the status Completed for task Add details about the member")
      thenISeeTheStatusForTask("Completed","Add details about the member")
        // ⚠️ No step-def match found for: I see the status Completed for task Add details about the member

      Then("I see the status Completed for task Add information about the QROPS")
      thenISeeTheStatusForTask("Completed","Add QROPS scheme manager's details")
        // ⚠️ No step-def match found for: I see the status Completed for task Add information about the QROPS

      Then("I see the status Not started yet for task Add information about the transfer")
      thenISeeTheStatusForTask("Not started yet","Add information about the transfer")
        // ⚠️ No step-def match found for: I see the status Not started yet for task Add information about the transfer

      Then("I see the status Not started yet for task Add QROPS scheme manager's details")
      thenISeeTheStatusForTask("Not started yet","Add QROPS scheme manager's details")
        // ⚠️ No step-def match found for: I see the status Not started yet for task Add QROPS scheme manager's details

      Then("I see the status Cannot start yet for task Check your answers and submit the report")
      thenISeeTheStatusForTask("Not started yet","Check your answers and submit the report")
        // ⚠️ No step-def match found for: I see the status Cannot start yet for task Check your answers and submit the report

      When("I click on Add QROPS scheme manager's details hyperlink on Task List Page")
      whenIClickOnHyperlinkOn(" QROPS scheme manager's details","Task List")
        // ⚠️ No step-def match found for: I click on Add QROPS scheme manager's details hyperlink on Task List Page

      Then("I am presented with the Scheme Manager Type Page")
      thenIAmPresentedWithThe("Scheme Manager Type Page")
        // ⚠️ No step-def match found for: I am presented with the Scheme Manager Type Page

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

      When("I click on Return to complete your transfer report hyperlink on Scheme Manager Address Page")
      whenIClickOnHyperlinkOn("Return to complete your transfer report","Scheme Manager Address Page")

      Then("I am presented with the Task List Page")
      thenIAmPresentedWithThe("Task List Page")

      Then("I see the status Completed for task Add details about the member")
      thenISeeTheStatusForTask("Completed","Add details about the member")

      Then("I see the status Not started yet for task Add information about the transfer")
      thenISeeTheStatusForTask("Not started yet","Add information about the transfer")
        // ⚠️ No step-def match found for: I see the status Not started yet for task Add information about the transfer

      Then("I see the status Completed for task Add information about the QROPS")
      thenISeeTheStatusForTask("Completed","Add information about the QROPS")
        // ⚠️ No step-def match found for: I see the status Completed for task Add information about the QROPS

      Then("I see the status In progress for task Add QROPS scheme manager's details")
      thenISeeTheStatusForTask("In progress","Add QROPS scheme manager's details")

        // ⚠️ No step-def match found for: I see the status In progress for task Add QROPS scheme manager's details

      Then("I see the status Cannot start yet for task Check your answers and submit the report")
      thenISeeTheStatusForTask("Cannot start yet","Check your answers and submit the report")
        // ⚠️ No step-def match found for: I see the status Cannot start yet for task Check your answers and submit the report

      When("I click on Add QROPS scheme manager's details hyperlink on Task List Page")
      whenIClickOnHyperlinkOn("Add QROPS scheme manager's details","Task List Page")
        // ⚠️ No step-def match found for: I click on Add QROPS scheme manager's details hyperlink on Task List Page

      Then("I am presented with the Scheme Manager Type Page")
      thenIAmPresentedWithThe("Scheme Manager Type Page")
        // ⚠️ No step-def match found for: I am presented with the Scheme Manager Type Page

      When("I select radio button Individual on Scheme Manager Type Page")
      whenISelectRadioButtonOn("Individual" , "Scheme Manager Type")
        // ⚠️ No step-def match found for: I select radio button Individual on Scheme Manager Type Page

      And("I click save and continue button on Scheme Manager Type Page")
      whenIClickSaveAndContinueButtonOn("Scheme Manager Type Page")

      Then("I am presented with the Scheme Manager Address Page")
      thenIAmPresentedWithThe("Scheme Manager Page")

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

      // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Scheme Manager Email Page

      And("I click save and continue button on Scheme Manager Email Page")
      whenIClickSaveAndContinueButtonOn("Scheme Manager Email Page")
        // ⚠️ No step-def match found for: I click save and continue button on Scheme Manager Email Page

      Then("I am presented with the Scheme Manager Telephone Page")
      thenIAmPresentedWithThe("Scheme Manager Telephone Page")
        // ⚠️ No step-def match found for: I am presented with the Scheme Manager Telephone Page

      When("I enter the following data into corresponding input fields on Scheme Manager Telephone Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Scheme Manager Telephone Page",
        Map("contactNumber" -> "+441234567890"))

      // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Scheme Manager Telephone Page

      And("I click save and continue button on Scheme Manager Telephone Page")
      whenIClickSaveAndContinueButtonOn("Scheme Manager Telephone Page")
        // ⚠️ No step-def match found for: I click save and continue button on Scheme Manager Telephone Page

      Then("I am presented with the Scheme Manager Check Your Answer Page")
      thenIAmPresentedWithThe("Scheme Manager Check Your Answer Page")
        // ⚠️ No step-def match found for: I am presented with the Scheme Manager Check Your Answer Page

      And("I should see the following details")
        andIShouldSeeTheFollowingDetails()  // auto-chosen (score=1.00, BaseStepDefinitionsSteps.scala)
      thenIAmPresentedWithThe("QROPS Check Your Answers Page")
      // ⚠️ No step-def match found for: I am presented with the QROPS Check Your Answers Page

      And("I should see the following details")
      val schemeManagerDetailsDetails: Map[String, String] = Map(
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

      And("I click save and continue button on Scheme Manager Check Your Answer Page")
      whenIClickSaveAndContinueButtonOn("Scheme Manager Check Your Answer Page")
        // ⚠️ No step-def match found for: I click save and continue button on Scheme Manager Check Your Answer Page

      Then("I am presented with the Task List Page")
      thenIAmPresentedWithThe("Task List Page")
        // ⚠️ No step-def match found for: I am presented with the Task List Page

      Then("I see the status Completed for task Add details about the member")
      thenISeeTheStatusForTask("Completed","Add details about the member")
        // ⚠️ No step-def match found for: I see the status Completed for task Add details about the member

      Then("I see the status Not started yet for task Add information about the transfer")
      thenISeeTheStatusForTask("Not started yet","Add information about the transfer")
        // ⚠️ No step-def match found for: I see the status Not started yet for task Add information about the transfer

      Then("I see the status Completed for task Add information about the QROPS")
      thenISeeTheStatusForTask("Completed","Add details about the QROPS")
        // ⚠️ No step-def match found for: I see the status Completed for task Add information about the QROPS

      Then("I see the status Completed for task Add QROPS scheme manager's details")
      thenISeeTheStatusForTask("Completed","Add QROPS scheme manager's details")
        // ⚠️ No step-def match found for: I see the status Completed for task Add QROPS scheme manager's details

      Then("I see the status Cannot start yet for task Check your answers and submit the report")
      thenISeeTheStatusForTask("Cannot start yet","Check your answers and submit the report")
        // ⚠️ No step-def match found for: I see the status Cannot start yet for task Check your answers and submit the report

      When("I click on Add information about the transfer hyperlink on Task List Page")
      whenIClickOnHyperlinkOn("Add information about the transfer","Task List Page")
        // ⚠️ No step-def match found for: I click on Add information about the transfer hyperlink on Task List Page

      Then("I am presented with the Overseas Transfer Allowance Page")
      thenIAmPresentedWithThe("Overseas Transfer Allowance Page")
        // ⚠️ No step-def match found for: I am presented with the Overseas Transfer Allowance Page

      When("I enter the following data into corresponding input fields on Overseas Transfer Allowance Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Overseas Transfer Allowance Page",
        Map("otAllowance" -> "400100"))

      // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Overseas Transfer Allowance Page

      And("I click save and continue button on Overseas Transfer Allowance Page")
      whenIClickSaveAndContinueButtonOn("Overseas Transfer Allowance Page")
        // ⚠️ No step-def match found for: I click save and continue button on Overseas Transfer Allowance Page

      Then("I am presented with the Amount Of Transfer Page")
      thenIAmPresentedWithThe("Amount of Transfer Page")
        // ⚠️ No step-def match found for: I am presented with the Amount Of Transfer Page

      When("I enter the following data into corresponding input fields on Amount Of Transfer Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Amount Of Transfer Page",
        Map("value" -> "400200"))

      // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Amount Of Transfer Page

      And("I click save and continue button on Amount Of Transfer Page")
      whenIClickSaveAndContinueButtonOn("Amount Of Transfer Page")
        // ⚠️ No step-def match found for: I click save and continue button on Amount Of Transfer Page

      Then("I am presented with the Is Transfer Amount Taxable Page")
      thenIAmPresentedWithThe("Is Transfer Amount Taxable Page")
        // ⚠️ No step-def match found for: I am presented with the Is Transfer Amount Taxable Page

      When("I select radio button No on Is Transfer Amount Taxable Page")
      whenISelectRadioButtonOn("No" , "Is Transfer Amount Taxable Page")
        // ⚠️ No step-def match found for: I select radio button No on Is Transfer Amount Taxable Page

      And("I click save and continue button on Is Transfer Amount Taxable Page")
      whenIClickSaveAndContinueButtonOn("Is Transfer Amount Taxable Page")
        // ⚠️ No step-def match found for: I click save and continue button on Is Transfer Amount Taxable Page

      Then("I am presented with the Why Transfer is not Taxable Page")
      thenIAmPresentedWithThe("Why Transfer is not Taxable Page")
        // ⚠️ No step-def match found for: I am presented with the Why Transfer is not Taxable Page

      When("I select checkbox The QROPS is an occupational pension scheme and the individual is an employee of the sponsoring employer. on Why Transfer is not Taxable Page")
      whenICheckboxOn("select","The QROPS is an occupational pension scheme and the individual is an employee of the sponsoring employer.","Why Transfer is not Taxable Page")
        // ⚠️ No step-def match found for: I select checkbox The QROPS is an occupational pension scheme and the individual is an employee of the sponsoring employer. on Why Transfer is not Taxable Page

      And("I click save and continue button on Why Transfer is not Taxable Page")
      whenIClickSaveAndContinueButtonOn("Why Transfer is not Taxable Page")
        // ⚠️ No step-def match found for: I click save and continue button on Why Transfer is not Taxable Page

      Then("I am presented with the Date Of Transfer Page")
      thenIAmPresentedWithThe("Date Of Transfer Page")
        // ⚠️ No step-def match found for: I am presented with the Date Of Transfer Page

      When("I enter the following data into corresponding input fields on Date Of Transfer Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Date Of Transfer Page",
        Map("day" -> "14"))

      // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Date Of Transfer Page

      And("I click save and continue button on Date Of Transfer Page")
      whenIClickSaveAndContinueButtonOn("Date Of Transfer Page")
        // ⚠️ No step-def match found for: I click save and continue button on Date Of Transfer Page

      Then("I am presented with the Is Transfer Cash Only Page")
      thenIAmPresentedWithThe("Is Transfer Cash Only Page")
        // ⚠️ No step-def match found for: I am presented with the Is Transfer Cash Only Page

      When("I select radio button No on Is Transfer Cash Only Page")
      whenISelectRadioButtonOn("No" , "Is Transfer Cash Only Page")
        // ⚠️ No step-def match found for: I select radio button No on Is Transfer Cash Only Page

      And("I click save and continue button on Is Transfer Cash Only Page")
      whenIClickSaveAndContinueButtonOn("Is Transfer Cash Only Page")
        // ⚠️ No step-def match found for: I click save and continue button on Is Transfer Cash Only Page

      Then("I am presented with the Type Of Asset Page")
      thenIAmPresentedWithThe("Type Of Asset Page")
        // ⚠️ No step-def match found for: I am presented with the Type Of Asset Page

      When("I select checkbox Cash on Type Of Asset Page")
      whenICheckboxOn("select","Cash","Type Of Asset Page")

      // ⚠️ No step-def match found for: I select checkbox Cash on Type Of Asset Page

      And("I select checkbox Unquoted shares on Type Of Asset Page")
      whenICheckboxOn("select","Unquoted shares","Type Of Asset Page")
        // ⚠️ No step-def match found for: I select checkbox Unquoted shares on Type Of Asset Page

      And("I select checkbox Quoted shares on Type Of Asset Page")
      whenICheckboxOn("select","Quoted shares","Type Of Asset Page")
        // ⚠️ No step-def match found for: I select checkbox Quoted shares on Type Of Asset Page

      And("I select checkbox Property on Type Of Asset Page")
      whenICheckboxOn("select","Property","Type Of Asset Page")
        // ⚠️ No step-def match found for: I select checkbox Property on Type Of Asset Page

      And("I select checkbox Other on Type Of Asset Page")
      whenICheckboxOn("select","Other","Type Of Asset Page")
        // ⚠️ No step-def match found for: I select checkbox Other on Type Of Asset Page

      And("I click save and continue button on Type Of Asset Page")
      whenIClickSaveAndContinueButtonOn("Type Of Asset Page")
        // ⚠️ No step-def match found for: I click save and continue button on Type Of Asset Page

      Then("I am presented with the Amount Of Cash In Transfer Page")
      thenIAmPresentedWithThe("Amount Of Cash In Transfer Page")
        // ⚠️ No step-def match found for: I am presented with the Amount Of Cash In Transfer Page

      When("I enter the following data into corresponding input fields on Amount Of Cash In Transfer Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Member Date Of Birth Page",
        Map("cashInTransfer" -> "400300"))

      // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Amount Of Cash In Transfer Page

      And("I click save and continue button on Amount Of Cash In Transfer Page")
      whenIClickSaveAndContinueButtonOn("Amount Of Cash In Transfer Page")
        // ⚠️ No step-def match found for: I click save and continue button on Amount Of Cash In Transfer Page

      Then("I am presented with the Add Unquoted Share Start Page")
      thenIAmPresentedWithThe("Add Unquoted Share Start Page")
        // ⚠️ No step-def match found for: I am presented with the Add Unquoted Share Start Page

      And("I click save and continue button on Add Unquoted Share Start Page")
      whenIClickSaveAndContinueButtonOn("Add Unquoted Share Start Page")
        // ⚠️ No step-def match found for: I click save and continue button on Add Unquoted Share Start Page

      Then("I am presented with the Name Of Company Unquoted Share Page")
      thenIAmPresentedWithThe("Name Of Company Unquoted Share Page")

      // ⚠️ No step-def match found for: I am presented with the Name Of Company Unquoted Share Page

      When("I enter the following data into corresponding input fields on Name Of Company Unquoted Share Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Name Of Company Unquoted Share Page",
        Map("value" -> "Unquoted Company Name"))
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Name Of Company Unquoted Share Page

      And("I click save and continue button on Name Of Company Unquoted Share Page")
      whenIClickSaveAndContinueButtonOn("Name Of Company Unquoted Share Page")
        // ⚠️ No step-def match found for: I click save and continue button on Name Of Company Unquoted Share Page

      Then("I am presented with the Value Of Unquoted Share Page")
      thenIAmPresentedWithThe("Value Of Unquoted Share Page")
        // ⚠️ No step-def match found for: I am presented with the Value Of Unquoted Share Page

      When("I enter the following data into corresponding input fields on Value Of Unquoted Share Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Value Of Company Unquoted Share Page",
        Map("value" -> "400400"))

      // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Value Of Unquoted Share Page

      And("I click save and continue button on Value Of Unquoted Share Page")
      whenIClickSaveAndContinueButtonOn("Value Of Unquoted Share Page")
        // ⚠️ No step-def match found for: I click save and continue button on Value Of Unquoted Share Page

      Then("I am presented with the Number Of Unquoted Share Page")
      thenIAmPresentedWithThe("Number Of Unquoted Share Page")
        // ⚠️ No step-def match found for: I am presented with the Number Of Unquoted Share Page

      When("I enter the following data into corresponding input fields on Number Of Unquoted Share Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Number Of Unquoted Share Page",
        Map("value" -> "400"))

      // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Number Of Unquoted Share Page

      And("I click save and continue button on Number Of Unquoted Share Page")
      whenIClickSaveAndContinueButtonOn("Number Of Unquoted Share")
        // ⚠️ No step-def match found for: I click save and continue button on Number Of Unquoted Share Page

      Then("I am presented with the Class Of Unquoted Share Page")
      thenIAmPresentedWithThe("Class Of Unquoted Share")
        // ⚠️ No step-def match found for: I am presented with the Class Of Unquoted Share Page

      When("I enter the following data into corresponding input fields on Class Of Unquoted Share Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Class Of Unquoted Share Page",
        Map("value" -> "Unquoted Class"))
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Class Of Unquoted Share Page

      And("I click save and continue button on Class Of Unquoted Share Page")
      whenIClickSaveAndContinueButtonOn("Class Of Unquoted Share")
        // ⚠️ No step-def match found for: I click save and continue button on Class Of Unquoted Share Page

      Then("I am presented with the Unquoted Share Check Your Answers Page")
      thenIAmPresentedWithThe("Unquoted Share Check Your Answers")
        // ⚠️ No step-def match found for: I am presented with the Unquoted Share Check Your Answers Page

      And("I should see the following details")
        andIShouldSeeTheFollowingDetails()  // auto-chosen (score=1.00, BaseStepDefinitionsSteps.scala)

      And("I click save and continue button on Unquoted Share Check Your Answers Page")
      whenIClickSaveAndContinueButtonOn("Unquoted Share Check Your Answers")
        // ⚠️ No step-def match found for: I click save and continue button on Unquoted Share Check Your Answers Page

      Then("I am presented with the Unquoted Share Amend Continue Page")
      thenIAmPresentedWithThe("Unquoted Share Amend Continue")
        // ⚠️ No step-def match found for: I am presented with the Unquoted Share Amend Continue Page

      And("I should see the heading You have added 1 group of unquoted shares")
        andIShouldSeeTheHeadingX("You have added 1 group of unquoted shares")  // auto-chosen (score=0.88, BaseStepDefinitionsSteps.scala)

      When("I select radio button No on Unquoted Share Amend Continue Page")
      whenISelectRadioButtonOn("No" , "Unquoted Share Amend Continue Page")
        // ⚠️ No step-def match found for: I select radio button No on Unquoted Share Amend Continue Page

      And("I click save and continue button on Unquoted Share Amend Continue Page")
      whenIClickSaveAndContinueButtonOn("Unquoted Share Amend Continue Page")
        // ⚠️ No step-def match found for: I click save and continue button on Unquoted Share Amend Continue Page

      Then("I am presented with the Add Quoted Share Start Page")
      thenIAmPresentedWithThe("Add Quoted Share Start")
        // ⚠️ No step-def match found for: I am presented with the Add Quoted Share Start Page

      And("I click save and continue button on Add Quoted Share Start Page")
      whenIClickSaveAndContinueButtonOn("Add Quoted Share Start")
        // ⚠️ No step-def match found for: I click save and continue button on Add Quoted Share Start Page

      Then("I am presented with the Name Of Company Quoted Share Page")
      thenIAmPresentedWithThe("Name Of Company Quoted Share")
        // ⚠️ No step-def match found for: I am presented with the Name Of Company Quoted Share Page

      When("I enter the following data into corresponding input fields on Name Of Company Quoted Share Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Name Of Company Quoted Share Page",
        Map("value" -> "Quoted Company Name"))

      // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Name Of Company Quoted Share Page

      And("I click save and continue button on Name Of Company Quoted Share Page")
      whenIClickSaveAndContinueButtonOn("Name Of Company Quoted Share Page")
        // ⚠️ No step-def match found for: I click save and continue button on Name Of Company Quoted Share Page

      Then("I am presented with the Value Of Quoted Share Page")
      thenIAmPresentedWithThe("Value Of Quoted Share Page")
        // ⚠️ No step-def match found for: I am presented with the Value Of Quoted Share Page

      When("I enter the following data into corresponding input fields on Value Of Quoted Share Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Value Of Quoted Share Page",
        Map("value" -> "400500"))

      // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Value Of Quoted Share Page

      And("I click save and continue button on Value Of Quoted Share Page")
      whenIClickSaveAndContinueButtonOn("Value Of Quoted Share Page")
        // ⚠️ No step-def match found for: I click save and continue button on Value Of Quoted Share Page

      Then("I am presented with the Number Of Quoted Share Page")
      thenIAmPresentedWithThe("Number Of Quoted Share Page")
        // ⚠️ No step-def match found for: I am presented with the Number Of Quoted Share Page

      When("I enter the following data into corresponding input fields on Number Of Quoted Share Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Number Of Quoted Share Page",
        Map("value" -> "401"))

      // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Number Of Quoted Share Page

      And("I click save and continue button on Number Of Quoted Share Page")
      whenIClickSaveAndContinueButtonOn("Number Of Quoted Share Page")
        // ⚠️ No step-def match found for: I click save and continue button on Number Of Quoted Share Page

      Then("I am presented with the Class Of Quoted Share Page")
      thenIAmPresentedWithThe("Class Of Quoted Share Page")
        // ⚠️ No step-def match found for: I am presented with the Class Of Quoted Share Page

      When("I enter the following data into corresponding input fields on Class Of Quoted Share Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Class Of Quoted Share Page",
        Map("value" -> "Quoted Class"))

      // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Class Of Quoted Share Page

      And("I click save and continue button on Class Of Quoted Share Page")
      whenIClickSaveAndContinueButtonOn("Class Of Quoted Share Page")
        // ⚠️ No step-def match found for: I click save and continue button on Class Of Quoted Share Page

      Then("I am presented with the Quoted Share Check Your Answers Page")
      thenIAmPresentedWithThe("Quoted Share Check Your Answers Page")
        // ⚠️ No step-def match found for: I am presented with the Quoted Share Check Your Answers Page

      And("I should see the following details")
        andIShouldSeeTheFollowingDetails()  // auto-chosen (score=1.00, BaseStepDefinitionsSteps.scala)

      And("I click save and continue button on Quoted Share Check Your Answers Page")
      whenIClickSaveAndContinueButtonOn("Quoted Share Check Your Answers Page")
        // ⚠️ No step-def match found for: I click save and continue button on Quoted Share Check Your Answers Page

      Then("I am presented with the Quoted Share Amend Continue Page")
      thenIAmPresentedWithThe("Quoted Share Check Your Answers Page")
        // ⚠️ No step-def match found for: I am presented with the Quoted Share Amend Continue Page

      And("I should see the heading You have added 1 group of quoted shares")
        andIShouldSeeTheHeadingX("You have added 1 group of quoted shares")  // auto-chosen (score=0.88, BaseStepDefinitionsSteps.scala)

      When("I select radio button Yes on Quoted Share Amend Continue Page")
      whenISelectRadioButtonOn("Yes" , "Quoted Share Amend Continue Page")
        // ⚠️ No step-def match found for: I select radio button Yes on Quoted Share Amend Continue Page

      And("I click save and continue button on Quoted Share Amend Continue Page")
      whenIClickSaveAndContinueButtonOn("Quoted Share Amend Continue Page")
        // ⚠️ No step-def match found for: I click save and continue button on Quoted Share Amend Continue Page

      Then("I am presented with the Second Name Of Company Quoted Share Page")
      thenIAmPresentedWithThe("Second Name Of Company Quoted Share Page")
        // ⚠️ No step-def match found for: I am presented with the Second Name Of Company Quoted Share Page

      When("I enter the following data into corresponding input fields on Name Of Company Quoted Share Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Name Of Company Quoted Share Page",
        Map("value" -> "Quoted Name of Company"))

      // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Name Of Company Quoted Share Page

      And("I click save and continue button on Second Name Of Company Quoted Share Page")
      whenIClickSaveAndContinueButtonOn("Second Name Of Company Quoted Share Page")
        // ⚠️ No step-def match found for: I click save and continue button on Second Name Of Company Quoted Share Page

      Then("I am presented with the Second Value Of Quoted Share Page")
      thenIAmPresentedWithThe("Second Value Of Quoted Share Page")
        // ⚠️ No step-def match found for: I am presented with the Second Value Of Quoted Share Page

      When("I enter the following data into corresponding input fields on Second Value Of Quoted Share Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Value Of Company Quoted Share Page",
        Map("value" -> "400600"))
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Second Value Of Quoted Share Page

      And("I click save and continue button on Second Value Of Quoted Share Page")
      whenIClickSaveAndContinueButtonOn("Second Value Of Quoted Share Page")
        // ⚠️ No step-def match found for: I click save and continue button on Second Value Of Quoted Share Page

      Then("I am presented with the Second Number Of Quoted Share Page")
      thenIAmPresentedWithThe("Second Number Of Quoted Share Page")
        // ⚠️ No step-def match found for: I am presented with the Second Number Of Quoted Share Page

      When("I enter the following data into corresponding input fields on Number Of Quoted Share Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Number Of Company Quoted Share Page",
        Map("value" -> "402"))
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Number Of Quoted Share Page

      And("I click save and continue button on Second Number Of Quoted Share Page")
      whenIClickSaveAndContinueButtonOn("Second Number Of Quoted Share Page")
        // ⚠️ No step-def match found for: I click save and continue button on Second Number Of Quoted Share Page

      Then("I am presented with the Second Class Of Quoted Share Page")
      thenIAmPresentedWithThe("Second Class Of Quoted Share Page")
        // ⚠️ No step-def match found for: I am presented with the Second Class Of Quoted Share Page

      When("I enter the following data into corresponding input fields on Class Of Quoted Share Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Class Of Company Quoted Share Page",
        Map("value" -> "Class Quoted A"))
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Class Of Quoted Share Page

      And("I click save and continue button on Second Class Of Quoted Share Page")
      whenIClickSaveAndContinueButtonOn("Second Class Of Quoted Share Page")
        // ⚠️ No step-def match found for: I click save and continue button on Second Class Of Quoted Share Page

      Then("I am presented with the Second Quoted Share Check Your Answers Page")
      thenIAmPresentedWithThe("Second Quoted Share Check Your Answers Page")
        // ⚠️ No step-def match found for: I am presented with the Second Quoted Share Check Your Answers Page

      And("I should see the following details")
        andIShouldSeeTheFollowingDetails()  // auto-chosen (score=1.00, BaseStepDefinitionsSteps.scala)

      And("I click save and continue button on Second Quoted Share Check Your Answers Page")
      whenIClickSaveAndContinueButtonOn("Second Quoted Share Check Your Answers Page")
        // ⚠️ No step-def match found for: I click save and continue button on Second Quoted Share Check Your Answers Page

      Then("I am presented with the Quoted Share Amend Continue 2 Page")
      thenIAmPresentedWithThe("Quoted Share Amend Continue 2  Page")
        // ⚠️ No step-def match found for: I am presented with the Quoted Share Amend Continue 2 Page

      And("I should see the heading You have added 2 groups of quoted shares")
        andIShouldSeeTheHeadingX("You have added 2 groups of quoted shares")  // auto-chosen (score=0.88, BaseStepDefinitionsSteps.scala)

      When("I select radio button No on Quoted Share Amend Continue Page")
      whenISelectRadioButtonOn("No" , "Quoted Share Amend Continue Page")
        // ⚠️ No step-def match found for: I select radio button No on Quoted Share Amend Continue Page

      And("I click save and continue button on Quoted Share Amend Continue Page")
      whenIClickSaveAndContinueButtonOn("Quoted Share Amend Continue Page")
        // ⚠️ No step-def match found for: I click save and continue button on Quoted Share Amend Continue Page

      Then("I am presented with the Add Property Start Page")
      thenIAmPresentedWithThe("Add Property Start Page")
        // ⚠️ No step-def match found for: I am presented with the Add Property Start Page

      And("I click save and continue button on Add Property Start Page")
      whenIClickSaveAndContinueButtonOn("Add Property Start Page")
        // ⚠️ No step-def match found for: I click save and continue button on Add Property Start Page

      Then("I am presented with the Property Address Page")
      thenIAmPresentedWithThe("Add Property AddressPage")
        // ⚠️ No step-def match found for: I am presented with the Property Address Page

      When("I enter the following data into corresponding input fields on Property Address Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Property Address Page",
        Map("day" -> "14"))

      And("I click save and continue button on Property Address Page")
      whenIClickSaveAndContinueButtonOn("Add Property Address Page")
        // ⚠️ No step-def match found for: I click save and continue button on Property Address Page

      When("I enter the following data into corresponding input fields on Value Of Property Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Value Of Property Page",
        Map("value" -> "400700"))
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Value Of Property Page

      And("I click save and continue button on Value Of Property Page")
      whenIClickSaveAndContinueButtonOn("Value Of Property Page")
        // ⚠️ No step-def match found for: I click save and continue button on Value Of Property Page

      Then("I am presented with the Property Description Page")
      thenIAmPresentedWithThe("Property Description Page")
        // ⚠️ No step-def match found for: I am presented with the Property Description Page

      When("I enter the following data into corresponding input fields on Property Description Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Property Description Page",
        Map("value" -> "Property value description"))
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Property Description Page

      And("I click save and continue button on Property Description Page")
      whenIClickSaveAndContinueButtonOn("Property Description Page")
        // ⚠️ No step-def match found for: I click save and continue button on Property Description Page

      Then("I am presented with the Property Check Your Answers Page")
      thenIAmPresentedWithThe("Property Check Your Answers Page")
        // ⚠️ No step-def match found for: I am presented with the Property Check Your Answers Page

      And("I should see the following details")
        andIShouldSeeTheFollowingDetails()  // auto-chosen (score=1.00, BaseStepDefinitionsSteps.scala)

      And("I click save and continue button on Property Check Your Answers Page")
      whenIClickSaveAndContinueButtonOn("Property Check Your Answers Page")

      Then("I am presented with the Property Amend Continue Page")
      thenIAmPresentedWithThe("Property Amend Continue Page")

      And("I should see the heading You have added 1 property")
        andIShouldSeeTheHeadingX("You have added 1 property")  // auto-chosen (score=0.88, BaseStepDefinitionsSteps.scala)

      When("I select radio button No on Property Amend Continue Page")
      whenISelectRadioButtonOn("No" , "Property Amend Continue Page")

      And("I click save and continue button on Property Amend Continue Page")
      whenIClickSaveAndContinueButtonOn("Property Amend Continue Page")

      Then("I am presented with the Add Other Assets Start Page")
      thenIAmPresentedWithThe("Add Other Assets Start Page")

      And("I click save and continue button on Add Other Assets Start Page")
      whenIClickSaveAndContinueButtonOn("Add Other Assets Start Page")

      Then("I am presented with the Other Assets Description Page")
      thenIAmPresentedWithThe("Other Assets Description Page")

      When("I enter the following data into corresponding input fields on Other Assets Description Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Other Assets Description Page",
        Map("value" -> "Other Assets value description"))

      And("I click save and continue button on Other Assets Description Page")
      whenIClickSaveAndContinueButtonOn("Other Assets Description Page")

      Then("I am presented with the Other Assets Value Page")
      thenIAmPresentedWithThe("Other Assets Description Page")

      When("I enter the following data into corresponding input fields on Other Assets Value Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Other Assets Value Page",
        Map("value" -> "400800"))

      And("I click save and continue button on Other Assets Value Page")
      whenIClickSaveAndContinueButtonOn("Other Assets Description Page")

      Then("I am presented with the Other Assets Check Your Answers Page")
      thenIAmPresentedWithThe("Other Assets Description Page")

      And("I should see the following details")
        andIShouldSeeTheFollowingDetails()  // auto-chosen (score=1.00, BaseStepDefinitionsSteps.scala)

      And("I click save and continue button on Other Assets Check Your Answers Page")
      whenIClickSaveAndContinueButtonOn("Other Assets Check Your Answers Page")

      Then("I am presented with the Other Assets Amend Continue Page")
      thenIAmPresentedWithThe("Other Assets Amend Continue Page")

      And("I should see the heading You have added 1 asset")
        andIShouldSeeTheHeadingX("You have added 1 asset")  // auto-chosen (score=0.88, BaseStepDefinitionsSteps.scala)

      When("I select radio button No on Other Assets Amend Continue Page")
      whenISelectRadioButtonOn("No" ,"Other Assets Amend Continue Page")

      And("I click save and continue button on Other Assets Amend Continue Page")
      whenIClickSaveAndContinueButtonOn("Other Assets Check Your Answers Page")

      Then("I am presented with the Check Your Answers Page")
      thenIAmPresentedWithThe("Check Your Answers Page")

      And("I should see the following details")
        andIShouldSeeTheFollowingDetails()  // auto-chosen (score=1.00, BaseStepDefinitionsSteps.scala)

      And("I click save and continue button on Check Your Answers Page")
      whenIClickSaveAndContinueButtonOn("Check Your Answers Page")

      Then("I am presented with the Task List Page")
      thenIAmPresentedWithThe("Task List Page")

      Then("I see the status Completed for task Add details about the member")
      thenISeeTheStatusForTask("Completed","Add details about the member")

      Then("I see the status Completed for task Add information about the transfer")
      thenISeeTheStatusForTask("Completed","Add information about the transfer")

      Then("I see the status Completed for task Add information about the QROPS")
      thenISeeTheStatusForTask("Completed","Add information about the QROPS")

      Then("I see the status Completed for task Add QROPS scheme manager's details")
      thenISeeTheStatusForTask("Completed","Add QROPS scheme manager's details")

      Then("I see the status Not started yet for task Check your answers and submit the report")
      thenISeeTheStatusForTask("Not started yet","Check your answers and submit the report")

      And("I click on Check your answers and submit the report hyperlink on Dashboard Page")
      whenIClickOnHyperlinkOn("Check your answers and submit the report","Dashboard Page")

      Then("I am presented with the Final Check Your Answers Page")
//      thenIAmPresentedWithThe("Final Check Your Answers Page")

      When("I click on final-change-members-current-address button on Final Check Your Answers Page")
      whenIClickOnButtonOn("final-change-members-current-address","Final Check Your Answers Page")

      Then("I am presented with the Final Change Member Current Address Page")
      thenIAmPresentedWithThe("Final Change Member Current Address Page")

      And("I enter the following data into corresponding input fields on Final Change Member Current Address Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Final Change Member Current Address Page",
        Map("addressLine1" -> "78 Queensway Crescent"))

      And("I click save and continue button on Final Change Member Current Address Page")
      whenIClickSaveAndContinueButtonOn("Final Change Member Current Address Page")

      Then("I am presented with the Final Check Your Answers Page")
      thenIAmPresentedWithThe("Final Check Your Answers Page")

      And("I should see the following values on the page")
        thenIShouldSeeTheFollowingValuesOnThePage()  // auto-chosen (score=1.00, BaseStepDefinitionsSteps.scala)

      When("I click on final-change-amount-of-transfer button on Final Check Your Answers Page")
      whenIClickOnButtonOn("final-change-amount-of-transfer","Final Check Your Answers Page")

      Then("I am presented with the Final Change Amount Of Transfer Page")
      thenIAmPresentedWithThe("Final Change Amount Of Transfer Page")

      When("I enter the following data into corresponding input fields on Final Change Amount Of Transfer Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Final Change Amount Of Transfer Page",
        Map("value" -> "50000"))

      And("I click save and continue button on Final Change Amount Of Transfer Page")
      whenIClickSaveAndContinueButtonOn("Final Change Member Current Address Page")

      Then("I am presented with the Final Check Your Answers Page")
      thenIAmPresentedWithThe("Final Check Your Answers Page")

      And("I should see the following values on the page")
        thenIShouldSeeTheFollowingValuesOnThePage()  // auto-chosen (score=1.00, BaseStepDefinitionsSteps.scala)

      When("I click on final-change-qrops-reference button on Final Check Your Answers Page")
      whenIClickOnButtonOn("final-change-qrops-reference","Final Check Your Answers Page")

      Then("I am presented with the Final Change QROPS Reference Page")
      thenIAmPresentedWithThe("Final Change QROPS Reference Page")

      When("I enter the following data into corresponding input fields on Final Change QROPS Reference Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Final Change QROPS Reference Page",
        Map("qropsRef" -> "QROPS123456"))

      And("I click save and continue button on Final Change QROPS Reference Page")
      whenIClickSaveAndContinueButtonOn("Final Change Member Current Address Page")

      Then("I am presented with the Final Check Your Answers Page")
      thenIAmPresentedWithThe("Final Check Your Answers Page")

      And("I should see the following values on the page")
        thenIShouldSeeTheFollowingValuesOnThePage()  // auto-chosen (score=1.00, BaseStepDefinitionsSteps.scala)

      When("I click on final-change-scheme-managers-name button on Final Check Your Answers Page")
      whenIClickOnButtonOn("final-change-scheme-managers-name","Final Check Your Answers Page")

      Then("I am presented with the Final Change Scheme Managers Name Page")
      thenIAmPresentedWithThe("Final Change Scheme Managers Name Page")

      When("I enter the following data into corresponding input fields on Final Change Scheme Managers Name Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Final Change QROPS Reference Page",
        Map("schemeManagersFirstName" -> "Humpty"))

      And("I click save and continue button on Final Change Scheme Managers Name Page")
      whenIClickSaveAndContinueButtonOn("Final Change Scheme Managers Name Page")

      Then("I am presented with the Final Check Your Answers Page")
      thenIAmPresentedWithThe("Final Check Your Answers Page")

      And("I should see the following values on the page")
        thenIShouldSeeTheFollowingValuesOnThePage()  // auto-chosen (score=1.00, BaseStepDefinitionsSteps.scala)

      And("I click save and continue button on Final Check Your Answers Page")
      whenIClickSaveAndContinueButtonOn("Final Check Your Answers Page")

      Then("I am presented with the Final Submission Page")
      thenIAmPresentedWithThe("Final Submission Page")

      When("I select radio button Yes on Final Submission Page")
      whenISelectRadioButtonOn("Yes" , "Final Submission Page")

      And("I click save and continue button on Final Submission Page")
      whenIClickSaveAndContinueButtonOn("Final Submission Page")

      Then("I am presented with the Declaration Page")
      thenIAmPresentedWithThe("Declaration Page")

      And("I click agree and submit button on Declaration Page")
      whenIClickOnAgreeAndSendReturnButton("Declaration Page")

      Then("I am presented with the Transfer Submission Page")
      thenIAmPresentedWithThe("Transfer Submission Page")

      And("I should see the heading Transfer submitted")
        andIShouldSeeTheHeadingX("Transfer submitted")  // auto-chosen (score=0.88, BaseStepDefinitionsSteps.scala)

    }
  }
}
