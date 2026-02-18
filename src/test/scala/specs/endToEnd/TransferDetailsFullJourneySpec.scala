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
import specpage.overseasPension.transferDetails.OverseasTransferAllowancePage
import specs.BaseSpec
import specs.tags.AllTests
import specsteps.BaseStepDefinitionsSteps.{Ienterthefollowingdataintocorrespondinginputfieldson, givenIClearedTheDataForTheService, navigateToPage, thenIAmPresentedWithThe, whenICheckboxOn, whenIClickSaveAndContinueButtonOn, whenIClickStartNewTransferLink, whenIClickSubmitButtonOn, whenIEnterEnrollmentKey, whenIEnterRedirectURLOnAuthLoginStubPageFor, whenISelectRadioButtonOn}

class TransferDetailsFullJourneySpec extends BaseSpec with Matchers {

  Feature("Is the Transfer details journey fully connected") {

    Scenario(
      "1. Full Transfer Details - Transfer Amount Taxable with applicable exclusion - Cash only",
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

      And("I navigated to the Overseas Transfer Allowance Page")
      navigateToPage(OverseasTransferAllowancePage)

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

      When("I select radio button Yes on Is Transfer Cash Only Page")
      whenISelectRadioButtonOn("Yes" , "Is Transfer Cash Only Page")

      And("I click save and continue button on Is Transfer Cash Only Page")
      whenIClickSaveAndContinueButtonOn("Is Transfer Cash Only Page")

      Then("I am presented with the Transfer Details Check Your Answers Page")
      thenIAmPresentedWithThe("Transfer Details Check Your Answers Page")

      And("I click save and continue button on Transfer Details Check Your Answers Page")
      whenIClickSaveAndContinueButtonOn("Transfer Details Check Your Answers Page")

      Then("I am presented with the Task List Page")
      thenIAmPresentedWithThe("Task List Page")
    }

    Scenario(
      "2. Full Transfer Details - Transfer Amount Taxable with no applicable exclusion - Cash only",
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

      And("I navigated to the Overseas Transfer Allowance Page")
      navigateToPage(OverseasTransferAllowancePage)

      Then("I am presented with the Overseas Transfer Allowance Page")
      thenIAmPresentedWithThe("Overseas Transfer Allowance Page")

      When("I enter the following data into corresponding input fields on Overseas Transfer Allowance Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Member Date Of Leaving UK Page",
        Map("otAllowance" -> "200100"))

      And("I click save and continue button on Overseas Transfer Allowance Page")
      whenIClickSaveAndContinueButtonOn("Overseas Transfer Allowance Page")

      Then("I am presented with the Amount Of Transfer Page")
      thenIAmPresentedWithThe("Amount Of Transfer Page")

      When("I enter the following data into corresponding input fields on Amount Of Transfer Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Amount Of Transfer Page",
        Map("value" -> "200200"))

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

      When("I select radio button There is no applicable exclusion. on Why Transfer Amount Taxable Page")
      whenISelectRadioButtonOn("There is no applicable exclusion." , "Why Transfer Amount Taxable Page")

      And("I click save and continue button on Why Transfer Amount Taxable Page")
      whenIClickSaveAndContinueButtonOn("Why Transfer Amount Taxable Page")

      Then("I am presented with the Amount Of Tax Deducted Page")
      thenIAmPresentedWithThe("Amount Of Tax Deducted Page")

      When("I enter the following data into corresponding input fields on Amount Of Tax Deducted Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Amount Of Tax Deducted Page",
        Map("taxDeducted" -> "200300"))

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
        Map("day" -> "13","month" -> "02","year" -> "2020"))

      And("I click save and continue button on Date Of Transfer Page")
      whenIClickSaveAndContinueButtonOn("Date Of Transfer Page")

      Then("I am presented with the Is Transfer Cash Only Page")
      thenIAmPresentedWithThe("Is Transfer Cash Only Page")

      When("I select radio button Yes on Is Transfer Cash Only Page")
      whenISelectRadioButtonOn("Yes" , "Is Transfer Cash Only Page")

      And("I click save and continue button on Is Transfer Cash Only Page")
      whenIClickSaveAndContinueButtonOn("Is Transfer Cash Only Page")

      Then("I am presented with the Transfer Details Check Your Answers Page")
      thenIAmPresentedWithThe("Transfer Details Check Your Answers Page")

      And("I click save and continue button on Transfer Details Check Your Answers Page")
      whenIClickSaveAndContinueButtonOn("Transfer Details Check Your Answers Page")

      Then("I am presented with the Task List Page")
      thenIAmPresentedWithThe("Task List Page")

    }

    Scenario(
      "3. Full Transfer Details - Transfer Amount Is Not Taxable - Cash only",
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

      And("I navigated to the Overseas Transfer Allowance Page")
      navigateToPage(OverseasTransferAllowancePage)

      Then("I am presented with the Overseas Transfer Allowance Page")
      thenIAmPresentedWithThe("Overseas Transfer Allowance Page")

      When("I enter the following data into corresponding input fields on Overseas Transfer Allowance Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Member Date Of Leaving UK Page",
        Map("otAllowance" -> "200100"))

      And("I click save and continue button on Overseas Transfer Allowance Page")
      whenIClickSaveAndContinueButtonOn("Overseas Transfer Allowance Page")

      Then("I am presented with the Amount Of Transfer Page")
      thenIAmPresentedWithThe("Amount Of Transfer Page")

      When("I enter the following data into corresponding input fields on Amount Of Transfer Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Amount Of Transfer Page",
        Map("value" -> "200200"))

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

      When("I select radio button There is no applicable exclusion. on Why Transfer Amount Taxable Page")
      whenISelectRadioButtonOn("There is no applicable exclusion." , "Why Transfer Amount Taxable Page")

      And("I click save and continue button on Why Transfer Amount Taxable Page")
      whenIClickSaveAndContinueButtonOn("Why Transfer Amount Taxable Page")

      Then("I am presented with the Amount Of Tax Deducted Page")
      thenIAmPresentedWithThe("Amount Of Tax Deducted Page")

      When("I enter the following data into corresponding input fields on Amount Of Tax Deducted Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Amount Of Tax Deducted Page",
        Map("taxDeducted" -> "200300"))

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
        Map("day" -> "13","month" -> "02","year" -> "2020"))

