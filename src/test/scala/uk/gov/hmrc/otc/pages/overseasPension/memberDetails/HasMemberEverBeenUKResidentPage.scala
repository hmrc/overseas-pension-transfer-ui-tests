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

package uk.gov.hmrc.otc.pages.overseasPension.memberDetails

import uk.gov.hmrc.otc.conf.TestConfiguration
import uk.gov.hmrc.otc.pages.BasePage

object HasMemberEverBeenUKResidentPage extends BasePage {

  override val url: String = TestConfiguration.url("overseas-pension-transfer-frontend") + "/member-details/member-has-ever-been-resident-uk"
  override val title       = "Has undefined undefined ever been a resident in the UK for tax purposes?"

  override def expectedPageErrorTitle: Option[String] = Some(
    "Error: Has {0} ever been a resident in the UK for tax purposes? - Report an overseas pension transfer - GOV.UK"
  )

  override def expectedPageTitle: Option[String] = Some(
    "Has {0} ever been a resident in the UK for tax purposes? - Report an overseas pension transfer - GOV.UK"
  )

  override def clickRadioButton(text: String): Unit =
    text match {
      case "Yes" => click on cssSelector("#value")
      case "No"  => click on cssSelector("#value-no")
    }
}
