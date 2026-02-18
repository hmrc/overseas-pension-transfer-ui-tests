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
import specs.tags.AllTests
import specsteps.BaseStepDefinitionsSteps._

class FullJourneySpec extends BaseSpec with Matchers {

  Feature("Is the members details journey fully connected") {

    Scenario(
      "1. Full Journey - PSA Starts a new transfer and submits",
      AllTests
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

      And ("I click on Start new transfer hyperlink on Dashboard Page")
      whenIClickStartNewTransferLink("Dashboard Page")

      Then ("I am presented with the What You Will Need Page")
      thenIAmPresentedWithThe("What You Will Need Page")

      And ("I click save and continue button on What You Will Need Page")
      whenIClickSaveAndContinueButtonOn("What You Will Need Page")

      Then ("I am presented with the Task List Page")
      thenIAmPresentedWithThe("Task List Page")

      When("I click on Add details about the member hyperlink on Task List Page")
      whenIClickStartMemberDetailsLink("Task List Page")

      Then("I am presented with the Member's Name Page")
      thenIAmPresentedWithThe("Member Name Page")

      When("I enter the following data into corresponding input fields on Member Name Page")
      Ienterthefollowingdataintocorrespondinginputfieldson("Member Name Page",
        Map("firstName" -> "John","lastName" -> "Doe"))

      When("I click continue button on Member Name Page")
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
        Map("day" -> "31","month" -> "12","year" -> "1991"))

      And("I click save and continue button on Member Date Of Birth Page")
      whenIClickSaveAndContinueButtonOn("Member Date Of Birth Page")

      Then("I am presented with the Members Current Address Page")
      thenIAmPresentedWithThe("Members Current Address Page")

      When("I enter the following data into corresponding input fields on Members Current Address Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Members Current Address Page", Map("addressLine1" -> "12 Burlington Avenue","addressLine2" -> "Burlington Road","addressLine3" -> "Maidenhead","addressLine4" -> "Berkshire","countryCode" -> "United Kingdom","postcode" -> "AB12CD","poBox" -> "11223344"))

      And("I click save and continue button on Members Current Address Page")
      whenIClickSaveAndContinueButtonOn("Members Current Address Page")

      Then("I am presented with the Is Member Currently UK Resident Page")
      thenIAmPresentedWithThe("Is Member Currently UK Resident Page")

      When("I select radio button Yes on Is Member Currently UK Resident Page")
      whenISelectRadioButtonOn("Yes" , "Is Member Currently UK Resident Page")

      And("I click save and continue button on Is Member Currently UK Resident Page")
      whenIClickSaveAndContinueButtonOn("Is Member Currently UK Resident Page")

      Then("I am presented with the Member Details Check Your Answers Page")
      thenIAmPresentedWithThe("Member Details Check Your Answers Page")

      And("I click save and continue button on Member Details Check Your Answers Page")
      whenIClickSaveAndContinueButtonOn("Member Details Check Your Answers Page")

      Then("I am presented with the Task List Page")
      thenIAmPresentedWithThe("Task List Page")

      When("I click on Add details the transfer hyperlink on Task List Page")
      whenIClickStartTransferDetailsLink("Task List Page")

      Then("I am presented with the Overseas Transfer Allowance Page")
      thenIAmPresentedWithThe("Overseas Transfer Allowance Page")

      When("I enter the following data into corresponding input fields on Overseas Transfer Allowance Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Member Date Of Leaving UK Page",
        Map("otAllowance" -> "100100"))

      And("I click save and continue button on Overseas Transfer Allowance Page")
      whenIClickSaveAndContinueButtonOn("Overseas Transfer Allowance Page")

      Then("I am presented with the Amount Of Transfer Page")
      thenIAmPresentedWithThe("Amount Of Transfer Page")

      When("I enter the following data into corresponding input fields on Amount Of Transfer Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Amount Of Transfer Page",
        Map("value" -> "100200"))

      And("I click save and continue button on Amount Of Transfer Page")
      whenIClickSaveAndContinueButtonOn("Amount Of Transfer Page")

      Then("I am presented with the Is Transfer Amount Taxable Page")
      thenIAmPresentedWithThe("Is Transfer Amount Taxable Page")

      When("I select radio button Yes on Is Transfer Amount Taxable Page")
      whenISelectRadioButtonOn("Yes" , "Is Transfer Amount Taxable Page")

      And("I click save and continue button on Is Transfer Amount Taxable Page")
      whenIClickSaveAndContinueButtonOn("Is Transfer Amount Taxable Page")

      Then("I am presented with the Why Transfer Amount Taxable Page")
      thenIAmPresentedWithThe("Why Transfer Amount Taxable Page")

      When("I select radio button Transfer exceeds member's overseas transfer allowance and there is an applicable exclusion. on Why Transfer Amount Taxable Page")
      whenISelectRadioButtonOn("Transfer exceeds member's overseas transfer allowance and there is an applicable exclusion." , "Why Transfer Amount Taxable Page")

      And("I click save and continue button on Why Transfer Amount Taxable Page")
      whenIClickSaveAndContinueButtonOn("Why Transfer Amount Taxable Page")

      Then("I am presented with the Applicable Transfer Exclusion Page")
      thenIAmPresentedWithThe("Applicable Transfer Exclusion Page")

      When("I select checkbox The QROPS is an occupational pension scheme and the individual is an employee of the sponsoring employer. on Applicable Transfer Exclusion Page")
      whenICheckboxOn("select","The QROPS is an occupational pension scheme and the individual is an employee of the sponsoring employer.","Applicable Transfer Exclusion Page")

      And("I select checkbox Both the individual and QROPS are resident in the same country. on Applicable Transfer Exclusion Page")
      whenICheckboxOn("select","Both the individual and QROPS are resident in the same country.","Applicable Transfer Exclusion Page")

      And("I click save and continue button on Applicable Transfer Exclusion Page")
      whenIClickSaveAndContinueButtonOn("Applicable Transfer Exclusion Page")

      Then("I am presented with the Amount Of Tax Deducted Page")
      thenIAmPresentedWithThe("Amount Of Tax Deducted Page")

      When("I enter the following data into corresponding input fields on Amount Of Tax Deducted Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Amount Of Tax Deducted Page",
        Map("taxDeducted" -> "100300"))

      And("I click save and continue button on Amount Of Tax Deducted Page")
      whenIClickSaveAndContinueButtonOn("Amount Of Tax Deducted Page")

      Then("I am presented with the Net Amount Transferred After Tax Page")
      thenIAmPresentedWithThe("Net Amount Transferred After Tax Page")

      When("I enter the following data into corresponding input fields on Net Amount Transferred After Tax Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Amount Of Tax Deducted Page",
        Map("netAmount" -> "100400"))

      And("I click save and continue button on Net Amount Transferred After Tax Page")
      whenIClickSaveAndContinueButtonOn("Net Amount Transferred After Tax Page")

      Then("I am presented with the Date Of Transfer Page")
      thenIAmPresentedWithThe("Date Of Transfer Page")

      When("I enter the following data into corresponding input fields on Date Of Transfer Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Date Of Transfer Page",
        Map("day" -> "31","month" -> "12","year" -> "2024"))

      And("I click save and continue button on Date Of Transfer Page")
      whenIClickSaveAndContinueButtonOn("Date Of Transfer Page")

      Then("I am presented with the Is Transfer Cash Only Page")
      thenIAmPresentedWithThe("Is Transfer Cash Only Page")

      When("I select radio button No on Is Transfer Cash Only Page")
      whenISelectRadioButtonOn("No" , "Is Transfer Cash Only Page")

      And("I click save and continue button on Is Transfer Cash Only Page")
      whenIClickSaveAndContinueButtonOn("Is Transfer Cash Only Page")

      Then("I am presented with the Type Of Asset Page")
      thenIAmPresentedWithThe("Type Of Asset Page")

      When("I select checkbox Cash on Type Of Asset Page")
      whenICheckboxOn("select","Cash","Type Of Asset Page")

      And("I select checkbox Unquoted shares on Type Of Asset Page")
      whenICheckboxOn("select","Unquoted shares","Type Of Asset Page")

      And("I select checkbox Quoted shares on Type Of Asset Page")
      whenICheckboxOn("select","Quoted shares","Type Of Asset Page")

      And("I select checkbox Property on Type Of Asset Page")
      whenICheckboxOn("select","Property","Type Of Asset Page")

      And("I select checkbox Other on Type Of Asset Page")
      whenICheckboxOn("select","Other","Type Of Asset Page")

      And("I click save and continue button on Type Of Asset Page")
      whenIClickSaveAndContinueButtonOn("Type Of Asset Page")

      Then("I am presented with the Amount Of Cash In Transfer Page")
      thenIAmPresentedWithThe("Amount Of Cash In Transfer Page")

      When("I enter the following data into corresponding input fields on Amount Of Cash In Transfer Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Amount Of Cash In Transfer Page",
        Map("cashInTransfer" -> "400300"))

      And("I click save and continue button on Amount Of Cash In Transfer Page")
      whenIClickSaveAndContinueButtonOn("Type Of Asset Page")

      Then("I am presented with the Add Unquoted Share Start Page")
      thenIAmPresentedWithThe("Add Unquoted Share Start Page")

      And("I click save and continue button on Add Unquoted Share Start Page")
      whenIClickSaveAndContinueButtonOn("Add Unquoted Share Start Page")

      Then("I am presented with the Name Of Company Unquoted Share Page")
      thenIAmPresentedWithThe("Name Of Company Unquoted Share Page")

      When("I enter the following data into corresponding input fields on Name Of Company Unquoted Share Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Name Of Company Unquoted Share Page",
        Map("value" -> "Unquoted Company Name"))

      And("I click save and continue button on Name Of Company Unquoted Share Page")
      whenIClickSaveAndContinueButtonOn("Name Of Company Unquoted Share Page")

      Then("I am presented with the Value Of Unquoted Share Page")
      thenIAmPresentedWithThe("Value Of Unquoted Share Page")

      When("I enter the following data into corresponding input fields on Value Of Unquoted Share Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Name Of Company Unquoted Share Page",
        Map("value" -> "400400"))

      And("I click save and continue button on Value Of Unquoted Share Page")
      whenIClickSaveAndContinueButtonOn("Name Of Company Unquoted Share Page")

      Then("I am presented with the Number Of Unquoted Share Page")
      thenIAmPresentedWithThe("Number Of Unquoted Share Page")

      When("I enter the following data into corresponding input fields on Number Of Unquoted Share Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Number Of Unquoted Share Page",
        Map("value" -> "400"))

      And("I click save and continue button on Number Of Unquoted Share Page")
      whenIClickSaveAndContinueButtonOn("Number Of Unquoted Share Page")

      Then("I am presented with the Class Of Unquoted Share Page")
      thenIAmPresentedWithThe("Class Of Unquoted Share Page")

      When("I enter the following data into corresponding input fields on Class Of Unquoted Share Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Class Of Unquoted Share Page",
        Map("value" -> "Unquoted Class"))

      And("I click save and continue button on Class Of Unquoted Share Page")
      whenIClickSaveAndContinueButtonOn("Class Of Unquoted Share Page")

      Then("I am presented with the Unquoted Share Check Your Answers Page")
      thenIAmPresentedWithThe("Unquoted Share Check Your Answers Page")

      And("I click save and continue button on Unquoted Share Check Your Answers Page")
      whenIClickSaveAndContinueButtonOn("Unquoted Share Check Your Answers Page")

      Then("I am presented with the Unquoted Share Amend Continue Page")
      thenIAmPresentedWithThe("Unquoted Share Amend Continue Page")

      When("I select radio button No on Unquoted Share Amend Continue Page")
      whenISelectRadioButtonOn("No" , "Unquoted Share Amend Continue Page")

      And("I click save and continue button on Unquoted Share Amend Continue Page")
      whenIClickSaveAndContinueButtonOn("Unquoted Share Check Your Answers Page")

      Then("I am presented with the Add Quoted Share Start Page")
      thenIAmPresentedWithThe("Add Quoted Share Start Page")

      And("I click save and continue button on Add Quoted Share Start Page")
      whenIClickSaveAndContinueButtonOn("Add Quoted Share Start Page")

      Then("I am presented with the Name Of Company Quoted Share Page")
      thenIAmPresentedWithThe("Name Of Company Quoted Share Page")

      When("I enter the following data into corresponding input fields on Name Of Company Quoted Share Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Name Of Company Quoted Share Page",
        Map("value" -> "Quoted Company Name"))

      And("I click save and continue button on Name Of Company Quoted Share Page")
      whenIClickSaveAndContinueButtonOn("Name Of Company Quoted Share Page")

      Then("I am presented with the Value Of Quoted Share Page")
      thenIAmPresentedWithThe("Value Of Quoted Share Page")

      When("I enter the following data into corresponding input fields on Value Of Quoted Share Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Name Of Company Quoted Share Page",
        Map("value" -> "400400"))

      And("I click save and continue button on Value Of Quoted Share Page")
      whenIClickSaveAndContinueButtonOn("Name Of Company Quoted Share Page")

      Then("I am presented with the Number Of Quoted Share Page")
      thenIAmPresentedWithThe("Number Of Quoted Share Page")

      When("I enter the following data into corresponding input fields on Number Of Quoted Share Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Number Of Quoted Share Page",
        Map("value" -> "400"))

      And("I click save and continue button on Number Of Quoted Share Page")
      whenIClickSaveAndContinueButtonOn("Number Of Quoted Share Page")

      Then("I am presented with the Class Of Quoted Share Page")
      thenIAmPresentedWithThe("Class Of Quoted Share Page")

      When("I enter the following data into corresponding input fields on Class Of Quoted Share Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Class Of Quoted Share Page",
        Map("value" -> "Quoted Class"))

      And("I click save and continue button on Class Of Quoted Share Page")
      whenIClickSaveAndContinueButtonOn("Class Of Quoted Share Page")

      Then("I am presented with the Quoted Share Check Your Answers Page")
      thenIAmPresentedWithThe("Quoted Share Check Your Answers Page")

      And("I click save and continue button on Quoted Share Check Your Answers Page")
      whenIClickSaveAndContinueButtonOn("Quoted Share Check Your Answers Page")

      Then("I am presented with the Quoted Share Amend Continue Page")
      thenIAmPresentedWithThe("Quoted Share Amend Continue Page")

      When("I select radio button Yes on Quoted Share Amend Continue Page")
      whenISelectRadioButtonOn("Yes" , "Quoted Share Amend Continue Page")

      And("I click save and continue button on Quoted Share Amend Continue Page")
      whenIClickSaveAndContinueButtonOn("Quoted Share Amend Continue Page")

      Then("I am presented with the Second Name Of Company Quoted Share Page")
      thenIAmPresentedWithThe("Second Name Of Company Quoted Share Page")

      When("I enter the following data into corresponding input fields on Name Of Company Quoted Share Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Name Of Company Quoted Share Page",
        Map("value" -> "Quoted Name of Company"))

      And("I click save and continue button on Second Name Of Company Quoted Share Page")
      whenIClickSaveAndContinueButtonOn("Second Name Of Company Quoted Share Page")

      Then("I am presented with the Second Value Of Quoted Share Page")
      thenIAmPresentedWithThe("Second Value Of Quoted Share Page")

      When("I enter the following data into corresponding input fields on Second Value Of Quoted Share Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Second Value Of Quoted Share Page",
        Map("value" -> "400600"))

      And("I click save and continue button on Second Value Of Quoted Share Page")
      whenIClickSaveAndContinueButtonOn("Second Value Of Quoted Share Page")

      Then("I am presented with the Second Number Of Quoted Share Page")
      thenIAmPresentedWithThe("Second Number Of Quoted Share Page")

      When("I enter the following data into corresponding input fields on Number Of Quoted Share Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Second Number Of Quoted Share Page",
        Map("value" -> "402"))

      And("I click save and continue button on Second Number Of Quoted Share Page")
      whenIClickSaveAndContinueButtonOn("Second Number Of Quoted Share Page")

      Then("I am presented with the Second Class Of Quoted Share Page")
      thenIAmPresentedWithThe("Second Class Of Quoted Share Page")

      When("I enter the following data into corresponding input fields on Class Of Quoted Share Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Class Of Quoted Share Page",
        Map("value" -> "Class Quoted A"))

      And("I click save and continue button on Second Class Of Quoted Share Page")
      whenIClickSaveAndContinueButtonOn("Second Class Of Quoted Share Page")

      Then("I am presented with the Second Quoted Share Check Your Answers Page")
      thenIAmPresentedWithThe("Second Quoted Share Check Your Answers Page")


      And("I click save and continue button on Second Quoted Share Check Your Answers Page")
      whenIClickSaveAndContinueButtonOn("Second Quoted Share Check Your Answers Page")

      Then("I am presented with the Quoted Share Amend Continue 2 Page")
      thenIAmPresentedWithThe("Quoted Share Amend Continue 2 Page")

      When("I select radio button No on Quoted Share Amend Continue Page")
      whenISelectRadioButtonOn("No" , "Quoted Share Amend Continue Page")

      And("I click save and continue button on Quoted Share Amend Continue Page")
      whenIClickSaveAndContinueButtonOn("Quoted Share Amend Continue Page")

      Then("I am presented with the Add Property Start Page")
      thenIAmPresentedWithThe("Add Property Start Page")

      And("I click save and continue button on Add Property Start Page")
      whenIClickSaveAndContinueButtonOn("Add Property Start Page")

      Then("I am presented with the Property Address Page")
      thenIAmPresentedWithThe("Property Address Page")

      When("I enter the following data into corresponding input fields on Property Address Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Property Address Page",
        Map("addressLine1" -> "221B Baker Street","addressLine2" -> "Marylebone","addressLine3" -> "London","addressLine4" -> "Greater London","countryCode" -> "United Kingdom","postcode" -> "NW16XE"))

      And("I click save and continue button on Property Address Page")
      whenIClickSaveAndContinueButtonOn("Property Address Page")

      When("I enter the following data into corresponding input fields on Value Of Property Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Value Of Property Page",
        Map("value" -> "400700"))

      And("I click save and continue button on Value Of Property Page")
      whenIClickSaveAndContinueButtonOn("Value Of Property Page")

      Then("I am presented with the Property Description Page")
      thenIAmPresentedWithThe("Property Description Page")

      When("I enter the following data into corresponding input fields on Property Description Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Property Description Page",
        Map("value" -> "Property value description"))

      And("I click save and continue button on Property Description Page")
      whenIClickSaveAndContinueButtonOn("Property Description Page")

      Then("I am presented with the Property Check Your Answers Page")
      thenIAmPresentedWithThe("Property Check Your Answers Page")

      And("I click save and continue button on Property Check Your Answers Page")
      whenIClickSaveAndContinueButtonOn("Property Check Your Answers Page")

      Then("I am presented with the Property Amend Continue Page")
      thenIAmPresentedWithThe("Property Amend Continue Page")

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
      thenIAmPresentedWithThe("Other Assets Value Page")

      When("I enter the following data into corresponding input fields on Other Assets Value Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Other Assets Value Page",
        Map("value" -> "400800"))

      And("I click save and continue button on Other Assets Value Page")
      whenIClickSaveAndContinueButtonOn("Other Assets Value Page")

      Then("I am presented with the Other Assets Check Your Answers Page")
      thenIAmPresentedWithThe("Other Assets Check Your Answers Page")

      And("I click save and continue button on Other Assets Check Your Answers Page")
      whenIClickSaveAndContinueButtonOn("Other Assets Check Your Answers Page")

      Then("I am presented with the Other Assets Amend Continue Page")
      thenIAmPresentedWithThe("Other Assets Amend Continue Page")

      When("I select radio button No on Other Assets Amend Continue Page")
      whenISelectRadioButtonOn("No" , "Other Assets Amend Continue Page")

      And("I click save and continue button on Other Assets Amend Continue Page")
      whenIClickSaveAndContinueButtonOn("Other Assets Amend Continue Page")

      Then("I am presented with the Check Your Answers Page")
      thenIAmPresentedWithThe("Check Your Answers Page")

      And("I click save and continue button on Check Your Answers Page")
      whenIClickSaveAndContinueButtonOn("Check Your Answers Page")

      Then("I am presented with the Task List Page")
      thenIAmPresentedWithThe("Task List Page")

      When("I click on Add information about the QROPS hyperlink on Task List Page")
      whenIClickStartQROPSDetailsLink("Task List Page")

      Then ("I am presented with the QROPS Name Page")
      thenIAmPresentedWithThe("QROPS Name Page")

      When("I enter the following data into corresponding input fields on QROPS Name Page")
      Ienterthefollowingdataintocorrespondinginputfieldson("QROPS Name Page", Map("qropsName" -> "The great QROPS"))

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
        Map("addressLine1" -> "21 Rosewood Close","addressLine2" -> "Maple Hill Estate","addressLine3" -> "Basingstoke","addressLine4" -> "Hampshire","addressLine5" -> "England","countryCode" -> "United Kingdom"))

