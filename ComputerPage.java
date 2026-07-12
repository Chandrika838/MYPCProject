package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class ComputerPage extends BasePage {

	
	public ComputerPage(WebDriver driver) {
	
	super(driver);
	
	
	}
	
// locators 
	
	private By admin = By.xpath("//span[contains(text(),'Admin')]");
	
	private By computer = By.xpath("//a[@href='/Admin/AdminPcs']//span[text()='Computers']");
	
	private By addnew = By.xpath("//span[normalize-space()='Add New']");
	
	private By addname = By.xpath("//input[@formcontrolname='resourceName']");
	
	private By addID = By.xpath("//input[@formcontrolname='resourceIdName']");
	
	private By location = By.id("locationId");
	
	private By defaultduration = By.id("defaultDuration");
	
	private By advanceoptions = By.xpath("//button[normalize-space()='advanced options']");
	
	private By prepartiontime = By.id("preparationTime");
	
	private By noshowwaitTime = By.id("noShowWaitTime");
	
	private By level1Warning = By.id("levelWarningMessage");
	
	private By level2Warning = By.id("level2WarningMessage");
	
	private By level3Warning = By.id("level3WarningMessage");
	
	private By logginlevel = By.id("loggingLevel");
	
	private By welcomemessage = By.id("showWelcomeMessage_");
	
	private By aupmessage = By.id("showAUPMessage_");
	
	private By inactivityTimeout = By.id("inactivityTimeout");
	
	private By locktimeout = By.id("lockTimeout");
	
	private By autorebot = By.id("autoRebootAtLogoff_");
	
	private By autoshutdown = By.id("autoShutdownAtClosingTime_");
	
	private By add = By.xpath("//span[normalize-space()='Add']");
	
	
// methods 
	
	
public void ClickAdmin() {
	
	click(admin);
}
	

public void ClickComputers() {
	click(computer);
}
	
	
public void ClickAddNew() {
	
	click(addnew);
}
	
	
public void enterComputerName(String value) {
	
	enterText(addname, value);
}
	

public void enterComputerID(String value) {
	
	enterText(addID,value);
}


public void selectLocation(String value) {
	
	new Select(getElement(location)).selectByVisibleText(value);
}


public void selectDefaultDuration(String value) {
	
	WebElement element = getElement(defaultduration);

element.clear();
element.sendKeys(value);


}


public void ClickAdvancedOption() {

	click(advanceoptions);
	 wait.until(ExpectedConditions.elementToBeClickable(noshowwaitTime));
}


public void selectPrepartionTime(String value) {
	
	new Select(getElement(prepartiontime)).selectByVisibleText(value);
}


public void enterNoShowWaitTime(String value) {
    WebElement element = wait.until(
            ExpectedConditions.visibilityOfElementLocated(noshowwaitTime));
    element.clear();
    element.sendKeys(value);
}

public void enterLevel1Warning(String value) {
    WebElement element = getElement(level1Warning);
    element.clear();
    element.sendKeys(value);
}

public void enterLevel2Warning(String value) {
    WebElement element = getElement(level2Warning);
    element.clear();
    element.sendKeys(value);
}

public void enterLevel3Warning(String value) {
    WebElement element = getElement(level3Warning);
    element.clear();
    element.sendKeys(value);
}

public void clickLoggingLevel() {
	 wait.until(ExpectedConditions.elementToBeClickable(logginlevel)).click();
}

public void enableShowWelcomeMessage() {

    if (!getElement(welcomemessage).isSelected()) {
        click(welcomemessage);
    }
}

public void enableShowAUPMessage() {

    if (!getElement(aupmessage).isSelected()) {
        click(aupmessage);
    }
}

public void enterInactivityTimeout(String value) {

    WebElement element = getElement(inactivityTimeout);
    element.clear();
    element.sendKeys(value);
}

public void enterLockTimeout(String value) {

    WebElement element = getElement(inactivityTimeout);
    element.clear();
    element.sendKeys(value);
}


public void ClickAutoReboot() {

	 wait.until(ExpectedConditions.elementToBeClickable(autorebot)).click();

}


public void ClickAutoShutdown() {
	
	 wait.until(ExpectedConditions.elementToBeClickable(autoshutdown)).click();
	
}

public void clickAdd() {
	 wait.until(ExpectedConditions.elementToBeClickable(add)).click();


}

}