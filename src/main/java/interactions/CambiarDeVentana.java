package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import java.util.Set;

public class CambiarDeVentana implements Interaction {
    private String ventanaPrincipal;
    private Set<String> ventanas;

    @Override
    public <T extends Actor> void performAs(T actor) {
        ventanaPrincipal = BrowseTheWeb.as(actor).getDriver().getWindowHandle();
        ventanas = BrowseTheWeb.as(actor).getDriver().getWindowHandles();

        for(String ventanaActual : ventanas){
            if(!ventanaActual.equals((ventanaPrincipal))){
                BrowseTheWeb.as(actor).getDriver().switchTo().window(ventanaActual);
            }
        }
    }

    public static CambiarDeVentana aLaVentanaNueva(){return new CambiarDeVentana();}
}
