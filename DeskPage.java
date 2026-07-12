package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class DeskPage extends BasePage {

	public DeskPage (WebDriver driver) {
		super(driver);
		
		
	}


// locators 

private By admin = By.xpath("//span[contains(text(),'Admin')]");
private By desk = By.xpath("//span[normalize-space()='Desks']");

private By addnew = By.xpath("//span[normalize-space()='Add New']");

private By deskname = By.xpath("//input[@type='text']");

private By location = By.id("locationId");

private By duration = By.id("defaultDuration");

private By advanceoptions = By.xpath("//button[normalize-space()='advanced options']");

private By prepartion = By.id("preparationTime");

private By checkbox = By.id("checkInRequired_");
	
private By add = By.xpath("//span[normalize-space()='Add']");


// Methods 


public void ClickAdmin() {
	
	click(admin);
		
}

public void ClickDesk() {
	
	 wait.until(ExpectedConditions.elementToBeClickable(desk)).click();
	 
	
}
	
public void ClickAddNew() {
	
	 wait.until(ExpectedConditions.elementToBeClickable(addnew)).click();
}
	

public void enterDeskName(String deskName) {
	

    wait.until(ExpectedConditions.visibilityOfElementLocated(deskname))
        .sendKeys(deskName);
}

public void selectLocation(String value){

	Select select = new Select(getElement(location));
	select.selectByVisibleText(value);
	
	
}

public void enterDefaultDuration(String value) {
	
	enterText(duration,value);
	
	
}
	
public void AdvanceOption2() {
	
	wait.until(ExpectedConditions.elementToBeClickable(advanceoptions)).click();
}
	

public void selectPrepartion(String deskpreptime) {
	
WebElement element = driver.findElement(prepartion);
	Select select = new Select(getElement(prepartion));
	
	select.selectByVisibleText(deskpreptime);
}



public void enableCheckBox(String id) {
	
	By locator = By.id(id);
	
	if(!getElement(locator).isSelected()) {
		
		click(locator);
	}

	}

public void enableCheckInRequired() {

    enableCheckBox("checkInRequired_");

}


public WebElement getElement(By locator) {
    return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
}

public void click(By locator) {
    wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
}


public void ClickAdd() {
	
	click(add);
}

}
