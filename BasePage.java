package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;

public class BasePage {

	protected WebDriver driver;
	protected WebDriverWait wait;
	
	// we will call this constructor 
	public BasePage(WebDriver driver) {
		this.driver = driver;
		
this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	}
	
	
// click  methods 
	
	
public void  click(By locator) {
	
	 wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
	
}

// Enter text 

public void enterText(By locator , String text ) {
WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
	element.clear();
	element.sendKeys(text);
	
}


// Get Element 

public WebElement getElement(By locator) {
	
	return wait.until(ExpectedConditions.elementToBeClickable(locator));
}


// Check Dispalayed

public boolean isDisplayed(By locator) {
	
	return wait.until(ExpectedConditions.elementToBeClickable(locator)).isDisplayed();
	
}


// check selected 

public boolean isSelected(By locator) {
	return wait.until(ExpectedConditions.elementToBeClickable(locator)).isSelected();
	
}


// check text 

public String getText(By locator) {
	
	return wait.until(ExpectedConditions.elementToBeClickable(locator)).getText();
	
}

// check enabled 

public boolean isEnabled(By locator) {
	return wait.until(ExpectedConditions.elementToBeClickable(locator)).isEnabled();
	
}


// Select checkbox 

public void selectCheckbox(By locator) {
	  WebElement checkbox = wait.until(
	            ExpectedConditions.elementToBeClickable(locator));
	
	if(!checkbox.isSelected()) {
		checkbox.click();
	}
}


// unselect Checkbox

public void unselectCheckox(By locator) {
	
	WebElement checkox = wait.until(
            ExpectedConditions.elementToBeClickable(locator));
	
	if(checkox.isSelected()) {
		checkox.click();
	}
}
	
}