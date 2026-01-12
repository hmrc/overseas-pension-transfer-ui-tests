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
import specsteps.BaseStepDefinitionsSteps.{andIShouldSeeTheFollowingDetails, andIShouldSeeTheHeadingX}
import uk.gov.hmrc.otc.cucumber.stepDefinitions.Hooks.{And, Then, When}

class TransferDetailsFullJourneySpec extends AnyFeatureSpec with Matchers {

  Feature("Is the Transfer details journey fully connected") {

    Scenario("1. Full Transfer Details - Transfer Amount Taxable with applicable exclusion - Cash only") {
      And("I navigated to the Overseas Transfer Allowance Page")
        // ⚠️ No step-def match found for: I navigated to the Overseas Transfer Allowance Page

      Then("I am presented with the Overseas Transfer Allowance Page")
        // ⚠️ No step-def match found for: I am presented with the Overseas Transfer Allowance Page

      When("I enter the following data into corresponding input fields on Overseas Transfer Allowance Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Overseas Transfer Allowance Page

      And("I click save and continue button on Overseas Transfer Allowance Page")
        // ⚠️ No step-def match found for: I click save and continue button on Overseas Transfer Allowance Page

      Then("I am presented with the Amount Of Transfer Page")
        // ⚠️ No step-def match found for: I am presented with the Amount Of Transfer Page

      When("I enter the following data into corresponding input fields on Amount Of Transfer Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Amount Of Transfer Page

      And("I click save and continue button on Amount Of Transfer Page")
        // ⚠️ No step-def match found for: I click save and continue button on Amount Of Transfer Page

      Then("I am presented with the Is Transfer Amount Taxable Page")
        // ⚠️ No step-def match found for: I am presented with the Is Transfer Amount Taxable Page

      When("I select radio button Yes on Is Transfer Amount Taxable Page")
        // ⚠️ No step-def match found for: I select radio button Yes on Is Transfer Amount Taxable Page

      And("I click save and continue button on Is Transfer Amount Taxable Page")
        // ⚠️ No step-def match found for: I click save and continue button on Is Transfer Amount Taxable Page

      Then("I am presented with the Why Transfer Amount Taxable Page")
        // ⚠️ No step-def match found for: I am presented with the Why Transfer Amount Taxable Page

      When("I select radio button Transfer exceeds member's overseas transfer allowance and there is an applicable exclusion. on Why Transfer Amount Taxable Page")
        // ⚠️ No step-def match found for: I select radio button Transfer exceeds member's overseas transfer allowance and there is an applicable exclusion. on Why Transfer Amount Taxable Page

      And("I click save and continue button on Why Transfer Amount Taxable Page")
        // ⚠️ No step-def match found for: I click save and continue button on Why Transfer Amount Taxable Page

      Then("I am presented with the Applicable Transfer Exclusion Page")
        // ⚠️ No step-def match found for: I am presented with the Applicable Transfer Exclusion Page

      When("I select checkbox The QROPS is an occupational pension scheme and the individual is an employee of the sponsoring employer. on Applicable Transfer Exclusion Page")
        // ⚠️ No step-def match found for: I select checkbox The QROPS is an occupational pension scheme and the individual is an employee of the sponsoring employer. on Applicable Transfer Exclusion Page

      And("I select checkbox Both the individual and QROPS are resident in the same country. on Applicable Transfer Exclusion Page")
        // ⚠️ No step-def match found for: I select checkbox Both the individual and QROPS are resident in the same country. on Applicable Transfer Exclusion Page

      And("I click save and continue button on Applicable Transfer Exclusion Page")
        // ⚠️ No step-def match found for: I click save and continue button on Applicable Transfer Exclusion Page

      Then("I am presented with the Amount Of Tax Deducted Page")
        // ⚠️ No step-def match found for: I am presented with the Amount Of Tax Deducted Page

      When("I enter the following data into corresponding input fields on Amount Of Tax Deducted Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Amount Of Tax Deducted Page

      And("I click save and continue button on Amount Of Tax Deducted Page")
        // ⚠️ No step-def match found for: I click save and continue button on Amount Of Tax Deducted Page

      Then("I am presented with the Net Amount Transferred After Tax Page")
        // ⚠️ No step-def match found for: I am presented with the Net Amount Transferred After Tax Page

      When("I enter the following data into corresponding input fields on Net Amount Transferred After Tax Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Net Amount Transferred After Tax Page

      And("I click save and continue button on Net Amount Transferred After Tax Page")
        // ⚠️ No step-def match found for: I click save and continue button on Net Amount Transferred After Tax Page

      Then("I am presented with the Date Of Transfer Page")
        // ⚠️ No step-def match found for: I am presented with the Date Of Transfer Page

      When("I enter the following data into corresponding input fields on Date Of Transfer Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Date Of Transfer Page

      And("I click save and continue button on Date Of Transfer Page")
        // ⚠️ No step-def match found for: I click save and continue button on Date Of Transfer Page

      Then("I am presented with the Is Transfer Cash Only Page")
        // ⚠️ No step-def match found for: I am presented with the Is Transfer Cash Only Page

      When("I select radio button Yes on Is Transfer Cash Only Page")
        // ⚠️ No step-def match found for: I select radio button Yes on Is Transfer Cash Only Page

      And("I click save and continue button on Is Transfer Cash Only Page")
        // ⚠️ No step-def match found for: I click save and continue button on Is Transfer Cash Only Page

      Then("I am presented with the Transfer Details Check Your Answers Page")
        // ⚠️ No step-def match found for: I am presented with the Transfer Details Check Your Answers Page

      And("I should see the following details")
        andIShouldSeeTheFollowingDetails()  // auto-chosen (score=1.00, BaseStepDefinitionsSteps.scala)

      And("I click save and continue button on Transfer Details Check Your Answers Page")
        // ⚠️ No step-def match found for: I click save and continue button on Transfer Details Check Your Answers Page

      Then("I am presented with the Task List Page")
        // ⚠️ No step-def match found for: I am presented with the Task List Page

    }

    Scenario("2. Full Transfer Details - Transfer Amount Taxable with no applicable exclusion - Cash only") {
      And("I navigated to the Overseas Transfer Allowance Page")
        // ⚠️ No step-def match found for: I navigated to the Overseas Transfer Allowance Page

      Then("I am presented with the Overseas Transfer Allowance Page")
        // ⚠️ No step-def match found for: I am presented with the Overseas Transfer Allowance Page

      When("I enter the following data into corresponding input fields on Overseas Transfer Allowance Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Overseas Transfer Allowance Page

      And("I click save and continue button on Overseas Transfer Allowance Page")
        // ⚠️ No step-def match found for: I click save and continue button on Overseas Transfer Allowance Page

      Then("I am presented with the Amount Of Transfer Page")
        // ⚠️ No step-def match found for: I am presented with the Amount Of Transfer Page

      When("I enter the following data into corresponding input fields on Amount Of Transfer Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Amount Of Transfer Page

      And("I click save and continue button on Amount Of Transfer Page")
        // ⚠️ No step-def match found for: I click save and continue button on Amount Of Transfer Page

      Then("I am presented with the Is Transfer Amount Taxable Page")
        // ⚠️ No step-def match found for: I am presented with the Is Transfer Amount Taxable Page

      When("I select radio button Yes on Is Transfer Amount Taxable Page")
        // ⚠️ No step-def match found for: I select radio button Yes on Is Transfer Amount Taxable Page

      And("I click save and continue button on Is Transfer Amount Taxable Page")
        // ⚠️ No step-def match found for: I click save and continue button on Is Transfer Amount Taxable Page

      Then("I am presented with the Why Transfer Amount Taxable Page")
        // ⚠️ No step-def match found for: I am presented with the Why Transfer Amount Taxable Page

      When("I select radio button There is no applicable exclusion. on Why Transfer Amount Taxable Page")
        // ⚠️ No step-def match found for: I select radio button There is no applicable exclusion. on Why Transfer Amount Taxable Page

      And("I click save and continue button on Why Transfer Amount Taxable Page")
        // ⚠️ No step-def match found for: I click save and continue button on Why Transfer Amount Taxable Page

      Then("I am presented with the Amount Of Tax Deducted Page")
        // ⚠️ No step-def match found for: I am presented with the Amount Of Tax Deducted Page

      When("I enter the following data into corresponding input fields on Amount Of Tax Deducted Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Amount Of Tax Deducted Page

      And("I click save and continue button on Amount Of Tax Deducted Page")
        // ⚠️ No step-def match found for: I click save and continue button on Amount Of Tax Deducted Page

      Then("I am presented with the Net Amount Transferred After Tax Page")
        // ⚠️ No step-def match found for: I am presented with the Net Amount Transferred After Tax Page

      When("I enter the following data into corresponding input fields on Net Amount Transferred After Tax Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Net Amount Transferred After Tax Page

      And("I click save and continue button on Net Amount Transferred After Tax Page")
        // ⚠️ No step-def match found for: I click save and continue button on Net Amount Transferred After Tax Page

      Then("I am presented with the Date Of Transfer Page")
        // ⚠️ No step-def match found for: I am presented with the Date Of Transfer Page

      When("I enter the following data into corresponding input fields on Date Of Transfer Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Date Of Transfer Page

      And("I click save and continue button on Date Of Transfer Page")
        // ⚠️ No step-def match found for: I click save and continue button on Date Of Transfer Page

      Then("I am presented with the Is Transfer Cash Only Page")
        // ⚠️ No step-def match found for: I am presented with the Is Transfer Cash Only Page

      When("I select radio button Yes on Is Transfer Cash Only Page")
        // ⚠️ No step-def match found for: I select radio button Yes on Is Transfer Cash Only Page

      And("I click save and continue button on Is Transfer Cash Only Page")
        // ⚠️ No step-def match found for: I click save and continue button on Is Transfer Cash Only Page

      Then("I am presented with the Transfer Details Check Your Answers Page")
        // ⚠️ No step-def match found for: I am presented with the Transfer Details Check Your Answers Page

      And("I should see the following details")
        andIShouldSeeTheFollowingDetails()  // auto-chosen (score=1.00, BaseStepDefinitionsSteps.scala)

      And("I click save and continue button on Transfer Details Check Your Answers Page")
        // ⚠️ No step-def match found for: I click save and continue button on Transfer Details Check Your Answers Page

      Then("I am presented with the Task List Page")
        // ⚠️ No step-def match found for: I am presented with the Task List Page

    }

    Scenario("3. Full Transfer Details - Transfer Amount Is Not Taxable - Cash only") {
      And("I navigated to the Overseas Transfer Allowance Page")
        // ⚠️ No step-def match found for: I navigated to the Overseas Transfer Allowance Page

      Then("I am presented with the Overseas Transfer Allowance Page")
        // ⚠️ No step-def match found for: I am presented with the Overseas Transfer Allowance Page

      When("I enter the following data into corresponding input fields on Overseas Transfer Allowance Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Overseas Transfer Allowance Page

      And("I click save and continue button on Overseas Transfer Allowance Page")
        // ⚠️ No step-def match found for: I click save and continue button on Overseas Transfer Allowance Page

      Then("I am presented with the Amount Of Transfer Page")
        // ⚠️ No step-def match found for: I am presented with the Amount Of Transfer Page

      When("I enter the following data into corresponding input fields on Amount Of Transfer Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Amount Of Transfer Page

      And("I click save and continue button on Amount Of Transfer Page")
        // ⚠️ No step-def match found for: I click save and continue button on Amount Of Transfer Page

      Then("I am presented with the Is Transfer Amount Taxable Page")
        // ⚠️ No step-def match found for: I am presented with the Is Transfer Amount Taxable Page

      When("I select radio button No on Is Transfer Amount Taxable Page")
        // ⚠️ No step-def match found for: I select radio button No on Is Transfer Amount Taxable Page

      And("I click save and continue button on Is Transfer Amount Taxable Page")
        // ⚠️ No step-def match found for: I click save and continue button on Is Transfer Amount Taxable Page

      Then("I am presented with the Why Transfer is not Taxable Page")
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

      When("I select radio button Yes on Is Transfer Cash Only Page")
        // ⚠️ No step-def match found for: I select radio button Yes on Is Transfer Cash Only Page

      And("I click save and continue button on Is Transfer Cash Only Page")
        // ⚠️ No step-def match found for: I click save and continue button on Is Transfer Cash Only Page

      Then("I am presented with the Transfer Details Check Your Answers Page")
        // ⚠️ No step-def match found for: I am presented with the Transfer Details Check Your Answers Page

      And("I should see the following details")
        andIShouldSeeTheFollowingDetails()  // auto-chosen (score=1.00, BaseStepDefinitionsSteps.scala)

      And("I click save and continue button on Transfer Details Check Your Answers Page")
        // ⚠️ No step-def match found for: I click save and continue button on Transfer Details Check Your Answers Page

      Then("I am presented with the Task List Page")
        // ⚠️ No step-def match found for: I am presented with the Task List Page

    }

    Scenario("4. Full Transfer Details - Transfer Amount Is Not Taxable - Cash, Unquoted, Quoted, Properties, Other") {
      And("I navigated to the Overseas Transfer Allowance Page")
        // ⚠️ No step-def match found for: I navigated to the Overseas Transfer Allowance Page

      Then("I am presented with the Overseas Transfer Allowance Page")
        // ⚠️ No step-def match found for: I am presented with the Overseas Transfer Allowance Page

      When("I enter the following data into corresponding input fields on Overseas Transfer Allowance Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Overseas Transfer Allowance Page

      And("I click save and continue button on Overseas Transfer Allowance Page")
        // ⚠️ No step-def match found for: I click save and continue button on Overseas Transfer Allowance Page

      Then("I am presented with the Amount Of Transfer Page")
        // ⚠️ No step-def match found for: I am presented with the Amount Of Transfer Page

      When("I enter the following data into corresponding input fields on Amount Of Transfer Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Amount Of Transfer Page

      And("I click save and continue button on Amount Of Transfer Page")
        // ⚠️ No step-def match found for: I click save and continue button on Amount Of Transfer Page

      Then("I am presented with the Is Transfer Amount Taxable Page")
        // ⚠️ No step-def match found for: I am presented with the Is Transfer Amount Taxable Page

      When("I select radio button No on Is Transfer Amount Taxable Page")
        // ⚠️ No step-def match found for: I select radio button No on Is Transfer Amount Taxable Page

      And("I click save and continue button on Is Transfer Amount Taxable Page")
        // ⚠️ No step-def match found for: I click save and continue button on Is Transfer Amount Taxable Page

      Then("I am presented with the Why Transfer is not Taxable Page")
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

    }

    Scenario("5 . Full Transfer Details - Transfer Amount Is Not Taxable - Unquoted, Quoted, Other") {
      And("I navigated to the Overseas Transfer Allowance Page")
        // ⚠️ No step-def match found for: I navigated to the Overseas Transfer Allowance Page

      Then("I am presented with the Overseas Transfer Allowance Page")
        // ⚠️ No step-def match found for: I am presented with the Overseas Transfer Allowance Page

      When("I enter the following data into corresponding input fields on Overseas Transfer Allowance Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Overseas Transfer Allowance Page

      And("I click save and continue button on Overseas Transfer Allowance Page")
        // ⚠️ No step-def match found for: I click save and continue button on Overseas Transfer Allowance Page

      Then("I am presented with the Amount Of Transfer Page")
        // ⚠️ No step-def match found for: I am presented with the Amount Of Transfer Page

      When("I enter the following data into corresponding input fields on Amount Of Transfer Page")
        // ⚠️ No step-def match found for: I enter the following data into corresponding input fields on Amount Of Transfer Page

      And("I click save and continue button on Amount Of Transfer Page")
        // ⚠️ No step-def match found for: I click save and continue button on Amount Of Transfer Page

      Then("I am presented with the Is Transfer Amount Taxable Page")
        // ⚠️ No step-def match found for: I am presented with the Is Transfer Amount Taxable Page

      When("I select radio button No on Is Transfer Amount Taxable Page")
        // ⚠️ No step-def match found for: I select radio button No on Is Transfer Amount Taxable Page

      And("I click save and continue button on Is Transfer Amount Taxable Page")
        // ⚠️ No step-def match found for: I click save and continue button on Is Transfer Amount Taxable Page

      Then("I am presented with the Why Transfer is not Taxable Page")
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

      And("I select checkbox Unquoted shares on Type Of Asset Page")
        // ⚠️ No step-def match found for: I select checkbox Unquoted shares on Type Of Asset Page

      And("I select checkbox Quoted shares on Type Of Asset Page")
        // ⚠️ No step-def match found for: I select checkbox Quoted shares on Type Of Asset Page

      And("I select checkbox Other on Type Of Asset Page")
        // ⚠️ No step-def match found for: I select checkbox Other on Type Of Asset Page

      And("I click save and continue button on Type Of Asset Page")
        // ⚠️ No step-def match found for: I click save and continue button on Type Of Asset Page

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

      When("I select radio button No on Quoted Share Amend Continue Page")
        // ⚠️ No step-def match found for: I select radio button No on Quoted Share Amend Continue Page

      And("I click save and continue button on Quoted Share Amend Continue Page")
        // ⚠️ No step-def match found for: I click save and continue button on Quoted Share Amend Continue Page

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

    }
  }
}
