package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeUI {
    public static final Target txt_valid=
            Target.the("El cliente visualiza la pagina principal de la web")
                    .located(By.xpath("//*[@id=\"item_4_title_link\"]/div"));

}
