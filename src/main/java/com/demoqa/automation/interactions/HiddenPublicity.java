package com.demoqa.automation.interactions;

import com.demoqa.automation.userinterface.PracticeFormWebpage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Visibility;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HiddenPublicity implements Task {

    public static HiddenPublicity close() {

        return instrumented(HiddenPublicity.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (Visibility.of(PracticeFormWebpage.PUBLICITY_HIDDEN_BUTTON).viewedBy(actor).asBoolean()) ;
        actor.attemptsTo(Click.on(PracticeFormWebpage.PUBLICITY_HIDDEN_BUTTON));
    }
}
