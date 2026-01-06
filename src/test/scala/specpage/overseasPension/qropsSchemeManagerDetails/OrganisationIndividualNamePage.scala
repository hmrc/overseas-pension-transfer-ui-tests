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

package uk.gov.hmrc.otc.pages.overseasPension.qropsSchemeManagerDetails

import uk.gov.hmrc.otc.conf.TestConfiguration
import uk.gov.hmrc.otc.pages.BasePage

object OrganisationIndividualNamePage extends BasePage {

  override val url: String = TestConfiguration.url("overseas-pension-transfer-frontend") + "/qrops-scheme-manager-details/organisation-individual-name"
  override val title       = "Who is the contact within the organisation"

  override def expectedPageErrorTitle: Option[String] = Some(
    "Error: Who is the contact within the organisation? - Report a transfer to a qualifying recognised overseas pension scheme - GOV.UK"
  )

  override def expectedPageTitle: Option[String] = Some(
    "Who is the contact within the organisation? - Report a transfer to a qualifying recognised overseas pension scheme - GOV.UK"
  )

  override def clickContinueButton(): Unit = {
    click on cssSelector(".govuk-button")
  }
}