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

import uk.gov.hmrc.otc.conf.TestConfiguration
import uk.gov.hmrc.otc.pages.auth.AuthLoginStubPageOld

object OverseasPensionStepDefinitionsSteps {

  // I enter redirect URL on Auth Login Stub Page for {string}
  def whenIEnterRedirectURLOnAuthLoginStubPageFor(typeOfJourney: String): Unit = {
    typeOfJourney match {
          case "Journey entry URL" =>
            AuthLoginStubPageOld.enterRedirectURL(TestConfiguration.url("overseas-pension-transfer-frontend") + "/start?srn=S2400000001")
          case "Is Member currently a resident of UK"                       =>
            AuthLoginStubPageOld.enterRedirectURL(TestConfiguration.url("overseas-pension-transfer-frontend") + "/member-is-resident-uk")
          case "Has member ever been a resident of the UK for tax purposes" =>
            AuthLoginStubPageOld.enterRedirectURL(TestConfiguration.url("overseas-pension-transfer-frontend") + "/member-has-ever-been-resident-uk")
          case "Member does not have NINO"                                  =>
            AuthLoginStubPageOld.enterRedirectURL(TestConfiguration.url("overseas-pension-transfer-frontend") + "/member-does-not-have-nino")
          case  "What You Will Need Page"                                                         =>
            AuthLoginStubPageOld.enterRedirectURL(TestConfiguration.url("overseas-pension-transfer-frontend") + "/what-will-be-needed")
          case "New Login Page"                       =>
            AuthLoginStubPageOld.enterRedirectURL(TestConfiguration.url("overseas-pension-transfer-frontend"))
          case _                                                            =>
            AuthLoginStubPageOld.enterRedirectURL(TestConfiguration.url("overseas-pension-transfer-frontend"))
        }
  }

  // I enter Enrollment Key {string}, Identifier Name {string} and Identifier Value {string} on {string}
  def whenIEnterEnrollmentKey (enrollmentKey:String, IdentifierName:String, IdentifierValue:String, page:String): Unit = {
    page match {
            case "Auth Login Stub Page" =>
              AuthLoginStubPageOld.enrolments(enrollmentKey, IdentifierName, IdentifierValue)
          }
  }

}
