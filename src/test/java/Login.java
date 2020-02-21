import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

public class Login {
    @Given("^User is in Facebook's main page$")
    public void user_is_in_Facebook_s_main_page() throws Throwable {
        System.out.println("Aquí se entra a la página de Facebook");
    }

    @When("^The user enters their email and password$")
    public void the_user_enters_his_email_and_password() throws Throwable {
        System.out.println("El usuario entra sus credenciales");
    }

    @When("^clicks the Login button$")
    public void clicks_the_Login_button() throws Throwable {
        System.out.println("El usuario clickea el boton de login");
    }

    @Then("^the user is redirected to Facebook's home page$")
    public void the_user_is_redirected_to_Facebook_s_home_page() throws Throwable {
        System.out.println("El usuario es redirigido a la página de inicio de Facebook");
    }

    @When("^The user enters his valid email and password$")
    public void theUserEntersHisValidEmailAndPassword() {
    }

    @And("^clicks on the Login button$")
    public void clicksOnTheLoginButton() {
    }

    @When("^The user enters his valid phone number and password$")
    public void theUserEntersHisValidPhoneNumberAndPassword() {
    }
}


