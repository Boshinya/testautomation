package com.blackcat.parallel;

import com.blackcat.pageobjects.Login;
import com.blackcat.utilities.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by bothees on 11/10/2016.
 */
public class LoginSteps {

    private static String expectedstring = "Boothiraj";

    BasePage basePage = new BasePage();

    private Login login = new Login(basePage);

    @Given("^user am on LoginPage$")
    public void user_am_on_LoginPage() {
        login.goToLoginpage();
    }

    @When("^user enter valid username$")
    public void user_enter_valid_username() {
        login.enteruserName();
    }

    @When("^user enter valid password$")
    public void user_enter_valid_password() {
        login.enteruserPassword();
    }
    @When("^user click on login button$")
    public void user_click_on_login_button() {
        login.clickLoginButton();
    }

    @Then("^user (should|should not) see the homepage$")
    public void user_should_see_the_homepage(String option)  {
        if("should".equalsIgnoreCase(option)) {
            assertThat("User should be logged in",login.verifyHomepage().contains(expectedstring));
        } else if("should not".equalsIgnoreCase(option)) {
            assertThat("User should not be logged in",login.verifyHomepage().contains(expectedstring));
        }
    }


}
