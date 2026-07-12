package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Sign_INPage extends BasePage{

	public  Sign_INPage(WebDriver driver) {
		
		super(driver);
		
	}
	

// locators 
	
private By email = By.cssSelector("#email");

private By password = By.cssSelector("#password");
	
private By loginButton = By.cssSelector(".btn.btn-default.btn-login.btn-main");	
	
private By 	profile = By.cssSelector(".navbar-initialsCircle.mt-1.me-1");
	
private By setting = By.xpath("//a[.//span[normalize-space()='Settings']]");
	
private By theme = By.name("theme");

private By submit = By.cssSelector("button[type='submit']");

private By signout = By.xpath("//a[normalize-space()='Sign Out']");
	


// Methods 

public void enterEmail(String userEmail) {
	  
	  enterText(email, userEmail);
	  
}

public void enterPassword(String userPassword) {
	  enterText(password, userPassword);
	  
}


public void clickLogin() {
	click(loginButton);
}
	
	
public void clickProfile() {
	wait.until(ExpectedConditions.elementToBeClickable(profile)).click();
		
}
	
public void clickSetting() {

    wait.until(ExpectedConditions.elementToBeClickable(setting)).click();
	
	
}


public void selectTheme(String themeName) {

    Select select = new Select(getElement(theme));

    select.selectByVisibleText(themeName);
	
	

}
	

public void clickSubmit() {
	
	click(submit);
	
}
	

public void clickSignout() {
	
	click(signout);
}
	
}
