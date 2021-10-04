package steps;

import impl.LoginImpl;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pojos.User;

import java.util.Map;

public class LoginSteps {
    LoginImpl impl = new LoginImpl();

    @DataTableType
    public User loginUser(Map<String, String> entry) {
        return new User(
                entry.get("username"),
                entry.get("password")

        );
    }

    @Given("I navigate to homepage")
    public void i_navigate_to_homepage() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I open {string} page")
    public void i_open_page(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I validate following emails and passwords are login in with no issue:")
    public void i_validate_following_emails_and_passwords_are_login_in_with_no_issue(io.cucumber.datatable.DataTable dataTable) {

    }
}