package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI {

    public static final Target txt_username=
            Target.the("Ingresar usuario").located(By.id("user-name"));

    public static final Target txt_contrasena=
            Target.the("Ingresar contrasena").located(By.id("password"));

    public static final Target btn_Login=
            Target.the("Boton Login").located(By.id("login-button"));

    public static final Target txt_mensajefallido=
            Target.the("Visualizar mensaje de usuario bloqueado").located(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3"));


}
