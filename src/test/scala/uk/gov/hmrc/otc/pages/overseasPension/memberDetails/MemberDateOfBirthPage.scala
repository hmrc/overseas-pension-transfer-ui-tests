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
import uk.gov.hmrc.otc.support.TestData

object MemberDateOfBirthPage extends BasePage {

  override val url: String = TestConfiguration.url("overseas-pension-transfer-frontend") + "/member-details/member-date-of-birth"
  override val title       = "What is Jon Doe’s date of birth?" // TODO this title needs to be corrected in message file in main application

  private def expectedFullName: String = {
    val expectedFirstName = TestData.get("firstName").getOrElse("Undefined")
    val expectedLastName  = TestData.get("lastName").getOrElse("Undefined")
    s"$expectedFirstName $expectedLastName"
  }

  override def expectedPageErrorTitle: Option[String] = Some(
    s"What is $expectedFullName’s date of birth? - Report an overseas pension transfer - GOV.UK"
  )

  override def expectedPageTitle: Option[String] = Some(
    s"What is $expectedFullName’s date of birth? - Report an overseas pension transfer - GOV.UK"
  )

  override def enterDate(day: String, month: String, year: String): Unit = {
    enterText("value.day", day)
    enterText("value.month", month)
    enterText("value.year", year)
  }
}
