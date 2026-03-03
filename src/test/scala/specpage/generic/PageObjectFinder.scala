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

package specpage.generic

import org.scalatest.exceptions.TestFailedException
import specpage.BasePage

import java.io.FileNotFoundException
import java.nio.file.{FileSystems, Files, Path}
import scala.jdk.CollectionConverters.*

object PageObjectFinder extends BasePage {

  override val title: String = ""
  override val url: String   = ""

  private val filePath: Path = FileSystems.getDefault.getPath("src/test/scala/specpage")

  def page(pageIn: String): BasePage = {
    val page = pageIn.replaceAll(" ", "")
    println(s"The page is --------------------------------- $page")
    val files: List[Path] = Files.walk(filePath).iterator().asScala.filter(Files.isRegularFile(_)).toList
    files.find(_.getFileName.toString == s"$page.scala")
      .map(_.toString.replaceAll(".*/(specpage/.*).scala", "$1").replaceAll("/", "."))
      .map(str => Class.forName(str + "$").getField("MODULE$").get(classOf[BasePage]).asInstanceOf[BasePage])
      .getOrElse(throw new TestFailedException(s"$page does not exist in tests, or it does not conform to Web page format", new FileNotFoundException(), 12))
  }

}