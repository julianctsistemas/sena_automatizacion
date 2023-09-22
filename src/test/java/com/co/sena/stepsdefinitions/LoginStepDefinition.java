package com.co.sena.stepsdefinitions;

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
    public void heUserEnterTheCredentials() {

    }

    @Then("^he user will be logged in$")
    public void heUserWillBeLoggedIn() {

    }

}
