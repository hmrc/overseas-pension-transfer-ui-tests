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

import org.openqa.selenium.By
import org.openqa.selenium.support.ui.ExpectedConditions
import org.scalatest.Assertion
import uk.gov.hmrc.otc.conf.TestConfiguration
import uk.gov.hmrc.otc.pages.BasePage

object DashboardPage extends BasePage {


  override val url: String = TestConfiguration.url("overseas-pension-transfer-frontend") + "/dashboard"
  override val title       = "All transfers (page – Report a transfer to a qualifying recognised overseas pension scheme (QROPS) – GOV.UK"
  private val pageNumberPattern = """page \d+ of \d+""".r


  override def checkPageTitle(): Assertion = {
    fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")))
    val actualTitle = pageTitle
    actualTitle should startWith("All transfers (page")
    actualTitle should endWith("– GOV.UK")
    pageNumberPattern.findFirstIn(actualTitle) match {
      case Some(_) => succeed
      case None =>
        fail(
          s"Dynamic page number format not found in title.\n" +
            s"Expected pattern: 'page X of Y'\n" +
            s"Actual title: $actualTitle"
        )
    }
  }
}