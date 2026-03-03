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

import specpage.auth.AuthLoginStubPage
import specpage.overseasPension.qropsSchemeManagerDetails.SchemeManagerTypePage
import specs.BaseSpec
import specs.tags.AllTests
import specsteps.BaseStepDefinitionsSteps.*

class SchemeManagerDetailsFullJourneySpec extends BaseSpec {

  Feature("Scheme manager details journey") {

    Scenario(
      "1. Full Scheme Manager Details Journey - Individual",
      AllTests
     ) {
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
      And("I navigated to the Scheme Manager Type Page")
        navigateToPage(SchemeManagerTypePage)
      Then("I am presented with the Scheme Manager Type Page")
        thenIAmPresentedWithThe("Scheme Manager Type Page")
      When("I select radio button Individual on Scheme Manager Type Page")
        whenISelectRadioButtonOn("Individual" , "Scheme Manager Type Page")
      And("I click save and continue button on Scheme Manager Type Page")
        whenIClickSaveAndContinueButtonOn("Scheme Manager Type Page")
      Then("I am presented with the Scheme Manager Name Page")
        thenIAmPresentedWithThe("Scheme Manager Name Page")
      When("I enter the following data into corresponding input fields on Scheme Manager Name Page")
        Ienterthefollowingdataintocorrespondinginputfieldson (
          Map("schemeManagersFirstName" -> "Emily","schemeManagersLastName" -> "Parker")
        )
      And("I click save and continue button on Scheme Manager Name Page")
        whenIClickSaveAndContinueButtonOn("Scheme Manager Name Page")
      Then("I am presented with the Scheme Manager Address Page")
        thenIAmPresentedWithThe("Scheme Manager Address Page")
      When("I enter the following data into corresponding input fields on Scheme Manager Address Page")
        Ienterthefollowingdataintocorrespondinginputfieldson (
          Map("addressLine1" -> "88 Willow Street","addressLine2" -> "Oakwood Park","addressLine3" -> "Stratford","addressLine4" -> "Greater London","addressLine5" -> "England","countryCode" -> "United Kingdom")
        )
      And("I click save and continue button on Scheme Manager Address Page")
        whenIClickSaveAndContinueButtonOn("Scheme Manager Address Page")
      Then("I am presented with the Scheme Manager Email Page")
        thenIAmPresentedWithThe("Scheme Manager Email Page")
      When("I enter the following data into corresponding input fields on Scheme Manager Email Page")
        Ienterthefollowingdataintocorrespondinginputfieldson (
          Map("emailAddress" -> "thismail@gmail.com")
        )
      And("I click save and continue button on Scheme Manager Email Page")
        whenIClickSaveAndContinueButtonOn("Scheme Manager Email Page")
      Then("I am presented with the Scheme Manager Telephone Page")
        thenIAmPresentedWithThe("Scheme Manager Telephone Page")
      When("I enter the following data into corresponding input fields on Scheme Manager Telephone Page")
        Ienterthefollowingdataintocorrespondinginputfieldson (
          Map("contactNumber" -> "+441234567890")
        )
      And("I click save and continue button on Scheme Manager Telephone Page")
        whenIClickSaveAndContinueButtonOn("Scheme Manager Telephone Page")
      Then("I am presented with the Scheme Manager Check Your Answer Page")
        thenIAmPresentedWithThe("Scheme Manager Check Your Answer Page")
       And("I click save and continue button on Scheme Manager Check Your Answer Page")
        whenIClickSaveAndContinueButtonOn("Scheme Manager Check Your Answer Page")
       Then("I am presented with the Task List Page")
        thenIAmPresentedWithThe("Task List Page")
    }

    Scenario(
      "2. Full Scheme Manager Details Journey - Organisation",
      AllTests
    ) {
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
      And("I navigated to the Scheme Manager Type Page")
        navigateToPage(SchemeManagerTypePage)
      Then("I am presented with the Scheme Manager Type Page")
        thenIAmPresentedWithThe("Scheme Manager Type Page")
      When("I select radio button Organisation on Scheme Manager Type Page")
        whenISelectRadioButtonOn("Organisation" , "Scheme Manager Type Page")
      And("I click save and continue button on Scheme Manager Type Page")
        whenIClickSaveAndContinueButtonOn("Scheme Manager Type Page")
      Then("I am presented with the Organisation Name Page")
        thenIAmPresentedWithThe("Organisation Name Page")
      When("I enter the following data into corresponding input fields on Organisation Name Page")
        Ienterthefollowingdataintocorrespondinginputfieldson (
          Map("organisationName" -> "Great Organisation")
        )
      And("I click save and continue button on Organisation Name Page")
        whenIClickSaveAndContinueButtonOn("Organisation Name Page")
      Then("I am presented with the Organisation Individual Name Page")
        thenIAmPresentedWithThe("Organisation Individual Name Page")
      When("I enter the following data into corresponding input fields on Organisation Individual Name Page")
        Ienterthefollowingdataintocorrespondinginputfieldson (
          Map("orgIndFirstName" -> "Sarah","orgIndLastName" -> "Thompson")
        )
      And("I click save and continue button on Scheme Manager Name Page")
        whenIClickSaveAndContinueButtonOn("Scheme Manager Name Page")
      Then("I am presented with the Scheme Manager Address Page")
        thenIAmPresentedWithThe("Scheme Manager Address Page")
      When("I enter the following data into corresponding input fields on Scheme Manager Address Page")
        Ienterthefollowingdataintocorrespondinginputfieldson (
          Map("addressLine1" -> "99 Elm Street","addressLine2" -> "Greenfield Estate","addressLine3" -> "Cambridge","addressLine4" -> "Cambridgeshire","addressLine5" -> "East of England","countryCode" -> "United Kingdom")
        )
      And("I click save and continue button on Scheme Manager Address Page")
        whenIClickSaveAndContinueButtonOn("Scheme Manager Address Page")
      Then("I am presented with the Scheme Manager Email Page")
        thenIAmPresentedWithThe("Scheme Manager Email Page")
      When("I enter the following data into corresponding input fields on Scheme Manager Email Page")
        Ienterthefollowingdataintocorrespondinginputfieldson (
          Map("emailAddress" -> "thismail@gmail.com")
        )
      And("I click save and continue button on Scheme Manager Email Page")
        whenIClickSaveAndContinueButtonOn("Scheme Manager Email Page")
      Then("I am presented with the Scheme Manager Telephone Page")
        thenIAmPresentedWithThe("Scheme Manager Telephone Page")
      When("I enter the following data into corresponding input fields on Scheme Manager Telephone Page")
        Ienterthefollowingdataintocorrespondinginputfieldson (
          Map("contactNumber" -> "+441234567890")
        )
      And("I click save and continue button on Scheme Manager Telephone Page")
        whenIClickSaveAndContinueButtonOn("Scheme Manager Telephone Page")
      Then("I am presented with the Scheme Manager Check Your Answer Page")
        thenIAmPresentedWithThe("Scheme Manager Check Your Answer Page")
      And("I click save and continue button on Scheme Manager Check Your Answer Page")
        whenIClickSaveAndContinueButtonOn("Scheme Manager Check Your Answer Page")
      Then("I am presented with the Task List Page")
        thenIAmPresentedWithThe("Task List Page")
    }

    Scenario(
      "3. Full Scheme Manager Details Journey - Organisation - CYA routing",
      AllTests
    ) {
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
      And("I navigated to the Scheme Manager Type Page")
        navigateToPage(SchemeManagerTypePage)
      Then("I am presented with the Scheme Manager Type Page")
        thenIAmPresentedWithThe("Scheme Manager Type Page")
      When("I select radio button Organisation on Scheme Manager Type Page")
        whenISelectRadioButtonOn("Organisation" , "Scheme Manager Type Page")
      And("I click save and continue button on Scheme Manager Type Page")
        whenIClickSaveAndContinueButtonOn("Scheme Manager Type Page")
      Then("I am presented with the Organisation Name Page")
        thenIAmPresentedWithThe("Organisation Name Page")
      When("I enter the following data into corresponding input fields on Organisation Name Page")
        Ienterthefollowingdataintocorrespondinginputfieldson (
          Map("organisationName" -> "Great Organisation")
        )
      And("I click save and continue button on Organisation Name Page")
        whenIClickSaveAndContinueButtonOn("Organisation Name Page")
      Then("I am presented with the Organisation Individual Name Page")
        thenIAmPresentedWithThe("Organisation Individual Name Page")
      When("I enter the following data into corresponding input fields on Organisation Individual Name Page")
        Ienterthefollowingdataintocorrespondinginputfieldson (
          Map("orgIndFirstName" -> "Sarah","orgIndLastName" -> "Thompson")
        )
      And("I click save and continue button on Scheme Manager Name Page")
        whenIClickSaveAndContinueButtonOn("Scheme Manager Name Page")
      Then("I am presented with the Scheme Manager Address Page")
        thenIAmPresentedWithThe("Scheme Manager Address Page")
      When("I enter the following data into corresponding input fields on Scheme Manager Address Page")
        Ienterthefollowingdataintocorrespondinginputfieldson (
          Map("addressLine1" -> "99 Elm Street","addressLine2" -> "Greenfield Estate","addressLine3" -> "Cambridge","addressLine4" -> "Cambridgeshire","addressLine5" -> "East of England","countryCode" -> "United Kingdom")
        )
      And("I click save and continue button on Scheme Manager Address Page")
        whenIClickSaveAndContinueButtonOn("Scheme Manager Address Page")
      Then("I am presented with the Scheme Manager Email Page")
        thenIAmPresentedWithThe("Scheme Manager Email Page")
      When("I enter the following data into corresponding input fields on Scheme Manager Email Page")
        Ienterthefollowingdataintocorrespondinginputfieldson (
          Map("emailAddress" -> "thismail@gmail.com")
        )
      And("I click save and continue button on Scheme Manager Email Page")
        whenIClickSaveAndContinueButtonOn("Scheme Manager Email Page")
      Then("I am presented with the Scheme Manager Telephone Page")
        thenIAmPresentedWithThe("Scheme Manager Telephone Page")
      When("I enter the following data into corresponding input fields on Scheme Manager Telephone Page")
        Ienterthefollowingdataintocorrespondinginputfieldson (
          Map("contactNumber" -> "+441234567890")
        )
      And("I click save and continue button on Scheme Manager Telephone Page")
        whenIClickSaveAndContinueButtonOn("Scheme Manager Telephone Page")
      Then("I am presented with the Scheme Manager Check Your Answer Page")
        thenIAmPresentedWithThe("Scheme Manager Check Your Answer Page")
      When("I click on change-organisation-name button on Check Your Answers Page")
        whenIClickOnButtonOn("change-organisation-name")
      Then("I am presented with the Change Organisation Name Page")
        thenIAmPresentedWithThe("Change Organisation Name Page")
      When("I enter the following data into corresponding input fields on Change Organisation Name Page")
        Ienterthefollowingdataintocorrespondinginputfieldson (
          Map("organisationName" -> "Great Organisation changed")
        )
      And("I click save and continue button on Organisation Name Page")
        whenIClickSaveAndContinueButtonOn("Organisation Name Page")
      Then("I am presented with the Scheme Manager Check Your Answer Page")
        thenIAmPresentedWithThe("Scheme Manager Check Your Answer Page")
      When("I click on change-scheme-managers-address button on Check Your Answers Page")
        whenIClickOnButtonOn("change-scheme-managers-address")
      Then("I am presented with the Change Scheme Manager Address Page")
        thenIAmPresentedWithThe("Change Scheme Manager Address Page")
      And("I click save and continue button on Scheme Manager Address Page")
        whenIClickSaveAndContinueButtonOn("Change Scheme Manager Address Page")
      Then("I am presented with the Scheme Manager Check Your Answer Page")
        thenIAmPresentedWithThe("Scheme Manager Check Your Answer Page")
      When("I click on change-scheme-managers-email button on Check Your Answers Page")
        whenIClickOnButtonOn("change-scheme-managers-email")
      Then("I am presented with the Change Scheme Manager Email Page")
        thenIAmPresentedWithThe("Change Scheme Manager Email Page")
      When("I enter the following data into corresponding input fields on Scheme Manager EmailPage")
        Ienterthefollowingdataintocorrespondinginputfieldson (
          Map("emailAddress" -> "changed@email.com")
        )
      And("I click save and continue button on Change Scheme Manager Email Page")
        whenIClickSaveAndContinueButtonOn("Change Scheme Manager EmailPage")
      Then("I am presented with the Scheme Manager Check Your Answer Page")
        thenIAmPresentedWithThe("Scheme Manager Check Your Answer Page")
      And("I click save and continue button on Scheme Manager Check Your Answer Page")
        whenIClickSaveAndContinueButtonOn("Scheme Manager Check Your Answer Page")
      Then("I am presented with the Task List Page")
        thenIAmPresentedWithThe("Task List Page")
    }
  }
}
