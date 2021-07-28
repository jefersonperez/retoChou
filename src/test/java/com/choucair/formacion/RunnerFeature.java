package com.choucair.formacion;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features ="src/test/resources/features/prueba.feature",
glue="com.choucair.formacion.definition",
snippets = SnippetType.CAMELCASE)


public class RunnerFeature {

}
