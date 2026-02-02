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
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.{ExpectedConditions, FluentWait, Wait}
import org.openqa.selenium.{By, WebDriver, WebElement}
import org.scalatest.Assertion
import org.scalatest.concurrent.Eventually
import org.scalatest.matchers.should.Matchers
import org.scalatestplus.selenium.{Page, WebBrowser}
import uk.gov.hmrc.otc.driver.BrowserDriver
//import uk.gov.hmrc.otc.Driver.instance.BrowserDriver
import uk.gov.hmrc.otc.support.TestData

import java.time.{Duration, LocalDate}
import scala.jdk.CollectionConverters._
import scala.util.matching.Regex

  trait BasePage extends Page
    with Matchers
    with BrowserDriver
    with Eventually
    with WebBrowser {
    implicit lazy val webDriver: WebDriver = Driver.instance
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
  /** Fluent Wait config * */

  var fluentWait: Wait[WebDriver] = new FluentWait[WebDriver](Driver.instance)
    .withTimeout(Duration.ofSeconds(20))
    .pollingEvery(Duration.ofMillis(500))

  def waitForPageHeader: WebElement = fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")))

  /** Page assertions * */
  def expectedPageTitle: Option[String] = None

  def expectedPageErrorTitle: Option[String] = None

  def expectedPageHeader: Option[String] = None

  def pageHeader: Option[String] = {
    waitForPageHeader
    val header: Option[String] = find(tagName("h1")).map(_.text)
    if (header.get.takeRight(2) == " ?")
      Some(header.get.replaceAll(" \\?$", "?"))
    else
      header
  }

  private def expectedPageTitleList = expectedPageTitle.map(_.split(";").toList)

  private def expectedPageErrorTitleList = expectedPageErrorTitle.map(_.split(";").toList)

  private def expectedPageHeaderList = expectedPageHeader.map(_.split(";").toList)

  def checkPageTitle(): Assertion = {
    fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")))
    expectedPageTitleList should contain(List(pageTitle))
  }

  def checkPageErrorTitle(): Assertion = {
    fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")))
    expectedPageErrorTitleList should contain(List(pageTitle))
  }

  def enterText(id: String, textToEnter: String): Unit = {
    Driver.instance.findElement(By.id(id)).clear()
    Driver.instance.findElement(By.id(id)).sendKeys(textToEnter)
  }

  def checkPageTitle(page: String): Unit = {}

  def checkPageErrorTitle(page: String): Unit = {}

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

  def checkPageHeader(): Assertion = {
    fluentWait.until(ExpectedConditions.textToBe(By.cssSelector("h1"), expectedPageHeader.get))
    expectedPageHeaderList should contain(List(pageHeader.get))
  }

  def clickSubmitButton(): Unit = click on cssSelector("#submit")

  //def clickAgreeSubmitButton(): Unit = click on xpath("//button[text()='Agree and Submit']")

  //def clickAgreeSubmitButton(): Unit = click on xpath("//*[@id="main-content"]/div/div/form/button")
  def clickAgreeSubmitButton(): Unit = click on cssSelector(".govuk-button")

  def clickSaveAndContinueButton(): Unit = click on cssSelector(".govuk-button")

  def clickContinueButton(): Unit = click on id("continueButton")

  def clickBackButton(): Unit = click on xpath("//a[normalize-space()='Back']")

    def clickOnLink(): Unit = click on id("continueButton")

  def enterDetails(data: String): Unit = {}

  def enterMultipleDetails(textToEnter: String, text: String): Unit = {}

  def enterMultipleDetailsWithIndex(textToEnter: String, text: String, index: String): Unit = {}

  def clickRadioButton(text: String): Unit =
    Driver.instance.findElements(By.tagName("label")).asScala.filter(_.getText.trim == text).head.click()

  def clickCheckBox(text: String): Unit =
    Driver.instance.findElements(By.tagName("label")).asScala.filter(_.getText.trim == text).head.click()

  def textFieldElement(field: String): WebElement = field match {
    case "firstName" => webDriver.findElement(By.id("memberFirstName"))
    case "lastName" => webDriver.findElement(By.id("memberLastName"))
    case "day" => webDriver.findElement(By.id("value.day"))
    case "month" => webDriver.findElement(By.id("value.month"))
    case "year" => webDriver.findElement(By.id("value.year"))
    case _ => webDriver.findElement(By.id(field))
  }

  def verifyInputFieldsByIds(fields: List[String]): Unit = {
    for (field <- fields) {
      Some(textFieldElement(field)).isDefined should be(true)
    }
  }

  def verifyInputFieldsWithLabels(fieldLabels: List[String]): Unit = {
    for (fieldLabel <- fieldLabels) {
      val labelField = find(xpath(s"//label[contains(text(), '$fieldLabel')]"))

      val inputFieldName = labelField.get.attribute("for").get
      // get the value of the 'for' attribute of the 'label' element
      // Search for an 'element' having the corresponding value
      //Some(Driver.instance.findElement(By.name(inputFieldName)))

      Some(Driver.instance.findElement(By.name(inputFieldName))).isDefined should be(true)
    }
  }

  def checkPageErrorSummaryTitle(errorSummaryTitle: String): Unit = {
    val actualErrorSummaryTitle = Driver.instance.findElement(By.className("govuk-error-summary__title")).getText
    actualErrorSummaryTitle should be(errorSummaryTitle)
  }

  def checkPageErrorMessage(errorMessage: String): Unit = {
    val actualErrorMessage =
      Driver.instance.findElement(By.cssSelector(".govuk-error-summary__body")).getText.trim.replaceAll("\n", ",")
    assert(actualErrorMessage.contains(errorMessage))
  }

  def listOfErrorLinks(): List[WebElement] = Driver.instance.findElements(By.cssSelector(".govuk-error-summary__list a")).asScala.toList

  def listOfErrorMessages(): List[String] = listOfErrorLinks().map(_.getText.trim)

  def clickButton(buttonText: String): Unit = click on partialLinkText(buttonText)

  def pageData: Map[String, String] = Driver.instance
    .findElements(By.cssSelector(".govuk-summary-list__row"))
    .asScala
    .flatMap { row =>
      val key = row.findElement(By.cssSelector(".govuk-summary-list__key")).getText.trim
      val value = row.findElement(By.cssSelector(".govuk-summary-list__value")).getText.trim.replace("\n", ",")
      Map(key -> value)
    }
    .toMap

  val Year: Int = LocalDate.now().getYear
  val Month: Int = LocalDate.now().getMonthValue

  def periodKey(): String =
    s"""${generateYear(Year: Int).toString.takeRight(2)}A${(generateMonth(Month: Int) + 64).toChar}"""

  def previousPeriodKey(): String = s"${Year.toString.takeRight(2)}A${((generateMonth(Month: Int) - 1) + 64).toChar}"

  def generateYear(Year: Int): Int =
    if (generateMonth(Month: Int) == 12)
      Year - 1
    else
      Year

  def generateMonth(Month: Int): Int =
    if ((Month - 1) == 0 || (Month - 1) == 1 || (Month - 1) == 2)
      1
    else if ((Month - 1) == 3 || (Month - 1) == 4 || (Month - 1) == 5)
      4
    else if ((Month - 1) == 6 || (Month - 1) == 7 || (Month - 1) == 8)
      7
    else
      10

  private def taxTypeCodeText() = Driver.instance.findElement(By.cssSelector(".govuk-radios"))

  def allTaxTypeCodeText(): Seq[String] = taxTypeCodeText().getText.split("\n").toList

  def productsList: Seq[List[String]] = Driver.instance
    .findElement(By.tagName("table"))
    .findElements(By.tagName("tr"))
    .asScala
    .map(
      _.findElements(By.xpath("td | th")).asScala
        .map(
          _.getText.trim
            .replaceAll("\nthis product", "")
            .replaceAll("""\n.*between.*""", "")
            .replaceAll("""\n.*at or above.*""", "")
            .replaceAll("""\n.*adjustment with duty value.*""", "")
            .replaceAll("\n", " ")
        )
        .toList
    )
    .toList

  def outstandingReturnsList: Seq[List[String]] = Driver.instance
    .findElement(By.xpath("//div/table[1]"))
    .findElements(By.tagName("tr"))
    .asScala
    .map(
      _.findElements(By.xpath("td | th")).asScala
        .map(_.getText.trim.replaceAll("""\nSubmit.*""", "").replaceAll("\n", " "))
        .toList
    )
    .toList

  def completedReturnsList: Seq[List[String]] = Driver.instance
    .findElement(By.xpath("//div/table[2]"))
    .findElements(By.tagName("tr"))
    .asScala
    .map(
      _.findElements(By.xpath("td | th")).asScala
        .map(_.getText.trim.replaceAll("""\nView.*""", "").replaceAll("\n", " "))
        .toList
    )
    .toList

  // To get the duty due text
  private def bulletPointsTextDutyDue() =
    Driver.instance.findElement(By.xpath("(//ul[@class='govuk-list govuk-list--bullet'])[2]"))

  def getBulletPointsTextDutyDue: Seq[String] = bulletPointsTextDutyDue().getText.split("\n").toList

  def enterDate(day: String, month: String, year: String): Unit = {}

  def selectCheckBoxes(choiceOfCheckBox: Array[String]): Unit =
    for (i <- choiceOfCheckBox.indices)
      click on xpath(s"//label[normalize-space()='${choiceOfCheckBox(i)}']")

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
    webDriver
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

  def clickAgreeAndSendReturnButton(): Unit = click on cssSelector("#continueButton")



}

object Driver {
  lazy val instance: WebDriver = new ChromeDriver()
}

// trait BasePage extends Page with Matchers with Eventually with WebBrowser {
 //override implicit def webDriver: WebDriver = Driver.instance
 //implicit val webDriver: WebDriver

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
