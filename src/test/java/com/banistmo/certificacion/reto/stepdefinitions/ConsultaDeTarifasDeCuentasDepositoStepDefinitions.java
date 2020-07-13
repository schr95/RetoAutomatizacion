package com.banistmo.certificacion.reto.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import interactions.CambiarDeVentana;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.DocumentoAbierto;
import userinterface.PaginaPrincipal;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static userinterface.PaginaPrincipal.MENU;
import static userinterface.Tarifario.ARCHIVO_ABIERTO;
import static userinterface.Tarifario.LINK_DOCUMENTO;

public class ConsultaDeTarifasDeCuentasDepositoStepDefinitions {
    private PaginaPrincipal paginaPrincipal;

    @Before
    public void configuracionInicial() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^El usuario ingresa al menu (.*)$")
    public void elUsuarioIngresaAlMenu(String opcion) {
        theActorCalled("Usuario").attemptsTo(
                Open.browserOn(paginaPrincipal),
                Click.on(MENU.of(opcion))
        );
    }

    @Cuando("^El usuario abre el documento (.*)$")
    public void elUsuarioAbreElDocumento(String archivo) {
        theActorInTheSpotlight().attemptsTo(
                Click.on(LINK_DOCUMENTO.of(archivo))
        );
    }

    @Entonces("^El usuario verifica que el archivo se visualiza correctamente$")
    public void elUsuarioVerificaQueElArchivoSeVisualizaCorrectamente() {
        theActorInTheSpotlight().attemptsTo(
                CambiarDeVentana.aLaVentanaNueva()
        );
    }

    @Entonces("^El usuario verifica que el archivo no existe en las opciones$")
    public void elUsuarioVerificaQueElArchivoNoExisteEnLasOpciones() {

    }
}
