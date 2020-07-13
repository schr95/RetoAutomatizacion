package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class DocumentoAbierto implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return null;
    }
    public static DocumentoAbierto correctamente() {
        return new DocumentoAbierto();
    }
}
