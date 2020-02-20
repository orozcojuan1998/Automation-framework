import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
    @Given("^that i am on the facebook login page$")
    public void thatIAmOnTheFacebookLoginPage() {
        System.out.println("I'm on the Facebook login page");
    }

    @When("^user enters his email and password$")
    public void userEnterHisEmail() {
    }

    @And("^clicks the Log in button$")
    public void userEnterHisPassword() {
        System.out.println("");
    }

    @Then("^user is redirected to Facebook home page$")
    public void userIsRedirectedToFacebookHomePage() {
        System.out.println("I redirect the user to the main FB page");
    }
}
