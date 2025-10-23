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

package uk.gov.hmrc.otc.pages.overseasPension

import org.scalatest.Assertion
import uk.gov.hmrc.otc.conf.TestConfiguration
import uk.gov.hmrc.otc.pages.BasePage
import uk.gov.hmrc.otc.support.TestData

object ViewSubmittedPage extends BasePage {

  override val title: String = "Overseas transfer report"

  override val url: String =
    TestConfiguration.url("overseas-pension-transfer-frontend") +
      "/view-submitted-transfer/from-dashboard" +
      "?qtReference=QT564339&pstr=24000001IN&qtStatus=Submitted&versionNumber=006"

  def buildUrl(
                qtReference: String = TestData.get("Transfer reference").getOrElse("Undefined"),
                pstr: String = TestData.get("pstr").getOrElse("Undefined"),
                qtStatus: String = TestData.get("Status").getOrElse("Undefined"),
                versionNumber: String = TestData.get("versionNumber").getOrElse("001")
              ): String = {
    val baseUrl = TestConfiguration.url("overseas-pension-transfer-frontend")

    val qtStatusParam = qtStatus match {
      case "Submitted to HMRC" => "Submitted"
      case other => other
    }

    s"$baseUrl/view-submitted-transfer/from-dashboard" +
      s"?qtReference=$qtReference" +
      s"&pstr=$pstr" +
      s"&qtStatus=$qtStatusParam" +
      s"&versionNumber=$versionNumber"
  }

  override def checkURL: Assertion = {
    val expectedUrl = buildUrl()
    val currentUrl = driver.getCurrentUrl

    assert(
      currentUrl.startsWith(expectedUrl),
      s"Expected URL to start with $expectedUrl but found $currentUrl"
    )
  }

  override def expectedPageTitle: Option[String] = Some(
    "Check your answers - Report a transfer to a qualifying recognised overseas pension scheme - GOV.UK"
  )
}

