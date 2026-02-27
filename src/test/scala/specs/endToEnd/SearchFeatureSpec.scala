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
import specs.tags.{AllTests, WIP}
import specsteps.BaseStepDefinitionsSteps._

class SearchFeatureSpec extends BaseSpec with Matchers {

  Feature("Is the members details journey fully connected") {

    Scenario(
      "1. Amend Journey - Change member,transfer,QROPS and schemeManager details",
      AllTests,
      WIP
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

      When ("I am enter search value and click on search")
      whenEnterOnSearch("Dashboard Page","Malcolm")
      whenIClickSearchButtonOn("Dashboard Page")




    }
  }
}
