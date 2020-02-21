package Modules.login;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
    @Given("^As an user I want to be able to log in on Facebook with email$")
    public void asAnUserIWantToBeAbleToLogInOnFacebookWithEmail() {
    }

    @When("^The user enters his valid email and password$")
    public void theUserEntersHisValidEmailAndPassword() {
    }

    @And("^clicks on the Login button$")
    public void clicksOnTheLoginButton() {
    }

    @Then("^the user is redirected to Facebook's home page$")
    public void theUserIsRedirectedToFacebookSHomePage() {
    }

    @Given("^User is in Facebook's main page$")
    public void userIsInFacebookSMainPage() {
    }

    @When("^The user enters his valid phone number and password$")
    public void theUserEntersHisValidPhoneNumberAndPassword() {
    }

    @When("^The user enters his valid email and invalid password$")
    public void theUserEntersHisValidEmailAndInvalidPassword() {
    }

    @Then("^the user receives a message \"([^\"]*)\"$")
    public void theUserReceivesAMessage(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^The user leaves the fields in blank$")
    public void theUserLeavesTheFieldsInBlank() {
    }

    @When("^The user clicks on \"([^\"]*)\" message$")
    public void theUserClicksOnMessage(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^The user enters his valid email$")
    public void theUserEntersHisValidEmail() {
    }

    @And("^clicks on \"([^\"]*)\"$")
    public void clicksOn(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^user receives a confirmation email$")
    public void userReceivesAConfirmationEmail() {
    }
}
