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

package specpage.overseasPension.transferDetails

import specpage.BasePage
import otc.conf.TestConfiguration

object UnquotedShareConfirmRemovalPage extends BasePage {

  override val url: String = TestConfiguration.url("overseas-pension-transfer-frontend") + "/transfer-details/assets/unquoted-shares-confirm-removal?index=0"
  override val title = " Are you sure you want to remove these unquoted shares?"

  override def expectedPageTitle: String =
    "Are you sure you want to remove these unquoted shares? - Report a transfer to a qualifying recognised overseas pension scheme - GOV.UK"
}