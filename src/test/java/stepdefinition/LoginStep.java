package stepdefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.LoginQuestion;
import task.LoginTask;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStep {

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("El cliente abre la pagina web")
    public void el_cliente_abre_la_pagina_web() {
        theActorCalled("usuario").attemptsTo(Open.url("https://www.saucedemo.com/"));
    }

    @When("diligencia los datos {string} y {string}")
    public void diligencia_los_datos_y(String usuario, String contrasena) {
        theActorCalled("usuario").attemptsTo(LoginTask.inicioSesion(usuario,contrasena));
        }

    @Then("debe ver el texto de productos {string}")
    public void debe_ver_el_texto_de_productos(String validText) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(LoginQuestion.loginvalidtext(validText)));
    }

    @Then("debe ver el mensaje de error {string}")
    public void debe_ver_el_mensaje_de_error(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}

