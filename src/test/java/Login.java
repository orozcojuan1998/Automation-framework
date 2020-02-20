import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
    @Given("^User is in Facebook's main page$")
    public void thatIAmOnTheFacebookLoginPage() {
        System.out.println("I load the web driver.");
        System.out.println("I'm on the Facebook login page");
    }

    @When("^The user enters their email and password$")
    public void userEnterHisEmail() {
        System.out.println("Email and password are typed into their " +
                "respective spaces");
    }

    @And("^clicks the Login button$")
    public void userEnterHisPassword() {
        System.out.println("Login button is clicked.");
    }

    @Then("^the user is redirected to Facebook's home page$")
    public void userIsRedirectedToFacebookHomePage() {
        System.out.println("I redirect the user to the main FB page");
    }
}
