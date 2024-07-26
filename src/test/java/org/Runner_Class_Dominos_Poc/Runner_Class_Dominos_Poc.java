package org.Runner_Class_Dominos_Poc;

import org.Base_Class_Dominos_Poc.Base_Class_Dominos_Poc;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\org\\Feature",glue ="org.Step_Definition_Dominos_Poc",
monochrome = true,dryRun = false,plugin = {"pretty","json:json-report/cucumber.json","html:html-report/cucumber-reports","junit:junit-report/cucumber.xml"})

public class Runner_Class_Dominos_Poc {
public static WebDriver driver;
	
	@BeforeClass
	
	public static void start()
	{
	driver =Base_Class_Dominos_Poc.launch_browser();
	driver.manage().window().maximize();
	}
	
    @AfterClass
    public static void End()
   {
    	driver.quit();
   }
	


}
	


