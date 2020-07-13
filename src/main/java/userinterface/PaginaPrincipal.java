package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("https://www.banistmo.com/wps/portal/banistmo/personas/")
public class PaginaPrincipal extends PageObject {
    public static final Target MENU = Target.the("Menu inferior segun nombre ingresado").locatedBy("//a[text()='{0}']");
}
