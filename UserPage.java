package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserPage extends BasePage{

	
// creating the constructopr for the web driver 
	public UserPage(WebDriver driver) {
		super(driver);
		
		
	}

// locators 
	
private By adminMenu = By.xpath("//span[normalize-space()='Admin']");
private By userMenu = By.xpath("//span[normalize-space()='Users']");
private By inviteUsers = By.xpath("//span[normalize-space()='Invite Users']");
private By firstName = By.xpath("//input[@formcontrolname='firstName']");
private By lastName = By.xpath("//input[@formcontrolname='lastName']");
private By emailID = By.xpath("//input[@formcontrolname='email']");

private By submitButton = By.xpath("//button[@type='submit']");


//  creating Methods 


public void clickAdmnMenu() {
	
	click(adminMenu);
	
}

public void clickUserMenu() {
	
	click(userMenu);
	
}

public void clickInviteUsers() {
	click(inviteUsers);
}

public void enterFirstName(String value) {
	enterText(firstName,value);
}

public void enterLastName(String value) {
	
	enterText(lastName,value);
}


public void enterEmailID(String value) {
	enterText(emailID,value);
	
}

public void clickSubmit() {
	click(submitButton);
}

}
