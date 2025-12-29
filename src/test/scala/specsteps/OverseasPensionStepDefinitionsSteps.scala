import uk.gov.hmrc.otc.conf.TestConfiguration
import uk.gov.hmrc.otc.pages.auth.AuthLoginStubPage

object OverseasPensionStepDefinitionsSteps {

  // I enter redirect URL on Auth Login Stub Page for {string}
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
        }
  }

  // I enter Enrollment Key {string}, Identifier Name {string} and Identifier Value {string} on {string}
  def whenIEnterEnrollmentKey (enrollmentKey:String, IdentifierName:String, IdentifierValue:String, page:String): Unit = {
    page match {
            case "Auth Login Stub Page" =>
              AuthLoginStubPage.enrolments(enrollmentKey, IdentifierName, IdentifierValue)
          }
  }

}
