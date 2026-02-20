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

class MemberDetailsFullJourneySpec extends BaseSpec with Matchers {

  Feature("Is the members details journey fully connected") {

    Scenario(
      "1. Full Members Journey - Member is currently UK resident",
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

    }

    Scenario(
      "2. Full Members Journey - Member is not currently or ever been UK resident" ,
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
        Map("firstName" -> "Sarah","lastName" -> "Smith"))

      And("I click continue button on Member Name Page")
      whenIClickSaveAndContinueButtonOn("Member Name Page")

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
        Map("day" -> "14","month" -> "06","year" -> "1974"))

      And("I click save and continue button on Member Date Of Birth Page")
      whenIClickSaveAndContinueButtonOn("Member Date Of Birth Page")

      Then("I am presented with the Members Current Address Page")
      thenIAmPresentedWithThe("Members Current Address Page")

      When("I enter the following data into corresponding input fields on Members Current Address Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Members Current Address Page",
        Map("addressLine1" -> "1 Main Street","addressLine2" -> "Main Town","addressLine3" -> "Kenilworth","addressLine4" -> "Warwickshire","countryCode" -> "United Kingdom","postcode" -> "WA15BC"))

      And("I click save and continue button on Members Current Address Page")
      whenIClickSaveAndContinueButtonOn("Members Current Address Page")

      Then("I am presented with the Is Member Currently UK Resident Page")
      thenIAmPresentedWithThe("Is Member Currently UK Resident Page")

      When("I select radio button No on Is Member Currently UK Resident Page")
      whenISelectRadioButtonOn("No" , "Is Member Currently UK Resident Page")

      And("I click save and continue button on Is Member Currently UK Resident Page")
      whenIClickSaveAndContinueButtonOn("Is Member Currently UK Resident Page")

      Then("I am presented with the Has Member Ever Been UK Resident Page")
      thenIAmPresentedWithThe("Has Member Ever Been UK Resident Page")

      When("I select radio button No on Has Member Ever Been UK Resident Page")
      whenISelectRadioButtonOn("No" , "Has Member Ever Been UK Resident Page")

      And("I click save and continue button on Has Member Ever Been UK Resident Page")
      whenIClickSaveAndContinueButtonOn("Has Member Ever Been UK Resident Page")

      Then("I am presented with the Member Details Check Your Answers Page")
      thenIAmPresentedWithThe("Member Details Check Your Answers Page")

      And("I click save and continue button on Member Details Check Your Answers Page")
      whenIClickSaveAndContinueButtonOn("Member Details Check Your Answers Page")

