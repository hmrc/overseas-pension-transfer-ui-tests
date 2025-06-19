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

package uk.gov.hmrc.otc.driver

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.{ChromeDriver, ChromeOptions}

object CustomChromeDriverFactory {

  // Create a single instance of WebDriver (reused everywhere)
  lazy val instance: WebDriver = {
    val options = new ChromeOptions()

    // Use system Chrome instead of the unstable "Chrome for Testing"
    options.setBinary("/Applications/Google Chrome.app/Contents/MacOS/Google Chrome")
    options.addArguments("--no-sandbox")
    options.addArguments("--disable-dev-shm-usage")
    options.addArguments("--disable-gpu")

    new ChromeDriver(options)
  }
}
