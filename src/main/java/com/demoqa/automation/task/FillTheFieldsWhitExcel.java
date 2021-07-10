package com.demoqa.automation.task;

import com.demoqa.automation.models.DataInjection;
import com.demoqa.automation.userinterface.PracticeFormWebpage;
import com.demoqa.automation.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.io.IOException;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillTheFieldsWhitExcel implements Task {
    DataInjection dataInjection = new DataInjection();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {

            actor.attemptsTo(
                    Enter.theValue(Excel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetName(),0, 0)).into(PracticeFormWebpage.FIRST_NAME_INPUT),
                    Enter.theValue(Excel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetName(),0, 1)).into(PracticeFormWebpage.LAST_NAME_INPUT),
                    Enter.theValue(Excel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetName(),0, 2)).into(PracticeFormWebpage.EMAIL_INPUT),
                    JavaScriptClick.on(PracticeFormWebpage.GENDER_SELECT),
                    Enter.theValue(Excel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetName(),0, 3)).into(PracticeFormWebpage.MOBILE_INPUT),
                    Enter.keyValues(Keys.CONTROL+"A").into(PracticeFormWebpage.DATE_OF_BIRTH_BOX),
                    Enter.keyValues(dataInjection.getBirthday()).into(PracticeFormWebpage.DATE_OF_BIRTH_BOX),
                    Enter.keyValues(Keys.ENTER).into(PracticeFormWebpage.DATE_OF_BIRTH_BOX),
                    Enter.keyValues(dataInjection.getSubjects()).into(PracticeFormWebpage.SUBJECTS),
                    Enter.keyValues(Keys.ENTER).into(PracticeFormWebpage.SUBJECTS),
                    JavaScriptClick.on(PracticeFormWebpage.HOBBIES_CLICK),
                    Enter.keyValues(dataInjection.getPicturepath()).into(PracticeFormWebpage.PICTURE),
                    Enter.theValue(Excel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetName(),0, 4)).into(PracticeFormWebpage.CURRENT_ADDRESS_INPUT),
                    JavaScriptClick.on(PracticeFormWebpage.STATE),
                    Enter.keyValues(Keys.ARROW_DOWN).into(PracticeFormWebpage.STATE),
                    Enter.keyValues(Keys.ENTER).into(PracticeFormWebpage.STATE),
                    JavaScriptClick.on(PracticeFormWebpage.CITY),
                    Enter.keyValues(Keys.ARROW_DOWN).into(PracticeFormWebpage.CITY),
                    Enter.keyValues(Keys.ENTER).into(PracticeFormWebpage.CITY),
                    JavaScriptClick.on(PracticeFormWebpage.SUBMIT_BUTTON),
                    WaitUntil.the(PracticeFormWebpage.BOX_VALIDATION,isVisible())
            );

        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public static FillTheFieldsWhitExcel injectionSheet(){
        return instrumented(FillTheFieldsWhitExcel.class);
    }
}
