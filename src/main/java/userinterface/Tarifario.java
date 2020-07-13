package userinterface;


import net.serenitybdd.screenplay.targets.Target;

public class Tarifario {
    public static final Target LINK_DOCUMENTO = Target.the("Link para abrir el docuemnto segun nombre ingresado")
            .locatedBy("//*[text()='{0}']//following::a[1]");
}
