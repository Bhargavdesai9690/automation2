package CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue={"stepDefinations"},
		plugin = {"pretty", "html:target/cucumber-htmlreport"}//,"json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
		
        )
public class TestRunner {

} 