      And("I click save and continue button on Date Of Transfer Page")
      whenIClickSaveAndContinueButtonOn("Date Of Transfer Page")

      Then("I am presented with the Is Transfer Cash Only Page")
      thenIAmPresentedWithThe("Is Transfer Cash Only Page")

      When("I select radio button Yes on Is Transfer Cash Only Page")
      whenISelectRadioButtonOn("Yes" , "Is Transfer Cash Only Page")

      And("I click save and continue button on Is Transfer Cash Only Page")
      whenIClickSaveAndContinueButtonOn("Is Transfer Cash Only Page")

      Then("I am presented with the Transfer Details Check Your Answers Page")
      thenIAmPresentedWithThe("Transfer Details Check Your Answers Page")

      And("I click save and continue button on Transfer Details Check Your Answers Page")
      whenIClickSaveAndContinueButtonOn("Transfer Details Check Your Answers Page")

      Then("I am presented with the Task List Page")
      thenIAmPresentedWithThe("Task List Page")

    }

    Scenario(
      "4. Full Transfer Details - Transfer Amount Is Not Taxable - Cash, Unquoted, Quoted, Properties, Other",
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

      And("I navigated to the Overseas Transfer Allowance Page")
      navigateToPage(OverseasTransferAllowancePage)

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

    }

    Scenario(
      "5 . Full Transfer Details - Transfer Amount Is Not Taxable - Unquoted, Quoted, Other",
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

      And("I navigated to the Overseas Transfer Allowance Page")
      navigateToPage(OverseasTransferAllowancePage)

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

      And("I select checkbox Unquoted shares on Type Of Asset Page")
      whenICheckboxOn("select","Unquoted shares","Type Of Asset Page")

      And("I select checkbox Quoted shares on Type Of Asset Page")
      whenICheckboxOn("select","Quoted shares","Type Of Asset Page")

      And("I select checkbox Other on Type Of Asset Page")
      whenICheckboxOn("select","Other","Type Of Asset Page")

      And("I click save and continue button on Type Of Asset Page")
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
      Ienterthefollowingdataintocorrespondinginputfieldson ("Value Of Unquoted Share Page",
        Map("value" -> "400400"))

      And("I click save and continue button on Value Of Unquoted Share Page")
      whenIClickSaveAndContinueButtonOn("Value Of Unquoted Share Page")

      Then("I am presented with the Number Of Unquoted Share Page")
      thenIAmPresentedWithThe("Number Of Unquoted Share Page")

      When("I enter the following data into corresponding input fields on Number Of Unquoted Share Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Value Of Unquoted Share Page",
        Map("value" -> "400400"))

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
      whenIClickSaveAndContinueButtonOn("Unquoted Share Amend Continue Page")

      Then("I am presented with the Add Quoted Share Start Page")
      thenIAmPresentedWithThe("Add Quoted Share Start Page")

      And("I click save and continue button on Add Quoted Share Start Page")
      whenIClickSaveAndContinueButtonOn("Add Quoted Share Start Page")

      Then("I am presented with the Name Of Company Quoted Share Page")
      thenIAmPresentedWithThe("Name Of Company Quoted Share Page")

      When("I enter the following data into corresponding input fields on Name Of Company Quoted Share Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Name Of Company Quoted Share Page",
        Map("value" -> "Unquoted Class"))

      And("I click save and continue button on Name Of Company Quoted Share Page")
      whenIClickSaveAndContinueButtonOn("Name Of Company Quoted Share Page")

      Then("I am presented with the Value Of Quoted Share Page")
      thenIAmPresentedWithThe("Value Of Quoted Share Page")

      When("I enter the following data into corresponding input fields on Value Of Quoted Share Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Value Of Quoted Share Page",
        Map("value" -> "400500"))

      And("I click save and continue button on Value Of Quoted Share Page")
      whenIClickSaveAndContinueButtonOn("Value Of Quoted Share Page")

      Then("I am presented with the Number Of Quoted Share Page")
      thenIAmPresentedWithThe("Number Of Quoted Share Page")

      When("I enter the following data into corresponding input fields on Number Of Quoted Share Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Number Of Quoted Share Page",
        Map("value" -> "401"))

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

      When("I select radio button No on Quoted Share Amend Continue Page")
      whenISelectRadioButtonOn("No" , "Quoted Share Amend Continue Page")

      And("I click save and continue button on Quoted Share Amend Continue Page")
      whenIClickSaveAndContinueButtonOn("Quoted Share Amend Continue Page")

      Then("I am presented with the Add Other Assets Start Page")
      thenIAmPresentedWithThe("Add Other Assets Start Page")

      And("I click save and continue button on Add Other Assets Start Page")
      whenIClickSaveAndContinueButtonOn("Add Other Assets Start Page")

      Then("I am presented with the Other Assets Description Page")
      thenIAmPresentedWithThe("Other Assets Description Page")

      When("I enter the following data into corresponding input fields on Other Assets Description Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Other Assets Description Page",
        Map("value" -> "Other Assets description"))

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

    }
  }
}
