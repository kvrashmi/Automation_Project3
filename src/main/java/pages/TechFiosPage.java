package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TechFiosPage  {
	
	
	@FindBy(how=How.XPATH,using="//button[text()='Set SkyBlue Background']")WebElement SKY_BLUE_BUTTON;
	public String locateSkyBlueButton()
	{
		System.out.println("TFP:"+SKY_BLUE_BUTTON.getText());
		return SKY_BLUE_BUTTON.getText();
	}
	
	public void clickSkyBlueButton()
	{
		System.out.println("Clicking Blue Button...");
		SKY_BLUE_BUTTON.click();
	}
	
	@FindBy(how=How.XPATH,using="//button[text()='Set White Background']")WebElement WHITE_BUTTON;
	public String locateWhiteButton()
	{
		System.out.println("TFP:"+WHITE_BUTTON.getText());
		return WHITE_BUTTON.getText();
	}
	
	public void clickWhiteButton()
	{
		System.out.println("Clicking White Button...");
		WHITE_BUTTON.click();
	}
	
	@FindBy(how=How.XPATH,using="//body[@style='background-color: skyblue;']")WebElement SKY_BLUE_VALIDATION;
	public String validateBlueBackground()
	{
		System.out.println("Color:"+SKY_BLUE_VALIDATION.getCssValue("background-color"));
		return SKY_BLUE_VALIDATION.getCssValue("background-color"); //skyblue
	}
	@FindBy(how=How.XPATH,using="//body[@style='background-color: white;']")WebElement WHITE_VALIDATION;
	public String validateWhiteBackground()
	{
		System.out.println("Color:"+WHITE_VALIDATION.getCssValue("background-color"));
		return WHITE_VALIDATION.getCssValue("background-color"); //WHITE
	}
	
	

}
