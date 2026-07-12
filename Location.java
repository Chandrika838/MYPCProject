package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Location extends BasePage{

	public Location(WebDriver driver) {
		super(driver);
	}
	
// locators 
	
	private By admin = By.xpath("//span[contains(text(),'Admin')]");
	private By location = By.xpath("//span[normalize-space()='Locations']");
	private By addnew = By.xpath("//span[normalize-space()='Add New']");
	private By locationname = By.cssSelector("input[formcontrolname='locationName']");
	private By advancedoptions = By.cssSelector("button.advanced-options");
	private By submit = By.xpath("//button[@type='submit']");
	
	
// Methods 
	
public void clickAdmin() {
	
	click(admin);
}
	

public boolean isAdminDisplayed() {
	
	return isDisplayed(admin);
	
}



public void clickLocation() {
	
	click(location);
}


public boolean isLocationDisplayed() {
	
	return isDisplayed(location);
}


	

public void clickAddNew() {
	
	click(addnew);
}



public void enterLocatioName(String name) {
	enterText(locationname , name);
}


public void clickAdvancedOptions() {

    wait.until(ExpectedConditions.elementToBeClickable(advancedoptions)).click();

}


public void ClickSubmit() {

	 wait.until(ExpectedConditions.elementToBeClickable(submit)).click();
	
}



	
}



