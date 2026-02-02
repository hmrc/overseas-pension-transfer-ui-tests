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

package specpage.overseasPension.QROPSDetails

import specpage.BasePage
import uk.gov.hmrc.otc.conf.TestConfiguration

object QROPSReferencePage extends BasePage {

  override val url: String = TestConfiguration.url("overseas-pension-transfer-frontend") + "/qrops-details/qrops-reference"
  override val title       = "What is the QROPS reference?"

  override def expectedPageErrorTitle: Option[String] = Some(
    "Error: What is the QROPS reference? - Report a transfer to a qualifying recognised overseas pension scheme - GOV.UK"
  )

  override def expectedPageTitle: Option[String] = Some(
    "What is the QROPS reference? - Report a transfer to a qualifying recognised overseas pension scheme - GOV.UK"
  )
}