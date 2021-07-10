package com.demoqa.automation.task;

import com.demoqa.automation.models.DataInjection;
import com.demoqa.automation.userinterface.PracticeFormWebpage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillTheFields implements Task {
    DataInjection dataInjection = new DataInjection();

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(dataInjection.getFirstName()).into(PracticeFormWebpage.FIRST_NAME_INPUT),
                Enter.theValue(dataInjection.getLastName()).into(PracticeFormWebpage.LAST_NAME_INPUT),
                Enter.theValue(dataInjection.getEmail()).into(PracticeFormWebpage.EMAIL_INPUT),
                JavaScriptClick.on(PracticeFormWebpage.GENDER_SELECT),
                Enter.theValue(dataInjection.getMobileNumber()).into(PracticeFormWebpage.MOBILE_INPUT),
                Enter.keyValues(Keys.CONTROL+"A").into(PracticeFormWebpage.DATE_OF_BIRTH_BOX),
                Enter.keyValues(dataInjection.getBirthday()).into(PracticeFormWebpage.DATE_OF_BIRTH_BOX),
                Enter.keyValues(Keys.ENTER).into(PracticeFormWebpage.DATE_OF_BIRTH_BOX),
                Enter.keyValues(dataInjection.getSubjects()).into(PracticeFormWebpage.SUBJECTS),
                Enter.keyValues(Keys.ENTER).into(PracticeFormWebpage.SUBJECTS),
                JavaScriptClick.on(PracticeFormWebpage.HOBBIES_CLICK),

                Enter.keyValues(dataInjection.getPicturepath()).into(PracticeFormWebpage.PICTURE),

                Enter.theValue(dataInjection.getCurrentAddress()).into(PracticeFormWebpage.CURRENT_ADDRESS_INPUT),
                JavaScriptClick.on(PracticeFormWebpage.STATE),
                Enter.keyValues(Keys.ARROW_DOWN).into(PracticeFormWebpage.STATE),
                Enter.keyValues(Keys.ENTER).into(PracticeFormWebpage.STATE),
                JavaScriptClick.on(PracticeFormWebpage.CITY),
                Enter.keyValues(Keys.ARROW_DOWN).into(PracticeFormWebpage.CITY),
                Enter.keyValues(Keys.ENTER).into(PracticeFormWebpage.CITY),
                JavaScriptClick.on(PracticeFormWebpage.SUBMIT_BUTTON),
                WaitUntil.the(PracticeFormWebpage.BOX_VALIDATION,isVisible())
        );
    }

    public static FillTheFields successful(){
        return instrumented(FillTheFields.class);
    }
}
