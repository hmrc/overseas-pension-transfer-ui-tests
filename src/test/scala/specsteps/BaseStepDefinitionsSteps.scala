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


import org.openqa.selenium.By
import org.scalatestplus.selenium.Page
import otc.conf.TestConfiguration
import otc.support.TestData
import specpage.BasePage
import specpage.auth.AuthLoginStubPage
import specpage.generic.PageObjectFinder
import uk.gov.hmrc.selenium.webdriver.Driver

import java.time.LocalDate

object BaseStepDefinitionsSteps extends BasePage {

  val currentYear: Int  = LocalDate.now().minusMonths(5).getYear
  val shortYear: String = currentYear.toString.substring(2)

  // I navigate to the {string}
  def navigateToPage(page: Page): Unit =
    Driver.instance.navigate.to(page.url)

  // I click submit button on {string}
  def whenIClickSubmitButtonOn(page: String): Unit = {
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
        page.checkURL
        page.checkPageTitle()

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

  // I am presented with the {string} with existing url suffix as {string}
  def thenIAmPresentedWithTheWithExistingUrlSuffixAs(page: String, urlSuffix: String): Unit = {
    PageObjectFinder.page(page).checkExistingDynamicURL(urlSuffix)
    PageObjectFinder.page(page).checkPageHeader()
    PageObjectFinder.page(page).checkPageTitle()
  }

  // I select radio button {string} on {string}
  def whenISelectRadioButtonOn(choice: String, page: String): Unit = {
    PageObjectFinder.page(page).clickRadioButton(choice)
  }

  // I {string} checkbox {string} on {string}
  def whenICheckboxOn(checkBoxAction: String, choice: String, page: String): Unit = {
    checkBoxAction match {
      case "select" | "unselect" =>
        PageObjectFinder.page(page).selectCheckBoxes(choice.split(","))
    }
  }

  // I click save and continue button on {string}
  def whenIClickSaveAndContinueButtonOn(page: String): Unit = {
    PageObjectFinder.page(page).clickSaveAndContinueButton()
  }

  // I click continue button on {string}
  def whenIClickContinueButtonOn(page: String): Unit = {
    PageObjectFinder.page(page).clickContinueButton()
  }

  // I click back button on {string}
  def whenIClickBackButtonOn(page: String): Unit = {
    PageObjectFinder.page(page).clickBackButton()
  }

  // The error summary title is {string} and the error message is {string}
  def thenTheErrorSummaryTitleIsAndTheErrorMessageIs(errorSummaryTitle: String, errorMessage: String): Unit = {
    PageObjectFinder.checkPageErrorSummaryTitle(errorSummaryTitle)
          val finalErrorMessage = errorMessage.replace("^", "’")
          PageObjectFinder.checkPageErrorMessage(finalErrorMessage)
  }

  // I enter {string} on {string}
  def whenIEnterOn(data: String, page: String): Unit = {
    PageObjectFinder.page(page).enterDetails(data)
  }

  // I enter {string} in the {string} input field on {string}
  def whenIEnterInTheInputFieldOn(text: String, field: String, page: String): Unit = {
    val element = PageObjectFinder.page(page).textFieldElement(field)
    element.sendKeys(text)
  }

  // I enter {string} for {string} on {string}
  def whenIEnterForOn(textToEnter: String, text: String, page: String): Unit = {
    PageObjectFinder.page(page).enterMultipleDetails(textToEnter, text)
  }

  // I enter {string} for {string} on {string} at {string} input box
  def whenIEnterForOnAtInputBox(textToEnter: String, text: String, page: String, index: String): Unit = {
    PageObjectFinder.page(page).enterMultipleDetailsWithIndex(textToEnter, text, index)
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

  // I am presented with the {string} {string}
  def thenIAmPresentedWithThe(page: String, specificPage: String): Unit = {
    PageObjectFinder.page(page).checkURL
    PageObjectFinder.page(page).checkPageTitle(specificPage)
  }

  // I click on {string} hyperlink on {string}
  def whenIClickOnHyperlinkOn(hyperlink: String, page: String): Unit = {
    hyperlink match {
      case "Member doesn't have a National Insurance number." =>
        Driver.instance.findElement(By.xpath("//*[@id=\"noNinoPageLink\"]")).click()

      case "The member has a National Insurance number." =>
        Driver.instance.findElement(By.xpath("//*[@id=\"memberNinoPageLink\"]")).click()

      case "Start new transfer" =>
        Driver.instance.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/p/a")).click()

      case "Member Name" =>
        Driver.instance.findElement(By.xpath("//*[contains(@href,'Malcolm')]")).click()

      case _ =>
        Driver.instance.findElement(By.xpath("//a[normalize-space()=\"" + hyperlink + "\"]")).click()
    }
  }

  def whenIClickOnButtonOn(button: String, page: String): Unit = {
    val pageObj = PageObjectFinder.page(page)
    val locator = By.xpath(s"//*[contains(@href, '$button')]")
    val element = Driver.instance.findElement(locator)
    element.click()
  }

  // I cleared the data for the service
  def givenIClearedTheDataForTheService(): Unit = {
    Driver.instance.get(TestConfiguration.url("overseas-pension-transfer-test") + "/test-only/reset-test-data")
        TestData.clear()
  }

  // I click agree and submit button on {string}
  def whenIClickAgreeAndSubmitButtonOn(page: String): Unit = {
    PageObjectFinder.page(page).clickAgreeSubmitButton()
  }

  def whenEnterOnSearch(page: String , searchItem: String): Unit = {
    PageObjectFinder.page(page).enterText("dashboard-search",searchItem)

  }
  def whenIClickSearchButtonOn(page: String): Unit = {
    PageObjectFinder.page(page).searchField()
  }


  def whenIClickStartNewTransferLink(page: String): Unit = {
    PageObjectFinder.page(page).startNewTransfer()
  }

  def whenIClickOnMemberNameLink(page: String): Unit = {
    PageObjectFinder.page(page).clickMemberName()
  }

  def whenIClickOnViewAmendLink(page: String): Unit = {
    PageObjectFinder.page(page).clickViewAmendLink()
  }

  def whenIClickStartMemberDetailsLink(page: String): Unit = {
    PageObjectFinder.page(page).startMemberDetails()
  }
  def whenIClickStartTransferDetailsLink(page: String): Unit = {
    PageObjectFinder.page(page).startTransferDetails()
  }
  def whenIClickStartQROPSDetailsLink(page: String): Unit = {
    PageObjectFinder.page(page).startQROPSDetails()
  }

  def whenIClickStartSchemeManagerDetailsLink(page: String): Unit = {
    PageObjectFinder.page(page).startSchemeManagerDetails()
  }

  def whenIClickFinalCYALink(page: String): Unit = {
    PageObjectFinder.page(page).clickFinalCYALink()
  }


  def whenIClickNoNinoLink(page: String): Unit = {
    PageObjectFinder.page(page).noNinoLink()
  }

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
