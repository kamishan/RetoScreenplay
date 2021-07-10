package com.demoqa.automation.task;

import com.demoqa.automation.userinterface.PracticeFormWebpage;
import com.demoqa.automation.utils.SpecialMethods;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillTheFieldsWithProperties implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        SpecialMethods.configProperties();

        actor.attemptsTo(
                Enter.theValue(SpecialMethods.properties.getProperty("firstName")).into(PracticeFormWebpage.FIRST_NAME_INPUT),
                Enter.theValue(SpecialMethods.properties.getProperty("lastName")).into(PracticeFormWebpage.LAST_NAME_INPUT),
                Enter.theValue(SpecialMethods.properties.getProperty("email")).into(PracticeFormWebpage.EMAIL_INPUT),
                JavaScriptClick.on(PracticeFormWebpage.GENDER_SELECT),
                Enter.theValue(SpecialMethods.properties.getProperty("mobileNumber")).into(PracticeFormWebpage.MOBILE_INPUT),
                Enter.keyValues(Keys.CONTROL+"A").into(PracticeFormWebpage.DATE_OF_BIRTH_BOX),
                Enter.keyValues(SpecialMethods.properties.getProperty("birthday")).into(PracticeFormWebpage.DATE_OF_BIRTH_BOX),
                Enter.keyValues(Keys.ENTER).into(PracticeFormWebpage.DATE_OF_BIRTH_BOX),
                Enter.keyValues(SpecialMethods.properties.getProperty("subject")).into(PracticeFormWebpage.SUBJECTS),
                Enter.keyValues(Keys.ENTER).into(PracticeFormWebpage.SUBJECTS),
                JavaScriptClick.on(PracticeFormWebpage.HOBBIES_CLICK),
                Enter.keyValues(SpecialMethods.properties.getProperty("picture")).into(PracticeFormWebpage.PICTURE),
                Enter.theValue(SpecialMethods.properties.getProperty("currentAddress")).into(PracticeFormWebpage.CURRENT_ADDRESS_INPUT),
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

    public static FillTheFieldsWithProperties fileProperties(){
        return instrumented(FillTheFieldsWithProperties.class);
    }
}
