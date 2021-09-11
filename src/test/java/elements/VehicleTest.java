package elements;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/elements/Vehicle.feature",
	glue = {""}, monochrome = true, dryRun = false)

public class VehicleTest {
	
	
}
