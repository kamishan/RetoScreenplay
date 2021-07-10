package com.demoqa.automation.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PracticeFormWebpage {

    public static String URL = "https://demoqa.com/automation-practice-form";

    public static final Target FIRST_NAME_INPUT = Target.the("").located(By.id("firstName"));
    public static final Target LAST_NAME_INPUT = Target.the("").located(By.id("lastName"));
    public static final Target EMAIL_INPUT = Target.the("").located(By.id("userEmail"));
    public static final Target GENDER_SELECT = Target.the("").located(By.id("gender-radio-1"));
    public static final Target MOBILE_INPUT = Target.the("").located(By.id("userNumber"));
    public static final Target DATE_OF_BIRTH_BOX = Target.the("").located(By.id("dateOfBirthInput"));
    public static final Target SUBJECTS = Target.the("").located(By.id("subjectsInput"));
    public static final Target HOBBIES_CLICK = Target.the("").located(By.xpath("//label[@for='hobbies-checkbox-3']"));
    public static final Target PICTURE = Target.the("").located(By.id("uploadPicture"));
    public static final Target CURRENT_ADDRESS_INPUT = Target.the("").located(By.id("currentAddress"));
    public  static final  Target STATE = Target.the("").located(By.id("react-select-3-input"));
    public  static final  Target CITY = Target.the("").located(By.id("react-select-4-input"));

    public static final Target SUBMIT_BUTTON = Target.the("").located(By.id("submit"));

    public static final Target BOX_VALIDATION = Target.the("").located(By.className("modal-content"));
}
