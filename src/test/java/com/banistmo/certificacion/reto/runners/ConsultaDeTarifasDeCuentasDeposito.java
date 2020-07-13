package com.banistmo.certificacion.reto.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/consulta_de_tarifas_de_cuentas_deposito.feature",
        glue = {"com.banistmo.certificacion.reto.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)
public class ConsultaDeTarifasDeCuentasDeposito {
}
