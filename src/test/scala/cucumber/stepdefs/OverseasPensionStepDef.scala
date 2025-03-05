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

package cucumber.stepdefs

import conf.TestConfiguration
import pages.auth.AuthLoginStubPage

class OverseasPensionStepDef extends BaseStepDef {

  When("""I enter redirect URL on Auth Login Stub Page for {string}""") { (typeOfJourney: String) =>
    typeOfJourney match {
      case "Business Tax Account Page" =>
        AuthLoginStubPage.enterRedirectURL(TestConfiguration.url("alcohol-duty-returns-frontend") + "/start")
      case "Alcohol Duty Service"      =>
        AuthLoginStubPage.enterRedirectURL(
          TestConfiguration.url("alcohol-duty-returns-frontend") + "/before-you-start-your-return/" + periodKey()
        )
    }
  }

  Given("""I enter the url for Claim Enrolment journey""") {
    driver.get(TestConfiguration.url("alcohol-duty-returns-frontend") + "/enrol/approval-id")
  }

  When("""I enter redirectURL for {string}""") { (text: String) =>
    text match {
      case "View Past Returns Page"  =>
        AuthLoginStubPage.enterRedirectURL(
          TestConfiguration.url("alcohol-duty-returns-frontend") + "/check-your-returns"
        )
      case "View Past Payments Page" =>
        AuthLoginStubPage.enterRedirectURL(TestConfiguration.url("alcohol-duty-returns-frontend") + "/view-payments")
    }
  }

  When("""I enter Enrollment Key {string}, Identifier Name {string} and Identifier Value {string} on {string}""") {
    (enrollmentKey: String, IdentifierName: String, IdentifierValue: String, page: String) =>
      page match {
        case "Auth Login Stub Page" =>
          AuthLoginStubPage.enrolments(enrollmentKey, IdentifierName, IdentifierValue)
      }
  }

  When("""I select Affinity Type as {string} on {string}""") { (value: String, page: String) =>
    page match {
      case "Auth Login Stub Page" =>
        AuthLoginStubPage.selectAffinityGroup(value)
    }
  }
}
