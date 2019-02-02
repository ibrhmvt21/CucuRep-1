package com.cybertek.step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStepDefinitions {



    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("I am going to login page");
    }

    @When("user logs in as a team lead")
    public void user_logs_in_as_a_team_lead() {
        System.out.println("I am logging in");
    }

    @Then("homepage should be displayed")
    public void homepage_should_be_displayed() {
        System.out.println("I can see the homepage");
    }
}
