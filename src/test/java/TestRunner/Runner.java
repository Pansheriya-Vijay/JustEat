package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\aarna\\eclipse-workspace\\JustEatRestaurentProject\\src\\test\\java\\feature\\searchRes.feature",glue = {"stepDefinations" },
format ={"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"})
//monochrome = true,
//strict = true,
//dryRun = true)

public class Runner {

}