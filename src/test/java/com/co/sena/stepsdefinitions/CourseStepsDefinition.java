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

public class CourseStepsDefinition {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void sepUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("carlos");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^he user enter page web$")
    public void heUserEnterPageWeb() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://izyacademy.com/"));

    }

    @When("^he user will validate the model course$")
    public void heUserWillValidateTheModelCourse() {

    }

    @Then("^he user validated the model successfully$")
    public void heUserValidatedTheModelSuccessfully() {

    }
}
