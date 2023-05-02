package Step_Definition;

import java.net.MalformedURLException;

import org.testng.Assert;

import Base_Class.Base_Class;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Home_Page_Step_Def extends Base_Class {
	
	@Given("the application is open")
	public void the_application_is_open() throws MalformedURLException {
	    applicationsetup_Method();
	}

	@When("User clicks on number two")
	public void user_clicks_on_number_two() {
		calculator_Page.clickon_One();
	}

	@And("User clicks on addition symbole")
	public void user_clicks_on_addition_symbole() {
		calculator_Page.clickon_Add_Btn();
	}

	@And("User clicks on number one")
	public void user_clicks_on_number_one() {
		calculator_Page.clickon_Two();
	}

	@And("User clicks on equal button")
	public void user_clicks_on_equal_button() {
		calculator_Page.clickon_Equal(); 
	}

	@Then("Addition result should be matched")
	public void addition_result_should_be_matched() {
		String result=calculator_Page.getText_Result_Field();
		int actual=Integer.parseInt(result);
		int expected=3;
		Assert.assertEquals(actual,expected);
	}

	@And("close the application")
	public void close_the_application() {
	   applicationtearDown_Method();
	}
}
