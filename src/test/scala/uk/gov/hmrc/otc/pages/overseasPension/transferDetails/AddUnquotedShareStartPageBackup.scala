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

package uk.gov.hmrc.otc.pages.overseasPension.transferDetails

import uk.gov.hmrc.otc.conf.TestConfiguration
import uk.gov.hmrc.otc.pages.BasePage

object AddUnquotedShareStartPageBackup extends BasePage {

  override val url: String = TestConfiguration.url("overseas-pension-transfer-frontend") + "/transfer-details/assets/unquoted-shares-start"
  override val title = "Add unquoted shares"

  override def expectedPageTitle: Option[String] = Some(
    "Add unquoted shares - Report a transfer to a qualifying recognised overseas pension scheme - GOV.UK"
  )
}
