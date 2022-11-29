package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.TechFiosPage;
import pages.TestBase;
import cucumber.api.java.en.Then;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class TechFiosPageStepDefinitions extends TestBase {
	
	TechFiosPage tp;
	
	@Given("^\"([^\"]*)\" button exists$")
      public void button_exists(String button_name){
	  TestBase.init();
	  tp=PageFactory.initElements(driver, TechFiosPage.class);
	  System.out.println(button_name);
	  
	  if(button_name.equals("Set SkyBlue Background"))
	  {
		  Assert.assertEquals(button_name, tp.locateSkyBlueButton());
	  }
	  else  if(button_name.equals("Set SkyWhite Background"))
	  {
		  Assert.assertEquals(button_name, tp.locateWhiteButton());

	  }
	  
  }
  
	@When("^I click on the button As \"([^\"]*)\"$")
	public void i_click_on_the_button_As(String button)  {
	    if(button.equals("Set SkyBlue Background"))
	    {
	    	tp.clickSkyBlueButton();
	    }
	    else if(button.equals("Set White Background"))
	    {
	    	tp.clickWhiteButton();
	    }
	}

 

  @Then("^the background color will change to sky blue$")
  public void the_background_color_will_change_to_sky_blue()  {
	  Assert.assertEquals("rgba(135, 206, 235, 1)",tp.validateBlueBackground());
	  TestBase.tearDown();
  }

  @Then("^the background color will change to white$")
  public void the_background_color_will_change_to_white() {
	  Assert.assertEquals("rgba(255, 255, 255, 1)",tp.validateWhiteBackground());
	  TestBase.tearDown();
  }
  

  
}
