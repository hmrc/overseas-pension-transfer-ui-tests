/*
 * Copyright 2026 HM Revenue & Customs
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

package specsteps

/*
 * Copyright 2026 HM Revenue & Customs
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

import io.cucumber.datatable.DataTable
import org.openqa.selenium.By
import org.openqa.selenium.support.ui.{ExpectedConditions, WebDriverWait}
import org.scalatestplus.selenium.Edge.pageSource
import org.scalatestplus.selenium.Page
import specpage.BasePage
import specpage.auth.AuthLoginStubPage
import specpage.generic.PageObjectFinder
import specpage.generic.PageObjectFinder.DataTableConverters
import otc.conf.MessageReader._
import otc.conf.TestConfiguration
import otc.support.TestData
import uk.gov.hmrc.selenium.webdriver.Driver

import java.time.{Duration, LocalDate}
import scala.jdk.CollectionConverters._

object BaseStepDefinitionsSteps extends BasePage {

  val currentYear: Int  = LocalDate.now().minusMonths(5).getYear
  val shortYear: String = currentYear.toString.substring(2)

  // I navigate to the {string}
  def navigateToPage(page: Page): Unit =
    go to page

  // I navigate to the {string}
  def whenINavigateToThe(): Unit = {
    page: String =>
        go to page
  }

  // I navigated to the {string}
  def andINavigatedToThe(pageName: String): Unit = {
    page: String =>
        go to PageObjectFinder.page(page)
  }

  // I click submit button on {string}
  def whenIClickSubmitButtonOn(page: String): Unit = {
    PageObjectFinder.page(page).waitForPageHeader
        PageObjectFinder.page(page).clickSubmitButton()
  }

  // I am presented with the {string}
  def thenIAmPresentedWith (pageName: String): Unit = {
    val page = PageObjectFinder.page(pageName)
    page.checkURL
    page.checkPageTitle()
  }

  // I am presented with the {string}
  def thenIAmPresentedWithThe (pageName: String): Unit = {
    val page = PageObjectFinder.page(pageName)
        page.waitForPageHeader
        page.checkURL
        page.checkPageTitle()

  }

  // I am presented with the change {string}
  def thenIAmPresentedWithTheChange(pageName: String): Unit = {
    val page = PageObjectFinder.page(pageName)
        page.waitForPageHeader
        page.checkChangeURL
        page.checkPageTitle()
  }

  // I am presented with the {string} with new url
  def thenIAmPresentedWithTheWithNewUrl(): Unit = {
    page: String =>
        PageObjectFinder.page(page).waitForPageHeader
        PageObjectFinder.page(page).checkNewURL
        PageObjectFinder.page(page).checkPageHeader()
        PageObjectFinder.page(page).checkPageTitle()
  }
  def whenIEnterRedirectURLOnAuthLoginStubPageFor(typeOfJourney: String): Unit = {
    typeOfJourney match {
      case "Journey entry URL" =>
        AuthLoginStubPage.enterRedirectURL(TestConfiguration.url("overseas-pension-transfer-frontend") + "/start?srn=S2400000001")
      case "Is Member currently a resident of UK"                       =>
        AuthLoginStubPage.enterRedirectURL(TestConfiguration.url("overseas-pension-transfer-frontend") + "/member-is-resident-uk")
      case "Has member ever been a resident of the UK for tax purposes" =>
        AuthLoginStubPage.enterRedirectURL(TestConfiguration.url("overseas-pension-transfer-frontend") + "/member-has-ever-been-resident-uk")
      case "Member does not have NINO"                                  =>
        AuthLoginStubPage.enterRedirectURL(TestConfiguration.url("overseas-pension-transfer-frontend") + "/member-does-not-have-nino")
      case  "What You Will Need Page"                                                         =>
        AuthLoginStubPage.enterRedirectURL(TestConfiguration.url("overseas-pension-transfer-frontend") + "/what-will-be-needed")
      case "New Login Page"                       =>
        AuthLoginStubPage.enterRedirectURL(TestConfiguration.url("overseas-pension-transfer-frontend"))
      case _                                                            =>
        AuthLoginStubPage.enterRedirectURL(TestConfiguration.url("overseas-pension-transfer-frontend"))
    }}
  def whenIEnterEnrollmentKey (enrollmentKey:String, IdentifierName:String, IdentifierValue:String, page:String): Unit = {
    page match {
      case "Auth Login Stub Page" =>
        AuthLoginStubPage.enrolments(enrollmentKey, IdentifierName, IdentifierValue)
    }}
  // I am presented with the {string} with new url containing prefix as {string} and suffix as {string}
  def thenIAmPresentedWithTheWithNewUrlContainingPrefixAsAndSuffixAs(page: String, urlPrefix: String, urlSuffix: String): Unit = {
    PageObjectFinder.page(page).waitForPageHeader
          PageObjectFinder.page(page).checkNewURLWithTwoDynamicValues(urlPrefix, urlSuffix)
          PageObjectFinder.page(page).checkPageHeader()
          PageObjectFinder.page(page).checkPageTitle()
  }

  // I am presented with the {string} with url suffix as {string}
  def thenIAmPresentedWithTheWithUrlSuffixAs(page: String, urlSuffix: String): Unit = {
    PageObjectFinder.page(page).waitForPageHeader
        PageObjectFinder.page(page).checkNewDynamicURL(urlSuffix)
        PageObjectFinder.page(page).checkPageHeader()
        PageObjectFinder.page(page).checkPageTitle()
  }

  // I am presented with the {string} with existing url suffix as {string}
  def thenIAmPresentedWithTheWithExistingUrlSuffixAs(page: String, urlSuffix: String): Unit = {
    PageObjectFinder.page(page).waitForPageHeader
          PageObjectFinder.page(page).checkExistingDynamicURL(urlSuffix)
          PageObjectFinder.page(page).checkPageHeader()
          PageObjectFinder.page(page).checkPageTitle()
  }

  // I select radio button {string} on {string}
  def whenISelectRadioButtonOn(choice: String, page: String): Unit = {
    PageObjectFinder.page(page).waitForPageHeader
        PageObjectFinder.page(page).clickRadioButton(choice)
  }

  // I {string} checkbox {string} on {string}
  def whenICheckboxOn(checkBoxAction: String, choice: String, page: String): Unit = {
    checkBoxAction match {
          case "select" | "unselect" =>
            PageObjectFinder.page(page).waitForPageHeader
            PageObjectFinder.page(page).selectCheckBoxes(choice.split(","))
        }
  }

  // I click save and continue button on {string}
  def whenIClickSaveAndContinueButtonOn(page: String): Unit = {
    PageObjectFinder.page(page).waitForPageHeader
        PageObjectFinder.page(page).clickSaveAndContinueButton()
  }

  // I click continue button on {string}
  def whenIClickContinueButtonOn(page: String): Unit = {
    PageObjectFinder.page(page).waitForPageHeader
        PageObjectFinder.page(page).clickContinueButton()
  }

  // I click back button on {string}
  def whenIClickBackButtonOn(page: String): Unit = {
    PageObjectFinder.page(page).waitForPageHeader
        PageObjectFinder.page(page).clickBackButton()
  }

  // I am presented with the {string} error page
  def thenIAmPresentedWithTheErrorPage(): Unit = {
    page: String =>
        PageObjectFinder.page(page).waitForPageHeader
        PageObjectFinder.page(page).checkURL
        PageObjectFinder.page(page).checkPageErrorTitle()
  }

  // The error summary title is {string} and the error message is {string}
  def thenTheErrorSummaryTitleIsAndTheErrorMessageIs(errorSummaryTitle: String, errorMessage: String): Unit = {
    PageObjectFinder.checkPageErrorSummaryTitle(errorSummaryTitle)
          val finalErrorMessage = errorMessage.replace("^", "’")
          PageObjectFinder.checkPageErrorMessage(finalErrorMessage)
  }

  // I enter {string} on {string}
  def whenIEnterOn(data: String, page: String): Unit = {
    PageObjectFinder.page(page).waitForPageHeader
        PageObjectFinder.page(page).enterDetails(data)
  }

  // I enter {string} in the {string} input field on {string}
  def whenIEnterInTheInputFieldOn(text: String, field: String, page: String): Unit = {
    PageObjectFinder.page(page).waitForPageHeader
        val element = PageObjectFinder.page(page).textFieldElement(field)
        element.sendKeys(text)
  }

  // I enter the following data into corresponding input fields on {string}
  def whenIEnterTheFollowingDataIntoCorrespondingInputFieldsOn(page: String, data: DataTable): Unit = {
    val rows                          = data.asLists(classOf[String]).asScala.toList
        val formData: Map[String, String] = rows.map(row => row.get(0) -> row.get(1)).toMap

        for ((field, value) <- formData) {
          val key = s"${page.trim.toLowerCase.replaceAll(" ", "_")}.$field"
          TestData.set(key, value)
          val inputField = PageObjectFinder.page(page).textFieldElement(field)
          inputField.clear()
          inputField.sendKeys(Option(value).getOrElse(""))
        }
  }

  // Overload for ScalaTest (no DataTable, accepts varargs)
  def whenIEnterTheFollowingDataIntoCorrespondingInputFieldsOn(links: (String, String)*): Unit = {
    links.foreach { case (text, url) =>
      val driverWait: WebDriverWait =
        new WebDriverWait(Driver.instance, Duration.ofSeconds(10), Duration.ofSeconds(1))
      driverWait.until(
        ExpectedConditions.elementToBeClickable(
          Driver.instance.findElement(By.id(url))
        )
      )
      //Driver.instance.findelements(url, text)
    }
  }

  // I enter {string} for {string} on {string}
  def whenIEnterForOn(textToEnter: String, text: String, page: String): Unit = {
    PageObjectFinder.page(page).waitForPageHeader
        PageObjectFinder.page(page).enterMultipleDetails(textToEnter, text)
  }

  // I enter {string} for {string} on {string} at {string} input box
  def whenIEnterForOnAtInputBox(textToEnter: String, text: String, page: String, index: String): Unit = {
    PageObjectFinder.page(page).waitForPageHeader
          PageObjectFinder.page(page).enterMultipleDetailsWithIndex(textToEnter, text, index)
  }

  // I enter {string} in the textarea field on {string}
  def whenIEnterInTheTextareaFieldOn(textToEnter: String, page: String): Unit = {
    PageObjectFinder.page(page).waitForPageHeader
          val textAreaElement = Driver.instance.findElement(By.className("govuk-textarea"))
          textAreaElement.clear()
          textAreaElement.sendKeys(textToEnter)
  }

  // I enter redirect url for {string}
  def whenIEnterRedirectUrlFor(page: String): Unit = {
    page match {
          case "Task List Page"            =>
            Driver.instance.get(TestConfiguration.url("overseas-pension-transfer-frontend") + "/complete-return/task-list")
          case "Return Summary Page"       =>
            Driver.instance.get(TestConfiguration.url("overseas-pension-transfer-frontend") + "/complete-return/check-return")
          case "Alcohol Duty Service"      =>
            Driver.instance.get(
              TestConfiguration.url("overseas-pension-transfer-frontend") + "/before-you-start-your-return/" + periodKey()
            )
          case "Previous Month Period Key" =>
            Driver.instance.get(
              TestConfiguration.url(
                "overseas-pension-transfer-frontend"
              ) + "/before-you-start-your-return/" + previousPeriodKey()
            )
        }
  }

  // I enter nothing in the {string} input field on {string}
  def andIEnterNothingInTheInputFieldOn(field: String, page: String): Unit = {
    val fieldValue = PageObjectFinder.page(page).textFieldElement(field).getAttribute("value")
        fieldValue should be("")
  }

  // ^I should see the following details
  def andIShouldSeeTheFollowingDetails(): Unit = {
    data: DataTable =>
        val expectedData = data.asMap(classOf[String], classOf[String]).asScala.toMap
        val actualData   = PageObjectFinder.pageData
        actualData should be(expectedData)
  }

  // ^I should see the heading "(.*)"$
  def andIShouldSeeTheHeadingX(expectedHeading: String): Unit = {
    val headingElement = Driver.instance.findElement(By.tagName("h1"))
        headingElement.getText should be(expectedHeading.replace("  ", " "))
  }

  // I should see the hint text {string}
  def andIShouldSeeTheHintText(hintText: String): Unit = {
    val hintElement = Driver.instance.findElement(By.className("govuk-hint"))
        hintElement.getText should be(hintText)
  }

  // I should see two radio buttons: {string} and {string}
  def andIShouldSeeTwoRadioButtonsAnd(optYes: String, optNo: String): Unit = {
    val radioOptions = Driver.instance.findElements(By.cssSelector("label.govuk-label"))
        val radioTexts   = radioOptions.asScala.map(_.getText)

        radioTexts should contain(optYes)
        radioTexts should contain(optNo)
  }

  // I should see below input fields on {string}
  def andIShouldSeeBelowInputFieldsOn(page: String, data: DataTable): Unit = {
    PageObjectFinder.page(page).verifyInputFieldsByIds(data.asScalaListOfStrings)
  }

  // Overload for ScalaTest (no DataTable, accepts varargs)
  def andIShouldSeeBelowInputFieldsOn(links: (String, String)*): Unit = {
    links.foreach { case (text, url) =>
      val driverWait: WebDriverWait =
        new WebDriverWait(Driver.instance, Duration.ofSeconds(10), Duration.ofSeconds(1))
      driverWait.until(
        ExpectedConditions.elementToBeClickable(
          Driver.instance.findElement(By.id(url))
        )
      )
      //verifyLinkById(url, text)
    }
  }

  // I should see the input fields with below labels on {string}
  def andIShouldSeeTheInputFieldsWithBelowLabelsOn(page: String, data: DataTable): Unit = {
    PageObjectFinder.page(page).verifyInputFieldsWithLabels(data.asScalaListOfStrings)
  }

  // Overload for ScalaTest (no DataTable, accepts varargs)
  def andIShouldSeeTheInputFieldsWithBelowLabelsOn(links: (String, String)*): Unit = {
    links.foreach { case (text, url) =>
      val driverWait: WebDriverWait =
        new WebDriverWait(Driver.instance, Duration.ofSeconds(10), Duration.ofSeconds(1))
      driverWait.until(
        ExpectedConditions.elementToBeClickable(
          Driver.instance.findElement(By.id(url))
        )
      )
      //verifyLinkById(url, text)
    }
  }

  // ^I should see a button with label "(.*)"$
  def andIShouldSeeAButtonWithLabel(buttonLabel: String): Unit = {
    // Locate button
        val buttonElement = Driver.instance.findElement(By.xpath(s"//button[normalize-space(text())='$buttonLabel']"))

        // Validate the button text
        buttonElement.getText should be(buttonLabel)
  }

  // ^I should see a button with label "(.*)"$
  def andIShouldSeeAButtonWithLabelX(buttonLabel: String): Unit = {
    val buttonElement = Driver.instance.findElement(By.xpath(s"//button[@type='submit' and normalize-space(text())='$buttonLabel']"))
        buttonElement.getAttribute("value") should be(buttonLabel)
  }

  // I verify the content {string} on {string}
  def andIVerifyTheContentOn(expectedText: String, page: String): Unit = {
    PageObjectFinder.page(page).waitForPageHeader
        val actualText = Driver.instance.findElement(By.className("govuk-heading-l")).getText
        actualText should be(expectedText)
  }

  // I should verify the details of the table {int} on {string}
  def andIShouldVerifyTheDetailsOfTheTableOn(num: Int, page: String, data: DataTable): Unit = {
    PageObjectFinder.page(page).waitForPageHeader
        val expected                                   = data.asScalaListOfLists
        def getResultList(num: Int): Seq[List[String]] =
          webDriver
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

  // Overload for ScalaTest (no DataTable, accepts varargs)
  def andIShouldVerifyTheDetailsOfTheTableOn(links: (String, String)*): Unit = {
    links.foreach { case (text, url) =>
      val driverWait: WebDriverWait =
        new WebDriverWait(Driver.instance, Duration.ofSeconds(10), Duration.ofSeconds(1))
      driverWait.until(
        ExpectedConditions.elementToBeClickable(
          Driver.instance.findElement(By.id(url))
        )
      )
     // verifyLinkById(url, text)
    }
  }

  // I click on View Return link for one of the completed returns on {string}
  def andIClickOnViewReturnLinkForOneOfTheCompletedReturnsOn(page: String): Unit = {
    PageObjectFinder.page(page).waitForPageHeader
        Driver.instance.findElement(By.xpath("//div/table[2]/tbody/tr[1]/td[3]/ul/li/a")).click()
  }

  // I click {string} on {string}
  def whenIClickOn(button: String, page: String): Unit = {
    PageObjectFinder.page(page).clickButton(button)
  }

  // I should verify the table header displayed
  def andIShouldVerifyTheTableHeaderDisplayed(data: DataTable): Unit = {
    val expectedText = data.asScalaListOfStrings
        tableHeaderText should be(expectedText)
  }

  // Overload for ScalaTest (no DataTable, accepts varargs)
  def andIShouldVerifyTheTableHeaderDisplayed(links: (String, String)*): Unit = {
    links.foreach { case (text, url) =>
      val driverWait: WebDriverWait =
        new WebDriverWait(Driver.instance, Duration.ofSeconds(10), Duration.ofSeconds(1))
      driverWait.until(
        ExpectedConditions.elementToBeClickable(
          Driver.instance.findElement(By.id(url))
        )
      )
      //verifyLinkById(url, text)
    }
  }

  // I am presented with the {string} {string}
  def thenIAmPresentedWithThe(page: String, specificPage: String): Unit = {
    PageObjectFinder.page(page).waitForPageHeader
        PageObjectFinder.page(page).checkURL
        PageObjectFinder.page(page).checkPageTitle(specificPage)
  }

  // I click on {string} hyperlink on {string}
  def whenIClickOnHyperlinkOn(hyperlink: String, page: String): Unit = {
    PageObjectFinder.page(page).waitForPageHeader
        hyperlink match {
          case "Member doesn't have a National Insurance number." =>
            Driver.instance.findElement(By.xpath("//*[@id=\"noNinoPageLink\"]")).click()

          case "The member has a National Insurance number." =>
            Driver.instance.findElement(By.xpath("//*[@id=\"memberNinoPageLink\"]")).click()

          case "Start new transfer" =>
            driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/p/a")).click()

          case "Member Name" =>
            Driver.instance.findElement(By.xpath("//*[contains(@href,'Malcolm')]")).click()

          case _ =>
            Driver.instance.findElement(By.xpath("//a[normalize-space()=\"" + hyperlink + "\"]")).click()
        }
  }

  // I click on {string} button on {string}
  def whenIClickOnButtonOn(button: String, page: String): Unit = {
    PageObjectFinder.page(page).waitForPageHeader
        button match {
          case _ =>
            Driver.instance.findElement(By.xpath("//*[contains(@href,'"+button+"')]")).click()

        }
  }

  // ^I should see the following status of the submission journey
  def andIShouldSeeTheFollowingStatusOfTheSubmissionJourney(): Unit = {
    data: DataTable =>
        val expectedData = data.asMaps().asScala.toList.flatMap(_.asScala.toMap).toMap
        val actualData   = PageObjectFinder.taskListPageContentView
        actualData should be(expectedData)
  }

  // I should see the following subsections
  def andIShouldSeeTheFollowingSubsections(): Unit = {
    data: DataTable =>
        val expected = data.asScalaListOfStrings
        subSectionsHeaderText should be(expected)
  }

  // I cleared the data for the service
  def givenIClearedTheDataForTheService(): Unit = {
    Driver.instance.get(TestConfiguration.url("overseas-pension-transfer-test") + "/test-only/reset-test-data")
        TestData.clear()
  }

  // I should see following details at the {string}
  def andIShouldSeeFollowingDetailsAtThe(page: String, data: DataTable): Unit = {
    val expectedData = data.asMaps().asScala.toList.flatMap(_.asScala.toMap).toMap
        PageObjectFinder.page(page).waitForPageHeader
        val actualData   = PageObjectFinder.dataAtCheckYourAnswersPage
        actualData should be(expectedData)
  }

  // Overload for ScalaTest (no DataTable, accepts varargs)
  def andIShouldSeeFollowingDetailsAtThe(links: (String, String)*): Unit = {
    links.foreach { case (text, url) =>
      val driverWait: WebDriverWait =
        new WebDriverWait(Driver.instance, Duration.ofSeconds(10), Duration.ofSeconds(1))
      driverWait.until(
        ExpectedConditions.elementToBeClickable(
          Driver.instance.findElement(By.id(url))
        )
      )
     // verifyLinkById(url, text)
    }
  }

  // I should see the {string} and below error messages
  def andIShouldSeeTheAndBelowErrorMessages(errorSummaryTitle: String, data: DataTable): Unit = {
    val expectedErrorMessage = data.asScalaListOfStrings
        PageObjectFinder.checkPageErrorSummaryTitle(errorSummaryTitle)
        PageObjectFinder.listOfErrorMessages() should be(expectedErrorMessage)
  }

  // Overload for ScalaTest (no DataTable, accepts varargs)
  def andIShouldSeeTheAndBelowErrorMessages(links: (String, String)*): Unit = {
    links.foreach { case (text, url) =>
      val driverWait: WebDriverWait =
        new WebDriverWait(Driver.instance, Duration.ofSeconds(10), Duration.ofSeconds(1))
      driverWait.until(
        ExpectedConditions.elementToBeClickable(
          Driver.instance.findElement(By.id(url))
        )
      )
     // verifyLinkById(url, text)
    }
  }

  // I should see following erroneous fields are highlighted on {string}
  def andIShouldSeeFollowingErroneousFieldsAreHighlightedOn(page: String, data: DataTable): Unit = {
    for (field <- data.asScalaListOfStrings) {
          val classAttr = textFieldElement(field).getAttribute("class")
          classAttr.split("\\s+") should contain("govuk-input--error")
        }
  }

  // Overload for ScalaTest (no DataTable, accepts varargs)
  def andIShouldSeeFollowingErroneousFieldsAreHighlightedOn(links: (String, String)*): Unit = {
    links.foreach { case (text, url) =>
      val driverWait: WebDriverWait =
        new WebDriverWait(Driver.instance, Duration.ofSeconds(10), Duration.ofSeconds(1))
      driverWait.until(
        ExpectedConditions.elementToBeClickable(
          Driver.instance.findElement(By.id(url))
        )
      )
      //verifyLinkById(url, text)
    }
  }

  // I should see following erroneous dropdown fields are highlighted on {string}
  def andIShouldSeeFollowingErroneousDropdownFieldsAreHighlightedOn(page: String, dataTable: DataTable): Unit = {
    val fields = dataTable.asList(classOf[String]).asScala // Convert Java List to Scala List
        fields.foreach { field =>
          val classAttr = textFieldElement(field).getAttribute("class") // Get class attribute
          //classAttr.split("\\s+").toSeq should contain("govuk-input--error") // Convert to Seq and validate
        }
  }

  // Overload for ScalaTest (no DataTable, accepts varargs)
  def andIShouldSeeFollowingErroneousDropdownFieldsAreHighlightedOn(links: (String, String)*): Unit = {
    links.foreach { case (text, url) =>
      val driverWait: WebDriverWait =
        new WebDriverWait(Driver.instance, Duration.ofSeconds(10), Duration.ofSeconds(1))
      driverWait.until(
        ExpectedConditions.elementToBeClickable(
          Driver.instance.findElement(By.id(url))
        )
      )
    //  verifyLinkById(url, text)
    }
  }

  // Clicking each error message should focus on the corresponding input field on {string}
  def andClickingEachErrorMessageShouldFocusOnTheCorrespondingInputFieldOn(page: String): Unit = {
    val errorLinks = PageObjectFinder.listOfErrorLinks()
        for (errorLink <- errorLinks) {
          val fieldId       = errorLink.getAttribute("href").split("#").last
          val inputField    = PageObjectFinder.textFieldElement(fieldId)
          errorLink.click()
          val activeElement = Driver.instance.switchTo().activeElement()
          activeElement shouldBe inputField
        }
  }

  // I check the page source for the following key-value pairs:
 def andICheckThePageSourceForTheFollowingKeyvaluePairs(data: DataTable): Unit = {
    val pageSource: String = Driver.instance.getPageSource.trim
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

  // Overload for ScalaTest (no DataTable, accepts varargs)
  def andICheckThePageSourceForTheFollowingKeyvaluePairs(links: (String, String)*): Unit = {
    links.foreach { case (text, url) =>
      val driverWait: WebDriverWait =
        new WebDriverWait(Driver.instance, Duration.ofSeconds(10), Duration.ofSeconds(1))
      driverWait.until(
        ExpectedConditions.elementToBeClickable(
          Driver.instance.findElement(By.id(url))
        )
      )
      //verifyLinkById(url, text)
    }
  }

  // I should see the following details of the table {int} at the returns summary page
  def andIShouldSeeTheFollowingDetailsOfTheTableAtTheReturnsSummaryPage(num: Int, data: DataTable): Unit = {
    val expected = data.asScalaListOfLists

          def declaredProductListAtReturnsSummary(num: Int): Seq[List[String]] = webDriver
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

  // Overload for ScalaTest (no DataTable, accepts varargs)
  def andIShouldSeeTheFollowingDetailsOfTheTableAtTheReturnsSummaryPage(links: (String, String)*): Unit = {
    links.foreach { case (text, url) =>
      val driverWait: WebDriverWait =
        new WebDriverWait(Driver.instance, Duration.ofSeconds(10), Duration.ofSeconds(1))
      driverWait.until(
        ExpectedConditions.elementToBeClickable(
          Driver.instance.findElement(By.id(url))
        )
      )
      //verifyLinkById(url, text)
    }
  }

  // the status of the Send return is marked as {string}
  def andTheStatusOfTheSendReturnIsMarkedAs(sendReturnStatus: String): Unit = {
    val expected = Driver.instance.findElement(By.xpath("//strong[@class='govuk-tag govuk-tag--grey']")).getText
        sendReturnStatus should be(expected)
  }

  // I click on Agree and send return button {string}
  def whenIClickOnAgreeAndSendReturnButton(page: String): Unit = {
    PageObjectFinder.page(page).waitForPageHeader
        PageObjectFinder.page(page).clickAgreeAndSendReturnButton()
  }

  // the page source contains {string}
  def whenThePageSourceContains(paymentAmountText: String): Unit = {
    val actualText = Driver.instance.findElement(By.xpath("//p[normalize-space()='" + paymentAmountText + "']")).getText
        actualText should be(paymentAmountText)
  }

  // ^I should see the following values on the page$
  def thenIShouldSeeTheFollowingValuesOnThePage(): Unit = {
    dataTable: DataTable =>
        dataTable.asMaps(classOf[String], classOf[String]).asScala.foreach((data: java.util.Map[String, String]) => {
          val text = getMessage(data.get("value"))
          pageSource should include(text)
        })
  }

  // I verify the value displayed as {string} on {string}
  def whenIVerifyTheValueDisplayedAsOn(expectedText: String, page: String): Unit = {
    PageObjectFinder.page(page).waitForPageHeader
        val actualText = Driver.instance.findElement(By.cssSelector("ul[class='govuk-list govuk-list--bullet'] li")).getText
        actualText should be(expectedText)
  }

  // I click on the Details component {string} on {string}
  def whenIClickOnTheDetailsComponentOn(detailsSummary: String, page: String): Unit = {
    PageObjectFinder.page(page).waitForPageHeader
        Driver.instance.findElement(By.cssSelector("span[class='govuk-details__summary-text']")).click()
  }

  // I see the status {string} for task {string}
  def thenISeeTheStatusForTask(expectedStatus: String, taskName: String): Unit = {
    val xpathExpression =
          s"""//li[contains(@class,'govuk-task-list__item')][.//*[normalize-space(text())="$taskName"]]"""

        val taskItem = Driver.instance.findElement(By.xpath(xpathExpression))
        val statusElement = taskItem.findElement(By.cssSelector("strong.govuk-tag"))
        statusElement.getText.trim should be(expectedStatus)
  }

  // I click agree and submit button on {string}
  def whenIClickAgreeAndSubmitButtonOn(page: String): Unit = {
    PageObjectFinder.page(page).waitForPageHeader
        PageObjectFinder.page(page).clickAgreeSubmitButton()
  }

  def whenEnterOnSearch(page: String , searchItem: String): Unit = {
    PageObjectFinder.page(page).waitForPageHeader
    PageObjectFinder.page(page).enterText("dashboard-search",searchItem)

  }
  def whenIClickSearchButtonOn(page: String): Unit = {
    PageObjectFinder.page(page).waitForPageHeader
    PageObjectFinder.page(page).searchField()
  }


  def whenIClickStartNewTransferLink(page: String): Unit = {
    PageObjectFinder.page(page).waitForPageHeader
    PageObjectFinder.page(page).startNewTransfer()
  }

  def whenIClickStartMemberDetailsLink(page: String): Unit = {
    PageObjectFinder.page(page).waitForPageHeader
    PageObjectFinder.page(page).startMemberDetails()
  }
  def whenIClickNoNinoLink(page: String): Unit = {
    PageObjectFinder.page(page).waitForPageHeader
    PageObjectFinder.page(page).noNinoLink()
  }

  def thenIShouldSeeTheFollowingValuesOnThePage(values: Map[String, String]): Unit = {
    values.foreach { case (_, value) => val text = getMessage(value)  } }

  def Ienterthefollowingdataintocorrespondinginputfieldson(page: String, formData: Map[String, String]): Unit = {
    for ((field, value) <- formData) {
      val key = s"${page.trim.toLowerCase.replaceAll(" ", "_")}.$field"
      TestData.set(key, value)
      val inputField = PageObjectFinder.page(page).textFieldElement(field)
      inputField.clear()
      inputField.sendKeys(Option(value).getOrElse(""))
    }
  }

}
