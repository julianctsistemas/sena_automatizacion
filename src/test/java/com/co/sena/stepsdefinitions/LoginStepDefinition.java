package com.co.sena.stepsdefinitions;

import com.co.sena.models.LoginCredential;
import com.co.sena.tasks.LoginTask;
import com.co.sena.userinterfaces.LoginPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class LoginStepDefinition {


    @Managed
    WebDriver hisBrowser;
    @Before

    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("julian");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }
    @Given("^he user is on the website$")
    public void heUserIsOnTheWebsite() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://izyacademy.com/"));


    }

    @When("^he user enter the credentials$")
    public void heUserEnterTheCredentials(List<LoginCredential> loginCredentialList) {

        LoginCredential loginCredential;
        loginCredential = loginCredentialList.get(1);


        OnStage.theActorInTheSpotlight().attemptsTo(LoginTask.enterCredential(loginCredential));

    }

    @Then("^he user will be logged in$")
    public void heUserWillBeLoggedIn() {

    }

}