      And("I click save and continue button on QROPS Address Page")
      whenIClickSaveAndContinueButtonOn("QROPS Reference Page")

      Then("I am presented with the QROPS Country Page")
      thenIAmPresentedWithThe("QROPS Country Page")

      When("I enter the following data into corresponding input fields on QROPS Country Page")
      Ienterthefollowingdataintocorrespondinginputfieldson("QROPS Country Page",
        Map("countryCode" -> "United Kingdom"))

      And("I click save and continue button on QROPS Country Page")
      whenIClickSaveAndContinueButtonOn("QROPS Country Page")

      And("I click save and continue button on QROPS Country Page")
      whenIClickSaveAndContinueButtonOn("QROPS Country Page")

      Then("I am presented with the QROPS Check Your Answers Page")
      thenIAmPresentedWithThe("QROPS Check Your Answers Page")

      And("I click save and continue button on QROPS Check Your Answers Page")
      whenIClickSaveAndContinueButtonOn("QROPS Check Your Answers Page")

      Then("I am presented with the Task List Page")
      thenIAmPresentedWithThe("Task List Page")

      When("I click on Add QROPS scheme manager's details hyperlink on Task List Page")
      whenIClickStartSchemeManagerDetailsLink("Task List Page")

      Then("I am presented with the Scheme Manager Type Page")
      thenIAmPresentedWithThe("Scheme Manager Type Page")

