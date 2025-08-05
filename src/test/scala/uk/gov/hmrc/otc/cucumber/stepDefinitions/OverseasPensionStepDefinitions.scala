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

package uk.gov.hmrc.otc.cucumber.stepDefinitions

import uk.gov.hmrc.otc.conf.TestConfiguration
import uk.gov.hmrc.otc.pages.auth.AuthLoginStubPage

class OverseasPensionStepDefinitions extends BaseStepDefinitions {

  When("""I enter redirect URL on Auth Login Stub Page for {string}""") { (typeOfJourney: String) =>
    typeOfJourney match {
      case "Is Member currently a resident of UK"                       =>
        AuthLoginStubPage.enterRedirectURL(TestConfiguration.url("overseas-pension-transfer-frontend") + "/member-is-resident-uk")
      case "Has member ever been a resident in the UK for tax purposes" =>
        AuthLoginStubPage.enterRedirectURL(TestConfiguration.url("overseas-pension-transfer-frontend") + "/member-has-ever-been-resident-uk")
      case "Member does not have NINO"                                  =>
        AuthLoginStubPage.enterRedirectURL(TestConfiguration.url("overseas-pension-transfer-frontend") + "/member-does-not-have-nino")
      case  "What You Will Need Page"                                                         =>
        //AuthLoginStubPage.enterRedirectURL(TestConfiguration.url("overseas-pension-transfer-frontend") + "/what-will-be-needed")
        AuthLoginStubPage.enterRedirectURL(TestConfiguration.url("overseas-pension-transfer-frontend") + "/what-will-be-needed")
      case "New Login Page"                       =>
        AuthLoginStubPage.enterRedirectURL(TestConfiguration.url("overseas-pension-transfer-frontend"))
      case _                                                            =>
        AuthLoginStubPage.enterRedirectURL(TestConfiguration.url("overseas-pension-transfer-frontend"))
    }
  }

  When("""I enter Enrollment Key {string}, Identifier Name {string} and Identifier Value {string} on {string}""") {
    (enrollmentKey: String, IdentifierName: String, IdentifierValue: String, page: String) =>
      page match {
        case "Auth Login Stub Page" =>
          AuthLoginStubPage.enrolments(enrollmentKey, IdentifierName, IdentifierValue)
      }
  }

}

