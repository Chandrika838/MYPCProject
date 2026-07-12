package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Reserve_RoomPage extends BasePage{

	public Reserve_RoomPage(WebDriver driver) {
	
	super(driver);
	
	}	
	// locators 
	

private By reserve = By.xpath("//span[normalize-space()='Reserve']");

private By room = By.xpath("//span[normalize-space()='Room']");

private By location = By.xpath("//app-location-selector//select");

private By tooltip = By.xpath("(//div[contains(@class,'bs-slot') and contains(@class,'bs-available')])[1]");

private By startTime = By.xpath("//app-time-selector[@formcontrolname='startTime']//select");

private	 By dragDrop = By.xpath("//div[@class='bs bs-marker']");
	
private By selfBooking = By.id("selfBooking");	
	
private By Submit= By.xpath("//span[normalize-space()='Book']");	
	

// methods 
	

public void clickReserve() {
	
	wait.until(ExpectedConditions.elementToBeClickable(reserve)).click();	
	
}

public void clickRoom() {
	
	wait.until(ExpectedConditions.elementToBeClickable(room)).click();
}

public void selectLocation(String value ){
	
	Select select = new Select(getElement(location));
	
	select.selectByVisibleText(value);
}
	

public void clickToolTip() {
	
    WebElement tooltipElement = wait.until(
            ExpectedConditions.refreshed(
                    ExpectedConditions.elementToBeClickable(tooltip)));

    tooltipElement.click();
}


public void selectStartime(String value) {
	

    // Wait until the dropdown is visible
    WebElement dropdown = wait.until(
            ExpectedConditions.visibilityOfElementLocated(startTime));

    // Wait until the dropdown is clickable
    wait.until(ExpectedConditions.elementToBeClickable(dropdown));

    // Create Select object
    Select select = new Select(dropdown);

    
    // Select the value
    select.selectByVisibleText(value);
}


public void clickDragdrop() {
	
	WebElement element = getElement(dragDrop);
	
	new Actions(driver).dragAndDropBy(element, 15, 0).perform();

}

public void enableSelfBooking() {
	
	WebElement checkbox = getElement(selfBooking);
	
	if(!checkbox.isSelected()) {
		
		checkbox.click();
	}
	
}


public void clickSubmit() {
	WebElement button = wait.until(
            ExpectedConditions.elementToBeClickable(Submit));
	button.click();
}
}
