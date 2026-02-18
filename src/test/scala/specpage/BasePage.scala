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
import org.openqa.selenium.{By, WebElement}
import org.scalatest.Assertion
import org.scalatest.concurrent.Eventually
import org.scalatest.matchers.should.Matchers
import org.scalatestplus.selenium.Page
import otc.support.TestData
import uk.gov.hmrc.selenium.component.PageObject
import uk.gov.hmrc.selenium.webdriver.Driver

import java.time.LocalDate
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
  def expectedPageTitle: Option[String] = None

  def expectedPageErrorTitle: Option[String] = None

  def expectedPageHeader: Option[String] = None

  def pageHeader: String = getText(By.tagName("h1"))

  def pageTitle: String = getTitle

  private def expectedPageTitleList = expectedPageTitle.map(_.split(";").toList)

  private def expectedPageErrorTitleList = expectedPageErrorTitle.map(_.split(";").toList)

  private def expectedPageHeaderList = expectedPageHeader.map(_.split(";").toList)

  def checkPageTitle(): Assertion = {
    expectedPageTitleList should contain(List(pageTitle))
  }

  def checkPageErrorTitle(): Assertion = {
    expectedPageErrorTitleList should contain(List(pageTitle))
  }

  def enterText(id: String, textToEnter: String): Unit = {
    sendKeys(By.id(id), textToEnter)
  }


  def checkURL: Assertion =
    if (url.contains("...")) {
      Driver.instance.getCurrentUrl should fullyMatch regex (url.replace("...", "") + ".*").r
    } else {
      Driver.instance.getCurrentUrl should equal(url)
    }

  def checkChangeURL: Assertion = {
    val changeUrl = url.replaceAll("([^/]+)$", "change-$1")
    if (url.contains("...")) {
      Driver.instance.getCurrentUrl should fullyMatch regex (changeUrl.replace("...", "") + ".*").r
    } else {
      Driver.instance.getCurrentUrl should equal(changeUrl)
    }
  }


  def checkNewURL: Assertion =
    if (newUrl.contains("...")) {
      Driver.instance.getCurrentUrl should fullyMatch regex (newUrl.replace("...", "") + ".*").r
    } else {
      Driver.instance.getCurrentUrl should equal(newUrl)
    }

  def checkNewURLWithTwoDynamicValues(urlPrefix: String, urlSuffix: String): Unit = {
    val currentUrl = Driver.instance.getCurrentUrl
    if (newUrl.contains("...")) {
      val updatedUrl = newUrl.replace("...", urlSuffix).replace("preFix-", urlPrefix)
      validateUrl(updatedUrl)
      currentUrl shouldBe updatedUrl
    } else {
      validateUrl(currentUrl)
      currentUrl shouldBe newUrl
    }
  }

  def checkNewURLWithOneDynamicValue(urlSuffix: String): Unit = {
    val currentUrl = Driver.instance.getCurrentUrl
    if (newUrl.contains("...")) {
      val updatedUrl = newUrl.replace("preFix-", "").replace("...", urlSuffix)
      validateUrl(updatedUrl)
      currentUrl shouldBe updatedUrl
    } else {
      validateUrl(currentUrl)
      currentUrl shouldBe newUrl
    }
  }

  def checkNewDynamicURL(urlSuffix: String): Unit = {
    val expectedUrl = newUrl + urlSuffix
    if (url.contains("...")) {
      Driver.instance.getCurrentUrl should fullyMatch regex (url.replace("...", "") + ".*").r
    } else {
      Driver.instance.getCurrentUrl should equal(expectedUrl)
    }
  }

  def checkExistingDynamicURL(urlSuffix: String): Unit = {
    val expectedUrl = url + urlSuffix
    if (url.contains("...")) {
      Driver.instance.getCurrentUrl should fullyMatch regex (url.replace("...", "") + ".*").r
    } else {
      Driver.instance.getCurrentUrl should equal(expectedUrl)
    }
  }

  def checkPageHeader(): Assertion = expectedPageHeaderList should contain(List(pageHeader))


  def clickSubmitButton(): Unit = click(By.cssSelector("#submit"))

  def clickAgreeSubmitButton(): Unit = click(By.cssSelector(".govuk-button"))

  def clickSaveAndContinueButton(): Unit = click(By.cssSelector(".govuk-button"))

  def clickContinueButton(): Unit = click(By.id("continueButton"))

  def clickBackButton(): Unit = click(By.xpath("//a[normalize-space()='Back']"))

  def clickOnLink(): Unit = click(By.id("continueButton"))

  def clickRadioButton(text: String): Unit =
    Driver.instance.findElements(By.tagName("label")).asScala.filter(_.getText.trim == text).head.click()

    def searchField(): Unit =
      click(By.xpath("//*[@id=\"main-content\"]/div/div/form/div/div[2]/div/div/button"))

    def startNewTransfer(): Unit =
      click(By.cssSelector("a[href='/report-transfer-qualifying-recognised-overseas-pension-scheme/what-will-be-needed']"))

    def clickMemberName(): Unit =
      click(By.linkText("Malcolm Mendes"))

    def startMemberDetails(): Unit =
      click(By.cssSelector("a[href='/report-transfer-qualifying-recognised-overseas-pension-scheme/member-details/member-name']"))

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

    def textFieldElement(field: String): WebElement = field match {
      case "firstName" => Driver.instance.findElement(By.id("memberFirstName"))
      case "lastName" => Driver.instance.findElement(By.id("memberLastName"))
      case "day" => Driver.instance.findElement(By.id("value.day"))
      case "month" => Driver.instance.findElement(By.id("value.month"))
      case "year" => Driver.instance.findElement(By.id("value.year"))
      case _ => Driver.instance.findElement(By.id(field))
    }


  def selectCheckBoxes(choiceOfCheckBox: Array[String]): Unit =
    for (i <- choiceOfCheckBox.indices)
      click(By.xpath(s"//label[normalize-space()='${choiceOfCheckBox(i)}']"))

  def subSectionsHeaderText: List[String] = Driver.instance
    .findElement(By.cssSelector("main[id='main-content'] div[class='govuk-grid-column-two-thirds']"))
    .findElements(By.tagName("h2"))
    .asScala
    .map(_.getText.trim)
    .toList

  def tableHeaderText: List[String] = Driver.instance
    .findElements(By.cssSelector("caption[class='govuk-table__caption govuk-table__caption--m']"))
    .asScala
    .map(_.getText.trim)
    .toList

  def taskListPageContentView: Map[String, String] =
    //Driver.instance
    Driver.instance
      //val rows: Seq[WebElement] =
      // Driver.instance
      .findElements(By.xpath("//li[@class='govuk-task-list__item govuk-task-list__item--with-link']"))
      .asScala
      .toSeq
      //  .findElements(By.xpath("//li[@class='govuk-task-list__item govuk-task-list__item--with-link']"))
      // .asScala
      .flatMap { row => {
        val key = row
          .findElement(By.cssSelector(".govuk-task-list__name-and-hint"))
          .getText
          .trim
          .replaceAll("""\nYou need to tell.*""", "")


        val value = row
          .findElement(By.cssSelector(".govuk-task-list__status"))
          .getText
          .trim
          .replace("\n", ",")

        // val key   = findElement(By.cssSelector(".govuk-task-list__name-and-hint")).getText.trim.replaceAll("""\nYou need to tell.*""", "")
        //val value = row.findElement(By.cssSelector(".govuk-task-list__status")).getText.trim.replace("\n", ",")
        Map(key -> value)
      }}
      .toMap

  def dataAtCheckYourAnswersPage: Map[String, String] = Driver.instance
    .findElements(By.cssSelector(".govuk-summary-list__row"))
    .asScala
    .flatMap { row =>
      val key   = row.findElement(By.cssSelector(".govuk-summary-list__key")).getText.trim
      val value = row.findElement(By.cssSelector(".govuk-summary-list__value")).getText.trim.replace("\n", "")
      Map(key -> value)
    }
    .toMap

  def ordinalToNumber(ordinal: String): Int = ordinal.toLowerCase() match {
    case "first"       => 0
    case "second"      => 1
    case "third"       => 2
    case "fourth"      => 3
    case "fifth"       => 4
    case "sixth"       => 5
    case "seventh"     => 6
    case "eighth"      => 7
    case "ninth"       => 8
    case "tenth"       => 9
    case "eleventh"    => 10
    case "twelfth"     => 11
    case "thirteenth"  => 12
    case "fourteenth"  => 13
    case "fifteenth"   => 14
    case "sixteenth"   => 15
    case "seventeenth" => 16
    case "eighteenth"  => 17
    case "nineteenth"  => 18
    case "twentieth"   => 19
    case _             => throw new IllegalArgumentException("Invalid ordinal")
  }

  def clickAgreeAndSendReturnButton(): Unit = click(By.cssSelector("#continueButton"))



}

// trait BasePage extends Page with Matchers with Eventually with WebBrowser {
 //override implicit def Driver.instance: WebDriver = Driver.instance
 //implicit val Driver.instance: WebDriver

    //override val url: String = ""
    //val changeUrl: String = ""
    //val newUrl: String = ""
    //val title: String = ""
    //val urlPattern: Regex = "^(https?://)?([\\w.-]+)?(\\.[a-z]{2,6})([/\\w .-]*)*\\??([^#\\s]*)#?([^\\s]*)$".r









  //trait BasePage extends Page with Matchers with BrowserDriver with Eventually with WebBrowser {
  //override val url: String = ""
  //val changeUrl: String = ""
  //val newUrl: String       = ""
  //val title: String        = ""
  //val urlPattern: Regex    = "^(https?://)?([\\w.-]+)?(\\.[a-z]{2,6})([/\\w .-]*)*\\??([^#\\s]*)#?([^\\s]*)$".r