      Then("I am presented with the Task List Page")
      thenIAmPresentedWithThe("Task List Page")
    }

    Scenario(
      "3. Full Members Journey - Member is not currently but has been UK resident with manual address entry" ,
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
        Map("firstName" -> "Rebecca","lastName" -> "Miller"))

      And("I click continue button on Member Name Page")
      whenIClickSaveAndContinueButtonOn("Member Name Page")

      Then("I am presented with the Member Nino Page")
      thenIAmPresentedWithThe("Member Nino Page")

      When("I enter the following data into corresponding input fields on Member Nino Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Member Nino Page",
        Map("value" -> "QQ112233B"))

      And("I click save and continue button on Member Nino Page")
      whenIClickSaveAndContinueButtonOn("Member Nino Page")

      Then("I am presented with the Member Date Of Birth Page")
      thenIAmPresentedWithThe("Member Date Of Birth Page")

      When("I enter the following data into corresponding input fields on Member Date Of Birth Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Member Date Of Birth Page",
        Map("day" -> "04","month" -> "09","year" -> "1980"))

      And("I click save and continue button on Member Date Of Birth Page")
      whenIClickSaveAndContinueButtonOn("Member Date Of Birth Page")

      Then("I am presented with the Members Current Address Page")
      thenIAmPresentedWithThe("Members Current Address Page")

      When("I enter the following data into corresponding input fields on Members Current Address Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Members Current Address Page",
        Map("addressLine1" -> "78 Kingsway Crescent","addressLine2" -> "Westfield Avenue","countryCode" -> "United Kingdom","postcode" -> "BA15XY"))

      And("I click save and continue button on Members Current Address Page")
      whenIClickSaveAndContinueButtonOn("Members Current Address Page")

      Then("I am presented with the Is Member Currently UK Resident Page")
      thenIAmPresentedWithThe("Is Member Currently UK Resident Page")

      When("I select radio button No on Is Member Currently UK Resident Page")
      whenISelectRadioButtonOn("No" , "Is Member Currently UK Resident Page")

      And("I click save and continue button on Is Member Currently UK Resident Page")
      whenIClickSaveAndContinueButtonOn("Is Member Currently UK Resident Page")

      Then("I am presented with the Has Member Ever Been UK Resident Page")
      thenIAmPresentedWithThe("Has Member Ever Been UK Resident Page")

      When("I select radio button Yes on Has Member Ever Been UK Resident Page")
      whenISelectRadioButtonOn("Yes" , "Has Member Ever Been UK Resident Page")

      And("I click save and continue button on Has Member Ever Been UK Resident Page")
      whenIClickSaveAndContinueButtonOn("Has Member Ever Been UK Resident Page")

      Then("I am presented with the Members Last UK Address  Page")
      thenIAmPresentedWithThe("Members Last UK Address Page")

      When("I enter the following data into corresponding input fields on Members Last UK Address Lookup Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Members Last UK Address Page",
        Map("addressLine1" -> "9 Greenbank Terrace","addressLine2" -> "Old Road","postcode" -> "ZZ99ZZ"))

      And("I click save and continue button on Members Last UK Address Lookup Page")
      whenIClickSaveAndContinueButtonOn("Members Last UK Address Lookup Page")

      And("I am presented with the Member Date Of Leaving UK Page")
      thenIAmPresentedWithThe("Member Date Of Leaving UK Page")

      When("I enter the following data into corresponding input fields on Member Date Of Leaving UK Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Member Date Of Leaving UK Page",
        Map("day" -> "20","month" -> "10","year" -> "2015"))

      And("I click save and continue button on Member Date Of Leaving UK Page")
      whenIClickSaveAndContinueButtonOn("Member Date Of Leaving UK Page")

      Then("I am presented with the Member Details Check Your Answers Page")
      thenIAmPresentedWithThe("Member Details Check Your Answers Page")

      And("I click save and continue button on Member Details Check Your Answers Page")
      whenIClickSaveAndContinueButtonOn("Member Details Check Your Answers Page")

      Then("I am presented with the Task List Page")
      thenIAmPresentedWithThe("Task List Page")

    }

    Scenario(
      "4. Full Members Journey - Member is currently UK resident with no Nino",
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
        Map("firstName" -> "Angelo","lastName" -> "McMannis"))

      And("I click continue button on Member Name Page")
      whenIClickSaveAndContinueButtonOn("Member Name Page")

      Then("I am presented with the Member Nino Page")
      thenIAmPresentedWithThe("Member Nino Page")

      When("I click on Member doesn't have a National Insurance number. hyperlink on Member Nino Page")
      whenIClickNoNinoLink("Member Nino Page")

      And("I am presented with the Member Does Not Have NINO Page")
      thenIAmPresentedWithThe("Member Does Not Have NINO Page")

      When("I enter Individual has recently moved to the UK and has not been issued a NINO yet. in the textarea field on Member Does Not Have NINO Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Member Does Not Have NINO Page",
        Map("value" -> "Individual has recently moved"))

      And("I click save and continue button on Member Does Not Have NINO Page")
      whenIClickSaveAndContinueButtonOn("Member Does Not Have NINO Page")

      Then("I am presented with the Member Date Of Birth Page")
      thenIAmPresentedWithThe("Member Date Of Birth Page")

      When("I enter the following data into corresponding input fields on Member Date Of Birth Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Member Date Of Birth Page",
        Map("day" -> "14","month" -> "08","year" -> "1990"))

      And("I click save and continue button on Member Date Of Birth Page")
      whenIClickSaveAndContinueButtonOn("Member Date Of Birth Page")

      Then("I am presented with the Members Current Address Page")
      thenIAmPresentedWithThe("Members Current Address Page")

      When("I enter the following data into corresponding input fields on Members Current Address Page")
      Ienterthefollowingdataintocorrespondinginputfieldson ("Members Current Address Page",
        Map("addressLine1" -> "7 Falcon Lane","addressLine2" -> "Riverside Gardens","countryCode" -> "United Kingdom","postcode" -> "RG12XY","poBox" -> "77889911"))

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

    }
  }
}
