package com.pvt.getmantseva.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    plugin = "pretty",
    monochrome = true,
    tags = "@test",
    glue = "com.pvt.tests",
    features = "classpath:com.pvt.tests.features"
)

public class TestRunner {

}