      When("I select radio button Individual on Scheme Manager Type Page")
      whenISelectRadioButtonOn("Individual" , "Scheme Manager Type Page")

      And("I click save and continue button on Scheme Manager Type Page")
      whenIClickSaveAndContinueButtonOn("Scheme Manager Type Page")

      Then("I am presented with the Scheme Manager Name Page")
      thenIAmPresentedWithThe("Scheme Manager Name Page")

      When("I enter the following data into corresponding input fields on Scheme Manager Name Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Scheme Manager Name Page",
        Map("schemeManagersFirstName" -> "Emily","schemeManagersLastName" -> "Parker"))

      And("I click save and continue button on Scheme Manager Name Page")
      whenIClickSaveAndContinueButtonOn("Scheme Manager Name Page")

      Then("I am presented with the Scheme Manager Address Page")
      thenIAmPresentedWithThe("Scheme Manager Address Page")

      When("I enter the following data into corresponding input fields on Scheme Manager Address Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Scheme Manager Address Page",
        Map("addressLine1" -> "88 Willow Street","addressLine2" -> "Oakwood Park","addressLine3" -> "Stratford","addressLine4" -> "Greater London","addressLine5" -> "England","countryCode" -> "United Kingdom"))

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

      And("I click save and continue button on Scheme Manager Check Your Answer Page")
      whenIClickSaveAndContinueButtonOn("Scheme Manager Check Your Answer Page")

