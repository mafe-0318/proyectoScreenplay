package questions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import ui.HomeUI;

@AllArgsConstructor
public class LoginQuestion  implements Question {

    private final String validtext;


    @Override
    public Object answeredBy(Actor actor){

        if(Text.of(HomeUI.txt_valid).answeredBy(actor).equals(validtext.toString()))
            return true;
        else
            return false;
    }

    public static LoginQuestion loginvalidtext(String validtext){
        return new LoginQuestion(validtext);
    }


}
