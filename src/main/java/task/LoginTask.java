package task;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import ui.LoginUI;
import static net.serenitybdd.screenplay.Tasks.instrumented;
@AllArgsConstructor
public class LoginTask implements Task {

    private final String usuario;
    private final String contrasena;

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Enter.theValue(usuario).into(LoginUI.txt_username));
        actor.attemptsTo(Enter.theValue(contrasena).into(LoginUI.txt_contrasena));
        actor.attemptsTo(Click.on(LoginUI.btn_Login));
    }

    public static Performable inicioSesion(String usuario, String contrasena) {
        return instrumented(LoginTask.class,usuario,contrasena);
    }

}