      Then("I am presented with the Task List Page")
      thenIAmPresentedWithThe("Task List Page")


      And("I click on Check your answers and submit the report hyperlink on Task List Page")
      whenIClickFinalCYALink("Task List Page")

      Then("I am presented with the Final Check Your Answers Page")
     thenIAmPresentedWithThe("Final Check Your Answers Page")

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
      whenIClickSaveAndContinueButtonOn("Declaration Page")

      Then("I am presented with the Transfer Submission Page")
      thenIAmPresentedWithThe("Transfer Submission Page")

    }

    Scenario(
      "2. Full Journey - PSP Starts a new transfer and submits",
      AllTests
    )
    {
      Given("I cleared the data for the service")
      givenIClearedTheDataForTheService()

      When ("I navigate to the Auth Login Stub Page")
      navigateToPage(AuthLoginStubPage)

      And ("I enter redirect URL on Auth Login Stub Page for Journey entry URL")
      whenIEnterRedirectURLOnAuthLoginStubPageFor("Journey entry URL")

      When ("I enter Enrollment Key HMRC-PODS-ORG, Identifier Name PSAID and Identifier Value A2100005 on Auth Login Stub Page and submit")
      whenIEnterEnrollmentKey("HMRC-PODSPP-ORG","PSPID","21000005","Auth Login Stub Page")

      And ("I click submit button on Auth Login Stub Page")
      whenIClickSubmitButtonOn("Auth Login Stub Page")

      Then ("I am presented with the Dashboard page")
      thenIAmPresentedWithThe("Dashboard Page")

      And ("I click on Start new transfer hyperlink on Dashboard Page")
      whenIClickStartNewTransferLink("Dashboard Page")

      Then ("I am presented with the What You Will Need Page")
      thenIAmPresentedWithThe("What You Will Need Page")

      And ("I click save and continue button on What You Will Need Page")
      whenIClickSaveAndContinueButtonOn("What You Will Need Page")

      Then ("I am presented with the Task List Page")
      thenIAmPresentedWithThe("Task List Page")

      When("I click on Add details about the member hyperlink on Task List Page")
      whenIClickStartMemberDetailsLink("Task List Page")

      Then("I am presented with the Member's Name Page")
      thenIAmPresentedWithThe("Member Name Page")

      When("I enter the following data into corresponding input fields on Member Name Page")
      Ienterthefollowingdataintocorrespondinginputfieldson("Member Name Page",
        Map("firstName" -> "John","lastName" -> "Doe"))

      When("I click continue button on Member Name Page")
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
        Map("day" -> "31","month" -> "12","year" -> "1991"))

      And("I click save and continue button on Member Date Of Birth Page")
      whenIClickSaveAndContinueButtonOn("Member Date Of Birth Page")

      Then("I am presented with the Members Current Address Page")
      thenIAmPresentedWithThe("Members Current Address Page")

      When("I enter the following data into corresponding input fields on Members Current Address Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Members Current Address Page", Map("addressLine1" -> "12 Burlington Avenue","addressLine2" -> "Burlington Road","addressLine3" -> "Maidenhead","addressLine4" -> "Berkshire","countryCode" -> "United Kingdom","postcode" -> "AB12CD","poBox" -> "11223344"))

      And("I click save and continue button on Members Current Address Page")
      whenIClickSaveAndContinueButtonOn("Members Current Address Page")

      Then("I am presented with the Is Member Currently UK Resident Page")
      thenIAmPresentedWithThe("Is Member Currently UK Resident Page")

      When("I select radio button Yes on Is Member Currently UK Resident Page")
      whenISelectRadioButtonOn("Yes" , "Is Member Currently UK Resident Page")

      And("I click save and continue button on Is Member Currently UK Resident Page")
      whenIClickSaveAndContinueButtonOn("Is Member Currently UK Resident Page")

      Then("I am presented with the Member Details Check Your Answers Page")
      thenIAmPresentedWithThe("Member Details Check Your Answers Page")

      And("I click save and continue button on Member Details Check Your Answers Page")
      whenIClickSaveAndContinueButtonOn("Member Details Check Your Answers Page")

      Then("I am presented with the Task List Page")
      thenIAmPresentedWithThe("Task List Page")

      When("I click on Add details the transfer hyperlink on Task List Page")
      whenIClickStartTransferDetailsLink("Task List Page")

      Then("I am presented with the Overseas Transfer Allowance Page")
      thenIAmPresentedWithThe("Overseas Transfer Allowance Page")

      When("I enter the following data into corresponding input fields on Overseas Transfer Allowance Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Member Date Of Leaving UK Page",
        Map("otAllowance" -> "100100"))

      And("I click save and continue button on Overseas Transfer Allowance Page")
      whenIClickSaveAndContinueButtonOn("Overseas Transfer Allowance Page")

      Then("I am presented with the Amount Of Transfer Page")
      thenIAmPresentedWithThe("Amount Of Transfer Page")

      When("I enter the following data into corresponding input fields on Amount Of Transfer Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Amount Of Transfer Page",
        Map("value" -> "100200"))

      And("I click save and continue button on Amount Of Transfer Page")
      whenIClickSaveAndContinueButtonOn("Amount Of Transfer Page")

      Then("I am presented with the Is Transfer Amount Taxable Page")
      thenIAmPresentedWithThe("Is Transfer Amount Taxable Page")

      When("I select radio button Yes on Is Transfer Amount Taxable Page")
      whenISelectRadioButtonOn("Yes" , "Is Transfer Amount Taxable Page")

      And("I click save and continue button on Is Transfer Amount Taxable Page")
      whenIClickSaveAndContinueButtonOn("Is Transfer Amount Taxable Page")

      Then("I am presented with the Why Transfer Amount Taxable Page")
      thenIAmPresentedWithThe("Why Transfer Amount Taxable Page")

      When("I select radio button Transfer exceeds member's overseas transfer allowance and there is an applicable exclusion. on Why Transfer Amount Taxable Page")
      whenISelectRadioButtonOn("Transfer exceeds member's overseas transfer allowance and there is an applicable exclusion." , "Why Transfer Amount Taxable Page")

      And("I click save and continue button on Why Transfer Amount Taxable Page")
      whenIClickSaveAndContinueButtonOn("Why Transfer Amount Taxable Page")

      Then("I am presented with the Applicable Transfer Exclusion Page")
      thenIAmPresentedWithThe("Applicable Transfer Exclusion Page")

      When("I select checkbox The QROPS is an occupational pension scheme and the individual is an employee of the sponsoring employer. on Applicable Transfer Exclusion Page")
      whenICheckboxOn("select","The QROPS is an occupational pension scheme and the individual is an employee of the sponsoring employer.","Applicable Transfer Exclusion Page")

      And("I select checkbox Both the individual and QROPS are resident in the same country. on Applicable Transfer Exclusion Page")
      whenICheckboxOn("select","Both the individual and QROPS are resident in the same country.","Applicable Transfer Exclusion Page")

      And("I click save and continue button on Applicable Transfer Exclusion Page")
      whenIClickSaveAndContinueButtonOn("Applicable Transfer Exclusion Page")

      Then("I am presented with the Amount Of Tax Deducted Page")
      thenIAmPresentedWithThe("Amount Of Tax Deducted Page")

      When("I enter the following data into corresponding input fields on Amount Of Tax Deducted Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Amount Of Tax Deducted Page",
        Map("taxDeducted" -> "100300"))

      And("I click save and continue button on Amount Of Tax Deducted Page")
      whenIClickSaveAndContinueButtonOn("Amount Of Tax Deducted Page")

      Then("I am presented with the Net Amount Transferred After Tax Page")
      thenIAmPresentedWithThe("Net Amount Transferred After Tax Page")

      When("I enter the following data into corresponding input fields on Net Amount Transferred After Tax Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Amount Of Tax Deducted Page",
        Map("netAmount" -> "100400"))

      And("I click save and continue button on Net Amount Transferred After Tax Page")
      whenIClickSaveAndContinueButtonOn("Net Amount Transferred After Tax Page")

      Then("I am presented with the Date Of Transfer Page")
      thenIAmPresentedWithThe("Date Of Transfer Page")

      When("I enter the following data into corresponding input fields on Date Of Transfer Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Date Of Transfer Page",
        Map("day" -> "31","month" -> "12","year" -> "2024"))

      And("I click save and continue button on Date Of Transfer Page")
      whenIClickSaveAndContinueButtonOn("Date Of Transfer Page")

      Then("I am presented with the Is Transfer Cash Only Page")
      thenIAmPresentedWithThe("Is Transfer Cash Only Page")

      When("I select radio button No on Is Transfer Cash Only Page")
      whenISelectRadioButtonOn("No" , "Is Transfer Cash Only Page")

      And("I click save and continue button on Is Transfer Cash Only Page")
      whenIClickSaveAndContinueButtonOn("Is Transfer Cash Only Page")

      Then("I am presented with the Type Of Asset Page")
      thenIAmPresentedWithThe("Type Of Asset Page")

      When("I select checkbox Cash on Type Of Asset Page")
      whenICheckboxOn("select","Cash","Type Of Asset Page")

      And("I select checkbox Unquoted shares on Type Of Asset Page")
      whenICheckboxOn("select","Unquoted shares","Type Of Asset Page")

      And("I select checkbox Quoted shares on Type Of Asset Page")
      whenICheckboxOn("select","Quoted shares","Type Of Asset Page")

      And("I select checkbox Property on Type Of Asset Page")
      whenICheckboxOn("select","Property","Type Of Asset Page")

      And("I select checkbox Other on Type Of Asset Page")
      whenICheckboxOn("select","Other","Type Of Asset Page")

      And("I click save and continue button on Type Of Asset Page")
      whenIClickSaveAndContinueButtonOn("Type Of Asset Page")

      Then("I am presented with the Amount Of Cash In Transfer Page")
      thenIAmPresentedWithThe("Amount Of Cash In Transfer Page")

      When("I enter the following data into corresponding input fields on Amount Of Cash In Transfer Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Amount Of Cash In Transfer Page",
        Map("cashInTransfer" -> "400300"))

      And("I click save and continue button on Amount Of Cash In Transfer Page")
      whenIClickSaveAndContinueButtonOn("Type Of Asset Page")

      Then("I am presented with the Add Unquoted Share Start Page")
      thenIAmPresentedWithThe("Add Unquoted Share Start Page")

      And("I click save and continue button on Add Unquoted Share Start Page")
      whenIClickSaveAndContinueButtonOn("Add Unquoted Share Start Page")

      Then("I am presented with the Name Of Company Unquoted Share Page")
      thenIAmPresentedWithThe("Name Of Company Unquoted Share Page")

      When("I enter the following data into corresponding input fields on Name Of Company Unquoted Share Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Name Of Company Unquoted Share Page",
        Map("value" -> "Unquoted Company Name"))

      And("I click save and continue button on Name Of Company Unquoted Share Page")
      whenIClickSaveAndContinueButtonOn("Name Of Company Unquoted Share Page")

      Then("I am presented with the Value Of Unquoted Share Page")
      thenIAmPresentedWithThe("Value Of Unquoted Share Page")

      When("I enter the following data into corresponding input fields on Value Of Unquoted Share Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Name Of Company Unquoted Share Page",
        Map("value" -> "400400"))

      And("I click save and continue button on Value Of Unquoted Share Page")
      whenIClickSaveAndContinueButtonOn("Name Of Company Unquoted Share Page")

      Then("I am presented with the Number Of Unquoted Share Page")
      thenIAmPresentedWithThe("Number Of Unquoted Share Page")

      When("I enter the following data into corresponding input fields on Number Of Unquoted Share Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Number Of Unquoted Share Page",
        Map("value" -> "400"))

      And("I click save and continue button on Number Of Unquoted Share Page")
      whenIClickSaveAndContinueButtonOn("Number Of Unquoted Share Page")

      Then("I am presented with the Class Of Unquoted Share Page")
      thenIAmPresentedWithThe("Class Of Unquoted Share Page")

      When("I enter the following data into corresponding input fields on Class Of Unquoted Share Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Class Of Unquoted Share Page",
        Map("value" -> "Unquoted Class"))

      And("I click save and continue button on Class Of Unquoted Share Page")
      whenIClickSaveAndContinueButtonOn("Class Of Unquoted Share Page")

      Then("I am presented with the Unquoted Share Check Your Answers Page")
      thenIAmPresentedWithThe("Unquoted Share Check Your Answers Page")

      And("I click save and continue button on Unquoted Share Check Your Answers Page")
      whenIClickSaveAndContinueButtonOn("Unquoted Share Check Your Answers Page")

      Then("I am presented with the Unquoted Share Amend Continue Page")
      thenIAmPresentedWithThe("Unquoted Share Amend Continue Page")

      When("I select radio button No on Unquoted Share Amend Continue Page")
      whenISelectRadioButtonOn("No" , "Unquoted Share Amend Continue Page")

      And("I click save and continue button on Unquoted Share Amend Continue Page")
      whenIClickSaveAndContinueButtonOn("Unquoted Share Check Your Answers Page")

      Then("I am presented with the Add Quoted Share Start Page")
      thenIAmPresentedWithThe("Add Quoted Share Start Page")

      And("I click save and continue button on Add Quoted Share Start Page")
      whenIClickSaveAndContinueButtonOn("Add Quoted Share Start Page")

      Then("I am presented with the Name Of Company Quoted Share Page")
      thenIAmPresentedWithThe("Name Of Company Quoted Share Page")

      When("I enter the following data into corresponding input fields on Name Of Company Quoted Share Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Name Of Company Quoted Share Page",
        Map("value" -> "Quoted Company Name"))

      And("I click save and continue button on Name Of Company Quoted Share Page")
      whenIClickSaveAndContinueButtonOn("Name Of Company Quoted Share Page")

      Then("I am presented with the Value Of Quoted Share Page")
      thenIAmPresentedWithThe("Value Of Quoted Share Page")

      When("I enter the following data into corresponding input fields on Value Of Quoted Share Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Name Of Company Quoted Share Page",
        Map("value" -> "400400"))

      And("I click save and continue button on Value Of Quoted Share Page")
      whenIClickSaveAndContinueButtonOn("Name Of Company Quoted Share Page")

      Then("I am presented with the Number Of Quoted Share Page")
      thenIAmPresentedWithThe("Number Of Quoted Share Page")

      When("I enter the following data into corresponding input fields on Number Of Quoted Share Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Number Of Quoted Share Page",
        Map("value" -> "400"))

      And("I click save and continue button on Number Of Quoted Share Page")
      whenIClickSaveAndContinueButtonOn("Number Of Quoted Share Page")

      Then("I am presented with the Class Of Quoted Share Page")
      thenIAmPresentedWithThe("Class Of Quoted Share Page")

      When("I enter the following data into corresponding input fields on Class Of Quoted Share Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Class Of Quoted Share Page",
        Map("value" -> "Quoted Class"))

      And("I click save and continue button on Class Of Quoted Share Page")
      whenIClickSaveAndContinueButtonOn("Class Of Quoted Share Page")

      Then("I am presented with the Quoted Share Check Your Answers Page")
      thenIAmPresentedWithThe("Quoted Share Check Your Answers Page")

      And("I click save and continue button on Quoted Share Check Your Answers Page")
      whenIClickSaveAndContinueButtonOn("Quoted Share Check Your Answers Page")

      Then("I am presented with the Quoted Share Amend Continue Page")
      thenIAmPresentedWithThe("Quoted Share Amend Continue Page")

      When("I select radio button Yes on Quoted Share Amend Continue Page")
      whenISelectRadioButtonOn("Yes" , "Quoted Share Amend Continue Page")

      And("I click save and continue button on Quoted Share Amend Continue Page")
      whenIClickSaveAndContinueButtonOn("Quoted Share Amend Continue Page")

      Then("I am presented with the Second Name Of Company Quoted Share Page")
      thenIAmPresentedWithThe("Second Name Of Company Quoted Share Page")

      When("I enter the following data into corresponding input fields on Name Of Company Quoted Share Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Name Of Company Quoted Share Page",
        Map("value" -> "Quoted Name of Company"))

      And("I click save and continue button on Second Name Of Company Quoted Share Page")
      whenIClickSaveAndContinueButtonOn("Second Name Of Company Quoted Share Page")

      Then("I am presented with the Second Value Of Quoted Share Page")
      thenIAmPresentedWithThe("Second Value Of Quoted Share Page")

      When("I enter the following data into corresponding input fields on Second Value Of Quoted Share Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Second Value Of Quoted Share Page",
        Map("value" -> "400600"))

      And("I click save and continue button on Second Value Of Quoted Share Page")
      whenIClickSaveAndContinueButtonOn("Second Value Of Quoted Share Page")

      Then("I am presented with the Second Number Of Quoted Share Page")
      thenIAmPresentedWithThe("Second Number Of Quoted Share Page")

      When("I enter the following data into corresponding input fields on Number Of Quoted Share Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Second Number Of Quoted Share Page",
        Map("value" -> "402"))

      And("I click save and continue button on Second Number Of Quoted Share Page")
      whenIClickSaveAndContinueButtonOn("Second Number Of Quoted Share Page")

      Then("I am presented with the Second Class Of Quoted Share Page")
      thenIAmPresentedWithThe("Second Class Of Quoted Share Page")

      When("I enter the following data into corresponding input fields on Class Of Quoted Share Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Class Of Quoted Share Page",
        Map("value" -> "Class Quoted A"))

      And("I click save and continue button on Second Class Of Quoted Share Page")
      whenIClickSaveAndContinueButtonOn("Second Class Of Quoted Share Page")

      Then("I am presented with the Second Quoted Share Check Your Answers Page")
      thenIAmPresentedWithThe("Second Quoted Share Check Your Answers Page")


      And("I click save and continue button on Second Quoted Share Check Your Answers Page")
      whenIClickSaveAndContinueButtonOn("Second Quoted Share Check Your Answers Page")

      Then("I am presented with the Quoted Share Amend Continue 2 Page")
      thenIAmPresentedWithThe("Quoted Share Amend Continue 2 Page")

      When("I select radio button No on Quoted Share Amend Continue Page")
      whenISelectRadioButtonOn("No" , "Quoted Share Amend Continue Page")

      And("I click save and continue button on Quoted Share Amend Continue Page")
      whenIClickSaveAndContinueButtonOn("Quoted Share Amend Continue Page")

      Then("I am presented with the Add Property Start Page")
      thenIAmPresentedWithThe("Add Property Start Page")

      And("I click save and continue button on Add Property Start Page")
      whenIClickSaveAndContinueButtonOn("Add Property Start Page")

      Then("I am presented with the Property Address Page")
      thenIAmPresentedWithThe("Property Address Page")

      When("I enter the following data into corresponding input fields on Property Address Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Property Address Page",
        Map("addressLine1" -> "221B Baker Street","addressLine2" -> "Marylebone","addressLine3" -> "London","addressLine4" -> "Greater London","countryCode" -> "United Kingdom","postcode" -> "NW16XE"))

      And("I click save and continue button on Property Address Page")
      whenIClickSaveAndContinueButtonOn("Property Address Page")

      When("I enter the following data into corresponding input fields on Value Of Property Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Value Of Property Page",
        Map("value" -> "400700"))

      And("I click save and continue button on Value Of Property Page")
      whenIClickSaveAndContinueButtonOn("Value Of Property Page")

      Then("I am presented with the Property Description Page")
      thenIAmPresentedWithThe("Property Description Page")

      When("I enter the following data into corresponding input fields on Property Description Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Property Description Page",
        Map("value" -> "Property value description"))

      And("I click save and continue button on Property Description Page")
      whenIClickSaveAndContinueButtonOn("Property Description Page")

      Then("I am presented with the Property Check Your Answers Page")
      thenIAmPresentedWithThe("Property Check Your Answers Page")

      And("I click save and continue button on Property Check Your Answers Page")
      whenIClickSaveAndContinueButtonOn("Property Check Your Answers Page")

      Then("I am presented with the Property Amend Continue Page")
      thenIAmPresentedWithThe("Property Amend Continue Page")

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
      thenIAmPresentedWithThe("Other Assets Value Page")

      When("I enter the following data into corresponding input fields on Other Assets Value Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Other Assets Value Page",
        Map("value" -> "400800"))

      And("I click save and continue button on Other Assets Value Page")
      whenIClickSaveAndContinueButtonOn("Other Assets Value Page")

      Then("I am presented with the Other Assets Check Your Answers Page")
      thenIAmPresentedWithThe("Other Assets Check Your Answers Page")

      And("I click save and continue button on Other Assets Check Your Answers Page")
      whenIClickSaveAndContinueButtonOn("Other Assets Check Your Answers Page")

      Then("I am presented with the Other Assets Amend Continue Page")
      thenIAmPresentedWithThe("Other Assets Amend Continue Page")

      When("I select radio button No on Other Assets Amend Continue Page")
      whenISelectRadioButtonOn("No" , "Other Assets Amend Continue Page")

      And("I click save and continue button on Other Assets Amend Continue Page")
      whenIClickSaveAndContinueButtonOn("Other Assets Amend Continue Page")

      Then("I am presented with the Check Your Answers Page")
      thenIAmPresentedWithThe("Check Your Answers Page")

      And("I click save and continue button on Check Your Answers Page")
      whenIClickSaveAndContinueButtonOn("Check Your Answers Page")

      Then("I am presented with the Task List Page")
      thenIAmPresentedWithThe("Task List Page")

      When("I click on Add information about the QROPS hyperlink on Task List Page")
      whenIClickStartQROPSDetailsLink("Task List Page")

      Then ("I am presented with the QROPS Name Page")
      thenIAmPresentedWithThe("QROPS Name Page")

      When("I enter the following data into corresponding input fields on QROPS Name Page")
      Ienterthefollowingdataintocorrespondinginputfieldson("QROPS Name Page", Map("qropsName" -> "The great QROPS"))

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
        Map("addressLine1" -> "21 Rosewood Close","addressLine2" -> "Maple Hill Estate","addressLine3" -> "Basingstoke","addressLine4" -> "Hampshire","addressLine5" -> "England","countryCode" -> "United Kingdom"))

      And("I click save and continue button on QROPS Address Page")
      whenIClickSaveAndContinueButtonOn("QROPS Reference Page")

      Then("I am presented with the QROPS Country Page")
      thenIAmPresentedWithThe("QROPS Country Page")

      When("I enter the following data into corresponding input fields on QROPS Country Page")
      Ienterthefollowingdataintocorrespondinginputfieldson("QROPS Country Page",
        Map("countryCode" -> "United Kingdom"))

      And("I click save and continue button on QROPS Country Page")
      whenIClickSaveAndContinueButtonOn("QROPS Country Page")

      And("I click save and continue button on QROPS Country Page")
      whenIClickSaveAndContinueButtonOn("QROPS Country Page")

      Then("I am presented with the QROPS Check Your Answers Page")
      thenIAmPresentedWithThe("QROPS Check Your Answers Page")

      And("I click save and continue button on QROPS Check Your Answers Page")
      whenIClickSaveAndContinueButtonOn("QROPS Check Your Answers Page")

      Then("I am presented with the Task List Page")
      thenIAmPresentedWithThe("Task List Page")

      When("I click on Add QROPS scheme manager's details hyperlink on Task List Page")
      whenIClickStartSchemeManagerDetailsLink("Task List Page")

      Then("I am presented with the Scheme Manager Type Page")
      thenIAmPresentedWithThe("Scheme Manager Type Page")

      When("I select radio button Individual on Scheme Manager Type Page")
      whenISelectRadioButtonOn("Individual" , "Scheme Manager Type Page")

      And("I click save and continue button on Scheme Manager Type Page")
      whenIClickSaveAndContinueButtonOn("Scheme Manager Type Page")

      Then("I am presented with the Scheme Manager Name Page")
      thenIAmPresentedWithThe("Scheme Manager Name Page")

      When("I enter the following data into corresponding input fields on Scheme Manager Name Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Scheme Manager Name Page",
        Map("schemeManagersFirstName" -> "Emily","schemeManagersLastName" -> "Parker"))

      And("I click save and continue button on Scheme Manager Name Page")
      whenIClickSaveAndContinueButtonOn("Scheme Manager Name Page")

      Then("I am presented with the Scheme Manager Address Page")
      thenIAmPresentedWithThe("Scheme Manager Address Page")

      When("I enter the following data into corresponding input fields on Scheme Manager Address Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Scheme Manager Address Page",
        Map("addressLine1" -> "88 Willow Street","addressLine2" -> "Oakwood Park","addressLine3" -> "Stratford","addressLine4" -> "Greater London","addressLine5" -> "England","countryCode" -> "United Kingdom"))

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

      And("I click save and continue button on Scheme Manager Check Your Answer Page")
      whenIClickSaveAndContinueButtonOn("Scheme Manager Check Your Answer Page")

      Then("I am presented with the Task List Page")
      thenIAmPresentedWithThe("Task List Page")


      And("I click on Check your answers and submit the report hyperlink on Task List Page")
      whenIClickFinalCYALink("Task List Page")

      Then("I am presented with the Final Check Your Answers Page")
      thenIAmPresentedWithThe("Final Check Your Answers Page")

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

      And("I click save and continue button on Final Check Your Answers Page")
      whenIClickSaveAndContinueButtonOn("Final Check Your Answers Page")

      Then("I am presented with the Final Submission Page")
      thenIAmPresentedWithThe("Final Submission Page")

      When("I select radio button Yes on Final Submission Page")
      whenISelectRadioButtonOn("Yes" , "Final Submission Page")

      And("I click save and continue button on Final Submission Page")
      whenIClickSaveAndContinueButtonOn("Final Submission Page")

      Then("I am presented with the Psp Declaration Page")
      thenIAmPresentedWithThe("Psp Declaration Page")

      Ienterthefollowingdataintocorrespondinginputfieldson ("Psp Declaration Page",
        Map("value" -> "A2100005"))

      And("I click agree and submit button on Declaration Page")
      whenIClickSaveAndContinueButtonOn("Declaration Page")

      Then("I am presented with the Transfer Submission Page")
      thenIAmPresentedWithThe("Transfer Submission Page")

    }
  }
}
