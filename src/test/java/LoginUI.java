import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class LoginUI {
    @Given("^User is on google home page$")
    public void userIsOnGoogleHomePage() {
        System.out.println("Initialize web driver and user enters to google.com");
    }
    @And("^search for facebook home page$")
    public void searchForFacebookHomePage() {
        System.out.println("User enters facebook in the searchbar");
    }
    @When("^User clicks on www\\.facebook\\.com$")
    public void userClicksOnWwwFacebookCom() {
        System.out.println("User clicks on facebook");
    }
    @And("^can check that email/phone,password text box and log in button exist$")
    public void canCheckThatEmailPhonePasswordTextBoxAndLogInButtonExist() {
        System.out.println("Verify that username/cellphone, password and login button exists");
    }
    @When("^User taps on email and password field$")
    public void userTapsOnEmailAndPasswordField() {
        System.out.println("Verify that user can tap on the email and password field");
    }
    @Then("^the user can see the cursor blinking$")
    public void theUserCanSeeTheCursorBlinking() {
        System.out.println("Verify user can see the cursor blinking");
    }
    @And("^can type any letters$")
    public void canTypeAnyLetters() {
        System.out.println("Verify user can type on the inputs");
    }
    @When("^User clicks on Facebook link$")
    public void userClicksOnFacebookLink() {
        System.out.println("Verify user can click the Fb link");
    }
    @And("^can check that email/phone,password text box and log in button are aligned$")
    public void canCheckThatEmailPhonePasswordTextBoxAndLogInButtonAreAligned() {
        System.out.println("Verify items align on the web page");
    }
}