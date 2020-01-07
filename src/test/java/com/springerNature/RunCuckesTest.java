package com.springerNature;

import com.springerNature.utilities.Setup;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by bothees on 27/11/2018.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
                 format ={"html:target/cucumber-html-report", "json:target/cucumber.json"},
                 tags = {"@test"},
                 features ="src/test/resources/features",
                 glue = {"com.blackcat.utilities",
                         "com.blackcat.stepdefinitions"})

public class RunCuckesTest extends Setup {

}









