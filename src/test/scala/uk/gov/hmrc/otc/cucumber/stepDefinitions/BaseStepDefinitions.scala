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

package uk.gov.hmrc.otc.cucumber.stepDefinitions

import io.cucumber.datatable.DataTable
import io.cucumber.scala.{EN, ScalaDsl}
import uk.gov.hmrc.otc.conf.MessageReader._
import org.junit.Assert
import org.openqa.selenium.By
import org.scalatest.concurrent.Eventually
import org.scalatest.matchers.should.Matchers
import org.scalatestplus.selenium.WebBrowser
import uk.gov.hmrc.otc.conf.TestConfiguration
import uk.gov.hmrc.otc.cucumber.stepDefinitions.Hooks.When
import uk.gov.hmrc.otc.driver.BrowserDriver
import uk.gov.hmrc.otc.pages.BasePage
import uk.gov.hmrc.otc.pages.auth.AuthLoginStubPage
import uk.gov.hmrc.otc.pages.generic.PageObjectFinder.DataTableConverters
import uk.gov.hmrc.otc.pages.generic.PageObjectFinder

import scala.jdk.CollectionConverters._
import java.time.LocalDate

trait BaseStepDefinitions
    extends ScalaDsl
    with EN
    with BrowserDriver
    with Eventually
    with Matchers
    with WebBrowser
    with BasePage {

  val currentYear: Int  = LocalDate.now().minusMonths(5).getYear
  val shortYear: String = currentYear.toString.substring(2)

  When("""I navigate to the {string}""") { page: String =>
    go to PageObjectFinder.page(page)
  }

  And("""I navigated to the {string}""") { page: String =>
    go to PageObjectFinder.page(page)
  }

  When("""I click submit button on {string}""") { (page: String) =>
    PageObjectFinder.page(page).waitForPageHeader
    PageObjectFinder.page(page).clickSubmitButton()
  }

  Then("""I am presented with the {string}""") { (page: String) =>
    PageObjectFinder.page(page).waitForPageHeader
    PageObjectFinder.page(page).checkURL
    PageObjectFinder.page(page).checkPageTitle()
  }

  Then("""I am presented with the {string} with new url""") { page: String =>
    PageObjectFinder.page(page).waitForPageHeader
    PageObjectFinder.page(page).checkNewURL
    PageObjectFinder.page(page).checkPageHeader()
    PageObjectFinder.page(page).checkPageTitle()
  }

  Then("""I am presented with the {string} with new url containing prefix as {string} and suffix as {string}""") {
    (page: String, urlPrefix: String, urlSuffix: String) =>
      PageObjectFinder.page(page).waitForPageHeader
      PageObjectFinder.page(page).checkNewURLWithTwoDynamicValues(urlPrefix, urlSuffix)
      PageObjectFinder.page(page).checkPageHeader()
      PageObjectFinder.page(page).checkPageTitle()
  }

  Then("""I am presented with the {string} with url suffix as {string}""") { (page: String, urlSuffix: String) =>
    PageObjectFinder.page(page).waitForPageHeader
    PageObjectFinder.page(page).checkNewDynamicURL(urlSuffix)
    PageObjectFinder.page(page).checkPageHeader()
    PageObjectFinder.page(page).checkPageTitle()
  }

  Then("""I am presented with the {string} with existing url suffix as {string}""") {
    (page: String, urlSuffix: String) =>
      PageObjectFinder.page(page).waitForPageHeader
      PageObjectFinder.page(page).checkExistingDynamicURL(urlSuffix)
      PageObjectFinder.page(page).checkPageHeader()
      PageObjectFinder.page(page).checkPageTitle()
  }

  When("""I select radio button {string} on {string}""") { (choice: String, page: String) =>
    PageObjectFinder.page(page).waitForPageHeader
    PageObjectFinder.page(page).clickRadioButton(choice)
  }

  When("""I {string} checkbox {string} on {string}""") { (checkBoxAction: String, choice: String, page: String) =>
    checkBoxAction match {
      case "select" | "unselect" =>
        PageObjectFinder.page(page).waitForPageHeader
        PageObjectFinder.page(page).selectCheckBoxes(choice.split(","))
    }
  }

  When("""I click save and continue button on {string}""") { (page: String) =>
    PageObjectFinder.page(page).waitForPageHeader
    //Thread.sleep(6000)
    PageObjectFinder.page(page).clickSaveAndContinueButton()
    //Thread.sleep(100000)
  }

  When("""I click continue button on {string}""") { (page: String) =>
    PageObjectFinder.page(page).waitForPageHeader
    PageObjectFinder.page(page).clickContinueButton()
  }

  When("""I click back button on {string}""") { (page: String) =>
    PageObjectFinder.page(page).waitForPageHeader
    PageObjectFinder.page(page).clickBackButton()
  }

  Then("""I am presented with the {string} error page""") { page: String =>
    PageObjectFinder.page(page).waitForPageHeader
    PageObjectFinder.page(page).checkURL
    PageObjectFinder.page(page).checkPageErrorTitle()
  }

  Then("""The error summary title is {string} and the error message is {string}""") {
    (errorSummaryTitle: String, errorMessage: String) =>
      PageObjectFinder.checkPageErrorSummaryTitle(errorSummaryTitle)
      val finalErrorMessage = errorMessage.replace("^", "’")
      PageObjectFinder.checkPageErrorMessage(finalErrorMessage)
  }

  When("""I enter {string} on {string}""") { (data: String, page: String) =>
    PageObjectFinder.page(page).waitForPageHeader
    PageObjectFinder.page(page).enterDetails(data)
  }

  When("""I enter {string} in the {string} input field on {string}""") { (text: String, field: String, page: String) =>
    PageObjectFinder.page(page).waitForPageHeader
    val element = PageObjectFinder.page(page).textFieldElement(field)
    element.sendKeys(text)
  }

  When("""I enter the following data into corresponding input fields on {string}""") { (page: String, data: DataTable) =>
    // Ensures data is interpreted as a list of rows, preserving order
    val rows                          = data.asLists(classOf[String]).asScala.toList
    // Ensures correct mapping
    val formData: Map[String, String] = rows.map(row => row.get(0) -> row.get(1)).toMap
    for ((field, value) <- formData) {
      val inputField = PageObjectFinder.page(page).textFieldElement(field)
      inputField.clear()
      inputField.sendKeys(Option(value).getOrElse(""))
    }
  }

  When("""I enter {string} for {string} on {string}""") { (textToEnter: String, text: String, page: String) =>
    PageObjectFinder.page(page).waitForPageHeader
    PageObjectFinder.page(page).enterMultipleDetails(textToEnter, text)
  }

  When("""I enter {string} for {string} on {string} at {string} input box""") {
    (textToEnter: String, text: String, page: String, index: String) =>
      PageObjectFinder.page(page).waitForPageHeader
      PageObjectFinder.page(page).enterMultipleDetailsWithIndex(textToEnter, text, index)
  }

  When("""I enter {string} in the textarea field on {string}""") {
    (textToEnter: String, page: String) =>
      PageObjectFinder.page(page).waitForPageHeader
      val textAreaElement = driver.findElement(By.className("govuk-textarea"))
      textAreaElement.clear()
      textAreaElement.sendKeys(textToEnter)
  }

  When("""I enter redirect url for {string}""") { (page: String) =>
    page match {
      case "Task List Page"            =>
        driver.get(TestConfiguration.url("overseas-pension-transfer-frontend") + "/complete-return/task-list")
      case "Return Summary Page"       =>
        driver.get(TestConfiguration.url("overseas-pension-transfer-frontend") + "/complete-return/check-return")
      case "Alcohol Duty Service"      =>
        driver.get(
          TestConfiguration.url("overseas-pension-transfer-frontend") + "/before-you-start-your-return/" + periodKey()
        )
      case "Previous Month Period Key" =>
        driver.get(
          TestConfiguration.url(
            "overseas-pension-transfer-frontend"
          ) + "/before-you-start-your-return/" + previousPeriodKey()
        )
    }
  }

  And("""I enter nothing in the {string} input field on {string}""") { (field: String, page: String) =>
    val fieldValue = PageObjectFinder.page(page).textFieldElement(field).getAttribute("value")
    fieldValue should be("")
  }

  And("""^I should see the following details""") { data: DataTable =>
    val expectedData = data.asMaps().asScala.toList.flatMap(_.asScala.toMap).toMap
    val actualData   = PageObjectFinder.pageData
    actualData should be(expectedData)
  }

  And("""^I should see the heading "(.*)"$""") { (expectedHeading: String) =>
    val headingElement = driver.findElement(By.tagName("h1"))
    headingElement.getText should be(expectedHeading.replace("  ", " "))
  }

  And("""I should see the hint text {string}""") { (hintText: String) =>
    val hintElement = driver.findElement(By.className("govuk-hint"))
    hintElement.getText should be(hintText)
  }

  And("""I should see two radio buttons: {string} and {string}""") { (optYes: String, optNo: String) =>
    val radioOptions = driver.findElements(By.cssSelector("label.govuk-label"))
    val radioTexts   = radioOptions.asScala.map(_.getText)

    radioTexts should contain(optYes)
    radioTexts should contain(optNo)
  }

  And("""I should see below input fields on {string}""") { (page: String, data: DataTable) =>
    PageObjectFinder.page(page).verifyInputFieldsByIds(data.asScalaListOfStrings)
  }

  And("""I should see the input fields with below labels on {string}""") { (page: String, data: DataTable) =>
    PageObjectFinder.page(page).verifyInputFieldsWithLabels(data.asScalaListOfStrings)
  }

  /*And("""^I should see a button with label "(.*)"$""") { (buttonLabel: String) =>
    // Locate button
    val buttonElement = driver.findElement(By.xpath(s"//button[normalize-space(text())='$buttonLabel']"))

    // Validate the button text
    buttonElement.getText should be(buttonLabel)
  }*/

  And("""^I should see a button with label "(.*)"$""") { (buttonLabel: String) =>
    val buttonElement = driver.findElement(By.xpath(s"//button[@type='submit' and normalize-space(text())='$buttonLabel']"))
    buttonElement.getAttribute("value") should be(buttonLabel)
  }

  And("""I verify the content {string} on {string}""") { (expectedText: String, page: String) =>
    PageObjectFinder.page(page).waitForPageHeader
    val actualText = driver.findElement(By.className("govuk-heading-l")).getText
    actualText should be(expectedText)
  }

  And("""I should verify the details of the table {int} on {string}""") { (num: Int, page: String, data: DataTable) =>
    PageObjectFinder.page(page).waitForPageHeader
    val expected                                   = data.asScalaListOfLists
    def getResultList(num: Int): Seq[List[String]] =
      driver
        .findElement(By.xpath("//div/table[" + num + "]"))
        .findElements(By.tagName("tr"))
        .asScala
        .map(
          _.findElements(By.xpath("td | th")).asScala
            .map(_.getText.trim)
            .toList
        )
        .toList

    val actual = getResultList(num)
    actual should be(expected)
  }

  And("""^I should see the following product details""") { data: DataTable =>
    val expected = data.asScalaListOfLists
    val actual   = productsList
    actual should be(expected)
  }

  And("""I click on View Return link for one of the completed returns on {string}""") { (page: String) =>
    PageObjectFinder.page(page).waitForPageHeader
    driver.findElement(By.xpath("//div/table[2]/tbody/tr[1]/td[3]/ul/li/a")).click()
  }
  When("""I redirect to a URL with Spirits section on {string}""") { (page: String) =>
    PageObjectFinder.page(page).waitForPageHeader
    val expectedPeriod = driver.findElement(By.xpath("(//tbody[@class='govuk-table__body'])[2]")).getText
    val periodToUrl    = Map(
      s"January $currentYear" -> s"${shortYear}AA",
      s"April $currentYear"   -> s"${shortYear}AD",
      s"July $currentYear"    -> s"${shortYear}AG",
      s"October $currentYear" -> s"${shortYear}AJ"
    )

    periodToUrl.find { case (period, _) => expectedPeriod.contains(period) } match {
      case Some((_, suffix)) =>
        driver.get(TestConfiguration.url("overseas-pension-transfer-frontend") + s"/view-your-return/$suffix")
      case None              =>
        logger.warn("No month returned to fit within the quarterly spirits requirement. Please check")
        Assert.fail()
    }

  }

  Then("""The page header is {string}""") { (pageHeader: String) =>
    val actualPageHeader = driver.findElement(By.tagName("h1")).getText
    val currentURL       = driver.getCurrentUrl

    val urlToPeriod = Map(
      s"${shortYear}AA" -> s"January $currentYear",
      s"${shortYear}AD" -> s"April $currentYear",
      s"${shortYear}AG" -> s"July $currentYear",
      s"${shortYear}AJ" -> s"October $currentYear"
    )

    urlToPeriod.find { case (suffix, _) => currentURL.contains(suffix) } match {
      case Some((_, period)) =>
        val finalPageHeader = pageHeader.replace("SpiritsPeriod", period)
        actualPageHeader should be(finalPageHeader)
      case None              =>
        logger.warn("No month to return")
        Assert.fail()
    }
  }

  When("""I click {string} on {string}""") { (button: String, page: String) =>
    PageObjectFinder.page(page).clickButton(button)
  }

  When("""I verify the ABV value displayed as {string} on {string}""") { (expectedText: String, page: String) =>
    PageObjectFinder.page(page).waitForPageHeader
    val actualText = driver.findElement(By.cssSelector("ul[class='govuk-list govuk-list--bullet'] li")).getText
    actualText should be(expectedText)
  }

  Then("""I verify the due amount displayed as {string} on {string}""") { (expectedText: String, page: String) =>
    PageObjectFinder.page(page).waitForPageHeader
    val actualText = driver.findElement(By.xpath("//main/div/div/p[1]")).getText.trim.replaceAll("\n", " ")
    actualText should be(expectedText)
  }

  And("""I should verify the table header displayed""") { (data: DataTable) =>
    val expectedText = data.asScalaListOfStrings
    tableHeaderText should be(expectedText)
  }

  Then("""I can see below tax type codes on the {string}""") { (page: String, data: DataTable) =>
    PageObjectFinder.page(page).waitForPageHeader
    val expectedText = data.asScalaListOfStrings
    allTaxTypeCodeText() should be(expectedText)
  }

  Then("""I am presented with the {string} {string}""") { (page: String, specificPage: String) =>
    PageObjectFinder.page(page).waitForPageHeader
    PageObjectFinder.page(page).checkURL
    PageObjectFinder.page(page).checkPageTitle(specificPage)
  }

  When("""I click on {string} hyperlink on {string}""") { (hyperlink: String, page: String) =>
    PageObjectFinder.page(page).waitForPageHeader
    hyperlink match {
      case "Member doesn't have a National Insurance number." =>
        driver.findElement(By.xpath("//*[@id=\"noNinoPageLink\"]")).click()

      case "The member has a National Insurance number." =>
        driver.findElement(By.xpath("//*[@id=\"memberNinoPageLink\"]")).click()

        //
      case "Change Address" =>
        driver.findElement(By.xpath("//*[contains(@href,'change-property-address')]")).click()

      case "Change Value" =>
        driver.findElement(By.xpath("//*[contains(@href,'change-property-value')]")).click()

      case "Change Description" =>
        driver.findElement(By.xpath("//*[contains(@href,'change-property-description')]")).click()

      case "Change Property Amend" =>
        driver.findElement(By.xpath("//*[contains(@href,'change-property-amend')]")).click()

      case "Remove Property" =>
        driver.findElement(By.xpath("//*[contains(@href,'property-confirm-removal')]")).click()

      case _ =>
        driver.findElement(By.xpath("//a[normalize-space()='" + hyperlink + "']")).click()
    }
  }

  And("""^I should see the following status of the submission journey""") { data: DataTable =>
    val expectedData = data.asMaps().asScala.toList.flatMap(_.asScala.toMap).toMap
    val actualData   = PageObjectFinder.taskListPageContentView
    actualData should be(expectedData)
  }

  And("""I should see the following subsections""") { data: DataTable =>
    val expected = data.asScalaListOfStrings
    subSectionsHeaderText should be(expected)
  }

  Given("""I cleared the data for the service""") {
    driver.get(TestConfiguration.url("overseas-pension-transfer-frontend") + "/test-only/clear-all")
  }

  And("""I should see following details at the {string}""") { (page: String, data: DataTable) =>
    val expectedData = data.asMaps().asScala.toList.flatMap(_.asScala.toMap).toMap
    PageObjectFinder.page(page).waitForPageHeader
    val actualData   = PageObjectFinder.dataAtCheckYourAnswersPage
    actualData should be(expectedData)
  }

  And("""I should see the {string} and below error messages""") { (errorSummaryTitle: String, data: DataTable) =>
    val expectedErrorMessage = data.asScalaListOfStrings
    PageObjectFinder.checkPageErrorSummaryTitle(errorSummaryTitle)
    PageObjectFinder.listOfErrorMessages() should be(expectedErrorMessage)
  }

  And("""I should see following erroneous fields are highlighted on {string}""") { (page: String, data: DataTable) =>
    for (field <- data.asScalaListOfStrings) {
      val classAttr = textFieldElement(field).getAttribute("class")
      classAttr.split("\\s+") should contain("govuk-input--error")
    }
  }

  And("""I should see following erroneous dropdown fields are highlighted on {string}""") { (page: String, dataTable: DataTable) =>
    val fields = dataTable.asList(classOf[String]).asScala // Convert Java List to Scala List
    fields.foreach { field =>
      val classAttr = textFieldElement(field).getAttribute("class") // Get class attribute
      //classAttr.split("\\s+").toSeq should contain("govuk-input--error") // Convert to Seq and validate
    }
  }

  And("""Clicking each error message should focus on the corresponding input field on {string}""") { (page: String) =>
    val errorLinks = PageObjectFinder.listOfErrorLinks()
    for (errorLink <- errorLinks) {
      val fieldId       = errorLink.getAttribute("href").split("#").last
      val inputField    = PageObjectFinder.textFieldElement(fieldId)
      errorLink.click()
      val activeElement = driver.switchTo().activeElement()
      activeElement shouldBe inputField
    }
  }

  And("""I check the page source for the following key-value pairs:""") { (data: DataTable) =>
    val pageSource: String = driver.getPageSource.trim
    val keyValuePairs      = data.asMaps(classOf[String], classOf[String]).asScala

    // Function to count occurrences of a substring in a string
    def countOccurrences(source: String, target: String): Int =
      source.sliding(target.length).count(window => window == target)
    // Verify each key-value pair
    keyValuePairs.foreach { pair =>
      val key   = pair.get("key")
      val value = pair.get("value")
      if (key != null && value != null) {
        val keyCount   = countOccurrences(pageSource, key)
        if (keyCount == 0) {
          fail(s"The key '$key' does not exist, please check")
        }
        val valueCount = countOccurrences(pageSource, value)
        if (valueCount == 0) {
          fail(s"The value '$value' does not exist, please check")
        }
      }
    }
  }

  And("""I click on change link {int} on {string} for alcohol type {string}""") {
    (changeLinkIndex: Int, page: String, alcoholType: String) =>
      PageObjectFinder.page(page).waitForPageHeader
      driver
        .findElement(
          By.xpath(
            "(//a[@href='/manage-alcohol-duty/complete-return/alcoholic-products/" + alcoholType + "/declare/check-your-answers'])[" + changeLinkIndex + "]"
          )
        )
        .click()
  }

  And("""I should see the following details of the table {int} at the returns summary page""") {
    (num: Int, data: DataTable) =>
      val expected = data.asScalaListOfLists

      def declaredProductListAtReturnsSummary(num: Int): Seq[List[String]] = driver
        .findElements(By.xpath("//table[" + num + "]/tbody/tr[@class='govuk-table__row']"))
        .asScala
        .map { declaredProductDetails =>
          declaredProductDetails
            .findElements(By.tagName("td"))
            .asScala
            .map(_.getText.trim.replaceAll("\n", " "))
            .toList
        }
        .toList

      val actual = declaredProductListAtReturnsSummary(num)
      actual should be(expected)
  }

  And("""the status of the Send return is marked as {string}""") { (sendReturnStatus: String) =>
    val expected = driver.findElement(By.xpath("//strong[@class='govuk-tag govuk-tag--grey']")).getText
    sendReturnStatus should be(expected)
  }

  When("""I click on Agree and send return button {string}""") { (page: String) =>
    PageObjectFinder.page(page).waitForPageHeader
    PageObjectFinder.page(page).clickAgreeAndSendReturnButton()
  }

  When("""the page source contains {string}""") { (paymentAmountText: String) =>
    val actualText = driver.findElement(By.xpath("//p[normalize-space()='" + paymentAmountText + "']")).getText
    actualText should be(paymentAmountText)
  }

  Then("""^I should see the following values on the page$""") { dataTable: DataTable =>
    dataTable.asMaps(classOf[String], classOf[String]).asScala.foreach((data: java.util.Map[String, String]) => {
      val text = getMessage(data.get("value"))
      pageSource should include(text)
    })
  }
  When("""I verify the value displayed as {string} on {string}""") { (expectedText: String, page: String) =>
    PageObjectFinder.page(page).waitForPageHeader
    val actualText = driver.findElement(By.cssSelector("ul[class='govuk-list govuk-list--bullet'] li")).getText
    actualText should be(expectedText)
  }

  When("""I click on the Details component {string} on {string}""") { (detailsSummary: String, page: String) =>
    PageObjectFinder.page(page).waitForPageHeader
    driver.findElement(By.cssSelector("span[class='govuk-details__summary-text']")).click()
  }

}


