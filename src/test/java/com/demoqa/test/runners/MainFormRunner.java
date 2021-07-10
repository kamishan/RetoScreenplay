package com.demoqa.test.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/main_form.feature",
        glue ="com.demoqa.test.stepDefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "")

public class MainFormRunner {
}
