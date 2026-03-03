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

class SearchJourneySpec extends BaseSpec with Matchers {

  Feature("Is the members details journey fully connected") {

    Scenario(
      "1. Search - Search by name,insurance number and transfer reference number",
      AllTests,
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

      When ("I am enter first name as search value and click on search")
      whenEnterOnSearch("Dashboard Page","Malcolm")

      Then ("I am presented with the Dashboard page with search results")
      thenIAmPresentedWithTheSearch("Dashboard Page","Malcolm Mendes")

      Then ("I am click on clear search button to clear out search results")
      whenIClickOnClearSearchLink("Dashboard Page")

      When ("I am enter national insurance number as search value and click on search")
      whenEnterOnSearch("Dashboard Page","QQ112233B")

      Then ("I am presented with the Dashboard page with search results")
      thenIAmPresentedWithTheSearch("Dashboard Page","Rebecca Miller")

      Then ("I am click on clear search button to clear out search results")
      whenIClickOnClearSearchLink("Dashboard Page")

      Then ("I am presented with the Dashboard page")
      thenIAmPresentedWithThe("Dashboard Page")

      When ("I am enter reference number as search value and click on search")
      whenEnterOnSearch("Dashboard Page","QT564351")

      Then ("I am presented with the Dashboard page")
      thenIAmPresentedWithThe("Dashboard Page")
    }
  }
}