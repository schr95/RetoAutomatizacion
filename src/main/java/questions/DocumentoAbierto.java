package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static userinterface.Tarifario.ARCHIVO_ABIERTO;

public class DocumentoAbierto implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String url = BrowseTheWeb.as(actor).getDriver().getCurrentUrl();
        return true;
    }
    public static DocumentoAbierto correctamente() {
        return new DocumentoAbierto();
    }
}
