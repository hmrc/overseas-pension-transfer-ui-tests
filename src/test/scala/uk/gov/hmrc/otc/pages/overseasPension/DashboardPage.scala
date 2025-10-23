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
import uk.gov.hmrc.otc.conf.TestConfiguration
import uk.gov.hmrc.otc.pages.BasePage

import scala.jdk.CollectionConverters.CollectionHasAsScala

object DashboardPage extends BasePage {

  override val url: String = TestConfiguration.url("overseas-pension-transfer-frontend") + "/dashboard"
  override val title       = "Report a transfer to a qualifying recognised overseas pension scheme"

  override def expectedPageTitle: Option[String] = Some(
    "Report a transfer to a qualifying recognised overseas pension scheme - Report a transfer to a qualifying recognised overseas pension scheme - GOV.UK"
  )

  def getDashboardTableRows: Seq[Map[String, String]] = {
    val table = driver.findElement(By.cssSelector(".govuk-table"))
    val headers = table.findElements(By.cssSelector("thead th")).asScala.map(_.getText.trim)
    val rows = table.findElements(By.cssSelector("tbody tr")).asScala

    rows.map { row =>
      val cells = row.findElements(By.cssSelector("td")).asScala.map(_.getText.trim.replaceAll("\\s+", " "))
      val trimmedHeaders = headers.take(cells.size)
      trimmedHeaders.zip(cells).toMap
    }.toSeq
  }
}
