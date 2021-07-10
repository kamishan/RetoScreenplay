package com.demoqa.test.stepDefinitions;

import com.demoqa.automation.interactions.OpenBrowser;
import com.demoqa.automation.task.FillTheFields;
import com.demoqa.automation.task.FillTheFieldsWhitExcel;
import com.demoqa.automation.userinterface.PracticeFormWebpage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.core.Serenity.takeScreenshot;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepDefinition {

    @Managed
    private WebDriver driver;

    @Before
    public void setUp() {

        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("webuser").can(BrowseTheWeb.with(driver));
    }

    @Given("^that a web user wants to practice automating the filling of a registration form in demoqa$")
    public void thatAWebUserWantsToPracticeAutomatingTheFillingOfARegistrationFormInDemoqa() {
            theActorInTheSpotlight().attemptsTo(OpenBrowser.on(PracticeFormWebpage.URL));
            //driver.manage().window().maximize();
    }

    @When("^he fills in the fields of a practice form$")
    public void heFillsInTheFieldsOfAPracticeForm() {
        theActorInTheSpotlight().attemptsTo(FillTheFields.successful());
    }

    @Then("^he should see his data in a pop-up window$")
    public void heShouldSeeHisDataInAPopUpWindow() {

    }

    @When("^he fills in the fields of a practice form with data in an Excel sheet$")
    public void heFillsInTheFieldsOfAPracticeFormWithDataInAnExcelSheet() {
        theActorInTheSpotlight().attemptsTo(FillTheFieldsWhitExcel.injectionSheet());
    }
}