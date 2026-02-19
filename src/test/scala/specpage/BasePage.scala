/*
 * Copyright 2023 HM Revenue & Customs
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

package specpage
import org.openqa.selenium.By
import org.scalatest.Assertion
import org.scalatest.concurrent.Eventually
import org.scalatest.matchers.should.Matchers
import org.scalatestplus.selenium.Page
import otc.support.TestData
import uk.gov.hmrc.selenium.component.PageObject
import uk.gov.hmrc.selenium.webdriver.Driver

import scala.jdk.CollectionConverters._
import scala.util.matching.Regex

trait BasePage extends Page with PageObject with Matchers with Eventually {

    override val url: String = ""
    val changeUrl: String = ""
    val newUrl: String = ""
    val title: String = ""
    val urlPattern: Regex =
      "^(https?://)?([\\w.-]+)?(\\.[a-z]{2,6})([/\\w .-]*)*\\??([^#\\s]*)#?([^\\s]*)$".r

  def expectedFullName: String = {
    val expectedFirstName = TestData.get("member_name_page.firstName").getOrElse("Undefined")
    val expectedLastName = TestData.get("member_name_page.lastName").getOrElse("Undefined")
    s"$expectedFirstName $expectedLastName"
  }

  def validateUrl(url: String): Boolean =
    url match {
      case  urlPattern(_, _, _, _, _, _) => true
      case _ => false
    }

  /** Page assertions * */
  def expectedPageTitle: String = ""

  def expectedPageErrorTitle: Option[String] = None

  def expectedPageHeader: String = ""

  def pageHeader: String = getText(By.tagName("h1"))

  def pageTitle: String = getTitle

  def currentUrl: String = getCurrentUrl

  def checkPageTitle(): Assertion = {
    getTitle shouldBe pageTitle
  }

  def enterText(id: String, textToEnter: String): Unit = {
    sendKeys(By.id(id), textToEnter)
  }

  def checkURL: Assertion = currentUrl shouldBe url

  def clickSubmitButton(): Unit = {
    click(By.cssSelector("#submit"))
    waitForInvisibilityOfElementWithText(By.id("submit"), "Submit")
  }

  def clickAgreeSubmitButton(): Unit = {
    click(By.cssSelector(".govuk-button"))
    waitForInvisibilityOfElementWithText(By.tagName("h1"), "")
  }

  def clickSaveAndContinueButton(): Unit = {
    click(By.cssSelector(".govuk-button"))
    waitForInvisibilityOfElementWithText(By.tagName("h1"), "")
  }

  def clickContinueButton(): Unit = {
    click(By.id("continueButton"))
    waitForInvisibilityOfElementWithText(By.tagName("h1"), "")
  }

  def clickRadioButton(text: String): Unit =
    Driver.instance.findElements(By.tagName("label")).asScala.filter(_.getText.trim == text).head.click()

  def searchField(): Unit =
    click(By.xpath("//*[@id=\"main-content\"]/div/div/form/div/div[2]/div/div/button"))

  def startNewTransfer(): Unit =
    click(By.linkText("Start a new transfer"))

  def clickMemberName(): Unit =
    click(By.linkText("Malcolm Mendes"))

  def startMemberDetails(): Unit =
    click(By.linkText("Add details about the member"))

  def startTransferDetails(): Unit =
    click(By.cssSelector("a[href='/report-transfer-qualifying-recognised-overseas-pension-scheme/transfer-details/overseas-transfer-allowance']"))

  def startQROPSDetails(): Unit =
    click(By.cssSelector("a[href='/report-transfer-qualifying-recognised-overseas-pension-scheme/qrops-details/qrops-name']"))

  def startSchemeManagerDetails(): Unit =
    click(By.cssSelector("a[href='/report-transfer-qualifying-recognised-overseas-pension-scheme/qrops-scheme-manager-details/scheme-manager-type']"))

  def clickFinalCYALink(): Unit =
    click(By.cssSelector("a[href='/report-transfer-qualifying-recognised-overseas-pension-scheme/check-your-answers']"))

  def noNinoLink(): Unit =
    click(By.cssSelector("a[href='/report-transfer-qualifying-recognised-overseas-pension-scheme/member-details/member-does-not-have-nino']"))

  def clickViewAmendLink(): Unit =
    click(By.cssSelector("a[href='/report-transfer-qualifying-recognised-overseas-pension-scheme/view-amend?qtReference=QT564339&pstr=24000001IN&qtStatus=Submitted&versionNumber=006']"))

  def textFieldElement(field: String): By = field match {
    case "firstName" => By.id("memberFirstName")
    case "lastName" => By.id("memberLastName")
    case "day" => By.id("value.day")
    case "month" => By.id("value.month")
    case "year" => By.id("value.year")
    case _ => By.id(field)
  }

def selectCheckBoxes(choiceOfCheckBox: Array[String]): Unit =
  for (i <- choiceOfCheckBox.indices)
    click(By.xpath(s"//label[normalize-space()='${choiceOfCheckBox(i)}']"))

}