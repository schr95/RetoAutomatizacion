package userinterface;


import net.serenitybdd.screenplay.targets.Target;

public class Tarifario {
    public static final Target LINK_DOCUMENTO = Target.the("Link para abrir el docuemnto segun nombre ingresado")
            .locatedBy("//*[text()='{0}']//following::a[1]");
    public static final Target ARCHIVO_ABIERTO = Target.the("Titulo de tarifario depositos")
            .locatedBy("//*[text()='S56_ActualizacionTarifarioDepositos_Dic2019']");

}
