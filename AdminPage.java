package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AdminPage extends BasePage {

	public AdminPage(WebDriver driver) {
		super(driver);
		
	}


// locators 
	 // here we need to write alll the main main things in the adminpage of java 
	
private	By adminMenu = By.xpath("//span[contains(text(),'Admin')]");
private By organisation = By.xpath("//span[contains(text(),'Organisation')]");
private By timeZone = By.xpath("//app-time-zone-selector//select");
private By advancedOption = By.xpath("//button[normalize-space()='advanced options']");
private	By submitButton = By.cssSelector("button[type='submit']");


// Admin mwthods
	
	public void clickAdminMenu() {
		click(adminMenu);	
	}

 public boolean isAdminMenuDisplayed() {
	 return isDisplayed(adminMenu);
 }

// organisation 
	
	public void clickOrganisation() {
		click(organisation);
		
	}
	public boolean isOrganisationDisplayed() {
		
		return isDisplayed(organisation);
	}
		
	

// Time Zone 
	
public void selectTimeZone(String value) {
	
	Select select = new Select(getElement (timeZone));
	select.selectByVisibleText(value);
	
}


// Advanced Option 

public void clickAdvancedOption() {
	
	click(advancedOption);
}


public boolean isAdvancedOptionDisplayed() {
	
	return isDisplayed(advancedOption);
	
}
// check box 


public void enableCheckBox(String id) {
	
	By locator = By.id(id);
	
	if(!getElement(locator).isSelected()) {
		
		click(locator);
	}

	}


public boolean isCheckBoxSelected(String id) {
	
	return getElement(By.id(id)).isSelected();
	
	

}

// Submit button 

public void clickSubmit() {
	
	click(submitButton);
	
	
}

public boolean isSubmitDisplayed() {
	
	return isDisplayed(submitButton);
}

}









