package Base_Class;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="C:\\Users\\lenovo\\eclipse-workspace1\\Cucumber_PageObject_Project\\src\\test\\java\\Feature_Files", 
glue= {"Step_Definition"},

//Result Format in Console
monochrome=true,

//Tags to run specific test
//tags="@Sanity",

//To run the test cases 
dryRun= false,

//Reports path and type
plugin ={"pretty","html:target/HtmlReports/index.html","json:target/JSONReports/cucumber.json","junit:target/JunitReports/cucumber.xml"}


		)
public class Test_Runner {

}
